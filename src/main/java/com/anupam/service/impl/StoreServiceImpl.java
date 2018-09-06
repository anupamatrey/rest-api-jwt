package com.anupam.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anupam.model.StoreDetails;
import com.anupam.repository.StoreDetailsRepository;
import com.anupam.service.StoreService;

@Service(value = "storeService")
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreDetailsRepository storeDetailsRepository;


	@Override
	public List<StoreDetails> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<StoreDetails> findByNo(Long no) {
		return storeDetailsRepository.findByNo(no);
	}

}
