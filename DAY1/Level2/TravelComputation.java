import java.util.Scanner;

public class TravelComputation {
   public static void main(String[] args) {
	// Initializing the scanner object
	Scanner input = new Scanner(System.in);

        // Taking input of name and journey details
	System.out.println("Enter your name : ");
        String name = input.next();

	System.out.println("Enter your starting city : ");
        String fromCity = input.next();

	System.out.println("Enter your via city : ");
        String viaCity = input.next();

	System.out.println("Enter your destination city : ");
        String toCity = input.next();

	System.out.println("Enter distance fromm to via city : ");
      	double distanceFromToVia = input.nextDouble();

	System.out.println("Enter time taken from to via city : ");
      	int timeFromToVia = input.nextInt();

	System.out.println("Enter distance from via to destinationn city : ");
        double distanceViaToFinalCity = input.nextDouble();

	System.out.println("Enter time taken from via city to destination city : ");
      	int timeViaToFinalCity = input.nextInt();

     	double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      	int totalTime = timeFromToVia + timeViaToFinalCity;


      	// Printing the travel details
      	System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");

	// closing the scanner resource
	input.close();
   }
}
