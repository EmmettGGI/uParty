package com.GGI.uParty.Objects;

import com.GGI.uParty.uParty;
import com.GGI.uParty.Network.Party;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class PartyModule {
	public uParty u;
	public SpriteBatch pic;
	public ShapeRenderer shape;
	
	private GlyphLayout layout = new GlyphLayout();
	
	private float w = Gdx.graphics.getWidth(),h = Gdx.graphics.getHeight();
	
	public Rectangle bounds;
	
	public Party p;
	
	public ImageButton voteUp;
	public ImageButton voteDown;
	
	public Rectangle voteUpB = new Rectangle();
	public Rectangle voteDownB = new Rectangle();
	
	public TextureRegion flippedUp,flippedDown;
	
	public PartyModule(uParty u,Party p){
		this.u=u;
		this.p=p;
		pic = new SpriteBatch();
		shape = new ShapeRenderer();
		bounds = new Rectangle();
		
		voteUp = new ImageButton(new TextureRegionDrawable(u.assets.voteButtonUp),new TextureRegionDrawable(u.assets.voteButtonDown),new TextureRegionDrawable(u.assets.voteButtonDown));
		
		flippedUp = new TextureRegion(u.assets.voteButtonUp);
		flippedUp.flip(false, true);
		flippedDown = new TextureRegion(u.assets.voteButtonDown);
		flippedDown.flip(false, true);
		
		voteDown = new ImageButton(new TextureRegionDrawable(flippedUp),new TextureRegionDrawable(flippedDown),new TextureRegionDrawable(flippedDown));
		
		voteUp.setBounds(voteUpB.x, voteUpB.y, voteUpB.width, voteUpB.height);
		voteDown.setBounds(voteDownB.x, voteDownB.y, voteDownB.width, voteDownB.height);
	}
	
	public void render(){
		voteUpB = new Rectangle(bounds.x+.85f*bounds.width,bounds.y+.625f*bounds.height,.1f*bounds.width,.35f*bounds.height);
		voteDownB = new Rectangle(bounds.x+.85f*bounds.width,bounds.y+.075f*bounds.height,.1f*bounds.width,.35f*bounds.height);
		voteUp.setBounds(voteUpB.x, voteUpB.y, voteUpB.width, voteUpB.height);
		voteDown.setBounds(voteDownB.x, voteDownB.y, voteDownB.width, voteDownB.height);
		
		shape.begin(ShapeType.Filled);
		shape.setColor(Color.DARK_GRAY);
		shape.rect(bounds.x,bounds.y,bounds.width,bounds.height);
		shape.setColor(u.assets.dark);
		shape.rect(bounds.x,bounds.y,bounds.width,.05f*bounds.height);
		//shape.rect(bounds.x,bounds.y+.95f*bounds.height,bounds.width,.05f*bounds.height);
		shape.end();
		
		pic.begin();
		u.assets.medium.setColor(u.assets.orange);
		u.assets.medium.draw(pic, p.name, bounds.x+.05f*bounds.width, bounds.y+.95f*bounds.height);
		u.assets.small.setColor(Color.WHITE);
		u.assets.small.draw(pic, "Time: "+p.d.toString(), bounds.x+.05f*bounds.width, bounds.y+.7f*bounds.height);
		if(p.description.length()>35){
		u.assets.small.draw(pic, "Description: "+p.description.substring(0,35), bounds.x+.05f*bounds.width, bounds.y+.5f*bounds.height);
		u.assets.small.draw(pic, p.description.substring(35,p.description.length()-1), bounds.x+.05f*bounds.width, bounds.y+.3f*bounds.height);
		}else{u.assets.small.draw(pic, "Description: "+p.description, bounds.x+.05f*bounds.width, bounds.y+.5f*bounds.height);}
		layout.setText(u.assets.medium, ""+p.vote);
		u.assets.medium.setColor(u.assets.orange);
		u.assets.medium.draw(pic, ""+p.vote, .9f*w-layout.width/2, bounds.y+bounds.height/2+layout.height/2);
		voteUp.draw(pic, 1);
		voteDown.draw(pic, 1);
		pic.end();
	}
	
	public boolean down(Rectangle touch){
		return false;
		
	}
	public boolean up(Rectangle touch){
		return false;
		
	}
}
