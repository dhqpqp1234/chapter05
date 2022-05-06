package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {

public static void main(String[] args) throws IOException   {
	
	List<Person> pList = new ArrayList<Person>();
	
	Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB_원본.txt");
	BufferedReader br = new BufferedReader(fr);
	
		while(true) {
		
		String str = br.readLine();
		
		if(str==null) {
			break;
		}
		
		String[] personinfo = str.split(",");
		
		String name = personinfo[0];
		String hp = personinfo[1];
		String company = personinfo[2];
		
		Person person = new Person(name,hp,company);
		
		pList.add(person);
	}
	
		for(Person person:pList) {
			System.out.println("이름: "+person.getName());
			System.out.println("핸드폰: "+person.getHp());
			System.out.println("회사: "+person.getCompany());
			System.out.println("");
		}
		
		
		
		br.close();
	}

}
