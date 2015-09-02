package com.GGI.uParty.Screens;

import javax.swing.GroupLayout.Alignment;

import com.GGI.uParty.uParty;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle;
import com.badlogic.gdx.utils.Align;

public class SignUpScreen implements Screen, InputProcessor{
	private uParty u;
	
	private GlyphLayout layout = new GlyphLayout();
	private SpriteBatch pic = new SpriteBatch();
	private float w = Gdx.graphics.getWidth(),h = Gdx.graphics.getHeight();
	
	private Rectangle nameB=new Rectangle(w/4,13*h/16,w/2,h/16);
	private Rectangle monthB=new Rectangle(w/4,23*h/32,w/8,h/16);
	private Rectangle dayB=new Rectangle(13*w/32,23*h/32,w/8,h/16);
	private Rectangle yearB=new Rectangle(18*w/32,23*h/32,3*w/16,h/16);
	private Rectangle emailB=new Rectangle(w/8,20*h/32,3*w/4,h/16);
	private Rectangle passB=new Rectangle(w/8,17*h/32,3*w/4,h/16);
	private Rectangle cpassB=new Rectangle(w/8,14*h/32,3*w/4,h/16);
	
	private TextFieldStyle style;
	private TextField name;
	private TextField month;
	private TextField day;
	private TextField year;
	private TextField email;
	private TextField pass;
	private TextField cpass;
	
	private String n="",m="",d="",y="",e="",p="",cp="";
	
	public SignUpScreen(uParty u) {
		this.u=u;
		
		/** Text Field Setup */
		style = new TextFieldStyle();
		style.font=u.assets.medium;
		style.fontColor=u.assets.orange;
		style.background=u.assets.textStyleBorder;
		
		name=new TextField(n,style);name.setMessageText("Name");name.setBounds(nameB.x,nameB.y,nameB.width,nameB.height);name.setAlignment(Align.center);
		month=new TextField(m,style);month.setMessageText("MM");month.setBounds(monthB.x,monthB.y,monthB.width,monthB.height);month.setAlignment(Align.center);
		day=new TextField(d,style);day.setMessageText("DD");day.setBounds(dayB.x,dayB.y,dayB.width,dayB.height);day.setAlignment(Align.center);
		year=new TextField(y,style);year.setMessageText("YYYY");year.setBounds(yearB.x,yearB.y,yearB.width,yearB.height);year.setAlignment(Align.center);
		email=new TextField(e,style);email.setMessageText("Email (must be .edu)");email.setBounds(emailB.x,emailB.y,emailB.width,emailB.height);email.setAlignment(Align.center);
		pass=new TextField(p,style);pass.setMessageText("Password");pass.setBounds(passB.x,passB.y,passB.width,passB.height);pass.setAlignment(Align.center);pass.setPasswordMode(true);pass.setPasswordCharacter('*');
		cpass=new TextField(cp,style);cpass.setMessageText("Confirm Password");cpass.setBounds(cpassB.x,cpassB.y,cpassB.width,cpassB.height);cpass.setAlignment(Align.center);cpass.setPasswordMode(true);cpass.setPasswordCharacter('*');
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(this);
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(.1f, .1f, .1f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		pic.begin();
		u.assets.large.setColor(u.assets.orange);
		layout.setText(u.assets.large, "Sign Up");
		u.assets.large.draw(pic, "Sign Up", w/2-layout.width/2, h-1.1f*layout.height);
		
		name.draw(pic, 1);
		month.draw(pic, 1);
		day.draw(pic, 1);
		year.draw(pic, 1);
		email.draw(pic, 1);
		pass.draw(pic, 1);
		cpass.draw(pic, 1);
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
