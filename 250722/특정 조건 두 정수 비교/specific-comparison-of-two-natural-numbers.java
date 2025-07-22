import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b){
        System.out.print(1);
        } else{
        System.out.print(0);
        }
        if (a == b){
        System.out.print(" "+1);
        } else{
        System.out.print(" "+0);
        }
        
        // System.out.println(a > b ? 1 : 0);
        // System.out.println(a == b ? 1 : 0);
    }
}

