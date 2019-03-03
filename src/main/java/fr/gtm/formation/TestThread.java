package fr.gtm.formation;

public class TestThread {

    public static void main(String[] args) throws Exception {

        Runnable run = new Runnable() {
            @Override
            public void run() {

                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };



        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);


        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();


        System.out.println("Done !");
    }
}
