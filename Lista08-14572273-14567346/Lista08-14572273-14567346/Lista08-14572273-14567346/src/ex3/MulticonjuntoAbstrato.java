package ex3;

import java.util.Iterator;


public abstract class MulticonjuntoAbstrato<T> {
	public class Wrapper {
		T element;
		int multiplicity = 0;
		
		public Wrapper (T e, int m) {
			this.element = e;
			this.multiplicity = m;
		}
		
		@Override
		public boolean equals(Object other) {
			try {
				return ((Wrapper)other).element.equals(element);
			} catch (Exception e) {
				return false;
			}
		}
		
		public int getMultiplicity() {
			return multiplicity;
		}
		
		public T getElement() {
			return element;
		}
	}
	
	public abstract Iterator<MulticonjuntoAbstrato<T>.Wrapper> iterator();
	public abstract int getMultiplicity(T element);
	public abstract boolean add(T e);
	public abstract boolean add(T e, int m);
	
	public boolean addAll(MulticonjuntoAbstrato<T> c) {
		Iterator<MulticonjuntoAbstrato<T>.Wrapper> i = c.iterator();
		while (i.hasNext()) {
			Wrapper w = (Wrapper)i.next();
			if (!this.add(w.element, w.multiplicity)) return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equals(Object other) {
		if (MulticonjuntoAbstrato.class.isAssignableFrom(other.getClass())) {
			Iterator<MulticonjuntoAbstrato<T>.Wrapper> i = ((MulticonjuntoAbstrato<T>)other).iterator();
			while(i.hasNext()) {
				Wrapper w = (Wrapper)i.next();
				if (getMultiplicity(w.element) != w.multiplicity) return false;
			}
			return true;
		}
		return false;
	}
}
