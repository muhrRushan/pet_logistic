package com.muharlyamov.pet_logistic.service.interfaces;

import com.muharlyamov.pet_logistic.entity.Organization;

import java.util.List;

public interface OrganizationService {
    public void save(Organization organization);
    public void delete(Organization organization);
    public List<Organization> getAll();
    public Organization getOrganization(int id);
}
