package com.GGI.uParty;

import java.io.IOException;

import com.GGI.uParty.Network.Network;
import com.GGI.uParty.Network.Sendable;
import com.GGI.uParty.Screens.LoginScreen;
import com.badlogic.gdx.Game;
import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.esotericsoftware.kryonet.Listener.ThreadedListener;

public class uParty extends Game {
	public Assets assets;
	private Client client;
	
	
	
	@Override
	public void create () {
		client= new Client();
		
		assets = new Assets(this);
		
		client.addListener(new ThreadedListener(new Listener(){
			 public void received (Connection connection, Object object) {
		         System.out.println("I recieved something");
				 /*if (object instanceof SomeResponse) {
		             SomeResponse response = (SomeResponse)object;
		             System.out.println(response.text);
		          }*/
		       }
			
		}));
		
		setScreen(new LoginScreen(this));
	}
	
	public void connect(){
		if(!client.isConnected()){
			try {
				
				client.start();
				client.connect(5000, "localhost", 36693);
				Network.register(client);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void send(Sendable s){
		connect();
		client.sendTCP(s);
		
	}

	
	
}
