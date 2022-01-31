import java.util.Scanner;
class Addition{
int add(int x,int y)
{
return x+y;
}
}
class Substraction{
int sub(int x,int y)
{
return x-y;
}
}
class Multiplication{
int mul(int x,int y)
{
return x*y;
}
}
class Division{
float div(int x,int y)
{
return (float)x/y;
}
}
class Moddivison{
int mod(int x,int y)
{
return x%y;
}
}
public class Calculator {
public static void main(String[] args) {
Scanner s =new Scanner(System.in);
System.out.println("Enter the value 1:");
int v1=s.nextInt();
System.out.println("Enter the value 2:");
int v2=s.nextInt();
System.out.println("===CHOICE===");
System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.mod");
System.out.println("Enter your choice:");
int choice=s.nextInt();
switch(choice) {
case 1:
Addition ad=new Addition();
System.out.println("Sum:"+ad.add(v1, v2));
break;
case 2:
Substraction sc=new Substraction();
System.out.println("Sub:"+sc.sub(v1, v2));
 break;
case 3:
Multiplication mul=new Multiplication();
System.out.println("Mul:"+mul.mul(v1, v2));
break;
case 4:
Division div=new Division();
System.out.println("Div:"+div.div(v1, v2));
break;
case 5:
Moddivison mod=new Moddivison();
System.out.println("Mod:"+mod.mod(v1,v2));
break;
default:
System.out.println("==Invalid Choice==");
}
}
}