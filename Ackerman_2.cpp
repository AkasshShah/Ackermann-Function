
#include<conio.h>
#include<iostream.h>

int ack(int x, int y){
    int ans;
    int a,b;
    a=x;
    b=y;
    if(a==0){
             ans=b+1;}
    else if(b==0){
         ans= ack(a-1,1);}
    else{
	ans = ack(a-1, ack(a,b-1));}
        
        
        return(ans);}
        



int main (void){
    
  int i,j;
  cout<<"Insert (i,j) for Ackermann funtion"<<endl;
  cin>>i>>j;
  cout<<"The Ackermann function of ("<<i<<","<<j<<") is"<<endl;
  cout<<ack(i,j)<<endl;

    
    
    getch();}

