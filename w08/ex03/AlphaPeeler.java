package ex03;

import java.io.*;
import java.util.*;

public class AlphaPeeler {
    public static void main(String args[])
    {
        // Thread object created
        // and initiated with data
        Thread t = new Thread("Hello Alphapeeler!");

        // Thread gets started
        t.start();

        // getting data of
        // Thread through String
        String s = t.getName();
        System.out.println(s);
    }
}