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
    	
    	//gets today's date and prints out the absolute date
    	System.out.println("Please enter today's date:");
    	int todaysAbsDate = monthAndDay(input);
    	
    	//prints a new line
    	System.out.println();
    	
    	//gets the birthday and prints out the absolute date
    	System.out.println("Please enter your birthday:");
    	int bDayAbsDate = monthAndDay(input);
    	
    	//prints the final statement
    	finalStatement(todaysAbsDate,bDayAbsDate);
    }
    
    //first statement
    public static int monthAndDay(Scanner input)
    {

    	System.out.print("What is the month (1-12)? "); 
    	int month = input.nextInt();
    	
    	//calls the length function to find the length of the month
    	int monthLength = dateRange(month);
    	System.out.print("What is the day (1-" + monthLength + ")? ");
    	int day = input.nextInt();
    	
    	//calls the absDate function to find the absolute distance between the days
    	int absNum = absDate(month, day);
    	System.out.println(month + "/" + day + " is the day #" + absNum + " of 365.");
    	
    	return absNum;
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
    	//adds the number of days before the month to the day inputed
    	if(month == 12)
    		return 334 + day;
    	else if (month == 11)
    		return 304 + day;
    	else if (month == 10)
    		return 273 + day;
    	else if (month == 9)
    		return 243 + day;
    	else if (month == 8)
    		return 212 + day;
    	else if (month == 7)
    		return 181 + day;
    	else if (month == 6)
    		return 151 + day;
    	else if (month == 5)
    		return 120 + day;
    	else if (month == 4)
    		return 90 + day;
    	else if (month == 3)
    		return 59 + day;
    	else if (month == 2)
    		return 31 + day;
    	else
    		return day;
    }
        
    //prints out the final statement based off days between the two dates
    public static void finalStatement(int today, int bday) 
    {
    	int distance = bday - today;
    	if(distance < 0)
    		System.out.println("Your birthday is in " + (365 - today + bday) + " days.");
    	//special cases
    	else if(distance == 1)
    		System.out.println("Wow, your birthday is tomorrow!");
    	else if(distance == 0)
    		System.out.println("Happy Birthday!");
    	else
    		System.out.println("Your next birthday is in " + distance + " days."));
    }

}

