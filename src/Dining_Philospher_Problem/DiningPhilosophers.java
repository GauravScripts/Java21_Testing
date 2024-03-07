package Dining_Philospher_Problem;

import java.util.concurrent.Semaphore;

public class DiningPhilosophers {
    public static void main(String[] args) throws InterruptedException {
        Semaphore leftFork = new Semaphore(1);
        Semaphore rightFork = new Semaphore(1);
        Forks forks = new Forks(leftFork, rightFork);
        Philosophers p1 = new Philosophers(1, leftFork, rightFork);
        Philosophers p2 = new Philosophers(2, leftFork, rightFork);
        Philosophers p3 = new Philosophers(3, leftFork, rightFork);
        Philosophers p4 = new Philosophers(4, leftFork, rightFork);
        Philosophers p5 = new Philosophers(5, leftFork, rightFork);
    Thread t1 = new Thread(p1);
    Thread t2 = new Thread(p2);
    Thread t3 = new Thread(p3);
    Thread t4 = new Thread(p4);
    Thread t5 = new Thread(p5);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

    t1.join();
    t2.join();

    t3.join();
    t4.join();
    t5.join();

    }

}
