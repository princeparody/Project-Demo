package com.fileoperations;

import java.io.File;
import java.io.IOException;

public class SampleFileOperations {
	
	public static void main(String[] args) throws Exception {
		
	//deleting the files
	
	File f = new File("C:\\Users\\prince\\Desktop\\prince\\work.xlsx");
	
    boolean b = f.delete();
    System.out.println(b);
}
}
