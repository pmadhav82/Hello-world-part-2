package test;

import java.util.Scanner;

public class Method {
	Scanner in = new Scanner(System.in);
	
	public void myMethod(){
		for(int a = 50; a<100; a++){
			System.out.print("*");
		}
		System.out.println("");
	}

		public void secondMethod(){
			int x;
			System.out.println("What is your current age?");
			x = in.nextInt();
			if(x>=18){
				System.out.println("You are allowed to buy a drink.");
			}else {
				System.out.println("You are not allowed to buy a drink.");
			}
			
		}
		
	}


