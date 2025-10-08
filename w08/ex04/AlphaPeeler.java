package ex04;
import java.io.*;
import java.util.*;

public class AlphaPeeler implements Runnable {
    public void run()
    {
        System.out.println(
            "Thread created and is now running via Runnable Interface");
    }
    public static void main(String[] args)
    {
        // aligning AlphaPeeler Class with
        // Runnable interface
        Runnable r1 = new AlphaPeeler();
        Thread t1 = new Thread(r1, "AlphaPeeler Thread ");
        // Thread object started
        t1.start();
        // getting the Thread
        // with String Method
        String str = t1.getName();
        System.out.println(str);
    }
}
