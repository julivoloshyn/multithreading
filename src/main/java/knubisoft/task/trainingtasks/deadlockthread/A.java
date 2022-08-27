package knubisoft.task.trainingtasks.deadlockthread;

public class A {

    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " entered to method A.foo()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Class A disconnected");
        }
        System.out.println(name + " trying to call method B.last()");
        b.last();
    }

        synchronized void last(){
            System.out.println("In method A.last()");
    }
}
