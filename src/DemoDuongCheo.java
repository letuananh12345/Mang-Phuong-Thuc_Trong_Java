import java.util.Scanner;

public class DemoDuongCheo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr = new int[6][6];
        int sum =0;
        int sum1=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) Math.round(Math.random() * 10);
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i=0;i<arr.length;i++){
            sum+=arr[i][i];
        }
        System.out.println(sum);
        for (int i=0;i<arr.length;i++){
            sum1+=arr[i][arr.length-i-1];
        }
        System.out.println(sum1);
        int sum2=0;
        System.out.println("Nhập cột cần tính:");
        int col=sc.nextInt();
        for (int i=0;i<arr.length;i++){
            sum2+=arr[i][col];
        }
        System.out.println(sum2);
    }
}

