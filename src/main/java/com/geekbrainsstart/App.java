package com.geekbrainsstart;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int sum(int a,int b){
       return a + b;

    }

    public static int simpleDiv(int a,int b){
        return b == 0 ? -1: a/b;
    }
    public static int multi(int a,int b){
        return a * b;
    }
}
