import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//여기서부터
        int aMath, aEng;
        int bMath, bEng;

        aMath = sc.nextInt();
        aEng = sc.nextInt();
        bMath = sc.nextInt();
        bEng = sc.nextInt();
//윗 부분이 어려웠음

        if(aMath > bMath && aEng > bEng){
            System.out.println(1);
        } else{
            System.out.println(0);
        }

    }
}