import java.util.Scanner;
class MultiplacationTable
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print((i*j)+" ");
}
System.out.println();
}
}
}
