package com.acme.projectA;

public class Main {

    private static final int COUNT = 10;
    private BigBoom bomb;

    public static void main(final String[] args) {

	for (int i = 0; i < 10; i++)
        	System.out.println("Hello World");

	bomb = new BigBoom(COUNT);
	bomb.makeAboom();
	
    }
}

