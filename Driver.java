
public class Driver {

	private int sum;
	
	public static void main(String[] args) {
		Driver driver = new Driver(999999);
		driver.upgrade(2147000000);
		System.out.println(driver.getSum());
	}
	
	/**
	 * Reverses and returns the given text. 
	 * @param text to reverse
	 * @return reversed text
	 */
	public static String getReverse(String s) {
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {
			char c = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = c;
		}
		return new String(arr);
	}
	
	public Driver(int sum) {
		this.sum = sum;
	}
	
	public void upgrade(int add) {
		sum = Math.addExact(sum, add);
	}
	
	public int getSum() {
		return sum;
	}
	
	public String toString() {
		return sum + "";
	}
}
