package com.dave.mycompany.service;

import com.dave.mycompany.model.Employee;
import com.dave.mycompany.model.Store;
import com.dave.mycompany.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StoreService {
    private final StoreRepository storeRepository;

    public Store add(Store store){
        return storeRepository.save(store);
    }

    public void updateManager(Integer store_id,Integer employee_id){
        Optional<Store> store = storeRepository.findById(store_id);
        if(store.isPresent()){
            store.get().setManager(Employee.builder().id(employee_id).build());
            storeRepository.save(store.get());
        }

    }
}
