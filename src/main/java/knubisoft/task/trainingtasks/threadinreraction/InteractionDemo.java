package knubisoft.task.trainingtasks.threadinreraction;

public class InteractionDemo {

    public static void main(String[] args) {

        Q q = new Q();
        new Producer(q);
        new Customer(q);

        System.out.println("Click CTRL-C to stop");
    }
}
