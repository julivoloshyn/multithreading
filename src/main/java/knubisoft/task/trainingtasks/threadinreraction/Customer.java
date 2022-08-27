package knubisoft.task.trainingtasks.threadinreraction;

public class Customer implements Runnable{

    Q q;

    Customer(Q q){
        this.q = q;
        new Thread(this, "Customer").start();
    }

    @Override
    public void run() {
        while(true) {
            q.get();
        }
    }
}
