package ProgramTheroy;

public class Pen {
	private int cost;
	private String brand;
	
	Pen(int cost, String brand)
	{
		this.cost=cost;
		this.brand=brand;
	}
	public int getcost()
	{
		return cost;
	}
	public String getbrand()
	{
		return brand;
	}
 public void setcost(int cost)
 {
	 this.cost=cost;
 }
 public void setbrand(String brand)
 {
	 this.brand=brand;
 }
}
