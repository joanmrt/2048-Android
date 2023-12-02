package com.example.a2048;

import android.widget.Button;

import java.util.concurrent.ThreadLocalRandom;

public class MainGame {
    NumberObject[][] positionArray = {{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null}};

    public void main(){

    }

    public void insertNumberObject(){

        int randomX = ThreadLocalRandom.current().nextInt(0, 3+1);
        int randomY = ThreadLocalRandom.current().nextInt(0, 3+1);
        NumberObject numberObject = new NumberObject(randomY,randomX, 2);

        positionArray[randomY][randomX] = numberObject;
    }
}
