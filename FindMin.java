import java.util.Scanner;
class FindMin
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int min;
if(a<b)
{
if(a<c)
min=a;
else
min=c;
}
else
{
if(b<c)
min=b;
else
min=c;
}
System.out.println("manimum no is:"+min);
}
}
