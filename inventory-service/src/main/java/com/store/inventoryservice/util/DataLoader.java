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
        inventory.setSkuCode("Iphone 14");
        inventory.setQuantity(50);
        inventoryRepository.save(inventory);

        Inventory inventory1 = new Inventory();
        inventory1.setSkuCode("Iphone 14 blue");
        inventory1.setQuantity(50);
        inventoryRepository.save(inventory1);

        Inventory inventory2 = new Inventory();
        inventory2.setSkuCode("Iphone 14 red");
        inventory2.setQuantity(150);
        inventoryRepository.save(inventory2);

    };

}
