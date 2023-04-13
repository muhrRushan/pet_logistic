package com.muharlyamov.pet_logistic.service.interfaces;

import com.muharlyamov.pet_logistic.entity.Client;

import java.util.List;

public interface ClientService {
    public void save(Client client);
    public void delete(Client client);
    List<Client> getAllClients();
    public Client getClient(int id);
}
