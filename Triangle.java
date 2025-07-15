import java.util.Scanner;
 public class Triangle{

public static void main(String [] args){
 Scanner input = new Scanner(System.in);

int T = 10;                         
  for(int y = 1;y <= 10; y++){      
  for(int z = y;z <= 10; z++){      

System.out.print("* ");             
}                                    
  System.out.println();                
  }                                      
int A = 10;

for(int x = 1;x <= A; x++){
  for(int s = 1;s <= x; s++){

System.out.print("* ");
 }
System.out.println();
 }

int C = 10;

for(int row1 = 1;row1 <= 10; row1++){
 for(int col = 1;col <= row1; col++){

System.out.print(col + " ");
 }
System.out.println();
 }




int B = 10;

for(int row = 1;row <= 10; row++){
 for(int col = row;col <= 10; col++){

System.out.print(col + " ");
 }
System.out.println();
 }



int D = 10;

for(int row2 = 1;row2 <= 10; row2++){
 for(int col1 = 1;col1 <= 10 - 1; col1++){

System.out.print(col1 + " ");
 }
System.out.println();
 }

 

   }
 }