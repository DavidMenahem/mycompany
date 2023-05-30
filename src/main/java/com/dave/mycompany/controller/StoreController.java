package com.dave.mycompany.controller;

import com.dave.mycompany.model.Store;
import com.dave.mycompany.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("store")
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;

    @PostMapping
    public Store add(@RequestBody Store store){
        return storeService.add(store);
    }

    @PutMapping("/manager/{store_id}/{employee_id}")
    public void updateManager(@PathVariable Integer store_id, @PathVariable Integer employee_id){
        storeService.updateManager(store_id,employee_id);
    }
}
