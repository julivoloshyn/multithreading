package knubisoft.task.trainingtasks.synchronizedthread;

public class Caller implements Runnable{
    String message;
    CallMe target;
    Thread t;

    public Caller(CallMe trg, String str){
        target = trg;
        message = str;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(message);
        }
    }
}
