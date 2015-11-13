package com.WIPLUU.stressapp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by rakion3498 on 11/3/2015.
 */
public class Background {
    private Texture back;
    private int x;
    private int y;

    Background(Texture t) {
        back = t;
        x = 0;
        y = 0;
    }

    public void draw(SpriteBatch b, int x, int y)
    {

        b.draw(back, 0, 0, x, y);
    }

}
