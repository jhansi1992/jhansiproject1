class Sample5
{
public static void main(String args[])
{
byte b=(byte)(127+5);  
System.out.println("B="+b);
}
}

/*solution:
	127+1=-128 bcz byte ranges from -128 to	                     	127 so it moves in 			reverse order.
	127+2=-127
	127+3=-126
	127+4=-125
	127+5=-124*/
