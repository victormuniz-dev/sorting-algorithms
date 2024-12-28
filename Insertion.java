import java.util.Scanner;
import java.util.Arrays;

public class Insertion{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();

                int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
                System.out.println(insertionSort(arr));
        }

        static int[] insertionSort(int[] v){
                for (int i = 1; i < v.length; i++){
                        int j = i;
                        while (j > 0 && v[j] < v[j - 1]){
                                int aux = v[j];
                                v[j] = v[j - 1];
                                v[j - 1] = aux;
                                j--;
                        }
                }
                return v;
        }
}

