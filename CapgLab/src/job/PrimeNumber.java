package job;

import java.util.Scanner;

public class PrimeNumber
{
       private int s=0;
       public int calculateSum(int n)
       {
              for(int i=0;i<=n;i++)
              {
                     if(i%3==0||i%5==0)
                     {
                           s+=i;
                     }
              }
              return s;
       }
       public static void main(String[] args)
       {
              PrimeNumber p1 = new PrimeNumber();
              Scanner s = new Scanner(System.in);
              int num=s.nextInt();
              System.out.println(p1.calculateSum(num));
       }
}