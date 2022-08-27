package knubisoft.task.trainingtasks.jointhread;

import lombok.SneakyThrows;

public class JoinThreadRealization implements Runnable{

    String name;
    Thread t;

    JoinThreadRealization(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread" + t);
        t.start();
    }

    @SneakyThrows
    @Override
    public void run() {
        for(int i = 5; i > 0; i--){
            System.out.println(name + ": " + i);
            Thread.sleep(1000);
        }
        System.out.println(name + " is over");
    }
}
