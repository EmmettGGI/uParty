package com.GGI.uParty;

import com.GGI.uParty.Screens.LoginScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class uParty extends Game {
	public Assets assets;
	
	@Override
	public void create () {
		assets = new Assets(this);
		setScreen(new LoginScreen(this));
	}

	
}
