package com.bcapp.tictactoe;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class Tile {
    private TextView textView;
    private boolean occupied_x = false;
    private boolean occupied_o = false;

    public Tile(TextView textView) {
        this.textView = textView;

    }

    public TextView getTextView() {
        return textView;
    }

    public boolean getOccupied_x() {
        return occupied_x;
    }

    public void setOccupied_x(boolean occupied_x) {
        this.occupied_x = occupied_x;
    }

    public boolean getOccupied_o() {
        return occupied_o;
    }

    public void setOccupied_o(boolean occupied_o) {
        this.occupied_o = occupied_o;
    }
}
