package knubisoft.task.trainingtasks.simplethread;

import knubisoft.task.trainingtasks.simplethread.RunnableRealization;

public class ThreadDemo {

    public synchronized static void main(String[] args) {

        new RunnableRealization();

        try {
            for(int i = 5; i > 0; i--){
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Main thread is disconnected.");
        }
        System.out.println("Main thread is completed.");
    }
}
