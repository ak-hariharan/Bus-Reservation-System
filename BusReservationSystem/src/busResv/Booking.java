package busResv;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String passengerName;
	int busNumber;
	Date date;
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the passenger: ");
		passengerName = scanner.next();
		System.out.println("Enter bus number:");
		busNumber = scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		// We receive the date as a String so we initialized it to "dateInput"
		//Then we use SimpleDateFormat class to convert the user's date(String) into date format
		//we have to pass the date format into the object creation "new SimpleDateFormat("dd-MM-yyyy");
		//here we mention month as "MM" not "mm" due to there may be a chance of clasing it as minutes as
		//"mm" in java.
		//then we parse the dateformat 
		String dateInput =  scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		
		
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity = 0;
		for(Bus bus:buses) {
			if(bus.getbusNumer()== busNumber) {
				capacity = bus.getCapacity();			}
		}
		
		
		int booked = 0;
		for(Booking b:bookings) {
			if(b.busNumber == busNumber && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;
		
	}
}
