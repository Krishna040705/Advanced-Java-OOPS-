package cse;

public class ConsumerExample implements Consumer<String> {
	public void accept(String s)
	{
		System.out.println(s.toLowerCase());
	}
	

}
