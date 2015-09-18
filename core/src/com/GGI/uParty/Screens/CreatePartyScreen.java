package com.GGI.uParty.Screens;

import com.GGI.uParty.uParty;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextArea;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle;
import com.badlogic.gdx.utils.Align;

public class CreatePartyScreen implements Screen,InputProcessor{
	public uParty u;
	private SpriteBatch pic = new SpriteBatch();
	private float w = Gdx.graphics.getWidth(),h = Gdx.graphics.getHeight();
	private GlyphLayout layout = new GlyphLayout();
	
	private Rectangle nameB = new Rectangle(w/4,13*h/16,w/2,h/16);
	private Rectangle hourB = new Rectangle(4*w/16,23*h/32,w/8,h/16);
	private Rectangle minB = new Rectangle(7*w/16,23*h/32,w/8,h/16);
	private Rectangle descriptionB = new Rectangle(w/8,9*h/16,3*w/4,h/8);
	private Rectangle whereB = new Rectangle(w/8,13*h/32,3*w/4,h/8);
	private Rectangle tSwitchB = new Rectangle(10*w/16,23*h/32,w/8,h/16);
	
	private TextButtonStyle buttonStyle;
	private TextButton createParty;
	private TextButton tSwitch;
	private boolean isPm=false;
	
	private TextFieldStyle style;
	private TextField name;
	private TextField hour;
	private TextField min;
	private TextField description;
	private TextField where;
	
	
	
	public String n="",d="",hr="12",m="00",wr="";
	
	public CreatePartyScreen(uParty u) {
		this.u=u;
		
		/** Text Field Setup */
		style = new TextFieldStyle();
			style.font=u.assets.medium;
			style.fontColor=u.assets.orange;
			style.background=u.assets.textStyleBorder;
		name = new TextField(n,style);
			name.setBounds(nameB.x, nameB.y, nameB.width, nameB.height);
			name.setMessageText("Event Name");
			name.setAlignment(Align.center);
		hour = new TextField(hr,style);
			hour.setBounds(hourB.x, hourB.y, hourB.width, hourB.height);
			hour.setAlignment(Align.center);
		min = new TextField(m,style);
			min.setBounds(minB.x, minB.y, minB.width, minB.height);
			min.setAlignment(Align.center);
		description = new TextField(d,style);
			description.setBounds(descriptionB.x, descriptionB.y, descriptionB.width, descriptionB.height);
			description.setMessageText("Event Description");
			description.setAlignment(Align.center);
		where = new TextField(wr,style);
			where.setBounds(whereB.x, whereB.y, whereB.width, whereB.height);
			where.setMessageText("Event Location");
			where.setAlignment(Align.center);
		
		
			
		/** Button setup */
		buttonStyle = new TextButtonStyle();
			buttonStyle.font=u.assets.medium;
			buttonStyle.fontColor=u.assets.dark;
			buttonStyle.up=u.assets.buttonStyleUp;
			buttonStyle.down=u.assets.buttonStyleDown;
			buttonStyle.checked=u.assets.buttonStyleDown;
		tSwitch = new TextButton("AM",buttonStyle);
				tSwitch.setBounds(tSwitchB.x, tSwitchB.y, tSwitchB.width, tSwitchB.height);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(.1f, .1f, .1f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		if(isPm){tSwitch.setText("PM");}else{tSwitch.setText("AM");}
		
		pic.begin();
		name.draw(pic, 1);
		hour.draw(pic, 1);
		min.draw(pic, 1);
		description.draw(pic, 1);
		where.draw(pic, 1);
		tSwitch.draw(pic, 1);
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
		// TODO Auto-generated method stub
		return false;
	}

}
