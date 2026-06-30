package org.example.Threads;

public class MainChallange {
    public static void main(String[] args) {
        OddThread oddThred = new OddThread();
        Thread evenThread = new Thread(new EvenRunnable());
        oddThred.start();
        evenThread.start();

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        oddThred.interrupt();
    }
}
