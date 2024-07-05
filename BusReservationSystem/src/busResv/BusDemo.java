package busResv;

import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
	public static void main(String args[]) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1, true, 2));
		buses.add(new Bus(2, true, 58));
		buses.add(new Bus(3, true, 60));
		
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		
		for (Bus b:buses) {
			b.displayBusInfo();
		}
		
		while(userOpt == 1) {
			System.out.println("Enter 1 to book and 2 to Exit");
			userOpt = scanner.nextInt();
			if(userOpt == 1) {
				Booking booking = new Booking(); 
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your Booking is confirmed");
				}
				else {
					System.out.println("Sorry, Bus is full. Try another bus or date");
				}
			}
		
		}

	}
	
}
