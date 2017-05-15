
public class VarTest {

	/**
	 * @param args
	 */
	
	static int x=5;
	
	int[] arr = new int[]{1,2,3};
	public static void main(String[] args) {

		//int x =5;
		
		System.out.println("Val of X: " + x);
		//int[] arr = new int[]{1,2,3};
		
		
		nowSee(x, arr);
		VarTest.nowSee(x, arr);
		
		
		System.out.println(x);
		
		for (int i : arr) {
      	  System.out.println(i);
		}
		
	}

	public void testStatic(){
		
	}
	
	public void instanceTest(){
		nowSee(x, arr);
	}

	private static void nowSee(int x, int[] arr) {
          x = x+2;
          System.out.println("In Side Method: " + x);
          
          for (int i : arr) {
        	  System.out.println(i);
		}
          arr[1]=1;
          
	}

}
