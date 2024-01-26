package com.example.crud_banh_chung.repository;

import com.example.crud_banh_chung.model.TrungCake;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CakeRepository extends CrudRepository<TrungCake, Integer> {
    public List<TrungCake> findTrungCakeByDetailsContaining(String keyword);
}
