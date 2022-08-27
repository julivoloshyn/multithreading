package knubisoft.task.trainingtasks.deadlockthread;

public class B {

    synchronized void bar(A a){
        String name = Thread.currentThread().getName();

        System.out.println(name + " entered in method B.bar()");

        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Class B disconnected");
        }
        System.out.println(name + " trying to call method A.last()");
        a.last();
    }
    synchronized void last(){
        System.out.println("In method A.last()");
    }
}
