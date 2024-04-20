
public class Test {
	public void  finalize()
	{
		System.out.println("Finalize() method");
	}
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
			Test t=new Test();
			Test t1=new Test();
			
			t=null;
			t1=null;
			System.gc();

	}

}
