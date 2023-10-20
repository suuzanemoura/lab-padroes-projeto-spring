package io.github.suuzanemoura.labpadroesprojetospring.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.suuzanemoura.labpadroesprojetospring.model.Address;
import io.github.suuzanemoura.labpadroesprojetospring.model.AddressRepository;
import io.github.suuzanemoura.labpadroesprojetospring.model.Client;
import io.github.suuzanemoura.labpadroesprojetospring.model.ClientRepository;
import io.github.suuzanemoura.labpadroesprojetospring.service.CepService;
import io.github.suuzanemoura.labpadroesprojetospring.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private CepService cepService;

    @Override
    public Iterable<Client> findAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        Optional<Client> cliente = clientRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void createNewClient(Client client) {
        saveClientWithCep(client);
    }

    @Override
    public void updateClientById(Long id, Client client) {

        Optional<Client> clientBd = clientRepository.findById(id);
        if (clientBd.isPresent()) {
            saveClientWithCep(client);
        }
    }

    @Override
    public void deleteClientById(Long id) {

        clientRepository.deleteById(id);
    }

    private void saveClientWithCep(Client client) {

        String cep = client.getAddress().getCep();
        Address address = addressRepository.findById(cep).orElseGet(() -> {

            Address newAddress = cepService.findCep(cep);
            addressRepository.save(newAddress);
            return newAddress;

        });

        client.setAddress(address);
        clientRepository.save(client);
    }

}