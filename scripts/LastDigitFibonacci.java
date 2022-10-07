import java.util.*;
import java.lang.*;
import java.io.*;

public class LastDigitFibonacci
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long a=0,b=1;
    long sum;
    for(int i=1;i<=n;i++){   
      sum = a+b;
          a=b;
          b=sum;
    }
    if(a<10){
      String c = String.format("%02d", a);
        System.out.println(c);
      }else{
        System.out.println(a%100);
      }
	}
}
