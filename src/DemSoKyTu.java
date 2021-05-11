import java.util.Scanner;

public class DemSoKyTu {
    public static void main(String[] args) {
        int count=0;
        sc = new Scanner(System.in);
        String chuoiNhapVao = new String();
        System.out.println("Nhập vào chuỗi: ");
        chuoiNhapVao = sc.nextLine();
        System.out.println("Nhập ký tự cần kiểm tra:");
        String s = sc.nextLine();
        System.out.println(chuoiNhapVao.length());
        boolean check=false;
        for (int i = 0; i < chuoiNhapVao.length(); i++) {
            if (chuoiNhapVao.charAt(i) == s.charAt(0)) {
                count++ ;
            }

        }
        System.out.println(count);
    }
}
