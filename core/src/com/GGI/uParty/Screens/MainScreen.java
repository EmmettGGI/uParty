/**
 * 
 */
package com.GGI.uParty.Screens;

import com.GGI.uParty.uParty;
import com.GGI.uParty.Network.Party;
import com.GGI.uParty.Objects.PartyList;
import com.GGI.uParty.Objects.PartyModule;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

/**
 * @author Emmett
 *
 */
public class MainScreen implements Screen, InputProcessor{
	public uParty u;
	private SpriteBatch pic = new SpriteBatch();
	private float w = Gdx.graphics.getWidth(),h = Gdx.graphics.getHeight();
	private GlyphLayout layout = new GlyphLayout();
	
	private ShapeRenderer shape = new ShapeRenderer();
	
	public PartyList test = new PartyList();
	private int scrolled = 0;
	public MainScreen(uParty u){
		this.u=u;
		Party p = new Party();
		
		test.add(new PartyModule(u,p));
		test.add(new PartyModule(u,p));
		
	}
	
	@Override
	public void show() {
		Gdx.input.setInputProcessor(this);
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(.1f, .1f, .1f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		test.render(scrolled);
		
		shape.begin(ShapeType.Filled);
		shape.setColor(u.assets.orange);
		shape.rect(0,.95f*h,w,.05f*h);
		float darken = .8f;
		shape.setColor(new Color(darken*(247f/255f),darken*(148f/255f),darken*(29f/255f),1f));
		shape.rect(0,.945f*h,w,.005f*h);
		shape.end();
		
		pic.begin();
		u.assets.medium.setColor(u.assets.dark);
		u.assets.medium.draw(pic, "uParty", .05f*w, .98f*h);
		layout.setText(u.assets.medium, u.assets.myProfile.name);
		u.assets.medium.draw(pic, u.assets.myProfile.name, .95f*w-layout.width, .98f*h);
		pic.end();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		scrolled+=amount;
		return true;
	}

}
