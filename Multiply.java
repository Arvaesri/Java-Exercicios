import java.util.Scanner;
class Multiply {
      public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt(); 
diferenca(a,b,c,d);

      }
      public static void diferenca(int a,int b,int c,int d){
          if(a >= 0 && d <= 100000){
        	  if((a+d) >= (b+c))
        	  {
        		  System.out.println((a+d)-(b+c));
        	  }
        	  else
        	  {
        		  System.out.println((b+c)-(a+d));
        	  }
          }

      }
} 
