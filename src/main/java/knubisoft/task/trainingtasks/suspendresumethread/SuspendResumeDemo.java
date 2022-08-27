package knubisoft.task.trainingtasks.suspendresumethread;

public class SuspendResumeDemo {

    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");

        try {
            Thread.sleep(1000);
            nt1.mySuspend();
            System.out.println("Suspending thread One");
            Thread.sleep(1000);
            nt1.myResume();
            System.out.println("Resuming thread One");
            Thread.sleep(1000);
            nt2.mySuspend();
            System.out.println("Suspending thread Two");
            Thread.sleep(1000);
            nt2.myResume();
            System.out.println("Resuming thread Two");
        } catch (InterruptedException e){
            System.out.println("Main thread is disconnected");
        }

        try {
            System.out.println("Waiting for threads ending.");
            nt1.t.join();
            nt2.t.join();
        } catch (InterruptedException e){
            System.out.println("Main thread is disconnected");
        }
        System.out.println("Main thread is disconnected");
    }
}
