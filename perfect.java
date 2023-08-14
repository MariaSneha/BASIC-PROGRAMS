import java.io.*;
import java.util.*;
class perfect
{
public static void main(String args[])
{
try
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int n1=n;
int c=1;
int s=0;
while(c<n)
{
if(n%c==0)
s=s+c;
c=c+1;
}
if(s==n1)
System.out.print("Perfect Number");
else
System.out.print("Not a perfect number");
}
catch(Exception e)
{
System.out.print("Exception occurs");
}
}
}