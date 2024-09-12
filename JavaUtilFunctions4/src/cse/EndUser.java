package cse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EndUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> il = new ArrayList<Integer>();
		il.addAll(Arrays.asList(10,21,14,16,17,199));
		List<Integer> el = createEvenIntList(il, x->x%2==0);

	}

	private static List<Integer> createEvenIntList(List<Integer> il, Predicate<Integer> p) {
		// TODO Auto-generated method stub
		List<Integer>result = new ArrayList<Integer>();
		for(int i : il)
		{
			if(p.test(i))
				result.add(i);
		}
		return result;
		
	}

}

//Supplier and BiSupplier unaryoperator
