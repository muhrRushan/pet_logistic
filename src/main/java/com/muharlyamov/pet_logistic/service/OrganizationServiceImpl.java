package com.muharlyamov.pet_logistic.service;

import com.muharlyamov.pet_logistic.dao.interfaces.OrganizationDAO;
import com.muharlyamov.pet_logistic.entity.Organization;
import com.muharlyamov.pet_logistic.service.interfaces.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationDAO organizationDAO;

    @Transactional
    @Override
    public void save(Organization organization) {
        organizationDAO.save(organization);
    }

    @Transactional
    @Override
    public void delete(Organization organization) {
        organizationDAO.delete(organization);
    }

    @Transactional
    @Override
    public List<Organization> getAll() {
        return organizationDAO.getAll();
    }

    @Transactional
    @Override
    public Organization getOrganization(int id) {
        return organizationDAO.getOrganization(id);
    }
}
