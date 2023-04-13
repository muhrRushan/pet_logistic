package com.muharlyamov.pet_logistic.service;

import com.muharlyamov.pet_logistic.dao.interfaces.ClientDAO;
import com.muharlyamov.pet_logistic.entity.Client;
import com.muharlyamov.pet_logistic.service.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientDAO clientDAO;

    @Transactional
    @Override
    public void save(Client client) {
        clientDAO.save(client);
    }

    @Transactional
    @Override
    public void delete(Client client) {
        clientDAO.delete(client);
    }

    @Transactional
    @Override
    public List<Client> getAllClients() {
        return clientDAO.getAllClients();
    }

    @Transactional
    @Override
    public Client getClient(int id) {
        return clientDAO.getClient(id);
    }
}
