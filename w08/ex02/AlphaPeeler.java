package ex02;
import java.io.*;
import java.util.*;

public class AlphaPeeler implements Runnable {
    // method to start Thread
    public void run()
    {
        System.out.println(
            "AlphaPeeler Thread is Running...");
    }

    public static void main(String[] args)
    {
        AlphaPeeler alphaOne = new AlphaPeeler();
        // initializing Thread Object
        Thread t1 = new Thread(alphaOne);
        t1.start();
    }
}
