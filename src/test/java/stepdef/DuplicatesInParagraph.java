package stepdef;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatesInParagraph {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*File file=new File("C:\\Users\\nisha.garudkar\\workspace\\CucumberTest1.0\\config\\paragraph.txt");
		File filedup=new File("C:\\Users\\nisha.garudkar\\workspace\\CucumberTest1.0\\config\\paragraphduplicate.txt");
		FileReader read=new FileReader(file);
		FileReader readdup=new FileReader(filedup);
		BufferedReader buffer = new BufferedReader(read);
		BufferedReader bufferdup = new BufferedReader(readdup);
		String line="";
		String linedup="";
		boolean flag=true;
		while((line=buffer.readLine())!=null && (linedup=bufferdup.readLine())!=null){
			if(!(line.equals(linedup))){
				flag=false;
				System.out.println(line+" "+linedup);
				break;
			}
				
		}
		System.out.println(flag);*/
			
		File file=new File("C:\\Users\\nisha.garudkar\\workspace\\CucumberTest1.0\\config\\paragraph.txt");
		//File filedup=new File("C:\\Users\\nisha.garudkar\\workspace\\CucumberTest1.0\\config\\paragraphduplicate.txt");
		FileReader read=new FileReader(file);
		//FileReader readdup=new FileReader(filedup);
		BufferedReader buffer = new BufferedReader(read);
		//BufferedReader bufferdup = new BufferedReader(readdup);
		String line="";
		char[] ch;
		HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
		while((line=buffer.readLine())!=null){
		    ch=line.toCharArray();
		    for(char ch1:ch){
		    if(hm.containsKey(ch1))
		    	hm.put(ch1, hm.get(ch1)+1);
		    	else
		    		hm.put(ch1, 1);
		   		    }   
		}
		Set<Character> set=new HashSet<Character>();
		for(Map.Entry<Character, Integer> map:hm.entrySet()){
			if(map.getValue()>=2)
				set.add(map.getKey());
		}
		System.out.println(set);
		
		File filecreate=new File("C:\\Users\\nisha.garudkar\\workspace\\CucumberTest1.0\\config\\result.txt");
		file.createNewFile();
		FileWriter write=new FileWriter(filecreate);
		write.write("\n");
		write.write(set.toString());
		write.close();
		
	/*My name is Nisha
Order number is SBL-1000000*/	
		
		
		
	}


}
