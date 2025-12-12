package Java.lec21;


class MyThread extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++) {

        }
    }
}
 class Main {
    public static void main(String[] args)  {
        MyThread t1=new MyThread();
        t1.start();

        for (int i=0;i<5;i++ ) {
            System.out.println("Main");

        }
    }
    
}
