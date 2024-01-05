import java.util.Scanner;
class FrequencyCharacter
{
 public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
char c=s.next().charAt(0);
int count=0;
for (int i=0;i<=str.length()-1; i++)
{
if(str.charAt(i)==c)
{
count++;
}
}
System.out.println(count);
}
}
