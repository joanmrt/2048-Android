package com.example.a2048;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    private GestureDetector gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gestureDetector = new GestureDetector(this, this);

        insertNumberObject();

    }

    NumberObject[][] positionArray = {{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null}};

    public void main(){

    }

    public void insertNumberObject(){
        GridLayout gl = findViewById(R.id.gridLayoutGame);

        int randomX = ThreadLocalRandom.current().nextInt(0, 3+1);
        int randomY = ThreadLocalRandom.current().nextInt(0, 3+1);
        NumberObject numberObject = new NumberObject(randomY,randomX, 2);

        positionArray[randomY][randomX] = numberObject;

        GridLayout.LayoutParams params = new GridLayout.LayoutParams();
        params.columnSpec = GridLayout.spec(randomY);
        params.rowSpec = GridLayout.spec(randomX);
        params.width = 200;
        params.height = 200;

        Button button = new Button(this);
        button.setText(Integer.toString(numberObject.getValue()));
        button.setBackgroundResource(R.drawable.buttons);
        button.setLayoutParams(params);
        button.setId(R.id.ButtonTest);
        gl.addView(button);

    }


    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        // Calculate the distance and velocity to determine if it's a valid fling
        float distanceX = e2.getX() - e1.getX();
        float distanceY = e2.getY() - e1.getY();

        if (Math.abs(distanceX) > Math.abs(distanceY) &&
                Math.abs(distanceX) > 100 && Math.abs(velocityX) > 100) {
            // Horizontal fling detected
            if (distanceX > 0) {
                // Fling to the right

            } else {
                // Fling to the left

            }
            return true;
        } else if (Math.abs(distanceY) > Math.abs(distanceX) &&
                Math.abs(distanceY) > 100 && Math.abs(velocityY) > 100) {
            // Vertical fling detected
            if (distanceY > 0) {
                // Fling down

            } else {
                // Fling up

            }
            return true;
        }

        return false;
    }

    public void moverPantallaDerecha(){
        Button button = findViewById(R.id.ButtonTest);

        GridLayout.LayoutParams params = (GridLayout.LayoutParams) button.getLayoutParams();

        //int row = params.rowSpec()

    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return gestureDetector.onTouchEvent(event) || super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(@NonNull MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(@NonNull MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(@NonNull MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(@Nullable MotionEvent e1, @NonNull MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(@NonNull MotionEvent e) {

    }


}