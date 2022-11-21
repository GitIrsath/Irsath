package smartgraduates;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		int sum=0;
		double average;
		final int LOWERBOUND=1;
		final int UPPERBOUND=100;
		
		//FOR LOOP...
		for(int number=LOWERBOUND;number<=UPPERBOUND;++number) {
			sum+=number;
			//System.out.println(sum);
			
			 average=sum/100;
			 
			 System.out.println("The Average is : "+average);
		
		//DO WHILE LOOP...
			 do {
				 sum+=number;
				 ++number;
			 }while(number<=UPPERBOUND);
			 System.out.println(sum);
			 
		//WHILE LOOP...	 
			 while(number<=UPPERBOUND) {
				 sum+=number;
				 ++number;
				// System.out.println(sum);
		}
			 
			 
			
		
		
			
		}
	}

}
