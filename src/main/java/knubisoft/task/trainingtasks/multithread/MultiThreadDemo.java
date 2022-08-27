package knubisoft.task.trainingtasks.multithread;

public class MultiThreadDemo {

    public static void main(String[] args) {
        new MultiThreadRealization("One");
        new MultiThreadRealization("Two");
        new MultiThreadRealization("Three");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Main thread is disconnected.");
        }
        System.out.println("Main thread is over.");
    }
}
