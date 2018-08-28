package vdab.ines.Miniproject.services;

import org.springframework.stereotype.Repository;
import vdab.ines.Miniproject.entities.Store;

@Repository
public interface StoreService {
    Store findById(long Id);
    Store findByTown(String town);
    void findShopmanagerByTown(String town);
}
