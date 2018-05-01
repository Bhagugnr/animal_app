/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.animalApp.controller.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bhagavan
 */

@RestController
@RequestMapping(value = "api/dream11")
public class Dream11Controller {
    
    public Map<String, User> dream11DB;
    static final Logger logger = Logger.getLogger(Dream11Controller.class);  
    
    public Dream11Controller() {
        this.dream11DB = new HashMap();
    }
    
    @RequestMapping(value = "/createTeam", method = RequestMethod.POST)
    public String createTeam(@RequestBody User user) {
        User response = this.StoreData(user);
        user.getTeams();
        return " Teams are Created...! on this name " + response.getTeams();
    }
    
        
    @RequestMapping(value = "getTeams", method = RequestMethod.POST)
    public List getTeams(@RequestBody User user) {
        
        User response = this.getUserTeamsById(user.getId());
        this.buidTeams(response);
        return this.buidTeams(response);
    }
    
    public User getUserTeamsById(String id) {
        return this.dream11DB.get(id);
    }
 
    public List buidTeams(User u) {
        List teamList = new ArrayList();
        for (Team team : u.getTeams()) {
            teamList.add(team);
        }
        return teamList;
    }
 
    public User StoreData(User user) {
        Team t = new Team();
        Player p = new Player();
        HashSet plyaerList = new HashSet();
        HashSet teamLIst = new HashSet();
        for (Team team : user.getTeams()) {
            t.setTeamID(team.getTeamID());
            t.setTeamName(team.getTeamName());
           for (Player player : team.getPlayer()) {
               p.setName(player.getName());
               p.setTeamName(player.getTeamName());
               p.setDescripttion(player.getDescripttion());
               plyaerList.add(p);
           }
           t.setPlayer(plyaerList);
           teamLIst.add(t);
        }
        User entityUser = new User (user.getId(), user.getName(), teamLIst);
        this.dream11DB.put(entityUser.getId(), entityUser);
        return entityUser;
    }
}
