import java.util.Scanner;
public class ermWatDaSigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a calculator nigga enter the thing u wanna do");
        boolean loop = true;
        while (loop) {
            System.out.println("Enter the expression with parenthesis and symbols or whatever or enter x to exit");
            String expression = sc.nextLine();
            if (expression.contains("x") || expression.contains("X"))
                loop = false;
            else {

            }
        }
    }
}
// for calculator create an expression to seperate parenthesised parts and calculate them
// after calculation return value and append value into original equation

class stack{
void stack(char c){

}
}
