package items;

public class Car {
	private int tires;
	private int b_tires;
	private int breaks;
	private int b_breaks;
	private int gearbox;
	private int b_gearbox;
	private int body;
	private int b_body;
	private int engine;
	private int b_engine;
	private int suspension;
	private int b_suspension;
	
	public Car()
	{
		prepareCar(6,3,3,3,3,2);
	}
	
	public Car(int t, int b, int g, int bd, int e, int s)
	{
		prepareCar(t, b, g, bd, e, s);
	}
	
	/*
	 *	Funcion para preparar el coche antes de una carrera
	 *	Se inicializan los datos a los pasados por el equipo para todo el gp 
	 */
	public void prepareCar(int t, int b, int g, int bd, int e, int s) 
	{
		this.b_tires = t;
		this.tires = t;
		this.b_breaks = b;
		this.breaks = b;
		this.b_gearbox = g;
		this.gearbox = g;
		this.b_body = bd;
		this.body = bd;
		this.b_engine = e;
		this.engine = e;
		this.b_suspension = s;
		this.suspension = s;
	}
	
	/*
	 * Retorno de las telemetrias del coche en forma de texto para saber como se encuentra
	 */
	public String getCarState()
	{
		return "Telemetria:\n\tNeumaticos: " + tires + "\n\tFrenos: " + breaks + "\n\tCaja de cambios: " + gearbox + "\n\tChasis: " 
				+ body + "\n\tMotor: " + engine + "\n\tSuspension: " + suspension;
	}
	
	
	/*
	 * Funciones para perder puntos en x valores
	 */
}
