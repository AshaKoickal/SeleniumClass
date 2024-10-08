package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample obj=new Sample();
//obj.show();
//obj.display();
obj.listDemo();
	}
	
	public void show()
	{
		//non generic arraylist
		ArrayList collection1 = new ArrayList();
		collection1.add(10);
		collection1.add("test");
		collection1.add(1.2f);
		collection1.add(true);
		collection1.add(18);
		collection1.add("test2");
		//System.out.println(collection1);
	}
	
	public void display()
	{
		//Generic Arraylist- jdk1.7 onwards
		ArrayList <Integer> collection2 =new ArrayList<Integer>();
		collection2.add(10);
		collection2.add(11);
		collection2.add(15);
		//collection2.add("test");
		collection2.add(1);
		collection2.add(35);
		System.out.println(collection2);
		collection2.remove(1);
		System.out.println(collection2);
		System.out.println(collection2.size());
		System.out.println(collection2.get(1));
		//System.out.println(collection2.get(5));->indexOutOfBoundException
		ArrayList <Integer> collection3=new ArrayList();
		System.out.println(collection3);
		collection3.addAll(collection2);
		System.out.println(collection3);
		collection3.removeAll(collection3);
		System.out.println(collection3);
		boolean b=collection2.contains(100);
		System.out.println(b);
		
	}
	@SuppressWarnings("rawtypes")
	public void listDemo()
	{
		//add 5 string, size,remove an object, get, addAll, removeAll, contains
		List <String> collectionObj=new ArrayList();
		collectionObj.add("A");
		collectionObj.add("B");
		collectionObj.add("C");
		collectionObj.add("D");
		collectionObj.add("E");
		//System.out.println(collectionObj);
		//System.out.println(collectionObj.size());
		collectionObj.remove("E");
		//System.out.println(collectionObj);
		boolean b=collectionObj.contains(100);
		//System.out.println(b);
		collectionObj.addAll(collectionObj);
		//System.out.println(collectionObj);
		
		//System.out.println(collectionObj.get(0));
		
		Iterator itr = collectionObj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr.remove();
		
		System.out.println(collectionObj);
		//collectionObj.removeAll(collectionObj);
		//System.out.println(collectionObj);
		
		
	}
	/*public void setDemo()
	{
		Set <Integer> collectionObj2=new HashSet();
		collectionObj2.add(1);
		collectionObj2.add(2);
		
	}*/
	}


