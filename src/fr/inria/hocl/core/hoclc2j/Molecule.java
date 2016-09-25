package fr.inria.hocl.core.hoclc2j;


import java.util.*;

public interface Molecule {

	public String generateDeclarationInit();


	public String generateReference();


	public Set<Symbols> getFreeVars();


	public String generateAllVariablesDeclaration( Set<Symbols> argumentVars );


	public int size();


	public void findReadOnlyReactives();


	public Iterator<Atom> iterator();


	public String generateAddElementCode();


	public LinkedList<String> getElementTypes();
}
