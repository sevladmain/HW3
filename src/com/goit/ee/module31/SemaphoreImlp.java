package com.goit.ee.module31;

/**
 * Created by SeVlad on 01.09.2016.
 */
public class SemaphoreImlp implements Semaphore {
    private int permits;

    public SemaphoreImlp() {
        permits = 1;
    }

    @Override
    public synchronized void acquire() throws InterruptedException {
       acquire(1);
    }

    @Override
    public synchronized void acquire(int permits) throws InterruptedException {
        if (permits <= 0)
            throw  new IllegalArgumentException("Number of permits is nonpositive: " + permits);
        while(this.permits != permits){
            wait();
        }
        if(permits == 1)
            notify();
        else
            notifyAll();
    }

    @Override
    public synchronized void release() {
        release(1);
    }

    @Override
    public synchronized void release(int permits) {
        
    }

    @Override
    public int getAvailablePermits() {
        return permits;
    }
}
