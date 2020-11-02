import java.util.*;


public class projects{
	
	
	public static void main (String args[]){
	
	
	/*#1 fruit array
	Sort elements of Array alphabetically
	*/
	String fruit[] = {"apple", "banana", "orange", "strawberry", "pineapple", "cherry"};
	Scanner sc = new Scanner (System.in);
	
	
	System.out.println("Start? Y/N");
	
	String answer = sc.next();
	
	System.out.println("----Fruit Array----");
	
		if(answer.equals ("Y")){
			for(int i =0; i< fruit.length; i++){
			System.out.println(fruit[i]);
			}//close for loop
		}//close if
		else{
			System.out.println("ok");
		}//close else
			
		
	System.out.println("Would you like to sort?");
	String answer2 = sc.next();
	
		if(answer2.equals ("Y")){
			Arrays.sort(fruit);
			System.out.println(Arrays.toString(fruit));
		}
		
	
			
		
	/*#2 water conversion
	convert lbs to gallons
	*/
	
		System.out.println("----Water Converter----");

		double lbs = 0.0;	
		System.out.println("Enter weight");
		lbs = sc.nextInt();
		double gallon = lbs * 8.33;
		System.out.println("You have "+ gallon + " gallons of water.");
	
	}//close main
	
	
}//end class