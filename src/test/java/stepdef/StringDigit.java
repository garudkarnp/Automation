package stepdef;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aa1bc2d3";
		String st = "\\d";
		int sum = 0,i=0;
		Pattern p = Pattern.compile(st);
		Matcher m = p.matcher(input);
		
		while(m.find())
		{	
			i = m.start();
			System.out.println(m.group());
			sum = sum + Integer.parseInt(String.valueOf(input.charAt(i)));
		}
		System.out.println(sum);

	}

}
