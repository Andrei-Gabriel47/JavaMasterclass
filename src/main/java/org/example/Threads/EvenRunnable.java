package org.example.Threads;

public class EvenRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=2 ; i<=10; i+=2){
            System.out.println("Runnable: " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Runnable Interrupted");
                break;
            }
        }
    }
}
