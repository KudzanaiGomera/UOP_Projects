package inheritance;

class Box {

	double width = 5;
	double height = 10;
	double depth = 3;

	// This is an empty constructor
	Box() {
		;
	}

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	void getVolume() {
		System.out.println("Volume is : " + width * height * depth);
	}
}