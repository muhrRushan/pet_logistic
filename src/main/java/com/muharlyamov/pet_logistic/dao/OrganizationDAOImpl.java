package com.muharlyamov.pet_logistic.dao;

import com.muharlyamov.pet_logistic.dao.interfaces.OrganizationDAO;
import com.muharlyamov.pet_logistic.entity.Organization;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrganizationDAOImpl implements OrganizationDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Organization organization) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(organization);
    }

    @Override
    public void delete(Organization organization) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(organization);
    }

    @Override
    public List<Organization> getAll() {
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("SyntaxError") List<Organization> allOrganizations = session.createQuery("from Organization", Organization.class).getResultList();
        return allOrganizations;
    }

    @Override
    public Organization getOrganization(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Organization.class, id);
    }
}
