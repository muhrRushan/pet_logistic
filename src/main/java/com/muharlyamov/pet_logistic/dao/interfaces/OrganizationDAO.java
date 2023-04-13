package com.muharlyamov.pet_logistic.dao.interfaces;

import com.muharlyamov.pet_logistic.entity.Client;
import com.muharlyamov.pet_logistic.entity.Organization;

import java.util.List;

public interface OrganizationDAO {
    void save(Organization organization);
    void delete(Organization organization);
    List<Organization> getAll();
    Organization getOrganization(int id);
}
