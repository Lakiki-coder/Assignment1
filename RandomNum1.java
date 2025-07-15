import java.util.Scanner;
import java.util.Random;
public class RandomNum1{

public static void main(String [] args){

Random rand = new Random(10001);
Scanner scan = new Scanner(System.in);

int guessNumber = scan.nextInt();
int guessNumber2 = rand.nextInt();




   while(guessNumber2 != guessNumber){
System.out.println("Guess number");

guessNumber = scan.nextInt();
guessNumber2 = rand.nextInt();

if(guessNumber < guessNumber2){
System.out.println("imput too low try again");
}else
if(guessNumber > guessNumber2){
System.out.println("input too high try again");
}
}


   }
  }