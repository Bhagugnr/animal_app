/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.animalApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bhagavan
 */

@RestController
@RequestMapping(value = "api")
public class HelloWorldController {
    
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String helloWorld() {
        return "Hellow world";
    }
}
