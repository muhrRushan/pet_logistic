package com.muharlyamov.pet_logistic.dao;

import com.muharlyamov.pet_logistic.dao.interfaces.DriverDAO;
import com.muharlyamov.pet_logistic.entity.Driver;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DriverDAOImpl implements DriverDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(Driver driver) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(driver);
    }

    @Override
    public void delete(Driver driver) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(driver);
    }

    @Override
    public List<Driver> getAll() {
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("SyntaxError") List<Driver> allDrivers = session.createQuery("from Driver", Driver.class).getResultList();
        return allDrivers;
    }

    @Override
    public Driver getDriver(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Driver.class, id);
    }
}
