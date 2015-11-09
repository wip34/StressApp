package com.WIPLUU.stressapp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by rakion3498 on 11/3/2015.
 */
public class Background {
    private Texture back;

    Background(Texture t) {
        back = t;
    }

    public void draw(SpriteBatch b)
    {
        b.draw(back, 0, 0);
    }


}
