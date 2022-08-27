package knubisoft.task.trainingtasks.jointhread;

public class JoinDemo {

    public static void main(String[] args) {
        JoinThreadRealization jtr1 = new JoinThreadRealization("One");
        JoinThreadRealization jtr2 = new JoinThreadRealization("Two");
        JoinThreadRealization jtr3 = new JoinThreadRealization("Three");

        System.out.println("Thread One is launched: " + jtr1.t.isAlive());
        System.out.println("Thread Two is launched: " + jtr2.t.isAlive());
        System.out.println("Thread Three is launched: " + jtr3.t.isAlive());

        try {
            System.out.println("Waiting for thread completion");
            jtr1.t.join();
            jtr1.t.join();
            jtr1.t.join();
        } catch (InterruptedException e){
            System.out.println("Main thread is disconnected");
        }

        System.out.println("Thread One is launched: " + jtr1.t.isAlive());
        System.out.println("Thread Two is launched: " + jtr2.t.isAlive());
        System.out.println("Thread Three is launched: " + jtr3.t.isAlive());

        System.out.println("Main thread is over.");
    }
}
