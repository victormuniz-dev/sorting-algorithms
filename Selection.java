import java.util.Scanner;
import java.util.Arrays;

public class Selection{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		selectionSort(arr);
		System.out.println(arr);
	}

	static void selectionSort(int[] v){
		for (int i = 0; i < v.length - 1; i++){
			int i_menor = i;
			for (int j = i + 1; j < v.length; j++){
				if (v[j] < v[i_menor]) i_menor = j;
			}
			int aux = v[i];
			v[i] = v[i_menor];
			v[i_menor] = v[i];	
		}
	}
}
