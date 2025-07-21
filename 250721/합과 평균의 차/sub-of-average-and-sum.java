import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //  // 변수 선언
        // int a, b, c;
        
        // // 입력
        // a = sc.nextInt();
        // b = sc.nextInt();
        // c = sc.nextInt();

        int sum = a+b+c;
        int avg = sum / 3;
        int sumavg = sum-avg;

        System.out.println(sum);       // 총합
        System.out.println(avg);       // 평균
        System.out.println(sumavg);    // 총합 - 평균
    }
}