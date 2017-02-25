import java.util.*;
public class Ackerman_1{
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
      for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){ 
                    System.out.println("The ackermann of ("+i+","+j+") = "+ack(i,j));}}
   }
}