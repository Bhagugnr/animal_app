/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.animalApp.controller.examples;

import java.util.Set;
import org.springframework.stereotype.Component;

/**
 *
 * @author Bhagavan
 */
@Component
public class Team {
    
    String teamID;
    String teamName;
    Set<Player> player;

    public Team() {
    
    }

    public Team(String teamID, String teamName, Set<Player> player) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.player = player;
    }

    
    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Set<Player> getPlayer() {
        return player;
    }

    public void setPlayer(Set<Player> player) {
        this.player = player;
    }



    @Override
    public String toString() {
        return "Team{" + "teamID=" + teamID + ", teamName=" + teamName + ", HashSet=" + player + '}';
    }
    
   
}
