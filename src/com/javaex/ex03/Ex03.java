package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {

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
		
		
		
		
		Person per = new Person("정지웅","010-7541-9768","031-123-4567");
		
		pList.add(per);
		
		//출력하기
		for(Person person:pList) {
			System.out.println("이름: "+person.getName());
			System.out.println("핸드폰: "+person.getHp());
			System.out.println("회사: "+person.getCompany());
			System.out.println("");
		}
		///////////////////////////////////////
		//파일에 저장
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Person person : pList) {
			String Str = person.getName() + ","+person.getHp()+","+person.getCompany();
		
			bw.write(Str);
		}
		
		
		
		
		
		bw.close();
		br.close();
	}

}
