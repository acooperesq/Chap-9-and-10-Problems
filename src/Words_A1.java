

public class Words_A1 {

	public static void main(String[] args) 
	{
		
		Dictionary webster = new Dictionary();
		
		System.out.println("Number of pages:  " + webster.getPages());
		
		 System.out.println("Number of definitions: " + webster.getDefinitions());
		 
		 System.out.println("Definitions per page: " + webster.computeRatio());

	}  
	
	public class Book 
	{ 	protected int pages = 1500;
	
		public void setPages(int numPages)
	
			{  
				pages = numPages;
		
			}
	
		public int getPages()
	
			{
				return pages;
			}
	}
	
public class Dictionary extends Book
	
		{ 	
			private int definitions = 52500;
	
		
			public double computeRatio()
		
				{	
					
					return (double) definitions / pages;
				
				}
	
		
	
			public void setDefinitions (int numDefinitions)
	
				{
					definitions = numDefinitions;

				}		
	
			public int getDefinitions()
	
				{
					return definitions;
		
				}
			
		}

}