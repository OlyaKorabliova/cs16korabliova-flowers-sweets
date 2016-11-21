package Supplier;

/**
 * Created by Olia on 14.11.2016.
 */
public class ChamomileSupplierObserver extends Observer {

    public ChamomileSupplierObserver(Observable observable) {
        this.subject = observable;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("We need more chamomiles!!!");
    }
}
