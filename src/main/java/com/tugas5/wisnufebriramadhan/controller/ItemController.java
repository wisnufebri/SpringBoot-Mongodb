package com.tugas5.wisnufebriramadhan.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.tugas5.wisnufebriramadhan.model.ItemModel;
import com.tugas5.wisnufebriramadhan.repository.ItemRepository;
import com.tugas5.wisnufebriramadhan.util.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ItemService itemService;

    @GetMapping
    public List<ItemModel> getAll(@RequestParam(value = "page", defaultValue = "0") Integer pageNo,
                                        @RequestParam(value = "sortKey", defaultValue = "username") String sortKey) {
        return itemService.getAllItem(pageNo, sortKey);
    }

    @GetMapping("/{id}")
    public Optional<ItemModel> getById(@PathVariable String id) {
        return itemService.getItemById(id);
    }

//    @PostMapping("")
//    public ItemModel insertItem(@RequestBody ItemModel item) {
//        itemService.insertItem(item);
//        return item;
//    }

    @PostMapping("/insert")
    public ItemModel createUser(@RequestBody ItemModel item) {
        ItemModel result = itemRepository.save(item);
        return result;
    }

    @PutMapping("")
    public Map<String, Object> updateUser(@RequestBody ItemModel item){
        return itemService.updateItem(item);
    }
}