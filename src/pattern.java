import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Pattern 1 or Pattern 2 or Diamond?");
        System.out.println("Pattern 1: \n   1\n  2 2\n 3 3 3");
        System.out.println("Pattern 2: \n     1\n   2 1 2\n 3 2 1 2 3");
        int n= sc.nextInt();
        //print this kinda pattern
        //         1
        //        2 2
        //       3 3 3
        switch(n){
            case 1:
                System.out.println("Enter Size: ");
                pattern1(sc.nextInt());
                break;
            case 2:
                System.out.println("Enter Size: ");
                pattern2(sc.nextInt());
                break;
            case 3:
                System.out.println("Enter Size: ");
                diamondPattern(sc.nextInt());
                break;
        }
    }
    static void pattern1(int n){
        //print this kinda pattern
        //         1
        //        2 2
        //       3 3 3
        for(int i=1;i<=n;i++) {
            //print the spaces before
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (i - j != 0)
                    System.out.print(" ");
            }
            System.out.println();

        }
    }
    static void pattern2(int n){
        //Palindrome pattern
        //this kinda
        //    1
        //  2 1 2
        //3 2 1 2 3

        for(int i=1;i<=n;i++){
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(((i-j)+1)+" ");
            }
            for(int j=1;j<=i;j++){
                if(j>1)
                    System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    static void diamondPattern(int n){
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                if (j > 1)
                    System.out.print("* ");
            }
            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print("* ");
            }
            for (int j = i; j >=1; j--) {
                if (j > 1)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
