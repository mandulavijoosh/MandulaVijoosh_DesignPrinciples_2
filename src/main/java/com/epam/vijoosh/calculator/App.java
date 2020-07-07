package com.epam.vijoosh.calculator;

import java.util.*;
import Math.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
		int a,b;
		Operations op=new Operations();
		while(true){
			System.out.println("Enter your choice");
			System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide 5.Exit");
			int c=sc.nextInt();
			if(c==5)
				break;
			System.out.println("enter two numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			switch(c){
			       case 1:op.add(a,b);
			       break;
			       case 2:op.sub(a,b);
			       break;
			       case 3:op.mul(a,b);
			       break;
			       case 4:op.div(a,b);
			       break;
			       default:System.out.println("Invalid choice");
			       
				}
		}
		sc.close();
    }
}


