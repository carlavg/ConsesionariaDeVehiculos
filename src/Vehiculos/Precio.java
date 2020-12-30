package Vehiculos;

import java.util.Comparator;

public class Precio implements Comparator<Vehiculos> { 
		
		
	    public int compare(Vehiculos a, Vehiculos b) { 
	    	return a.precio > b.precio ? -1 :(a.precio < b.precio ? 1 : 0); 
	    } 
	} 

