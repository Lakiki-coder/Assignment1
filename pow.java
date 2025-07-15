import java.util.Scanner ;
public class pow {

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter number");
int number = input.nextInt();

System.out.println("Enter second number");
int number2 = input.nextInt();

int num1 = number;
int num2 = number2;

int pow = 1;

while(num2 != 0){
pow *= num1;
}
System.out.print(pow);

   
 }
}
