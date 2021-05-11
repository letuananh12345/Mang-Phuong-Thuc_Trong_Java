import java.util.Scanner;

public class DaoMang {
    public static void main(String[] args) {
        int size;
        int[] arr; // khai báo mảng
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter Size");
            size = sc.nextInt();
            if (size>20)
                System.out.println("nhập size không quá 20");
        }while (size>20);

        arr=new int[size] ; //khởi tạo mảng
        int i = 0;
        while (i<arr.length){
            System.out.println("Enter element" + (i+1)+" :" );
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");//in mảng đã nhập ra
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");// in mảng sau khi đảo
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
