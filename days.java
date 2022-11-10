public class days
{
int leap(int y)
{
if(y%4==0)
{
if(y%100==0)
{
if(y%400==0)
return 1;
else
return 0;
}
else
return 1;
}
else
return 0;
}
public static void main(String[] args)
{
days obj=new days();
int d=Integer.parseInt(args[0]);
int m=Integer.parseInt(args[1]);
int y=Integer.parseInt(args[2]);
int noofdays=0;
int[] md={31,28,31,30,31,30,31,31,30,31,30,31};
for(int i=1970;i<y;i++)
{
if(obj.leap(i)==1)
noofdays=noofdays+366;
else
noofdays=noofdays+365;
}
if(obj.leap(y)==1)
md[1]=29;
for(int i=0;i<m-1;i++)
{
noofdays=noofdays+md[i];
}
noofdays=noofdays+d;
System.out.println(noofdays);
}
}