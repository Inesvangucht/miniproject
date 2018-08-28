package vdab.ines.Miniproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vdab.ines.Miniproject.entities.Store;
import vdab.ines.Miniproject.repositories.StoreRepository;

import javax.persistence.EntityNotFoundException;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public Store findById(long id) {
        return storeRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Store findByTown(String town) {
        return null;
    }

    @Override
    public void findShopmanagerByTown(String town) {


    }

}
