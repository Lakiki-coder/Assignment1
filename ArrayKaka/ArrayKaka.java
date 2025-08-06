import java.util.Arrays ;
public class ArrayKaka{
public static void main(String [] args) {


 int [] elements = {9,88,77,66,1,55,44};

 System.out.print(Arrays.toString( squareNumbers(elements)));

}

public static int maximumIn(int [] largestElement){


int largest = largestElement[0];

for(int i = 0; i < largestElement.length; i++){

if(largestElement[i] > largest){

largest = largestElement[i];
}
}
return largest;
}



public static int minimumIn(int [] minimumElement){

int minimum = minimumElement[0];

for(int i = 0; i < minimumElement.length; i++){

if(minimumElement[i] < minimum){

minimum = minimumElement[i];
}
}
return minimum;

}

public static int [] sumOf(int [] sumOfElement){


for (int i = 0; i < sumOfElement.length; i++) {

sumOfElement[0] += i;
}

return sumOfElement;

}




public static int sumOfEvenNumbers(int [] sumEvenElement){


for(int count = 0; count < sumEvenElement.length; count++){
if(sumEvenElement[0] % 2 == 0){

 sumEvenElement[0] += count;
}
}
return  sumEvenElement;
}



public static int [] sumOfOldNumbers(int [] sumOldElement){


int sum = 0;
int [] oldNumber = new int[sumOldElement.length];
 
for(int count = 0; count < sumOldElement.length; count++){
if(sum % 2 != 0){

sumOldElement = sum + oldNumber[count];
sum++;
}
}
return sumOldElement;
}



public static int [] maximumAndMinimum(int [] maxAndMinElement){

int largest = maxAndMinElement[0];
int lowest =  maxAndMinElement[0];

 
for(int count = 0; count < maxAndMinElement.length; count++){

if(maxAndMinElement[count]  > largest){
largest = maxAndMinElement[count] ;
}


if(maxAndMinElement[count] < lowest){
lowest = maxAndMinElement[count] ;
}
return  new int[]{max, min};

} 


public static int noOfOldNumbers(int [] noOfOldElement){
int counter = 0;

for(int count = 0; count < noOfOldElement.length; count++){
if(noOfOldElement[count] % 2 != 0){

counter++;
}
}
return counter;
}


public static int noOfEvenNumbers(int [] noOfEvenElement){
int counter = 0;

for(int count = 0; count < noOfEvenElement.length; count++){
if(noOfEvenElement[count] % 2 == 0){

counter++;
}
}
return counter;
}

public static int [] evenNumbers(int [] noOfEvenElement){

int [] number = new int[noOfEvenElement.length];
 
for(int count = 0; count < noOfEvenElement.length; count++){
if(noOfEvenElement[count] % 2 == 0){

number[count] = noOfEvenElement[count]; 

}
}
return number;
}



public static int [] oldNumbers(int [] noOfOldElement){



int [] number = new int[noOfOldElement.length];
 
for(int count = 0; count < noOfOldElement.length; count++){
if(noOfOldElement[count] % 2 != 0){

number[count] = noOfOldElement[count]; 

}

}
return number;
}


public static int [] squareNumbers(int [] allOfSquareElement){


int [] number = new int[allOfSquareElement.length];
 
for(int count = 0; count < allOfSquareElement.length; count++){

number[count] =  allOfSquareElement[count] * allOfSquareElement[count];
}

return number;
}

}


