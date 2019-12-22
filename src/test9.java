import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int s = in.nextInt();
        int nums [] = new int[s];
        for (int i = 0; i < s; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print ("Вывод массива");
        for (int i = 0; i < s; i++) {
            System.out.print (" " + nums[i]*2);
        }
    }
}