/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.animalApp.controller.examples;

import org.springframework.stereotype.Component;

/**
 *
 * @author Bhagavan
 */
@Component
public class Player {
    String name;
    String teamName;
    String descripttion;

    public Player() {
    }

    public Player(String name, String teamName, String descripttion) {
        this.name = name;
        this.teamName = teamName;
        this.descripttion = descripttion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getDescripttion() {
        return descripttion;
    }

    public void setDescripttion(String descripttion) {
        this.descripttion = descripttion;
    }
    
    
}
