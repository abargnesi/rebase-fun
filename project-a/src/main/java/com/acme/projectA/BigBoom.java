package com.acme.projectA;

public class BigBoom{

	private static int start;
	private static int end;

	public BigBoom(int t){
		start = t;
		end = 0;
	}

	public string makeAboom(){
		while (start > end){
			System.out.println("tick...");
		}
	
		System.out.println("BOOM!");
}
