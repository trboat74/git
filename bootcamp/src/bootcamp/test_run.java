package bootcamp;

public class test_run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int one = 1;
		int two = 2;
		int count = 20;
		int[] test = populateArray(one,two,count);

		for (int i = 0; i < count; ++i) {
			System.out.println(test[i]);
		}
	}
	
	public static int[] populateArray(int left, int right, int count) {

		int[] green = new int[count];
		for (int i = 0; i < count; ++i) {
			green[i] = left+i;
		}
		return green;

	}
}
