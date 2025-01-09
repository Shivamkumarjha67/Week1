public class DayOfWeek {
	public static void main(String[] args) {
		// Getting details of month, day and year from command line
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);

		// Applying formulae
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0/4 - y0/100 + y0/400;

		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int dayOfWeek = (day +  x  +  31 * m0 / 12)  %  7;

		System.out.println(dayOfWeek);		
	} 
}