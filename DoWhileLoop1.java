import java.util.Scanner;
class DoWhileLoop1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i=0;
do
{
System.out.print(i+" ");
i=i+1;
}
while(i<=n);
}
}