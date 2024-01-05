import java.util.Scanner;
class Pattern3
{
public static void printPattern(char c,int  n)
{
int i=1;
while (i<=n)
{
printLine(c,i);

}
}
public static void printLine(char c,int col)
{
System.out.print("\n");
int j=1;
while(j<=col)
System.out.print(c);
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
int row=s.nextInt();
printPattern(ch,row);
}
}

