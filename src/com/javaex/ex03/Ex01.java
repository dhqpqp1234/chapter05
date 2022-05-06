package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01 {

public static void main(String[] args) throws IOException   {
		
	Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB_원본.txt");
	BufferedReader br = new BufferedReader(fr);
	
		while(true) {
		
		String str = br.readLine();
		
		if(str==null) {
			break;
		}
		
		String[] personinfo = str.split(",");
		
		
		System.out.println(personinfo[1]);
		
		
	}
	
	
	
	br.close();
	fr.close();
	}

}
