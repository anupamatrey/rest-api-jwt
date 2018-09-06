/**
 * 
 */
package com.anupam.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anupam.model.StoreDetails;
import com.anupam.service.StoreService;

/**
 * @author Anupam Sharma
 *
 */
@RestController
public class StoreDetailsController {
	
    @Autowired
    private StoreService storeService;

/*    @RequestMapping(value="/user", method = RequestMethod.GET)
    public List<User> listUser(){
        return userService.findAll();
    }*/

    @RequestMapping(value = "/stores/{id}", method = RequestMethod.GET)
    public Optional<StoreDetails> getOne(@PathVariable(value = "id") Long id){
        return storeService.findByNo(id);
    }

}
