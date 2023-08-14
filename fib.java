import java.io.*;
import java.util.*;
class fib
{
public static void main(String args[])
{
try
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int a=0,b=1;
int t=0;
System.out.printf("%d\t%d",a,b);
for(int c=2;c<n;c++)
{
t=a+b;
System.out.printf("\t%d",t);
a=b;
b=t;
}
}
catch(Exception e)
{
System.out.print("Exception occurs");
}
}
}
