package knubisoft.task.trainingtasks.synchronizedthread;

public class SynchronizedThreadRealisation {

    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller clr1 = new Caller(target, "Welcome");
        Caller clr2 = new Caller(target, "into synchronized");
        Caller clr3 = new Caller(target, "world");

        try {
            clr1.t.join();
            clr2.t.join();
            clr3.t.join();
        } catch (InterruptedException e){
            System.out.println("Disconnected");
        }
    }
}
