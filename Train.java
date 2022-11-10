import java.util.*;
public class Train
{
String name;
int number;
int start;
int end;
String[] station=new String[21];
int[] dist=new int[21];
Train(String n,int number,int s,int e,String a[],int b[])
{
name=n;
this.number=number;
start=s;
end=e;
station=a;
dist=b;
}
void change()
{
Scanner sc=new Scanner(System.in);
System.out.println("Choose your Source");
start=sc.nextInt();
System.out.println("Choose your destination");
end=sc.nextInt();
}
int compute()
{
int disttravelled=dist[end-1]-dist[start-1];
int charge=disttravelled*3;
return charge;
}
void display()
{
System.out.println("You have booked the train from "+station[start-1]+" to "+station[end-1]+".\nYou will be travelling "+(dist[end-1]-dist[start-1])+" kms.\nYour total fare will be "+compute()+" Rupees");
}
void displaytraindetails()
{
System.out.println(name+" runs between stations "+station[0]+" and "+station[20]+".\nThe train number is "+number);
System.out.println("Following are the halting stations during its journey");
for(int i=0;i<21;i++)
System.out.println((i+1)+". "+station[i]);
System.out.println("Default source and destination are " +station[0]+" and "+station[20]);
}
public static void main(String[] args)
{
String a[]={"Subedarganj","Fatehpur","Kanpur Central","Etawah Junction","Tundla Junction","Aligarh Junction","Rajghat Narora","Babrala","Bahjoi","Chandausi Junction","Raha Ka Sahaspur Junction","Moradabad Junction","Kanth","Seohara","Dhampur","Nagina","Najibabad Junction","Chandok","Laksar Junction","Haridwar","Deradun Terminal"};
int b[]={0,113,190,330,421,500,548,554,581,598,618,641,671,688,701,718,740,758,782,809,861};
Scanner sc=new Scanner(System.in);
Train obj=new Train("SFG DDN Express",14113,1,21,a,b);
while(true)
{
System.out.println("1. Display train details\n2. Change source and destination\n3. Display fare\n4. Exit");
System.out.println("Enter your choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:
obj.displaytraindetails();
break;
case 2:
obj.change();
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