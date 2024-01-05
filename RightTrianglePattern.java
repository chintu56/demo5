import java.util.Scanner;
class RightTrianglePattern
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
int row=s.nextInt();
int x,y;
if(row%2==0)
x=y=row/2;
else
{
x=row/2;
y=row/2+1;
}
printPattern(ch,x);
printReversePattern(ch,y);
}
public static void  printReversePattern(char c,int n)
{
for(int i=n;i>=1;i--)
{
printLine(c,i);
}
}
public static void printPattern(char c,int n)
{
for(int i=1;i<=n;i++)
{
printLine(c,i);
}
}
public static void printLine(char c,int col)
{
System.out.print("\n");
for(int i=1;i<=col;i++)
System.out.print(c);
}
}