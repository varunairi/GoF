package dp.iterator;

public class TestDriveIterator {

public static void main(String[] args) {
	MyCustomCollection<Integer> coll = new MyCustomCollection<>();
	
	coll.addItem(1);
	coll.addItem(4);
	coll.addItem(15);
	coll.addItem(17);
	coll.addItem(18);
	
	Iterator<Integer> customIterator = coll.getIterator();
	Integer temp=null;
	
	while ((temp=customIterator.getNext() )!=null) {
		System.out.println(temp);
	}
}
}
