package com.company.digital;

public class AsciiValueAtoZ
{
    public static void main(String[] args)
    {
        for(int i = 65; i <= 90; i++)
        {
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
        }
        System.out.println("---------------------------------------");
        for(int i = 97; i <= 122; i++)
        {
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
        }
    }
}