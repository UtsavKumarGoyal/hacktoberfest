
import java.util.*;
import java.io.*;

public class AngledTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x= a*a;
        int y = b*b;
      int z = c*c;
        
      if((a>b) && (a>c)){
        if(x<y+z){
          System.out.println("1");
        }else if(x==y+z){
          System.out.println("2");
        }else{
          System.out.println("3");
        }
      }else if((b>a) && (b>c)){
        if(y<x+z){
          System.out.println("1");
        }else if(y==x+z){
          System.out.println("2");
        }else{
          System.out.println("3");
        }
      }else{
        if(z<x+y){
          System.out.println("1");
        }else if(z==x+y){
          System.out.println("2");
        }else{
          System.out.println("3");
        }
      }
      
      
      
    }
}
