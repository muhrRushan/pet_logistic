package com.muharlyamov.pet_logistic.api.v1.controller;

import com.muharlyamov.pet_logistic.entity.Client;
import com.muharlyamov.pet_logistic.service.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("api/v1/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("all")
    public List<Client> getAll() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getClientnById(@PathVariable int id) {
        Client client = clientService.getClient(id);
        if (client == null) {
            throw new NoSuchElementException("There is no such client by ID = " + id);
        }
        return client;
    }

    @PostMapping("/")
    public Client addNewClient(@RequestBody Client client){
        clientService.save(client);
        return client;
    }

    @PutMapping("/{id}")
    public Client updateClient(@RequestBody Client client,
                                       @PathVariable int id){
        Client checkClient = clientService.getClient(id);
        if (checkClient == null){
            throw new NoSuchElementException("There is no such client by ID = " + id);
        }
        checkClient.setId(id);
        clientService.save(client);
        return client;
    }

    @DeleteMapping("/{id}")
    public String deleteClient(@PathVariable int id){
        Client client = clientService.getClient(id);
        if (client == null){
            throw new NoSuchElementException("There is no such client by ID = " + id);
        }
        clientService.delete(client);
        return "Client by ID = " + id + " was deleted";
    }
}
