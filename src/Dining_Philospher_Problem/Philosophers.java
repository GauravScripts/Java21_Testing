package Dining_Philospher_Problem;

import java.util.concurrent.Semaphore;

public class Philosophers implements Runnable {
    private final int id;
    private final Semaphore leftFork;
    private final Semaphore rightFork;

    public Philosophers(int id, Semaphore leftFork, Semaphore rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        try{
            while(true){
                think();

                pickFork();
                eat();
        downFork();
            }
        }
        catch (InterruptedException e){
           Thread.currentThread().interrupt();
        }

    }
    public void think() throws InterruptedException{
        System.out.println("Philosopher " + id + " is thinking");
        Thread.sleep((long) (Math.random() * 1000));
    }
    public void eat() throws InterruptedException{
        System.out.println("Philosopher " + id + " is eating");
        Thread.sleep((long) (Math.random() * 1000));
    }
    public void pickFork() throws InterruptedException{
       leftFork.acquire();
        System.out.println("Philosopher " + id + " picked up left fork");
        rightFork.acquire();
        System.out.println("Philosopher " + id + " picked up right fork");
    }
    public void downFork() throws InterruptedException{
        leftFork.release();
        System.out.println("Philosopher " + id + " put down left fork");
        rightFork.release();
        System.out.println("Philosopher " + id + " put down right fork");
    }

}
