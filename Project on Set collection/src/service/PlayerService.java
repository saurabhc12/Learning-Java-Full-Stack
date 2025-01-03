package service;

import java.util.Set;
import dao.PlayerDao;
import entity.player;

public class PlayerService {
	PlayerDao dao = null;

    public Set<player> getAllPlayersService(){
    	System.out.println("PlayerService --> getAllPlayersService");

 
    	dao = new PlayerDao();
    	Set<player> allplayer=dao.getAllPlayers();


        return allplayer;
      }


}
