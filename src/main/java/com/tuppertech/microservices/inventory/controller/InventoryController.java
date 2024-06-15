package com.tuppertech.microservices.inventory.controller;

import com.tuppertech.microservices.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Log4j2
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@RequestParam String skuCode,@RequestParam Integer quantity){
        return inventoryService.isInStock(skuCode,quantity);
    }

}
