Question:
Gruber Healthcare has different types of forms for their customer, one of which is a know your customer form ( KYC ) which has to be filled annually. Each form has a date which signifies the date the form was filled called the form date.

Due to government regulations the KYC form can only be filled within + or - 30 days of the signup anniversary of a customer. 
    When filling it up, you have to provide the form date. If you are past the +-30 day anniversary then you can back-date it so that it falls in the +-30-day window. When filling it up you cannot use a future date for the form date.

For Example, assuming today is 4 Apr 2017 and I had signed up on 1st Mar 2014, my window for KYC submission this year would be 30 Jan 2017 to 31 Mar 2017. Since it is already 4th Apr - I would have to back-date the KYC to a date in this range.

Note: The KYC form can be filled only for the closest anniversary in the past or within 30 days range in future.
Anniversary refers to same day and month every year. If your birthday is 01-02-1992 -then your first anniversary will be 01-02-1993, the 2nd will be 01-02-1994 and so on. 01-02-1992 is not an anniversary.

Given the signup date and the current date, provide the allowable date range for the form date.

Input - First line is an integer n as the number of inputs to be passed. Next, n lines are n input for the program in the format dd-mm-yyyy dd-mm-yyyy Each line has two dates separated by space where the first date in signup date and the second date is the current date.

Output - Range of dates for KYC form in format dd-mm-yyyy dd-mm-yyyy

Test Input:
5
16-07-1998 27-06-2017
04-02-2016 04-04-2017
04-05-2017 04-04-2017
04-04-2015 04-04-2016
04-04-2015 15-03-2016

Test output:
16-06-2017 27-06-2017
05-01-2017 06-03-2017
No range
05-03-2016 04-04-2016
05-03-2016 15-03-2016

Ans:
package corejava_assignments.assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
    public static String getRange(String signUpDate, String currentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate formattedSignUpDate = LocalDate.parse(signUpDate, formatter);
        LocalDate formattedCurrentDate = LocalDate.parse(currentDate, formatter);
        int year = formattedCurrentDate.getYear();
        LocalDate next30Days = LocalDate.of(year, formattedSignUpDate.getMonth(), formattedSignUpDate.getDayOfMonth()).plusDays(30);
        LocalDate past30Days = LocalDate.of(year, formattedSignUpDate.getMonth(), formattedSignUpDate.getDayOfMonth()).minusDays(30);
        if (formattedSignUpDate.isAfter(formattedCurrentDate)) {
            return "No range";
        } else if (formattedCurrentDate.isAfter(next30Days)) {
            return (formatter.format(past30Days) + " " + formatter.format(next30Days));
        } else {
            return (formatter.format(past30Days) + " " + formatter.format(formattedCurrentDate));
        }

    }public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of inputs");
        int noOfInputs = sc.nextInt();
        sc.nextLine();
        String[] rangeDates = new String[noOfInputs];
        int i = 0;
        while ( i<noOfInputs  ) {
            System.out.println("Enter the signup and current date string");
            String str=sc.nextLine();
            String[] input = str.split(" ");
            if(input.length==2)
                rangeDates[i] = getRange(input[0], input[1]);
            i++;
        }
        for (String date : rangeDates) {
            System.out.println(date);
        }

    }
}
