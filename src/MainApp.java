
public class MainApp {

	public static void main(String[] args) {
		
//создаем объекты класса Континент
		
		Continent [] continent = new Continent [6];
		continent [0] = new Continent (24_710_000,"North America");
		continent [1] = new Continent (17_840_000,"South America");
		continent [2] = new Continent (30_370_000,"Africa");
		continent [3] = new Continent (8_600_000,"Australia");
		continent [4] = new Continent (14_000_000,"Antarctic");
		continent [5] = new Continent (55_000_000,"Eurasia");
		
		System.out.println("You will now see all the continents on the Earth. They are:");
		System.out.println();

		for (int i = 0; i<continent.length; i++) {
			
			System.out.println("continent name is: " + continent [i].getName()+ "." + "The square of the continent equals to: "+continent [i].getSquare()+ " square kilometers.");
			System.out.println( " ");
	
		}
	System.out.println("____________________________________________________________________");
	
	System.out.println();
		System.out.println("Now you will learn all the Oceans existing on the Earth");
		
		System.out.println();
	

	//создаем объекты класса океаны
	
	Oceans [] oceans = new Oceans [4];
	oceans [0] = new Oceans ("Pacific",10_911);
	oceans [1] = new Oceans ("Indian",8_047);
	oceans [2] = new Oceans ("Atlantic",8_486);
	oceans [3] = new Oceans ("Arctic",5_450);
	
	
		
		
	for (int d = 0; d<oceans.length; d++) {
		System.out.println("Ocean name is: " +oceans [d].getName() + "." + "the maximun depth of the ocean is : " + oceans [d].getDepthValue() + ".");
		System.out.println(" ");;
	}
	}
}
	



