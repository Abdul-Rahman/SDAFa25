package ex01;

import java.io.*;
import java.util.*;

public class AlphaPeeler extends Thread {
    // initiated run method for Thread
    public void run()
    {
        System.out.println("AlphaPeeler Thread is Running...");
    }
    public static void main(String[] args)
    {
        AlphaPeeler alphaOne = new AlphaPeeler();
        // Invoking Thread using start() method
        alphaOne.start();
    }
}

