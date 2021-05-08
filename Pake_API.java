import java.util.Arrays;
import java.util.Scanner;

public class Pake_API {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] data = { -80, -50, 0, 40, 0, -30, 90, 70, 89, 50, 55 };
        int input;

        System.out.println("\t\tPratikum modul 5 pemograman lanjut");
        System.out.println("\t\t Oleh Muhammad Irfan Fachrulrozy H.\n\n");

        Arrays.sort(data);

        System.out.println("Data :");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.print("\nCari index elemen dari :");
        input = in.nextInt();

        if (Arrays.binarySearch(data, input) < 0) {
            System.out.printf("%d ada pada index ke- %d", input, Arrays.binarySearch(data, input));
        }
        else{
            System.out.println(input + " Berada pada index ke - :" + Arrays.binarySearch(data,input));
        }

    }

}
