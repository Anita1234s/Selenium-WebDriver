package anitaseltest;

public class AdditionTest {
	
	int i;
	int j;
	int k;
	
	public void  sum(int i, int j)
	{
		 k=i+j;
		 
		 
		 System.out.println(k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   AdditionTest a =new AdditionTest();
   a.i=10;
   a.j=20;
   a.sum(30,40);
   System.out.println(a.i);
		
	}

}
