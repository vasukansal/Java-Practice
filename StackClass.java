import java.util.*;
interface StackInterface
{
void push(int v);
int pop();
void display();
}
public class StackClass implements StackInterface
{
int []s=new int[10];
int top=-1;
public void push(int v)
{
if(top==9)
System.out.println("Stack is full");
else
s[++top]=v;
}
public int pop()
{
return s[top--];
}
public void display()
{
for(int i=0;i<=top;i++)
{
System.out.println(s[i]+" ");
}
}
public static void main(String[] args)
{
StackClass obj=new StackClass();
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
System.out.println("Enter your choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter a number to be pushed");
int t=sc.nextInt();
obj.push(t);
break;
case 2:
if(obj.top==-1)
System.out.println("Stack is empty");
else
System.out.println("Popped values is "+obj.pop());
break;
case 3:
obj.display();
break;
case 4:
System.exit(0);
break;
default:
System.out.println("Invalid choice");
}
}
}
}