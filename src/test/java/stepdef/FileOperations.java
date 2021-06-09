package stepdef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuffer buff=new StringBuffer();
		File file=new File("C:\\Users\\nisha.garudkar\\workspace\\CucumberTest1.0\\config\\message.txt");
		FileReader read=new FileReader(file);
		BufferedReader buffer = new BufferedReader(read);
		String line="";
		int k=0;
		boolean found = false;
		while((line=buffer.readLine())!=null)
		{
			if(line.contains("SBL")){
				for(int i=0;i<line.length();i++){
					if(line.charAt(i)=='S' && line.charAt(i+1)=='B')
						{	k=i;
						line = line.replace(line.substring(k, k+11), "SBL-7654543");
						found=true;
						break;
						}
					if(found==true)
						break;
					}
				
			}
			buff.append(line);
			buff.append("\n");
			
			
		}
		buffer.close();
		System.out.println(buff.toString());
		FileWriter writer=new FileWriter("C:\\Users\\nisha.garudkar\\workspace\\CucumberTest1.0\\config\\message.txt");
		writer.write(buff.toString());
		writer.close();
		
		
	/*My name is Nisha
Order number is SBL-1000000*/	
		
	}

}
