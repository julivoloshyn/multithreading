package knubisoft.task.trainingtasks.threadinreraction;

public class Q {

    int n;
    boolean valueSet = false;

    synchronized int get(){
        while(!valueSet)
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println("InterruptedException is caught");
            }

            System.out.println("Got " + n);
            valueSet = false;
            notify();
            return n;
        }

        synchronized void put(int n){
            while(valueSet)
                try {
                    wait();
                } catch (InterruptedException e){
                    System.out.println("InterruptedException is caught");
                }

                this.n = n;
                valueSet = true;
                System.out.println("Sent " + n);
                notify();
    }
}
