package stepdef;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RuntimePolymorphism extends StringPrograms{
	
	public int datamember=10;
	@Override
	public void Removefromfirstwhichisinsecond(String str1, String str2){
		
		Set<Character> maskSet = new HashSet<Character>();
        for(char c: str2.toCharArray()){
            maskSet.add(c);
        }
        
        List<Character> output = new ArrayList<Character>();
        for (int i = 0; i < str1.length(); i++) {
            // HashSet look up O(1)
            if(!maskSet.contains(str1.charAt(i))){
                // List add O(1)
                output.add(str1.charAt(i));
            }
        }
        System.out.println(String.valueOf(output)+"child"+datamember);
	}
	
	public static void main(String[] args)
	{
		StringPrograms s=new RuntimePolymorphism();
		System.out.println(s.datamember);
		s.Removefromfirstwhichisinsecond("nisha", "ni");
		
	}
	

}


