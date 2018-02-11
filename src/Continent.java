

public class Continent {

	String name;
	int square;
	
	
	public Continent (int square, String name)
	{
		this.square = square;
		this.name = name;
		
	}
	
	
	public String getName() {
		return name;}
	public int getSquare () {
		return square;}

	public void raiseSquare (int byPercent) {
		square*=1+byPercent/100;
	}
	
	

		
	
		
		
	}
	

	


