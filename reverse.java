import java.io.*;
class reverse
{
public static void main(String args[]) throws Exception
{
DataInputStream in=new DataInputStream(System.in);
int n=Integer.parseInt(in.readLine());
int s=0;
while(n>0)
{
int r=n%10;
s=s*10+r;
n=n/10;
}
System.out.print(s);
}
}
