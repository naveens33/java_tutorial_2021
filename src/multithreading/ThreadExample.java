package multithreading;

public class ThreadExample {
    public static void main(String[] agrs) throws InterruptedException {
        MyThread1 obj1 =  new MyThread1();
        Thread th1 = new Thread(obj1);
        MyThread2 obj2 =  new MyThread2();
        Thread th2 = new Thread(obj2);
        Thread th3 = new Thread(() -> {
            System.out.println("MyThread3 Started");
            System.out.println("MyThread3 Completed");
        });
        System.out.println("State of Thread1:"+ th1.getState());
        System.out.println("State of Thread2:"+ th2.getState());
        System.out.println("State of Thread3:"+ th3.getState());
        th1.start();
        th2.start();
        th3.start();
        System.out.println("State of Thread1:"+ th1.getState());
        System.out.println("State of Thread2:"+ th2.getState());
        System.out.println("State of Thread3:"+ th3.getState());
        Thread.sleep(1000);
        System.out.println("State of Thread1:"+ th1.getState());
        System.out.println("State of Thread2:"+ th2.getState());
        System.out.println("State of Thread3:"+ th3.getState());
    }
}

class MyThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("MyThread1 Started");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread1 Completed");
    }
}

class MyThread2 extends Thread{

    @Override
    public void run() {
        System.out.println("MyThread2 Started");
        System.out.println("Current Thread Status: "+Thread.currentThread().getState());
        System.out.println("MyThread2 Completed");
    }
}