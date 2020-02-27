package items;

public class Team {
	private String name;
	private Driver d1;
	private Driver d2;
	
	private int base_tire;
	private int base_breaks;
	private int base_gearbox;
	private int base_body;
	private int base_engine;
	private int base_suspension;
	
	private Car c1;
	private Car c2;
	
	public void createTeam(String name, Driver d1, Driver d2) 
	{
		this.name = name;
		this.d1 = d1;
		this.d2 = d2;
	}
	
	public void createCars()
	{
		//Si no se ponen datos se crean los coches con las estadisticas base
		//en principio no es importante ya que en cada gp se inizializan los datos estadisticos de cada coche ya que se pueden
		//modificar reglajes antes de cada GP
		c1 = new Car();
		c2 = new Car();
	}
	
	/*
	 * Funcion que prepara el coche indicado para el gp, retorna un true si lo ha preparado correctamente
	 * o false si no lo ha podido preparar de forma correcta
	 */
	public boolean prepareCarForGP(Car c, int t, int b, int g, int bd, int e, int s)
	{
		//Accion - se podran modificar dos estadisticas del coche para cada gp (una en positivo y la otra en negativo por un punto)
		if((t+b+g+bd+e+s)==20)
		{
			//la suma de los valores tiene que dar exactamente 20
			int diff = getDifferences(t, b, g, bd, e, s);
			if(diff==2 || diff==0)
			{
				if(c1.equals(c))
				{
					c1.prepareCar(t, b, g, bd, e, s);
					return true;
				}
				else if(c2.equals(c))
				{
					c2.prepareCar(t, b, g, bd, e, s);
					return true;
				}
				else 
				{
					return false;
				}
			}
			else 
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	/*
	 * Funcion que retorna el numero de diferencias que puede haber entre estadisticas. El resultado correcto tiene que ser 0 o 2, el resto de
	 * retornos son incorrectos
	 */
	public int getDifferences(int t, int b, int g, int bd, int e, int s)
	{
		int diff = 0;
		
		diff += compare(t, base_tire);
		diff += compare(b, base_breaks);
		diff += compare(g, base_gearbox);
		diff += compare(bd, base_body);
		diff += compare(e, base_engine);
		diff += compare(s, base_suspension);
				
		return diff;
	}
	
	/*
	 * Funcion que compara dos valores y retorna un valor determinado para comprovar las diferencias entre estadisticas
	 */
	public int compare(int a, int b)
	{
		int c = 0;
		if(a==0) c = 3;
		if(a>=(b+2) || a<=(b-2)) c = 3;
		if(a==(b+1) || a==(b-1)) c = 1;
		return c;
	}
	
	public Car getCar1()
	{
		return c1;
	}
	
	public Car getCar2()
	{
		return c2;
	}
}
