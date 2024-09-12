package cse;

public class EndUser {
public static void main(String[] args)
{
	Sensor s =new Sensor();
	s.setTC();
	Adapter a = new Adapter (s);
	Display d= new Display();
	d.setTF(a.getTCF());
	
	
	System.out.println("The Temperature in FH =" + d.dispTF());
}

}
//Creation of abstract class called remote control which has one menber of type device