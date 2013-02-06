package fr.ensc.transdici.simulateurAudio;

import java.util.TreeMap;


public class Balance {

	private final String nom;
	
	// la première valeur est la fréquence, la seconde est la modification de gain a faire
	private TreeMap<Integer, Integer> gain; 

	
	public Balance(String nom)
	{
		this.nom = nom;
		this.gain = new TreeMap<Integer, Integer>();
		
	}
	
	public void AddValue2Gain(int frequence, int modifGain)
	{
		this.gain.put(frequence, modifGain);
	}
	
	public void removeValueFromGain(int frequence)
	{
		this.gain.remove(frequence);
	}

	public double getGain(int frequence) throws OutOfRangeException
	{
		if (frequence > gain.lastKey() || frequence < gain.firstKey())
			throw new OutOfRangeException();
		
		
		
		double deltaF = gain.ceilingKey(frequence) - gain.floorKey(frequence);
		double deltaG = 
				gain.get(gain.ceilingKey(frequence))
				- gain.get(gain.floorKey(frequence));	
		double coeff = deltaG/deltaF;
		int fb = gain.floorKey(frequence);
		return gain.get(fb)+(frequence-fb)*coeff;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	
	
	
}
