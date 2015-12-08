package com.WIPLUU.stressapp;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Widget ;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;


import javafx.stage.Screen;

public class MyGdxGame extends ApplicationAdapter {

    SpriteBatch batch;
    Texture img;
    Background test1;
    TextureAtlas buttonAtlas;
    Skin buttonSkin;

    @Override
    public void create() {
        img = new Texture("johncena.jpg");
        test1 = new Background(img);
        batch = new SpriteBatch();
        buttonAtlas = new TextureAtlas("buttonAtlas.atlas");
        buttonSkin = new Skin();
        buttonSkin.addRegions(buttonAtlas);

    }

    @Override
    public void render() {
        Button pika = new Button(buttonSkin);
        Stage splash = new Stage(   );
        splash.addActor(pika);
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        test1.draw(batch, Gdx.graphics.getWidth(), Gdx.graphics.getHeight()); //change later
        splash.draw();
        batch.end();

    }
}


