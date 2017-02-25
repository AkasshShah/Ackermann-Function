import java.util.*;
public class Ackerman_2{
   public static int ack(int x, int y){
      int ans;
      int a,b;
      a=x;
      b=y;
      if(a==0){
         ans=b+1;
      }
      else if(b==0){
         ans=ack(a-1,1);
      }
      else{
         ans=ack(a-1,ack(a,b-1));
      }
      return(ans);
   }
   public static void main(String[] args){
      int i,j;
      System.out.println("Insert (i,j) for Ackermann function");
      Scanner scan=new Scanner(System.in);
      i=scan.nextInt();
      j=scan.nextInt();
      System.out.println("The answer for ackermann funtion for "+i+","+j+"is:");
      System.out.println(ack(i,j));
   }
}