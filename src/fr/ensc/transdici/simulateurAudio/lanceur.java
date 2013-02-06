package fr.ensc.transdici.simulateurAudio;

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
		
		try {
			System.out.println(balance.getGain(155));
		} catch (OutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		balance.removeValueFromGain(150);
		
		try {
			System.out.println(balance.getGain(155));
		} catch (OutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
