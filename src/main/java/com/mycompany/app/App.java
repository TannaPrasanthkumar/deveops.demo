package com.mycompany.app;

import java.lang.*;
import java.util.*;

public class App
{
    public void Alpha_To_Numerical(char ch)
    {
        String str="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                System.err.println(i+1);
                break;
            }
        }
    }
    public static void main(String[] args)
    {
        char ch = 'c';
        System.out.print("THe value is :");
        App a1 = new App();
        a1.Alpha_To_Numerical(ch);
    }
}
