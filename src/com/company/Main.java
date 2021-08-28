package com.company;

public class Main {
    public static int generateRandomAge()
    {
        return (int) (Math.random() * 107) + 1;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 1; i++)
        {
            int x = generateRandomAge();
            System.out.println(x);
        }
    }
}