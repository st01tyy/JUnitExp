package edu.bistu.junitexp;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Func func = new Func();
        for(int i = 0; i < 9; i++)
        {
            System.out.println("case " + i + ": " + func.Func(s.nextInt(), s.nextInt(), s.nextInt()));
        }
        s.close();
    }
}
