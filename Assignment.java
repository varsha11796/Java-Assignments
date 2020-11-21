class MyClass
	{
	private int prnno;
	private int idno;

	public MyClass(int prnno)
	{
	this.prnno= prnno;
	}

	public MyClass(int prnno,int idno)
	{
	this.prnno= prnno;
	this.idno = idno;
	}

	public MyClass()
	{
	}

	public void setPrnNo(int prnno)
	{
	this.prnno= prnno;
	}

	public int getPrnNo()
	{
	return prnno;
	}

	public void setIdNo(int idno)
	{
	this.idno= idno;
	}

	public int getIdNo()
	{
	return idno;
	}
	}

public class Assignment
	{
	public static void main(String args[])
	{
	MyClass engg1 = new MyClass();
		engg1.setPrnNo(4364332);
		engg1.setIdNo(35);
	System.out.println("prn no of engg1 is: "+engg1.getPrnNo() +" and id no of engg1 is: "+engg1.getIdNo());

	MyClass engg2 = new MyClass(654389);
	System.out.println("prn no of engg2 is: " +engg2.getPrnNo());

	MyClass engg3 = new MyClass(87466 , 65);
	System.out.println("prn no of engg3 is: " +engg3.getPrnNo() + " and id no of engg3 is: " +engg3.getIdNo());
	}
	}
