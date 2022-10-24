//BOJ 11866 요세푸스문제0
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i=1;i<=n;i++){
            q.add(i);
        }

        System.out.print("<");
        while (!q.isEmpty()) {
            for (int i = 0; i < k-1 ; i++) {
                q.add(q.poll());
            }
            System.out.print(q.poll());
            if (!q.isEmpty()){
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}