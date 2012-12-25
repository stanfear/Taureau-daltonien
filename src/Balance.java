import java.util.SortedSet;
import java.util.TreeMap;


public class Balance {

	private final String nom;
	
	// la première valeur est la fréquence, la seconde est la modification de gain a faire
	private TreeMap<Integer, Integer> gain; 

	
	public Balance(String nom)
	{
		this.nom = nom;
		this.gain = new TreeMap();
		
	}
	
	public void AddValue2Gain(int frequence, int modifGain)
	{
		this.gain.put(frequence, modifGain);
	}
	
	public void removeValueFromGain(int frequence)
	{
		this.gain.remove(frequence);
	}

	public TreeMap<Integer, Integer> getGain()
	{
		return gain;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	
	
	
}
