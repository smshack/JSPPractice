package com.javalec25.ex;

public class test {
public static void main(String[] args) {
	String uri ="/JSPPractice/lec25/insert.do";
	int cut = uri.lastIndexOf('/');
	String result =uri.substring(0,cut+1);
	String result2 =uri.substring(cut+1);
	
	System.out.println(uri);
	System.out.println(cut);
	System.out.println(result);
	System.out.println(result2);
	
}
}
