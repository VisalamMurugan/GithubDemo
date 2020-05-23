package Leapyear;

public class LeapYear {

/*Leap Year -  is a calendar year that contains an additional day (or, in the case of a lunisolar calendar, a month) added to keep the calendar year synchronized with the astronomical year or seasonal year.*/
			    public static void main(String[] args) {

		        int year = 2021;
		        boolean leap = false;

		        if(year % 4 == 0)
		        {
		            if( year % 100 == 0)
		            {
		                // year is divisible by 400, hence the year is a leap year
		                if ( year % 400 == 0)
		                    leap = true;
		                else
		                    leap = false;
		            }
		            else
		                leap = true;
		        }
		        else
		            leap = false;

		        if(leap)
		            System.out.println(year + " is a leap year.");
		        else
		            System.out.println(year + " is not a leap year.");
		    }
		




}
