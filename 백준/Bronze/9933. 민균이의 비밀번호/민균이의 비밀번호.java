import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int len;
    static char mid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> passwordlist = new ArrayList<>();

        for(int i=0; i<n; i++){
           String password = sc.next();
           StringBuffer b = new StringBuffer(password);
           String reverse = b.reverse().toString();

           if(passwordlist.contains(reverse) || password.equals(reverse)){
               len = password.length();
               mid = password.charAt(password.length()/2);
           } else {
               passwordlist.add(password);
           }
        }

        System.out.println(len+" "+mid);

    }
}