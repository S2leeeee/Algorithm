//BOJ 10815 숫자 카드
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            set.add(num);
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            if(set.contains(num))
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }
    }
}