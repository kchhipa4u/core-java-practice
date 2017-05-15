
public class NewInstance {

	/**
	 * Different ways to create a new instance of a class
	 * 1. using class.forName
	 * 2. Reflection
	 * 3. Clone
	 * 4. Object deserialization
	 */
	public static void main(String[] args) {
		
		// 1. Class.forName approach
		try {
			Class.forName("GetHeapSize").newInstance();
			System.out.println(Class.forName("GetHeapSize").getName());
			Class.forName("GetHeapSize").getName();
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2. Reflection
		
		try {
			GetHeapSize.class.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
