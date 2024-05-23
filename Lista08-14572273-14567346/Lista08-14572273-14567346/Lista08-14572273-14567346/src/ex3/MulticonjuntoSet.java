package ex3;
import java.util.*;

public class MulticonjuntoSet<T> extends MulticonjuntoAbstrato<T> {
	private HashSet<Wrapper> set;
	
	public MulticonjuntoSet() {
		super();
		set = new HashSet<MulticonjuntoAbstrato<T>.Wrapper>();
	}
	
	public boolean contains(Object e) {
		Iterator<MulticonjuntoSet<T>.Wrapper> i = set.iterator();
		while(i.hasNext()) {
			Wrapper w = (Wrapper)i.next();
			if (w.element.equals(e)) return true;
		}
		
		return false;
	}
	
	public int getMultiplicity(Object e) {
		Iterator<MulticonjuntoSet<T>.Wrapper> i = set.iterator();
		while(i.hasNext()) {
			Wrapper w = (Wrapper)i.next();
			if (w.element.equals(e)) return w.multiplicity;
		}
		
		return 0;
	}
	
	public boolean add(T e) {
		return add(e, 1);	
    }
	
	public boolean add(T e, int m) {
		if (m < 0) return false;
		Iterator<MulticonjuntoSet<T>.Wrapper> i = set.iterator();
		while(i.hasNext()) {
			Wrapper w = (Wrapper)i.next();
			if (w.element.equals(e)) {
				w.multiplicity += m;
				return true;
			}
		}
		
		return set.add(new Wrapper(e, m));	
    }

	public Iterator<MulticonjuntoAbstrato<T>.Wrapper> iterator() {
		return set.iterator();
	}
}
