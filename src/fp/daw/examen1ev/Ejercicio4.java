package fp.daw.examen1ev;

public class Ejercicio4 {

	public static void main(String[] args) {
		int[][] matriz = { { 1, 5, 5, 2, 4 }, { 2, 1, 4, 14, 3 }, { 3, 7, 11, 2, 8 }, { 4, 8, 12, 16, 4 } };
		System.out.println(max3x3sum(matriz));

	}

	static int max3x3sum(int[][] matriz) {
		int max = 0;
		for (int i = 0; i < matriz.length - 2; i++) {
			for (int j = 0; j < matriz[i].length - 2; j++) {
				int sum = 0;
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						sum += matriz[i + k][j + l];
					}
				}
				if (sum > max) {
					max = sum;
				}
			}
		}
		return max;
	}
}
