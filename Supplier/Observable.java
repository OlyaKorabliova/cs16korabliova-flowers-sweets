package Supplier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olia on 20.11.2016.
 */
public class Observable {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
