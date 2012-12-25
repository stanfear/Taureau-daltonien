
public class lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("bonjour !");

		
		Balance balance = new Balance("test");
		
		
		balance.AddValue2Gain(150, -2);
		balance.AddValue2Gain(160, 4);
		balance.AddValue2Gain(1060, 2);
		balance.AddValue2Gain(10, -10);
		balance.AddValue2Gain(2, -6);
		
		System.out.println(balance.getGain());
		
		balance.removeValueFromGain(150);
		
		System.out.println(balance.getGain());
	}

}
