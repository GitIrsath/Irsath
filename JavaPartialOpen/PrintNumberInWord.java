package smartgraduates;

public class PrintNumberInWord {

	public static void main(String[] args) {
		int number=3;
		
		if(number==1) {
			System.out.println("One");
		}else if(number==2){
			System.out.println("Two");
		}else if(number==3) {
			System.out.println("Three");
		}else if(number==4) {
			System.out.println("Four");
		}else if(number==5) {
			System.out.println("Five");
		}

       switch(number) {
       case 1:
    	   System.out.println("One");
    	   break;
       case 2:
    	   System.out.println("Two");
    	   break;
       case 3:
    	   System.out.println("Three");
    	   break;
       case 4:
    	   System.out.println("Four");
    	   break;
       case 5:
    	   System.out.println("Five");
    	   break;
 
       default:
    	   System.out.println("Nothing");
       }

	}

}
