package com.viju;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	String name1,name2,name3,name4,name5,name6;
	System.out.println("Please enter your full name without any spaces: ");
	name1 = input.next();
	System.out.println("Your name without any spaces is "+name1);
	System.out.println("There are "+name1.length()+ " characters in your name");
	System.out.println("Your full name in upper case letter is "+name1.toUpperCase());
	System.out.println("Your full name in lower case letter is "+name1.toLowerCase());
	name2 = "Welcome to Java Programming";
	System.out.println("Hello "+name1+" "+ name2);
	System.out.println("Now enter your first name:");
	name3 = input.next();
	System.out.println("Now enter your second name");
	name4 = input.next();
	name5 = name3.concat(name4);
	System.out.println("Your full name is "+name5);
    }
}
