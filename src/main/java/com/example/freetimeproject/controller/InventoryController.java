package com.example.freetimeproject.controller;

import com.example.freetimeproject.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping("/showInventory")
    public String showInventory(Model model) {
        model.addAttribute("inventoryShelves", inventoryService.getAllShelves());
        return "inventory";
    }

    @GetMapping("/searchItem")
    public String searchItem() {

        return "searchResults";
    }

}
