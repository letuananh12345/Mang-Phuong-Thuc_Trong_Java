import java.util.Scanner;

public class GTMax {
    public static void main(String[] args) {
        int[] arr ;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập 1 size");
            size = sc.nextInt();
            if (size >20)
                System.out.println("Không vượt quá 20");
        }while (size<20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
            i++;
        }
        }

}
