import java.util.Scanner;
class PrintingPattern
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
char c=s.next().charAt(0);
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i+1;j++)
{
System.out.print(c);
}
System.out.println();
}
}
}
