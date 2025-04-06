//Enter 3 numbers from the user & make a function to print their average.
//Write a function to print the sum of all odd numbers from 1 to n.
//Write a function which takes in 2 numbers and returns the greater of those two.
//Write a function that takes in the radius as input and returns the circumference of a circle.
//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
//Write an infinite loop using do while condition.
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
//Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
//Write a program to print Fibonacci series of n terms where n is input by user :
//        0 1 1 2 3 5 8 13 21 .....
//In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
//        (BONUS)

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner sc= new Scanner(System.in);
        //avg of 3 numbers
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("The average is : "+printAvg(a,b,c));
        //sum of all odd numbers from 1 to n
        System.out.println("Enter a number");
        a=sc.nextInt();
        System.out.println("The sum is : "+oddNaturalSum(a));
        //greater number of 2
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("The Greater number is: "+greaterNum(a,b));
        //circumference of circle
        System.out.println("Enter radius of circle");
        a=sc.nextInt();
        System.out.println("The circumference is : "+circumferenceCalc(a));
        //vote eligibility
        System.out.println("Enter age");
        a=sc.nextInt();
        System.out.println(voteEligibility(a));
        //count the type of integer
        System.out.println("Enter the numbers or press x to exit whenever");
        numCount();
        //calculate power
        System.out.println("To calculate X raised to power n, type x then n");
        System.out.println(powerCalc(sc.nextInt(),sc.nextInt()));
        //greatest common divisor
        System.out.println("Enter 2 numbers for finding GCD");
        System.out.println(GCD(sc.nextInt(),sc.nextInt())+" Is the GCD");
        //fibonacci
        System.out.println("Enter a number of fibonacci series terms to print ");
        fibonacci(sc.nextInt());
    }
    static int printAvg(int a, int b, int c){
        return (a+b+c)/3;
    }
    static int greaterNum(int a , int b){
        if(a>b)
            return a;
        else return b;
    }
    static int oddNaturalSum(int a){
        if(a>0){
            if (a % 2 == 0) {
                a--;
                return a + oddNaturalSum(a - 2);
            } else return a + oddNaturalSum(a - 2);
        }
        else return 0;
    }
    static double circumferenceCalc(int a){
        return 2.0*22.0*a/7.0;
    }
    static String voteEligibility(int a){
        if(a>17)
            return "Eligible";
        else return "Not Eligible";
    }
    static void infLoop(){
        do
            System.out.println("Skibidi");
        while(true);
    }
    static void numCount(){
        int positive=0;
        int negative=0;
        int zero=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number");
            if (sc.nextInt() > 0)
                positive++;
            else if (sc.nextInt() < 0)
                negative++;
            else zero++;
            System.out.println("Press x to exit or press any key to continue");
        }while(!(sc.next().equals("x")));
        System.out.println(positive + " Positive numbers, " + negative+" Negative numbers and " + zero + " zeroes");

    }
    static int powerCalc(int a , int b){
        if(b>0)
            return a*(powerCalc(a,b-1));
        else return 1;
    }
    static int GCD(int a, int b){
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }
    static void fibonacci(int a){
        int fibonacci_1=0;
        int fibonacci_2=1;
        int fibonacci_3=fibonacci_1+fibonacci_2;
        if(a==1)
            System.out.println(fibonacci_1);
        else if(a==2)
            System.out.println(fibonacci_1+"\n"+fibonacci_2);
        else{
            System.out.println(fibonacci_1+"\n"+fibonacci_2);
            for (int i=1;i<=a;i++){
                System.out.println(fibonacci_3);
                fibonacci_1=fibonacci_2;
                fibonacci_2=fibonacci_3;
                fibonacci_3=fibonacci_1+fibonacci_2;
            }
        }
    }
}
