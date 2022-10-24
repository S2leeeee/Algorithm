//BOJ 7785 회사에 있는 사람
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String stay = sc.next();

            if (map.containsKey(name)) {
                map.remove(name);
            } else {
                map.put(name, stay);
            }
        }

        ArrayList<String> arrlist = new ArrayList<String>(map.keySet());
        arrlist.sort(Collections.reverseOrder());

        for(int i=0; i<arrlist.size();i++) {
            System.out.println(arrlist.get(i));
        }
    }
}