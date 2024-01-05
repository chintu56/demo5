import java.util.Scanner;
class PrintNumbers6
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<=n;i=i+5)
{
System.out.print(i+" ");
}

}
}