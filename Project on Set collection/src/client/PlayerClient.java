package client;

import java.util.Set;

import controller.PlayerController;
import entity.player;

public class PlayerClient {
	public static void main(String[] args) {
		
	      PlayerController controller =new PlayerController();
	      
	      Set<player> allplayer = controller.getAllPlayersController();
	      
	      for(player p:allplayer) {
	    	  System.out.println(p);
	      }
	      

	    }

}
