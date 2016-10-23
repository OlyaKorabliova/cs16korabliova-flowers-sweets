package com.korabliova.study.home_tasks;

/**
 * Created by Olia on 17.10.2016.
 */
public enum FlowerType {
    CHAMOMILE, ROSE, TULIP, NO_TYPE;

    public String toString() {
        switch (this) {
            case CHAMOMILE:
                return "chamomile";
            case ROSE:
                return "rose";
            case TULIP:
                return "tulip";
            default:
                return "no type";
        }
    }
}
