package ex3;

import java.util.*;

import ex3.MulticonjuntoAbstrato.Wrapper;


public class MulticonjuntoLinkedList<T> extends MulticonjuntoAbstrato<T> {

	private LinkedList<Wrapper> list;
	
	public MulticonjuntoLinkedList() {
		list = new LinkedList<MulticonjuntoAbstrato<T>.Wrapper>();
	}
	
	@Override
	public Iterator<MulticonjuntoAbstrato<T>.Wrapper> iterator() {
		return list.iterator();
	}

	@Override
	public int getMultiplicity(T element) {
		int i = list.indexOf(new Wrapper(element, 0));
		if (i < 0) return 0;
		return list.get(i).multiplicity;
	}

	@Override
	public boolean add(T e) {
		return add(e, 1);
	}

	@Override
	public boolean add(T e, int m) {
		if (m < 0) return false;
		int i = list.indexOf(new Wrapper(e, 0));
		if (i >= 0) {
			list.get(i).multiplicity += m;
			return true;
		}
		
		return list.add(new Wrapper(e, m));
	}
}
