package com.muharlyamov.pet_logistic.service.interfaces;

import com.muharlyamov.pet_logistic.entity.Organization;

import java.util.List;

public interface OrganizationService {
    void save(Organization organization);
    void delete(Organization organization);
    List<Organization> getAll();
    Organization getOrganization(int id);
}
