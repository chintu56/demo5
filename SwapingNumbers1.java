import java.util.Scanner;
class SwapingNumbers1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num1=s.nextInt();
int num2=s.nextInt();
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println(num1+"\n"+num2);
}
}
