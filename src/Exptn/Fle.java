package Exptn;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fle {

	public static void main(String[] args)throws IOException {
		try {
		File F= new File("C:/thiruu.txt");
        FileReader Fr=new FileReader(F);
		int temp=0;
		
		while((temp=Fr.read())!=-1) {
			System.out.println((char)temp);
		throw new NoFileException("No file found");
		}
		}catch(NoFileException ss) {
		
			System.out.println(ss);
		}
		
	}
	}


