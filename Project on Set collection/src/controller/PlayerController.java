package controller;

import java.util.Set;


import entity.player;
import service.PlayerService;

public class PlayerController {
	 PlayerService service = null;

	    public Set<player> getAllPlayersController(){
	    	System.out.println("PlayerController --> getAllPlayersController");
	    	
	    	service = new PlayerService();
	    	Set<player> allplayer=service.getAllPlayersService();


	        return allplayer;
	      }

}
