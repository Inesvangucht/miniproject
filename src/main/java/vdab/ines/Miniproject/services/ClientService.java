package vdab.ines.Miniproject.services;

import org.springframework.stereotype.Repository;
import vdab.ines.Miniproject.entities.Client;

@Repository
public interface ClientService {
    Client findById(Long id);
    Client findByFirstName(String firstNAme);
    void saveClient(Client client);
}
