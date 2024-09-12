package cse;
import java.util.ArrayList;
import java.util.Iterator;

public class Auctioner implements ISubject {
	
	private ArrayList<IObserver> bidderList;

	private int bidAmount;
	public Auctioner ()
	{
		this.bidderList= new ArrayList<IObserver>();
		this.bidAmount=0;
	}
	@Override
	public boolean attach(IObserver o) {
		this.bidderList.add(o);
	
		return true;
	}

	@Override
	public boolean remove(IObserver o) {
		this.bidderList.remove(o);
		return true;
	}

	@Override
	public void notifyallobservers() {
		//Calling the update method of each observer
		
		Iterator <IObserver> it = bidderList.iterator();
		while(it.hasNext())
			
			it.next().update(bidAmount);
		
		
	}
	public boolean setbidAmount(int a)
	{
		if(a<=this.bidAmount)
		
			return false;
		this.bidAmount=a;
		this.notifyallobservers();
		return true;
	}

}
