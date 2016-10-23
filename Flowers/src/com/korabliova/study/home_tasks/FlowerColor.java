package com.korabliova.study.home_tasks;

/**
 * Created by Olia on 17.10.2016.
 */
public enum FlowerColor {
    RED, WHITE, BLUE, YELLOW, NO_COLOR;

    public String toString() {
        String a;
        switch (this) {
            case WHITE:
                a = "White";
                break;
            case RED:
                a = "Red";
                break;
            case BLUE:
                a = "Blue";
                break;
            case YELLOW:
                a = "Yellow";
                break;
            default:
                a = "No color";
                break;
        }
        return a;
}

}
