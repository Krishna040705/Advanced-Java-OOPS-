package cse;

public class Adapter {
	private Sensor s;
	public Adapter (Sensor s)
	{
		this.s =s;
	}

public double getTCF() {
	return (s.getTC()*9/5)+32;
}

}
