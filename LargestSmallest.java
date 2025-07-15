import java.util.Scanner;

 public class LargestSmallest {
 public static void main(String [] args){
 
 Scanner input = new Scanner(System.in);

 System.out.println("enter first number:");
 int number1 = input.nextInt();

int largest = number1;
int smallest = number1;

while(number1 != -5 ){
System.out.println("Enter number");

number1 = input.nextInt();
if(number1 < smallest){
smallest = number1;}
if(number1 > largest){
largest = number1;}
}

System.out.println("the Largest is: " + largest);
System.out.println("the Smallest is: " + smallest);

}
}
