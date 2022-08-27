package knubisoft.task.trainingtasks.synchronizedthread;

public class CallMe {

    void call(String message){
        System.out.println("[" + message);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("Disconnected");
        }
        System.out.println("]");
    }

}
