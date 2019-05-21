package inheritance;

public class MatchBox extends Box {
	
	
	double volume = width * height * depth;
	double weight = .03611 * volume;
	

	@Override
	void getVolume() {
		System.out.println("width  of Matchbox is: " + width); 
		System.out.println("height of Matchbox is: " + height); 
		System.out.println("depth  of Matchbox is: " + depth); 
		calculateWeight();
		System.out.println("Volume is : " + volume);
	}
	
	void calculateWeight() {
		System.out.println("weight of Matchbox is : " + weight);
	}
	
	

}
