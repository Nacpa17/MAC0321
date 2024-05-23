package ex3;

import java.util.*;

public class MulticonjuntoStack<T> extends MulticonjuntoAbstrato<T> {

	private Stack<Wrapper> stack;
	
	public MulticonjuntoStack() {
		stack = new Stack<MulticonjuntoAbstrato<T>.Wrapper>();
	}
	
	@Override
	public Iterator<MulticonjuntoAbstrato<T>.Wrapper> iterator() {
		return stack.iterator();
	}
	@Override
	public int getMultiplicity(T element) {
		int i = stack.indexOf(new Wrapper(element, 0));
		if (i < 0) return 0;
		return stack.get(i).multiplicity;
	}

	@Override
	public boolean add(T e) {
		return add(e, 1);
	}

	@Override
	public boolean add(T e, int m) {
		if (m < 0) return false;
		int i = stack.indexOf(new Wrapper(e, 0));
		if (i >= 0) {
			stack.get(i).multiplicity += m;
			return true;
		}
		
		return stack.add(new Wrapper(e, m));
	}
}
