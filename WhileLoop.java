import java.util.Scanner;
class WhileLoop
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i=0;
while(i<=n)
{
System.out.print(i+" ");
i=i+5;
}

}
}