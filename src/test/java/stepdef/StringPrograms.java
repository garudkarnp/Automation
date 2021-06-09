package stepdef;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am a girl";
		String sec = "ag";
		//ReverseStringPreserveSpace(str);
		//MaxOccuringcharacter(str);
		//RemoveDuplicates(str);
		StringPrograms a = new StringPrograms();
		a.Removefromfirstwhichisinsecond(str,sec);
		
	}
		
		
		
		public static void ReverseStringPreserveSpace(String input){
		char[] inputArray = input.toCharArray();  
        char[] result = new char[inputArray.length];  
   
        for (int i = 0; i < inputArray.length; i++) {  
            if (inputArray[i] == ' ') {  
                result[i] = ' ';  
            }  
        }  
   
        int j = result.length - 1;  
   
        for (int i = 0; i < inputArray.length; i++) {  
            if (inputArray[i] != ' ') {  
                if (result[j] == ' ') {  
                    j--;  
                }  
                result[j] = inputArray[i];  
                j--;  
            
        }  
        System.out.println(input + " --> " + String.valueOf(result));  
        }
	}



   public static void MaxOccuringcharacter(String input){
	   char[] a = input.toCharArray();
	   char c=input.charAt(0);
	   ArrayList<Character> li= new ArrayList<Character>();
	   int maxcount=0;
	   for(int i=0;i<a.length;i++){
		   int count=0;
		   if(!(li.contains(a[i])) && a[i]!=' '){
			   li.add(a[i]);
			   count++;
			   for(int j=i+1;j<a.length;j++){
				   if(a[i]==a[j])
					   count++;
				   }
			   if(count>maxcount){
				   maxcount=count;
				   c= input.charAt(i);
				   
			   }
			   
			   }
		   }
	   System.out.println(c);
	   System.out.println(maxcount);
	   
	   }
	   
	public static void RemoveDuplicates(String str){
		char[] a = str.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<a.length;i++){
			set.add(a[i]);	
		}
		/*char[] res = new char[a.length];
		for(int i=0;i<a.length;i++){
			res[i]=set.;	
		}*/
		System.out.println(set.toString());
		
	}

	public int datamember=20;
	public void Removefromfirstwhichisinsecond(String str1, String str2){
		int datamember=20;
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
        System.out.println(String.valueOf(output)+"parent"+datamember);
        
        String li="$50.00";
        String[] arrx=li.split("[$.]");
        for(String s:arrx)
        System.out.println(s);
        System.out.println(arrx[2]);
	}
	
	
}

		


