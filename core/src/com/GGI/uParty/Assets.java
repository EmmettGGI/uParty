package com.GGI.uParty;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class Assets {
	public uParty u;
	public float w = Gdx.graphics.getWidth(),h=Gdx.graphics.getHeight();
	
	/**Colors*/
	public Color orange = new Color(247f/255f,148f/255f,29f/255f,1f);
	
	/**Images*/
	public Texture logo1024;
	public TextureRegionDrawable textStyleBorder;
	
	/**Fonts*/
	public BitmapFont small;
	public BitmapFont medium;
	public BitmapFont large;
	
	public Assets(uParty u){
		this.u=u;
		loadImages();
		loadFonts();
	}


	private void loadFonts() {
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("font.ttf"));
		FreeTypeFontParameter parameter = new FreeTypeFontParameter();
		
		parameter.size = (int) (h/100);
		small = generator.generateFont(parameter); 
		
		parameter.size = (int) (h/50);
		medium = generator.generateFont(parameter); 
		
		parameter.size = (int) (h/25);
		large = generator.generateFont(parameter); 
		generator.dispose();
		
	}


	private void loadImages() {
		logo1024 = new Texture(Gdx.files.internal("1024.png"));
		textStyleBorder = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("Images/TextStyleBorder.png"))));
		
	}
}
