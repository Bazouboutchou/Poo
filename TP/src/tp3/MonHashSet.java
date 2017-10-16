package tp3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class MonHashSet <E>extends HashSet<E> {

	public MonHashSet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MonHashSet(Collection<? extends E> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public MonHashSet(int initialCapacity, float loadFactor) {
		super(initialCapacity, loadFactor);
		// TODO Auto-generated constructor stub
	}

	public MonHashSet(int initialCapacity) {
		super(initialCapacity);
		// TODO Auto-generated constructor stub
	}
	
	public MonHashSet<E> sousEnsembleAleatoire(int n){
		MonHashSet<E> ms = new MonHashSet<>();
		ArrayList<E> array = new ArrayList<>(this);
		for (int i = 0; i < n; ++i){
			ms.add(array.get(i));
		}
		return ms;
	}
}
