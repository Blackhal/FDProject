package items;

public class Driver {
	private String name;
	private int number;
	private Car assignedCar;
	
	public Driver(String name)
	{
		this.name = name;
	}
	
	public void assignCar(Car car)
	{
		this.assignedCar = car;
	}
	
	public String getDriverStatus()
	{
		return "Piloto: " + name + "\n" + assignedCar.getCarState();
	}
}
