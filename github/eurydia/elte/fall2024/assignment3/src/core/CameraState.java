package core;


import org.bson.Document;

import java.util.List;

public class CameraState {
    private int centerX;
    private int centerY;

    public CameraState() {
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int value) {
        centerX = value;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int value) {
        centerY = value;
    }
}