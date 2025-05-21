class Vehicle{
	private String licencePlate;
	private String ownerName;
	private int hoursParked;
	
	Vehicle(String licencePlate,String ownerName,int hoursParked){
		this.licencePlate=licencePlate;
		this.ownerName=ownerName;
		this.hoursParked=hoursParked;
	}
	
	String getlicencePlate(){
		return licencePlate;
	}
	
	void setlicencePlate(String licencePlate){
		this.licencePlate=licencePlate;
	}
	
	String getownerName(){
		return ownerName;
	}
	
	void setownerName(String ownerName){
		this.ownerName=ownerName;
	}
	
	int gethoursParked(){
		return hoursParked;
	}
	
	void sethoursParked(int hoursParked){
		this.hoursParked=hoursParked;
	}
	
	void displayInfo(){
		System.out.println("License plate: "+licencePlate+ ",Owner: "+ownerName+",Hoursparked: "+hoursParked);
	}
}


class ParkingLot{
	private Vehicle[] vehicles;
	private int count;
	
	ParkingLot(){
		vehicles=new Vehicle[5];
		count=0;
	}
	
	void parkVehicle(Vehicle v){
		if(count<5){
			vehicles[count]=v;
			count++;
			System.out.println("Parking lot is full. Can't park vehicle: "+ v.getlicencePlate());
		}
	}
	
	void removeVehicle(String licencePlate){
		int index=-1;
		for(int i=0; i<count; i++){
			if (vehicles[i].getlicencePlate().equalsIgnoreCase(licencePlate)){
				index=i;
				break;
			}
		}
		
		if(index==-1){
			System.out.println("vehicle with license plate"+licencePlate+"not found.");
			return;
		}
		
		vehicles[count-1]=null;
		count--;
		System.out.println("vehicle with licencePlate"+licencePlate+"removed");
	}
	
	void displayAllVehicle(){
		if(count==0){
			System.out.println("Parking lot is empty");
			return;
		}
		System.out.println("Parked vehicles:");
		for(int i=0; i<count; i++){
			vehicles[i].displayInfo();
		}
	}
}

class Main{
	public static void main(String[] args){
		ParkingLot lot=new ParkingLot();
		
		lot.parkVehicle(new Vehicle("ABC123","John Doe",2));
		lot.parkVehicle(new Vehicle("XYZ789","Jane Smith",4));
		lot.parkVehicle(new Vehicle("LMN456","Bob brown",1));
		
		lot.removeVehicle("XYZ789");
		lot.displayAllVehicle();
	
	}
}

