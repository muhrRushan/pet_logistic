package com.muharlyamov.pet_logistic.api.v1.controller;

import com.muharlyamov.pet_logistic.entity.Organization;
import com.muharlyamov.pet_logistic.service.interfaces.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("api/v1/organization")
public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;

    @GetMapping("all")
    public List<Organization> getAll() {
        return organizationService.getAll();
    }

    @GetMapping("/{id}")
    public Organization getById(@PathVariable int id) {
        Organization organization = organizationService.getOrganization(id);
        if (organization == null) {
            throw new NoSuchElementException("There is no such organization by ID = " + id);
        }
        return organization;
    }

    @PostMapping("/")
    public Organization addNew(@RequestBody Organization organization){
        organizationService.save(organization);
        return organization;
    }

    @PutMapping("/{id}")
    public Organization update(@RequestBody Organization organization,
                                       @PathVariable int id){
        Organization checkOrganization = organizationService.getOrganization(id);
        if (checkOrganization == null){
            throw new NoSuchElementException("There is no such organization by ID = " + id);
        }
        organization.setId(id);
        organizationService.save(organization);
        return organization;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        Organization organization = organizationService.getOrganization(id);
        if (organization == null){
            throw new NoSuchElementException("There is no such organization by ID = " + id);
        }
        organizationService.delete(organization);
        return "Organization by ID = " + id + " was deleted";
    }
}
