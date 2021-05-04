import java.util.*;
class Factorial{  
int fact(int a){    
  if (a>0) {  
     return(a * fact(a-1)); 
      }
  else   
  {
   return 1;   
  }
 }    
 public static void main(String args[]){  
  int i,f=1;  
  int num=7;  
  f= fact(num);   
  System.out.println(f);    
 }  
}
