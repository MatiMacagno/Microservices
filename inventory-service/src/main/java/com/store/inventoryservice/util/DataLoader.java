package com.store.inventoryservice.util;

import com.store.inventoryservice.model.Inventory;
import com.store.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final InventoryRepository inventoryRepository;

    @Override
    public void run(String... args) throws Exception {
        Inventory inventory = new Inventory();
        inventory.setSkuCode("Iphone_14");
        inventory.setQuantity(50);
        inventoryRepository.save(inventory);

        Inventory inventory1 = new Inventory();
        inventory1.setSkuCode("Iphone_14_blue");
        inventory1.setQuantity(0);
        inventoryRepository.save(inventory1);



    };

}
