/**
* The TripPlannerApp is to resolve the edx Microsoft Java Trip Planner project
* https://courses.edx.org/courses/course-v1:Microsoft+DEV276x+2T2017/courseware
*
 */
import java.util.Scanner;

class TripPlannerApp{
    public static void main(String[] args) {
        greeting();
        travelTimeAndBudget();
        timeDifference();
        countryArea();
        //System.out.println(roundDouble( 20.123456 ));
    }


    //Part 1 Greeting
    public static void greeting(){
        Scanner input = new Scanner( System.in );
 
        //greeting
        System.out.println("Welcome to Vacation Planner!");
        

        //getName
        System.out.print("What is your name? ");
        String name = input.nextLine();


        //getTravelDestination
        System.out.print("Nice to meet you " + name + ", where are you traveling to? ");
        String traveDestination = input.nextLine();

        //endGreeting
        System.out.println("Great! " + traveDestination + " sounds like a great trip");
        System.out.println("***********\n");
        
    }    



    //Part 2 Travel time and Budget
    public static void travelTimeAndBudget(){
        Scanner input = new Scanner( System.in );

        //getTravelDays
        System.out.print("How many days are you going to spend traveling? ");
        int travelDays = input.nextInt();
        
        //getTravelDays
        System.out.print("How much money in USD, are you planning to spend on your trip? ");
        double travelMoneyUSD = input.nextDouble();

        //getCurrency
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currencySymbol = input.next();

        System.out.print("How many " + currencySymbol +" are there in 1 USD? ");
        double currencyExchangeRate = input.nextDouble();


        //printDetails
        //Duration
        System.out.println("If you are travelling for " + travelDays + " days" 
            + " that is the same as " 
            + (travelDays*24) + " hours or "
            + (travelDays*24*60) + " minutes" );

        //Money per Day
        System.out.println("If you are going to spend $" + roundDouble(travelMoneyUSD) + " USD"
            + " that means per day you can spend up to " 
            + "$" + roundDouble(travelMoneyUSD/travelDays) + " USD" );

        //Money in Local Currency
        System.out.println("Your total budget in " + currencySymbol + " is "
            + roundDouble(travelMoneyUSD * currencyExchangeRate) + " " + currencySymbol + ", "
            + "which per day is " + roundDouble((travelMoneyUSD * currencyExchangeRate) / travelDays ) + " " + currencySymbol );
    }    


    //Part 3 Time Difference 
    public static void timeDifference(){
        Scanner input = new Scanner( System.in );

        //getTimeDifference
        System.out.print("What is the time difference, in hours, between your home and your destination? " );
        double timeDifference = input.nextDouble();

        int timeDifferenceHours     = (24 + (int)timeDifference ) % 24 ;
        int timeDifferenceMinutes   = (int)( (timeDifference % 1) * 60.0);
        if (timeDifferenceMinutes < 0){
            timeDifferenceMinutes = Math.abs(timeDifferenceMinutes);
            timeDifferenceHours-- ;
        }

        System.out.println("That means when it is midnight at home it will be " 
            + timeDifferenceHours + ":" + timeDifferenceMinutes
            + " in your travel destination"
            + " and when it is noon at home it will be "
            + ((timeDifferenceHours + 12 )%24) + ":" + timeDifferenceMinutes );

    }


    
    //Part 4 Country Area
    public static void countryArea(){
        Scanner input = new Scanner(System.in);

        //getCountrySquareKm
        System.out.print("What is the square area of your destination country in km2? ");
        double countrySquareKm = input.nextDouble();

        double countrySquareMiles = countrySquareKm * 0.38610;
        System.out.println("In miles2 that is " + countrySquareMiles);
    }

    
    public static double roundDouble(double doubleIn){
        int multiplier  = 100;
        int intToDouble = (int)(doubleIn * multiplier);

        double formattedNumber = (double)intToDouble / (double)multiplier;
        return formattedNumber;
    }
    
}