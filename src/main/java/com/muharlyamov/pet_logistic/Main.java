package com.muharlyamov.pet_logistic;

import com.muharlyamov.pet_logistic.entity.Organization;
import com.muharlyamov.pet_logistic.service.OrganizationServiceImpl;
import com.muharlyamov.pet_logistic.service.interfaces.OrganizationService;
import org.springframework.stereotype.Component;

public class Main {

    public static void main(String[] args) {
        Organization organization = new Organization("Рога и копыта");
        OrganizationService organizationService = new OrganizationServiceImpl();
        organizationService.save(organization);
    }
}
