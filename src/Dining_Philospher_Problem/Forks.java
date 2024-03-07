package Dining_Philospher_Problem;

import java.util.concurrent.Semaphore;

public class Forks {
    private final Semaphore leftFork;
    private final Semaphore rightFork;

    public Forks(Semaphore leftFork, Semaphore rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }
}
