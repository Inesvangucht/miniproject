package vdab.ines.Miniproject.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vdab.ines.Miniproject.entities.Store;

@Repository
public interface StoreRepository extends PagingAndSortingRepository<Store, Long> {

    Store findByTown(String town);
}
