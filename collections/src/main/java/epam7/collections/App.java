package epam7.collections;


import java.util.Scanner;
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
    	Scanner in = new Scanner(System.in);
    	customer_list customarraylist =new customer_list();
    	System.out.println("Intializing with 9 Integers");
    	customarraylist.adding(new Integer(1));
    	customarraylist.adding(new Integer(2));
    	customarraylist.adding(new Integer(3));
    	customarraylist.adding(new Integer(4));
    	customarraylist.adding(new Integer(5));
    	customarraylist.adding(new Integer(6));
    	customarraylist.adding(new Integer(7));
    	customarraylist.adding(new Integer(8));
    	customarraylist.adding(new Integer(9));
    	System.out.print("print all the elements in the list after adding ");
        System.out.println(customarraylist);
        System.out.println("Enter how many elements you want to remove");
        int removelements  = in.nextInt();
    	for(int i = 0; i < removelements; i++) {
    		System.out.println("Enter the index you want to remove");
    		int n = in.nextInt();
    		customarraylist.remove(n);
    	}
    	System.out.println(" print all the elements in the list after removing ");
    	System.out.println(customarraylist);
    	
    	System.out.println("Enter how many elements you want to get");
    	int fetchelements  = in.nextInt();
    	for(int i = 0; i < fetchelements; i++) {
    		System.out.println("Enter the element you want to get");
    		int n = in.nextInt();
    		customarraylist.fetching(n);
    	}  	
    	
    	System.out.print("print all the elements in the list after getting ");
        System.out.println(customarraylist);
    	System.out.println("getting");
    	
      System.out.print("All the Elements in the list are ");
       System.out.println(customarraylist);
       System.out.println("Number of elements in list are:"+customarraylist.size());
        
    }
}