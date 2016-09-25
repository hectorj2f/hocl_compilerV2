package fr.inria.hocl.core.hocli;


import java.io.*;

/**
 * Represents a tuple.
 * 
 */
public class Tuple implements Atom, Cloneable, Serializable {

	private static final long serialVersionUID = -7925117927352375840L;

	public final int size;

	private Atom[] atoms;


	public Tuple( int s ) {
		size = s;
		atoms = new Atom[size];
	}


	public String toString() {
		String s = new String();

		for( int i = 0; i < size - 1; i++ ) {
			s = s + atoms[i] + ":";
		}
		s = s + atoms[size - 1];
		return "(" + s + ")";
	}


	public boolean equals( Atom atom ) {
		boolean equal;
		Tuple tuple;

		equal = atom instanceof Tuple;
		if( equal ) {
			tuple = ( Tuple ) atom;
			equal = ( size == tuple.size );
			for( int i = 0; equal && i < size; i++ ) {
				equal = equal && get( i ).equals( tuple.get( i ) );
			}
		}
		return equal;
	}
	/**
	 * This method creates a new Tuple and clones all its Atom objects from an existed Tuple.
	 * @return a new Tuple object with its
	 */
	public Tuple clone() {
		Tuple tuple = new Tuple(this.size);

		for( int i = 0; i < size; i++ ) {
			tuple.set(i,this.get( i ).clone());
		}
			
		return tuple;
	}


	public void set( int indice, Atom a ) {
		assert 0 <= indice && indice < size;
		atoms[indice] = a;
	}


	public Atom get( int indice ) {
		assert 0 <= indice && indice < size;
		return atoms[indice];
	}


	public String getDesc() {
		String s = "";

		for( int i = 0; i < this.atoms.length; i++ ) {
			s += "\"" + this.atoms[i].getClass() + "\"";
		}

		return s;
	}

} // class Tuple
