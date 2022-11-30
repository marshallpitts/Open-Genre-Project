package lizard;
//Written by marshall pitts
public class Lizard {
	private String name;
	private double length;
	private String color;
	
	public Lizard()
	{
		this.name = "marsh";
		this.length = 2;
		this.color = "blue";
	}
	
	public Lizard(String n, double w, String nL)
	{
		this.setName(n);
		this.setLength(w);
		this.setColor(nL);
	}
	

	public String getName()
	{
		return this.name;
	}
	public double getLength()
	{
		return this.length;
	}
	public String getColor()
	{
		return this.color;
	}
	
	public void setName(String name2)
	{
		if(name2!= null)
		{
			this.name = name2;
		}
		else
		{
			System.out.println("invalid");
			name = "marsh";
		}
	}
	
	public void setLength(double length2)
	{
		if(length >= 0)
		{
			this.length = length2;
		}
		else
		{
			System.out.println("invalid");
			length = 8;
	}
	}
	
	public void setColor(String color2)
	{
		if(color2!= null)
		{
			this.color = color2;
		}
		else
		{
			System.out.println("invalid");
			color = "blue";
		}
	}
	public boolean equals(Lizard sh)
	{
		if(color.equals(sh.getColor())&& length == (sh.getLength()) && name.equals(sh.getName()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		return "Lizard name: " + name + " \nlizard color: "+ color +" \nlizard length: "+ length +" feet";
	}
	{
}
}









