package com.anupam.service;

import java.util.List;
import java.util.Optional;

import com.anupam.model.StoreDetails;

public interface StoreService {

    List<StoreDetails> findAll();
    Optional<StoreDetails> findByNo(Long no);
}
