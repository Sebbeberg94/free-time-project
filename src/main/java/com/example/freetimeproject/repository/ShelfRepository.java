package com.example.freetimeproject.repository;

import com.example.freetimeproject.classes.Shelf;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ShelfRepository extends CrudRepository<Shelf, Long> {

    Shelf findByItemsId(Long itemId);

}
