import java.util.Scanner;

public class TimGTTMang {
    public static void main(String[] args) {
        String[] students = {"chó", "meo", "lợn", "gà", "chim", "công", "quạ"};
        String input_name;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên cần tìm trong mảng");
        input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) { // equals : so sánh 2 chuỗi . nếu khác nhau thì false
                System.out.println( input_name + " là phần tử thứ" + (i + 1) + "trong list động vật");
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("không có trong " + input_name+ "trong list");
        }
    }
}

