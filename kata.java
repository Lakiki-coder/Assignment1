import java.util.Scanner ;
public class kata {

public static void main(String [] args){
Scanner input = new Scanner(System.in);



}
public static int addision(int num1, int num2){
int result = num1 + num2;
return result;
}

public static int isEven1(int num1, int num2){
if(num1 %2 == 0 && num2 == 0) {
System.out.println("true");}
else{
System.out.println("false");
}
return num1;
}


public static int EvenNumber(int num1){
if(num1 % 2 == 0 ) {
System.out.println("True");}
else{
System.out.println("false");
}
return num1;
}


public static int subtract(int num1, int num2){
int max = num1;
int min = num1;

if(num2 > num1)max = num2;
if(num2 < num1)min = num2;

int maxMin = max - min;
return maxMin;

}
public static float divide(float num1, float num2){
float sub = num1 / num2;
if(num1 % 1 == 0 && num2 % 1 != 0){
sub = 0;

}
return sub;
}

public static int factorOf(int userInput){
int addNum = 0;

for( int i = 1; i <= userInput; i++){
if(userInput % i == 0)addNum++;
}
return addNum;


}
public static int isSquare(int num1){
if(num1 % Math.sqrt(num1) == 0)
System.out.print("true");
else
System.out.print("false");
return num1;

}

public static long squareOf(long userInput) {


long a = userInput * userInput;

if((a == userInput * userInput) && (Math.sqrt(a) == userInput))

System.out.println(a);

else
System.out.println("can't return square,try again");

return userInput;

 }
public static int factorial(int userInput) {

int digit = 1;
int digit2 = 1;
while(userInput >= 1){

digit *= userInput;  userInput--;
}
return digit;
}

}

