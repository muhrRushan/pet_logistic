package com.muharlyamov.pet_logistic.dao;

import com.muharlyamov.pet_logistic.dao.interfaces.ClientDAO;
import com.muharlyamov.pet_logistic.entity.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientDAOImpl implements ClientDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Client client) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(client);
    }

    @Override
    public void delete(Client client) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(client);
    }

    @Override
    public List<Client> getAllClients() {
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("SyntaxError") List<Client> allClients = session.createQuery("from Client", Client.class).getResultList();
        return allClients;
    }

    @Override
    public Client getClient(int id) {
        Session session = sessionFactory.getCurrentSession();
        Client client = session.get(Client.class, id);
        return  client;
    }


}
