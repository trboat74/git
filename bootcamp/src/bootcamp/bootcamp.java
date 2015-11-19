package bootcamp;

import java.util.Scanner;

public class bootcamp {

	public static void main(String[] args) {

	}

	// TASK 1
	public static int smallest(int go, int[] yellow) {
		int blue = yellow[0];
		for (int i = 0; i < go; ++i) {
			if (yellow[i] < blue) {
				blue = yellow[i];
			}
		}
		return blue;

	}

	// TASK 2
	public static int[] populateArray(int left, int right, int count) {

		int[] green = new int[count];
		for (int i = 0; i < count; ++i) {
			green[i] = left + i;
		}
		return green;

	}

	// TASK 3
	public static double[] populateArray(double one, double two, int count) {
		double[] black = new double[count];
		for (int i = 1; i < count; ++i) {
			black[i - 1] = one + i;
		}

		return black;
	}

	// TASK 4
	public static int[] grow(int[] tree) {

		int[] orange = new int[2 * tree.length];
		for (int i = 0; i < tree.length; ++i) {
			orange[i] = tree[i];
		}
		return orange;
	}

	// TASK 5
	public static int[] shrink(int[] tree) {

		int[] banana = new int[1 / 2 * tree.length];
		for (int i = 0; i < tree.length; ++i) {
			banana[i] = tree[i];
		}
		return banana;

	}

	// TASK 6
	public static double[] grow(double[] tree) {

		double[] count = new double[2 * tree.length];
		for (int i = 0; i < tree.length; ++i) {
			count[i] = tree[i];
		}
		return count;
	}

	// TASK 7
	public static double[] shrink(double[] tree) {

		double[] count = new double[1 / 2 * tree.length];
		for (int i = 0; i < tree.length; ++i) {
			count[i] = tree[i];
		}
		return count;
	}
}
