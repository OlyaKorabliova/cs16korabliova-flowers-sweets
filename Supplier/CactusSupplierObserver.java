package Supplier;

/**
 * Created by Olia on 20.11.2016.
 */
public class CactusSupplierObserver extends Observer {

    public CactusSupplierObserver(Observable observable) {
        this.subject = observable;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("We need more cactus!!!");
    }
}
