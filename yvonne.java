import java.io.*;
class Employee
{
static int number;
static String name ;
static String address;
static int salary;
static int hours;
	
public static void main(String args[]) throws IOException
{
	

int a,b,result;
String num1,num2;
DataInputStream d=new DataInputStream(System.in);

System.out.println("select option:[1]monthly,[2]weekly,[3]hourly");
num1=d.readLine();
a=Integer.parseInt(num1);
if(a==1){
System.out.println("Enter id number:");
num1=d.readLine();
b=Integer.parseInt(num1);
System.out.println("Enter a fullname:");
name=d.readLine();
System.out.println("Enter address:");
address=d.readLine();
System.out.println("Enter salary:");
num2=d.readLine();
salary=Integer.parseInt(num2);
result=salary-(((salary*30)/100)+((salary*3)/100)-((salary*5)/100));
System.out.println("your salary ="+result+"Rfw");
}
else if(a==2){
System.out.println("Enter id number:");
num1=d.readLine();
b=Integer.parseInt(num1);
System.out.println("Enter a fullname:");
name=d.readLine();
System.out.println("Enter address:");
address=d.readLine();
System.out.println("Enter hours:");
num2=d.readLine();
hours=Integer.parseInt(num2);
salary=2500;
result=salary*hours;
System.out.println("your salary ="+result+"Rfw");	
	}
else if(a==3){
System.out.println("Enter id number:");
num1=d.readLine();
b=Integer.parseInt(num1);
System.out.println("Enter a fullname:");
name=d.readLine();
System.out.println("Enter address:");
address=d.readLine();
System.out.println("Enter salary:");
num2=d.readLine();
salary=Integer.parseInt(num2);
System.out.println("your salary ="+salary+"Rfw");	
	}	
else{
	
System.out.println("wrong choice");
	}
}

}