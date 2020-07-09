class overloading
{
int length,width,height;
public void add(int l,int h,int w)
{
length=l;
width=w;
height=h;
}
public void add(int l,int h)
{
length=l;
height=h;
}
public void display()
{
	System.out.println(length+height+width);
}
public void display1()
{
	System.out.println(length+height);
}
public static void main(String[] args)
{
overloading a= new overloading();
a.add(10,12,13);
a.display();
a.add(5,6);
a.display1();
}
}
