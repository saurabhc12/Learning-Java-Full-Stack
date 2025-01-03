package dao;

import java.util.HashSet;
import java.util.Set;

import entity.player;

public class PlayerDao {
	 public Set<player> getAllPlayers(){
	    	System.out.println("PlayerDao --> getAllPlayers");
	    	
	    	Set<player> playerdb = new HashSet<player>();
	    	
	    	playerdb.add(new player(7,"msd1",5000,1,"1csk"));
	    	playerdb.add(new player(8,"msd2",4000,1,"2csk"));
	    	playerdb.add(new player(9,"msd3",3000,1,"3csk"));
	    	playerdb.add(new player(10,"msd4",2000,1,"4csk"));
	    	playerdb.add(new player(11,"msd5",1000,1,"5csk"));
	    	
	    	
	      return playerdb;
	    }

}
