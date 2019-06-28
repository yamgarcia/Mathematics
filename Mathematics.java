import java.util.HashSet;
import java.util.Random;

public class Mathematics {

	static final double PI = 3.14159;
	static final double ONE_FOOT_TO_KILOMETER_RATIO = 0.0003048;

	public static double getPi() {
		return PI;
	}

	public static double getOneFootToKilometerRatio() {
		return ONE_FOOT_TO_KILOMETER_RATIO;
	}

	public double PI() {
		return PI;
	}

	public double FeetToKMRatio() {
		return ONE_FOOT_TO_KILOMETER_RATIO;
	}

	public static double getCircleArea(double radius) {
		double r2 = radius * radius;
		double area = PI * r2;
		return area;
	}

	public double getSquareArea(double d) {
		d *= d;
		return d;
	}

	public double add(double d, double e) {
		double sum = d + e;
		return sum;
	}

	public double times(double d, double e) {
		double product = d * e;

		return product;
	}

	public double subtract(double d, double e) {
		double difference = d - e;
		return difference;
	}

	public int divide(int i, int j) {
		int division = 0;
		if (j <= 0 || i <= 0) {
			return division;
		} else {
			division = i / j;
			return division;
		}
	}

	public int absoluteValue(int i) {
		int abs = i;
		if (i > 0) {
			return abs;
		} else {
			abs = i * -1;
			return abs;
		}
	}

	public double convertFeetToKilometers(double d) {
		double km;
		km = d / 3280.84;
		return km;
	}

	public int doubleTheNumber(int i) {
		int answer = i * 2;
		return answer;
	}

	public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {

		HashSet<Integer> values = new HashSet<Integer>();
		//Random r = new Random();

		boolean lessThanTen = true;
		boolean greaterThanTwenty = true;
		boolean notFifteen = true;

		for (int i = 0; i < 10000; i++) {
			//int number = r.nextInt();
			if (i < 10) {
				lessThanTen = false;
			} else if (i > 20) {
				greaterThanTwenty = false;
			} else if (i == 15) {
				notFifteen = false;
			} else {
			values.add(i);
			}
		}
		return values.size();
	}
}
