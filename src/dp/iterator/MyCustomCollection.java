package dp.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyCustomCollection<T> {
	private List<T> myList = new ArrayList<>();
	public MyCustomCollection() {
		// TODO Auto-generated constructor stub
	}
	
	public void addItem(T item) {
		this.myList.add(item);
	}
	
	public Iterator<T> getIterator() {
		return new MyCustomCollIterator<T>(this.myList);
	}
	
	private static class MyCustomCollIterator<T> implements Iterator<T>{
		private int count=0;
		private List<T> myList;
		public MyCustomCollIterator( List<T> myList) {
			this.myList = myList;
			
		}
		@Override
		public synchronized T getNext() {
			if (this.count == this.myList.size()) return null;
			return myList.get(count++);
			
		}
		
	}
}
