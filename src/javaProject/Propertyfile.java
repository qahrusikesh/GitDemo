package javaProject;

import java.io.File;

import java.io.FileReader;
import java.util.Properties;

public class Propertyfile {

	public static void main(String[] args) throws Exception {
		File f=new File("H:\\WebSerREST\\javaProject\\src\\javaProject\\one.properties");
		FileReader fr=new FileReader(f);
		Properties p=new Properties();
		p.load(fr);
		System.out.println(p.getProperty("uri"));
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("no"));
		

	}

}
