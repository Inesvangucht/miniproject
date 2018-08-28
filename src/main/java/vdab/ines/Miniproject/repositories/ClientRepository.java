package vdab.ines.Miniproject.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vdab.ines.Miniproject.entities.Client;

@Repository
public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {

    Client findByFirstName(String firstName);

}
