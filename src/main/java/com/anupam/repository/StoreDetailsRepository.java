/**
 * 
 */
package com.anupam.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.anupam.model.StoreDetails;

/**
 * @author Anupam Sharma
 *
 */
@Repository
public interface StoreDetailsRepository extends MongoRepository<StoreDetails, Long>{

	Optional<StoreDetails> findByNo(Long no);

}
