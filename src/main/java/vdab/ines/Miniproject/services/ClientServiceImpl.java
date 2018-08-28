package vdab.ines.Miniproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vdab.ines.Miniproject.entities.Client;
import vdab.ines.Miniproject.repositories.ClientRepository;

import javax.persistence.EntityNotFoundException;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client findById(Long id) {

        return clientRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Client findByFirstName(String firstNAme) {

        return clientRepository.findByFirstName(firstNAme);
    }

    @Override
    public void saveClient(Client client) {

        clientRepository.save(client);

    }
}
