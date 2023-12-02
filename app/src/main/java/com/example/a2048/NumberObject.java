package com.example.a2048;

import android.graphics.Color;

import java.util.ArrayList;

public class NumberObject {
    private int value;
    private int positionY;
    private int positionX;
    private Color color;

    public NumberObject() {
    }

    public NumberObject(int positionY, int positionX, int value){
        this.positionY = positionY;
        this.positionX = positionX;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
