import java.io.*;
import java.util.*;
class gcd
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int a=Integer.parseInt(in.readLine());
int b=Integer.parseInt(in.readLine());
int c=2,g=1;
while((c<=a)&&(c<=b))
{
if((a%c==0)&&(b%c==0))
g=c;
c=c+1;
}
System.out.printf("%d",g);
}
catch(Exception e)
{
System.out.print("Exception occurs");
}
}
}




