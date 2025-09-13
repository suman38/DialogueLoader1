package com.suman.game;

import com.google.gson.Gson;

public class MainClass1 {
	
	public static void main(String[] args) {
		Gson obj = new Gson();
		
		Demo d1 = new Demo();
		d1.name = "Suman";
		d1.id = 1;
		
		String str = obj.toJson(d1);
		System.out.println(str);
		System.out.println();
		
		Demo d2 = obj.fromJson(str, Demo.class);
		System.out.println(d2.name);
		System.out.println(d2.id);
		
	}

}
