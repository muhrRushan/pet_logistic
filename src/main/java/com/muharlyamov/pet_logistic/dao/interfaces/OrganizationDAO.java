package com.muharlyamov.pet_logistic.dao.interfaces;

import com.muharlyamov.pet_logistic.entity.Client;
import com.muharlyamov.pet_logistic.entity.Organization;

import java.util.List;

public interface OrganizationDAO {
    public void save(Organization organization);
    public void delete(Organization organization);
    public List<Organization> getAll();
    public Organization getOrganization(int id);
}
