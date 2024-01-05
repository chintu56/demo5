import java.util.Scanner;
class IfcaseOddOrEven
{
 public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int  n;
n=s.nextInt();
if(n%2==0)
{
System.out.print("EVEN\n");
System.out.print(n+"is even");
}
else
{
System.out.print("ODD\n");
System.out.print(n+"is odd");
}
}
}