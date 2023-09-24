package org.deseri;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execution {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		FileReader fr=new FileReader("C:\\Users\\Dinesh\\eclipse-workspace\\DeserializeJSON\\src\\test\\resources\\file.json");
	    ObjectMapper objmap=new ObjectMapper();
	    DeserialJSON readValue = objmap.readValue(fr, DeserialJSON.class);
	    String name = readValue.getName();
	    System.out.println(name);
	    System.out.println(readValue.getAge());
	    System.out.println(readValue.isStatus());
	    System.out.println(readValue.getAddress().getCity());
	    System.out.println(readValue.getAddress().getState());
	    System.out.println(readValue.getCourses());
	}

}
