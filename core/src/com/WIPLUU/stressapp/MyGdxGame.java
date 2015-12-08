package com.WIPLUU.stressapp;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;




public class MyGdxGame extends ApplicationAdapter {

    SpriteBatch batch;
    Texture img;
    Background test1;
    TextureAtlas buttonAtlas;
    Skin buttonSkin;
    Button pewpButton;

    @Override
    public void create() {
        img = new Texture("johncena.jpg");
        test1 = new Background(img);
        batch = new SpriteBatch();
        buttonAtlas = new TextureAtlas("buttonAtlas/buttonAtlas.atlas");
        buttonSkin = new Skin();
        buttonSkin.addRegions(buttonAtlas);
        pewpButton = new Button(buttonSkin.getDrawable("pika big"));

    }

    @Override
    public void render() {
        Stage splash = new Stage();
        splash.addActor(pewpButton);

        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        test1.draw(batch, Gdx.graphics.getWidth(), Gdx.graphics.getHeight()); //change later
        splash.draw();
        batch.end();

    }
}
