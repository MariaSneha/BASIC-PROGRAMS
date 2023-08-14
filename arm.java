import java.io.*;
import java.util.*;
import java.math.*;
class arm
{
public static void main(String args[])
{
try
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int n1=n;
int s=0;
while(n>0)
{
int r=n%10;
s=s+(int)Math.pow(r,3);
n=n/10;
}
if(s==n1)
System.out.println("Armstrong Number");
else
System.out.println("Not an armstrong number");
}
catch(Exception e)
{
System.out.print("Exception occurs");
}
}
}
