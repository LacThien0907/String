import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi s: ");
        int n = sc.nextInt();


    }

    public static void printUppercase(String x) {
        String s1 = null;
        char[] ch = x.toCharArray();
        for (int i = 0; i < x.length(); i++) {
            if (Character.isUpperCase(ch[i])) {
                s1 = s1 + ch[i] ;
            }
        }
        System.out.println("Print uppercase characters in s on the screen: " + s1);
    }

}