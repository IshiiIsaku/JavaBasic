package practice10;

public class Car {


	int serialN = 10000;
	String color = "Red";
	int gasoline = 50;

	int serialN1 = 10000;
	String color1 = "White";
	int gasoline1 = 40;

	int serialN2 = 10000;
	String color2 = "Black";
	int gasoline2 = 30;




	public int run() {
		gasoline--;

		if (gasoline < 0) {
			return -1;
		}

		int num = new java.util.Random().nextInt(15) + 1;

		return num;
	}

	public int run1() {
		gasoline1--;

		if (gasoline1 < 0) {
			return -1;
		}

		int num1 = new java.util.Random().nextInt(15) + 1;

		return num1;
	}

	public int run2() {
		gasoline2--;

		if (gasoline2 < 0) {
			return -1;
		}

		int num2 = new java.util.Random().nextInt(15) + 1;

		return num2;
	}


}
