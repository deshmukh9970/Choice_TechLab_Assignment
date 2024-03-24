package com.dynamic;

//FizzBuzz: A classic question to test basic programming logic. Write a program that prints the numbers 
//from 1 to 100. But for multiples of three, print "Fizz" instead of the number, and for the multiples of 
//five, print "Buzz". For numbers that are multiples of both three and five, print "FizzBuzz".

public class FizzBuzz {

    public static void fizzBuzz(int num) 
    {
        for(int i=1;i<=num;i++) 
        {
            if(i%3==0 && i%5==0) 
            {
                System.out.println("FizzBuzz");
                
            }else if(i%3==0)
            {
                System.out.println("Fizz");
                
            }else if(i%5==0) 
            {
                System.out.println("Buzz");
                
            }else
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        fizzBuzz(100); 
    }
}

