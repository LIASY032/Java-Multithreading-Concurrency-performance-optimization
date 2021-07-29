public class section2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //Code that will run in a new thread
                System.out.println("We are in thread: " + Thread.currentThread().getName());
                System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
            }
        });

        thread.setName("New Worker thread");

        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " before starting a new thread");
        thread.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " after starting a new thread");

        //this will not consume any CPU
//        Thread.sleep(10000);
    }
}
