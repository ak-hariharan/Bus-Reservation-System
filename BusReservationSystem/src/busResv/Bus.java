package busResv;

public class Bus {
	private int busNumber;
	private boolean ac;
	private int capacity; //get and set 
	//method to access this private variables
	
	Bus(int busNum, boolean val, int cap){
		this.busNumber = busNum;
		this.ac = val;
		this.capacity = cap;
	}
	
	
	public int getbusNumer() {
		return busNumber;
	}
	
	public boolean isAc() {
		return ac;
	}
	
	public int getCapacity() {//accessor method
		return capacity;
	}
	
	
	//We can't change the bus number, 
	//so we don't need this setbusNumber 
	//method
	
//	public void setbusNumer(int busNum) {
//		busNumber = busNum;
//	}
	
	public void setAc(boolean val) {
		ac = val;
	}
	public void setCapacity(int cap) {//mutator method
		capacity = cap;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus No: " + busNumber +
		" AC: " + ac + " Total capacity: " + capacity);
	}
	

}
