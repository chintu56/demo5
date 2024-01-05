import java.util.Scanner;
class Ifcase
{
 public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int  n;
n=s.nextInt();
if(n==0){System.out.println("SUNDAY");}
else if(n==1){System.out.println("MONDAY");}
else if(n==2){System.out.println("TUSDAY");}
else if(n==3){System.out.println("WEDNESDAY");}
else if(n==4){System.out.println("THURSDAY");}
else if(n==5){System.out.println("FRIDAY");}
else if(n==6){System.out.println("SATURDAY");}
else{System.out.println("INVALID");}
}
}
