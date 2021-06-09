package stepdef;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Pattern {
	

	public static void main(String[] args) {
		
		Set set = new TreeSet();
		set.add("2");
		set.add("3");
		set.add("1");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
			
		// TODO Auto-generated method stub
		
		/* pattern
		 * 1
		 * 23
		 * 456
		 * 78910
		 */
		/*int m=1;
		for (int i=0; i<4;i++){
			for(int j=0;j<=i;j++){
				System.out.print(m);
				m++;
			}
			System.out.println();
		}
		/* int n = 5; 

	        PyramidPattern(n); 
	        } 

		    public static void PyramidPattern(int n) 

		    {  
		    	int k1=0;

		        for (int i=n; i>0; i--) // for number of rows(n) 

		{ 
		        	for (k1=0;k1<n-i;k1++) // a loop for spaces

		            { 

		                System.out.print(" "); //to print space

		            }  

		            for (int j=0; j<i; j++ ) //for number of columns

		            { 

		                System.out.print("* "); //to print star

		            } 

		            System.out.println(); //end-line after every row

		        } 
		        for (int i=0; i<n;i++) // for number of rows(n) 

				{ 
				        	for (k1=n-i;k1>1;k1--) // a loop for spaces

				            { 

				                System.out.print(" "); //to print space

				            }  

				            for (int j=0; j<=i; j++ ) //for number of columns

				            { 

				                System.out.print("* "); //to print star

				            } 

				            System.out.println(); //end-line after every row

				        } */
		
		   /*m=1;
	        for (int i = 1; i <= 4; i++)

	        {

	            /*int n = 4;

	            for (int j = 1; j<= n - i; j++) { 
	            	System.out.print(" "); 
	            	} 
	            for (int k = 0; k< i; k++)

	            {

	                System.out.print(m);
	                m++;

	            }
	            System.out.println();

	            /*for (int l = 2; l <= i; l++) { 
	            	System.out.print(l); 
	            	}  
	            	} 
	        for (int i=3; i>=1; i--)

	        {

	            int n = 3;

	            for (int j = 0; j<=n-i; j++) 
	            { System.out.print(" "); 
	            } for (int k = i; k >= 1; k--)

	            {

	                System.out.print(k);

	            }

	            for (int l = 2; l <= i; l++)

	            {

	                System.out.print(l);

	            }

	            System.out.println();

	        }*/

	    }

		    } 



		


