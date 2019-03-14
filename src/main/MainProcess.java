package main;

import java.util.ArrayList;

import similarity.Migration;
import similarity.Split;

public class MainProcess {
	
	public static void main (String args[]) throws Exception{
		Split sp = new Split();
		String path = "migrations";
		ArrayList<Migration> migrats = new ArrayList<>();
		migrats = sp.readMigration(path, "talker");
		sp.storeTrans(migrats);
		
		String inputPath = "input.cpp";
		sp.suggestion(inputPath);
		System.out.println();
	}

}
