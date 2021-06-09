package stepdef;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.regex.Pattern;

public class MyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {4, 1, 3, 2, 5};
		int[] arr2 = {1, 2, 5, 3, 4};

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
			System.out.println("true");
		
		
		/*String str1="[^a-z]";
		String str2=str;
		StringBuffer str3=new StringBuffer(str2.replaceAll(str1, ""));
		str3.reverse();
		String str4=str3.toString();
		//System.out.println(str4);
		
		int j=0;
		String res=str;
	
		for(int i=0;i<str.length();i++){
			if(Character.isAlphabetic(str.charAt(i))){
				res=str.replace(str.charAt(i),str4.charAt(j));
				j++;
			}
			
		}
		System.out.println(res);
		String str="a$b%c+&fg*k";
		String str1=str.replaceAll("[^a-z]", "");
		System.out.println(str1);
		char[] ch=str.toCharArray();
		char[] ch1=ch;
		int j=0;
		for(int i=str.length()-1;i>=0;i--){
			if(Character.isAlphabetic(str.charAt(i))){
				ch1[i]=str1.charAt(j);
				j++;
			}
			
			
		}
		String str2=new String(ch1);
		System.out.println(str2);*/
		
		String strgiven="I love my country";
		String str2=strgiven.replaceAll(" ", "");
		char[] ch=str2.toCharArray();
		char[] chgiven=strgiven.toCharArray();
		int j=str2.length()-1;
		//while(j>=0){
		for(int i=0;i<=strgiven.length()-1;i++)
		{
			if(chgiven[i]==' '){
				i++;
				chgiven[i]=ch[j];
				
			}
			else{
				chgiven[i]=ch[j];
			
			}
			j--;
			
			}
		//}
			
		System.out.println(String.valueOf(chgiven));
		
		
		
		
		
		
		
		/*
	    int[] arr1={1,2,3};
	    int[] arr2={1,3,4};
	    int[] arr3={5,7,8};
	    
	    //8 3 5
	    
	    int q=0,n=0;
	    int[] sum=new int[arr1.length];
	    
	    for(int i=arr1.length-1;i>=0;i--){
	    sum[i] = arr1[i]+arr2[i]+arr3[i]+q;
	    n=sum[i];
	    sum[i]=n%10;
	    q=n/10;
	    }
	    for(int j=0;j<sum.length;j++)
	    	System.out.println(sum[j]);
	    
	    */
	    
		
		
		

	}

}
