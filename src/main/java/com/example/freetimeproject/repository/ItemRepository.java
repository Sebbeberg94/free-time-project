package com.example.freetimeproject.repository;

import com.example.freetimeproject.classes.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long> {

    List<Item> findAllByShelfId(Long id);

}
