import java.util.Scanner;
class SwapingNumbers
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int frist=s.nextInt();
int second=s.nextInt();
int temp;
System.out.println("--------------Before swaping---------------");
System.out.println("frist:"+frist);
System.out.println("second:"+second);
 temp=frist;
frist=second;
second=temp;
System.out.println("--------------------after swaping---------------");
System.out.println("frist:"+frist);
System.out.println("second:"+second);
}
}