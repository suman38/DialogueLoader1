package com.suman.game2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import com.google.gson.Gson;

public class MainClass2 {

	public MainClass2()
	{
		Gson gsonlib = new Gson();
		String str = loadFile("res/dialogues.json");
		System.out.println(str);
		Dialogue d = gsonlib.fromJson(str, Dialogue.class);
		
		System.out.println("Npc:"+d.npcname);
		if(!d.dialogues.isEmpty())
		{
//			int r = (int)Math.random()*1+0;
			System.out.println(d.dialogues.get(1));
		}
	}
	
	private String loadFile(String path)
	{
		StringBuilder strjson = new StringBuilder();
		String s = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while((s = br.readLine())!=null) {
				strjson.append(s.trim());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return strjson.toString();
	}

	public static void main(String[] args) {
		new MainClass2();
	}
}
