package com.muharlyamov.pet_logistic.dao.interfaces;

import com.muharlyamov.pet_logistic.entity.Client;

import java.util.List;

public interface ClientDAO {
    void save(Client client);
    void delete(Client client);
    List<Client> getAllClients();
    Client getClient(int id);
}
