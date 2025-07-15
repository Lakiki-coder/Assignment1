import java.util.Scanner ;
public class Factorial {

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter number");
int number = input.nextInt();

int digit = 1;
int digit2 = 1;

while(number >= 1){

digit *= number;  number--;
}
System.out.print(digit);
  
 }
} 