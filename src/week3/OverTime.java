package week3;

public class OverTime {
    public static void main(String[] args) {

        double hourlyRate = 50;
        int numberOfHours = 43;
        double pay;

        if (numberOfHours > 40) {

            pay = 40 * hourlyRate; // base pay for 40 hours
            int hoursOver40 = numberOfHours - 40; // 5
            pay += hoursOver40 * hourlyRate * 1.5;
            System.out.println(hoursOver40);

        } else { // less than or equal 40
            pay = numberOfHours * hourlyRate;
        }

        System.out.println(pay);
    }
}

/*

Overtime [if else, operators, variables]

	Declare and assign the following variables
		hourly rate & number of hours worked

	Calculate your total net pay for the week. Also consider if any overtime should be paid. Overtime will be 1.5 times the normal rate and should be paid for every hour over 40.
	(if you worked 43 hours total, you will get 40 hours normal pay and 3 hours overtime pay)

	Output different messages based on overtime
		if normal hours were worked (40 hours or less):
			You worked $hours hours, so your total net pay is: $netPay

		if you worked overtime (more than 40 hours):
			Wow you worked $hours hours, so you will get $overtime_hours of overtime. Your net pay is $netPay
 */
