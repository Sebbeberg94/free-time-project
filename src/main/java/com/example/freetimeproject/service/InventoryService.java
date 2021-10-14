package com.example.freetimeproject.service;

import com.example.freetimeproject.classes.Item;
import com.example.freetimeproject.classes.Shelf;
import com.example.freetimeproject.repository.ItemRepository;
import com.example.freetimeproject.repository.ShelfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ShelfRepository shelfRepository;

    public Item getItem(Long itemId) {
        return itemRepository.findById(itemId).get();
    }

    public List<Item> getItemsOnShelf(Long shelfId) {
        return itemRepository.findAllByShelfId(shelfId);
    }

    public List<Item> getAllItems() {
        return (List<Item>) itemRepository.findAll();
    }

    public Shelf getShelf(Long shelfId) {
        return shelfRepository.findById(shelfId).get();
    }

    public List<Shelf> getAllShelves() {
        return (List<Shelf>) shelfRepository.findAll();
    }

}
