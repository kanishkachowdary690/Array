package aray;

class Tester12 {
    
	   public static int[] findLeapYears(int year){
	       //Implement your code here and change the return value accordingly
		   while(true) {
			   if(year%4==0)
			   {
				  if(year%100==0)
				  {
					  if(year%400==0)
					  {
						  break;
					  }
				  }
			   }
			   else
			   {
				   year++;
			   }
		   }
		   int[] a=new int[15];
		   for(int i=0;i<a.length;i++) {
			   a[i]=year;
			   year=year+4;
		   }
	       return a;
	   }
	    
	   public static void main(String[] args) {
	       int year = 2000;
		   int[] leapYears;
		   leapYears=findLeapYears(year);
		   for ( int index = 0; index<leapYears.length; index++ ) {
		       System.out.println(leapYears[index]);
		   }
	    }
	}
