package knubisoft.task.trainingtasks.simplethread;

import lombok.SneakyThrows;

public class RunnableRealization implements Runnable{

    Thread t;

    public RunnableRealization(){
        t = new Thread(this, "Demonstration thread.");
        System.out.println("Child thread created: " + t);
        t.start();
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println("Child thread: " + i);
            Thread.sleep(500);
        }
        System.out.println("Child thread is completed.");
    }
}
