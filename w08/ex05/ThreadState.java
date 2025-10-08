// creation of ThreadState class
// to implement Runnable interface
package ex05;
class AlphaPeeler implements Runnable {
    public void run() {
        // implementing try-catch Block to set sleep state
        // for inactive thread
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException intExcp1) {
        	intExcp1.printStackTrace();
        }
        System.out.println(
            "AlphaPeeler - The state for thr1 after it invoked join method() on thread thr2"
            + " " + ThreadState.thr1.getState());
        // implementing try-catch block
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException intExcp2) {
        	intExcp2.printStackTrace();
        }
    }
}
public class ThreadState implements Runnable {
    public static Thread thr1;
    public static ThreadState state1;
    public static void main(String args[]) {
        state1 = new ThreadState();
        thr1 = new Thread(state1);
        System.out.println("after-spanning, state of thr1 is" + " " + thr1.getState());
        // lets invoke start() method on thr1
        thr1.start();
        // Now,Thread thr1 is moved to runnable state
        System.out.println(
            "after invoking of start() method, state of thr1 is"
            + " " + thr1.getState());
    }
    public void run() {
        AlphaPeeler apeeler1 = new AlphaPeeler();
        Thread thr2 = new Thread(apeeler1);
        // Thread is created and its in new state.
        thr2.start();
        // Now thr2 is moved to runnable state
        System.out.println(
            "state of thr2 Thread, after-calling of start() method is"
            + " " + thr2.getState());
        // create a try-catch block to set thr1 in waiting
        // state
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException intExcp3) {
        	intExcp3.printStackTrace();
        }
        System.out.println(
            "State of Thread thr2 after invoking to method sleep() is"
            + " " + thr2.getState());
        try {
            thr2.join();
            System.out.println(
                "State of Thread thr2 after join() is"
                + " " + thr2.getState());
        }
        catch (InterruptedException intExcp4) {
        	intExcp4.printStackTrace();
        }
        System.out.println(
            "state of Thread thr1 after completing the execution is"
            + " " + thr1.getState());
    }
}