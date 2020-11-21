/*4)define a class called as "Item" (Item.java)
with members
String itemid;
String name;
int cost;

parameterized constructor which will accept above details at the time
of creating object.
	member function
void display()
which will display all the details of product
create instances of this class and call the method display.*/

package Item;

public class Item {
	
	String itemid;
	String name;
	int cost;
	Item(String itemid,String name,int cost)
	{
		this.itemid=itemid;
		this.name=name;
		this.cost=cost;
	}
		public void disp()
		{
			System.out.println("itemid = "+itemid+" "+"name = "+name+" "+"cost = "+cost);
		}

public static void main(String[] args) {
	Item ref=new Item("123","Varsha",1000000000);
	ref.disp();
}
}
