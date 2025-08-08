public class TaskNine{
public static void main(String [] args){

int counter = 1;
int summ = 0;
for(int count = 1; count < 24;count++ ){
 if(count % 4 == 0){
 counter = counter * 4;
 summ += counter;
}
}
  
  
int squareResult = 0;
int totalSum = 0;
int rider = 1;
int sum = 0;
for(int reader = 1; reader < 48;reader++ ){
 if(reader % 8 == 0){
 rider = rider * 8;
 sum += rider;
}
}
totalSum = sum + summ;
squareResult = Math.pow(totalSum);
  System.out.print(squareResult);
}


}