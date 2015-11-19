package com.WIPLUU.stressapp;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import javafx.stage.Screen;

public class MyGdxGame extends ApplicationAdapter {

	SpriteBatch batch;
	Texture img;
	Background test1;
	
	@Override
	public void create () {
		img = new Texture("johncena.jpg");
		test1 = new Background(img);
		batch = new SpriteBatch();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		test1.draw(batch, Gdx.graphics.getWidth(), Gdx.graphics.getHeight()); //change later
		batch.end();
		
	}


