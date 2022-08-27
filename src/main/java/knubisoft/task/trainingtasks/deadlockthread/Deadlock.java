package knubisoft.task.trainingtasks.deadlockthread;

public class Deadlock implements Runnable{

    A a = new A();
    B b = new B();

    Deadlock(){
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this, "Rival thread");
        t.start();

        a.foo(b);
        System.out.println("Back to Main thread");
    }

    @Override
    public void run() {
        b.bar(a);

        System.out.println("Back to another thread");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
