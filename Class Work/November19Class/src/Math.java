
public class Math {

	int previousnum = 0;

	static int addNum(int x, int y) {

		int total;
		total = x + y;

		return total;
	}

	int addSpecial(int x) {

		int total = previousnum + x;
		previousnum = total;
		return total;
	}

}
