import java.util.Scanner;
class PrintNumbers1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=n;i>=0;i=i+5)
{
System.out.print(i+" ");
}

}
}