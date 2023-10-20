package io.github.suuzanemoura.labpadroesprojetospring.service;

import io.github.suuzanemoura.labpadroesprojetospring.model.Client;

public interface ClientService {
    
    Iterable<Client> findAllClients();

    Client findById(Long id);

    void createNewClient(Client client);

    void updateClientById(Long id, Client client);

    void deleteClientById(Long id);
}
