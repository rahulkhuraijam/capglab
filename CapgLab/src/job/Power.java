package job;

class Power
{

static boolean isPowerOfTwo(int n)
{
    if(n==0)
    return false;
 
return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == 
       (int)(Math.floor(((Math.log(n) / Math.log(2)))));
}
 
public static void main(String[] args)
{
    if(isPowerOfTwo(31))
    System.out.println("Yes");
    else
    System.out.println("No");
     
    if(isPowerOfTwo(64))
    System.out.println("Yes");
    else
    System.out.println("No");
}
}