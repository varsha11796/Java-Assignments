/*3)create a package called "course"
In this package create three classes
a) Dac    with methods  term1()  and term2()
b) PreDac with  method  cet()
c) Basic   with method  finalTest()
Now write application called  "VitaApp" in which call all the methods  of the above mentioned classes*/

package course;
public class VitaApp
{
	public static void main(String args[])
	{
		Dac dac = new Dac();
		PreDac pre = new PreDac();
		Basic basic = new Basic();
		dac.term1();
		dac.term2();
		pre.cet();
		basic.finalTest();
	}

}