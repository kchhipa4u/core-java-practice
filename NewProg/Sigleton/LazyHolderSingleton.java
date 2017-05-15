/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Sigleton;

/**
 *
 * @author kc211701
 */


   class Something {
	private Something() {
	}

	private static final class LazyHolder {
		private static final Something INSTANCE = new Something();
	}

	public static Something getInstance() {
		return LazyHolder.INSTANCE;
	}
}


public class LazyHolderSingleton {
    public static void main(String[] args) {
        System.out.println("Singleton" + Something.getInstance().toString());
    }

}
