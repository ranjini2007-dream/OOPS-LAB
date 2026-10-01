import java.util.*; 
abstractclassshape
{
public int x,y;
publicabstractvoidprintArea();
}

classRectangle1extendsshape
{
publicvoidprintArea(){ float area;
area=x*y;
System.out.println("Area ofRectangleis"+area);
}
}

classTriangleextendsshape
{
publicvoidprintArea()
{
float area;
area=(x*y)/ 2;
System.out.println("Area ofTriangleis"+area);
}
}
classCircleextendsshape
{
publicvoidprintArea()
{
float area;
area=(22 * x * x) / 7;System.out.println("AreaofCircleis"+area);
}
}
publicclassShapes
{
publicstaticvoid main(String[]args)
{
Scannersc=newScanner(System.in); System.out.println("Entervalues:"); int x1=sc.nextInt();
inty1=sc.nextInt();
Rectangle1r=new Rectangle1();
r.x=x1;r.y=y1; r.printArea();
Trianglet=newTriangle();
t.x=x1;t.y=y1; t.printArea();
Circlec=newCircle();
c.x=x1;
c.printArea();
}
}
	
OUTPUT:
D:\JavaPrograms>javaShapes 
Enter values :
7
8
AreaofRectangleis56.0 Area of Triangle is 28.0 Area of Circle is 154.0




