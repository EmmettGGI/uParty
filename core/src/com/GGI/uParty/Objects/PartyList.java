package com.GGI.uParty.Objects;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;

public class PartyList extends ArrayList<PartyModule>{

	public float w = Gdx.graphics.getWidth(),h = Gdx.graphics.getHeight();
	
	public PartyList(){
		
	}
	
	public void render(int scrolled){
		
		for(int i = 0;i<size();i++){
			get(i).bounds=new Rectangle(0,.945f*h-((i+1)*.1f*h)+scrolled,w,.1f*h);
			get(i).render();
		}
		
	}
	
	public boolean down(){
		return false;
		
	}
	
	public boolean up(){
		return false;
		
	}
}
