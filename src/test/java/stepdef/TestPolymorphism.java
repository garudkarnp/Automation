package stepdef;

public class TestPolymorphism {
	
	
		public static void main(String[] args)
		{
			RuntimePolymorphism r=new RuntimePolymorphism();
			StringPrograms s= new StringPrograms();
			//RuntimePolymorphism t= new StringPrograms(); parent obj calling child methods not allowed
			StringPrograms z=new RuntimePolymorphism();
			r.Removefromfirstwhichisinsecond("nisha", "is");
			s.Removefromfirstwhichisinsecond("nisha", "is");
			z.Removefromfirstwhichisinsecond("nisha", "is");
			//r.datamember;
			//s.datamember;
			//z.datamember;
			System.out.println(s.datamember);
			System.out.println(r.datamember);
			System.out.println(z.datamember);
		
			
		//Runtime - child and String -parent
	}

}
