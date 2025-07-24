import java.util.Scanner ;
public class SubstractIntergal {

public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int num1 = input.nextInt();

System.out.println("Enter second number");
int num2 = input.nextInt();

int firstNumber = num1;
int secondNumber = num2;

int diff = ((secondNumber - firstNumber) || (firstNumber - secondNumber));


System.out.print("your value is: " + diff); 
}
public static int highest(int number1,int number2){
int result;

int firstNumber = Math.max(number1,number2);
int secondNumber = Math.min(number1,number2);
int diference = firstNumber - secondNummber;

return result;

  }
 }