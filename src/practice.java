public class practice {
    public static void main(String[] args) {
        System.out.println("Sum of 4 natural numbers");
        int sum=0;
        for(int i=1;i<5;i++){
            sum+=i;
        }
        System.out.println(sum);

        printPattern(10,5);
        printPattern(7);
    }

    public static void printPattern(int length,int breadth){
        for(int i=1;i<=length;i++){
            for(int j=1;j<=breadth;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void printPattern(int length){
        for(int i=1;i<=length;i++){
            for(int j=1;j<=length;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
