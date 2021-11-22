/*
 * Isayiah Lim
 * 11/22/2021
 * APCS Period 2
 * Birthday Project
 * 
 * Program Description
 * This program asks for today's date and the user's birthday, then calculates the amount of days
 * before their next birthday. It also prints out the absolute date of both.
 */
import java.util.Scanner;
public class Birthday 
{
    public static void main(String[] args) 
    {
    	Scanner input = new Scanner(System.in);
    	System.out.println("This program tells you how many days");
    	System.out.println("it will be until your next birthday.");
    	System.out.println();
    	
    	//prints the first statement
    	System.out.println("Please enter today's date:");
    	monthAndDay(input);
    }
    
    //first statement
    public static void monthAndDay(Scanner input)
    {

    	System.out.println("What is the month (1-12)?"); 
    	int month = input.nextInt();
    	
    	//calls the length function to find the length of the month
    	int monthLength = dateRange(month);
    	System.out.println("What is the day (1-" + monthLength + ")?");
    	int day = input.nextInt();
    	
    	//calls the absDate function to find the absolute distance between the days
    	int absNum = absDate(month, day);
    	System.out.println(month + "/" + day + " is the day #" + absNum + " of 365.");
    }
    
    //returns the number of days based off of the month inputed
    public static int dateRange(int month)
    {
    	//February has 28 days
    	if(month == 2)
    		return 28;
    	//April, June, September, November have 30 days
    	else if(month == 4 || month == 6 || month == 9 || month == 11)
    		return 30;
    	//Every other month has 31
    	else
    		return 31;
    }

    //calculates the absolute days of any date
    public static int absDate(int month, int day)
    {
    	int number = 0;
    	//adds the number of days before the month to the day inputed
    	if(month == 12)
    		return 334 + day;
    	else if (month == 11)
    		return 304 + day;
    	else if (month == 10)
    		return 273 + day;
    	else if ()
    }
    
    //calculates the days between the birthday and the current day
    public static int distance(int today, int bday)
    {
    	
    }
    
    //prints out the final statement based off days between the two dates
    public static void finalStatement() 
    {
    	
    }
    
}
