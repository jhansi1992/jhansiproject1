/*Explicit TypeCasting:Conversion process done by the user*/

/*Syntax:
	In C : (datatype)Variable name;
	In C++: datatype(Variable name);
	In Java:(datatype)Variable name;*/

class Sample4
{
public static void main(String args[])
{
int i=123;
byte b=(byte)i;
System.out.println("I="+i+"\n B="+b);
double d=10.34;
float f=(float)d;
System.out.println("D="+d+"\n F="+f);
}
}
