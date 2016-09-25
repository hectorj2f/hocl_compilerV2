package fr.inria.hocl.workflow.example.clientChService;
import fr.inria.hocl.core.hocli.*;
import fr.inria.hocl.core.hocli.*;
import fr.inria.hocl.core.hocli.rmi.*;
import java.io.*;

public class Reset extends ReactionRule implements Serializable {

	
	public Reset(){
		super("reset", Shot.ONE_SHOT);
		setTrope(Trope.EXPANSER);
			AtomIterator[] _HOCL_atomIteratorArray14;
		_HOCL_atomIteratorArray14 = new AtomIterator[3];
		{
			AtomIterator[] _HOCL_atomIteratorArrayTuple13;
			_HOCL_atomIteratorArrayTuple13 = new AtomIterator[2];
			{
				class AtomIterator__HOCL_literal31 extends IteratorForExternal {
					public AtomIterator__HOCL_literal31(){
						access = Access.REWRITE;
					}
					@Override
					public boolean conditionSatisfied() {
						Atom atom;
						boolean satisfied;
						atom = iterator.getElement();
						satisfied = false;
						if (atom instanceof ExternalObject
						  && ((ExternalObject)atom).getObject() instanceof String) {
							
							IteratorForTuple _HOCL_tupleAtomIterator43 = (IteratorForTuple)permutation.getAtomIterator(0);
							String _HOCL_literal31 = (String)((IteratorForExternal)_HOCL_tupleAtomIterator43.getAtomIterator(0)).getObject();
							satisfied = _HOCL_literal31.equals("RESET");
						}
						return satisfied;
					}
				
				} // end of class AtomIterator__HOCL_literal31
				_HOCL_atomIteratorArrayTuple13[0] = new AtomIterator__HOCL_literal31();
			}
			{
				class IteratorSolution7 extends IteratorForSolution {
					protected Permutation makeSubPermutation(){
						Permutation perm;
						AtomIterator[] _HOCL_atomIteratorArray14;
						_HOCL_atomIteratorArray14 = new AtomIterator[0];
						
						MoleculeIterator[] _HOCL_moleculeIteratorArray14 = new MoleculeIterator[1];
						_HOCL_moleculeIteratorArray14[0] = new MoleculeIterator(1); // w
						
						perm = newPermutation(_HOCL_atomIteratorArray14, _HOCL_moleculeIteratorArray14);
						return perm;
					}
				
				} // class IteratorSolution7
				_HOCL_atomIteratorArrayTuple13[1] = new IteratorSolution7();
			}
			_HOCL_atomIteratorArray14[0] = new IteratorForTuple(_HOCL_atomIteratorArrayTuple13, Reset.this);
		}
		{
			AtomIterator[] _HOCL_atomIteratorArrayTuple14;
			_HOCL_atomIteratorArrayTuple14 = new AtomIterator[2];
			{
				class AtomIterator__HOCL_literal32 extends IteratorForExternal {
					public AtomIterator__HOCL_literal32(){
						access = Access.REWRITE;
					}
					@Override
					public boolean conditionSatisfied() {
						Atom atom;
						boolean satisfied;
						atom = iterator.getElement();
						satisfied = false;
						if (atom instanceof ExternalObject
						  && ((ExternalObject)atom).getObject() instanceof String) {
							
							IteratorForTuple _HOCL_tupleAtomIterator44 = (IteratorForTuple)permutation.getAtomIterator(1);
							String _HOCL_literal32 = (String)((IteratorForExternal)_HOCL_tupleAtomIterator44.getAtomIterator(0)).getObject();
							satisfied = _HOCL_literal32.equals("LOCKED");
						}
						return satisfied;
					}
				
				} // end of class AtomIterator__HOCL_literal32
				_HOCL_atomIteratorArrayTuple14[0] = new AtomIterator__HOCL_literal32();
			}
			{
				class AtomIterator_value extends IteratorForExternal {
					public AtomIterator_value(){
						access = Access.REWRITE;
					}
					@Override
					public boolean conditionSatisfied() {
						Atom atom;
						boolean satisfied;
						atom = iterator.getElement();
						satisfied = false;
						if (atom instanceof ExternalObject
						  && ((ExternalObject)atom).getObject() instanceof Integer) {
							satisfied = true;
						}
						return satisfied;
					}
				
				} // end of class AtomIterator_value
				_HOCL_atomIteratorArrayTuple14[1] = new AtomIterator_value();
			}
			_HOCL_atomIteratorArray14[1] = new IteratorForTuple(_HOCL_atomIteratorArrayTuple14, Reset.this);
		}
		{
			AtomIterator[] _HOCL_atomIteratorArrayTuple15;
			_HOCL_atomIteratorArrayTuple15 = new AtomIterator[2];
			{
				class AtomIterator__HOCL_literal33 extends IteratorForExternal {
					public AtomIterator__HOCL_literal33(){
						access = Access.REWRITE;
					}
					@Override
					public boolean conditionSatisfied() {
						Atom atom;
						boolean satisfied;
						atom = iterator.getElement();
						satisfied = false;
						if (atom instanceof ExternalObject
						  && ((ExternalObject)atom).getObject() instanceof String) {
							
							IteratorForTuple _HOCL_tupleAtomIterator45 = (IteratorForTuple)permutation.getAtomIterator(2);
							String _HOCL_literal33 = (String)((IteratorForExternal)_HOCL_tupleAtomIterator45.getAtomIterator(0)).getObject();
							satisfied = _HOCL_literal33.equals("INVOKE");
						}
						return satisfied;
					}
				
				} // end of class AtomIterator__HOCL_literal33
				_HOCL_atomIteratorArrayTuple15[0] = new AtomIterator__HOCL_literal33();
			}
			{
				class AtomIterator_active extends IteratorForExternal {
					public AtomIterator_active(){
						access = Access.REWRITE;
					}
					@Override
					public boolean conditionSatisfied() {
						Atom atom;
						boolean satisfied;
						atom = iterator.getElement();
						satisfied = false;
						if (atom instanceof ExternalObject
						  && ((ExternalObject)atom).getObject() instanceof Integer) {
							
							IteratorForTuple _HOCL_tupleAtomIterator46 = (IteratorForTuple)permutation.getAtomIterator(1);
							Integer value = (Integer)((IteratorForExternal)_HOCL_tupleAtomIterator46.getAtomIterator(1)).getObject();
							IteratorForTuple _HOCL_tupleAtomIterator47 = (IteratorForTuple)permutation.getAtomIterator(2);
							Integer active = (Integer)((IteratorForExternal)_HOCL_tupleAtomIterator47.getAtomIterator(1)).getObject();
							satisfied = (value == 0) && (active == 1);
						}
						return satisfied;
					}
				
				} // end of class AtomIterator_active
				_HOCL_atomIteratorArrayTuple15[1] = new AtomIterator_active();
			}
			_HOCL_atomIteratorArray14[2] = new IteratorForTuple(_HOCL_atomIteratorArrayTuple15, Reset.this);
		}
		MoleculeIterator[] _HOCL_moleculeIteratorArray15 = new MoleculeIterator[0];
		permutation = newPermutation(_HOCL_atomIteratorArray14, _HOCL_moleculeIteratorArray15);
	}

	public Reset clone() {
		 return new Reset();
	}
	public void addType(String s){}

	// compute result of the rule reset
	protected Molecule computeResult(){
		ExternalObject object;
		ReactionRule rule;
		String[] string;
		Tuple tuple;
		
		IteratorForTuple _HOCL_tupleAtomIterator48 = (IteratorForTuple)permutation.getAtomIterator(0);
		IteratorForSolution _HOCL_iteratorSolution3 = (IteratorForSolution)_HOCL_tupleAtomIterator48.getAtomIterator(1);
		Molecule w = _HOCL_iteratorSolution3.getSubPermutation().getSolution().getContents();
		IteratorForTuple _HOCL_tupleAtomIterator49 = (IteratorForTuple)permutation.getAtomIterator(2);
		Integer active = (Integer)((IteratorForExternal)_HOCL_tupleAtomIterator49.getAtomIterator(1)).getObject();
		Molecule mol25 = new Molecule();
		mol25.add(w);
		Tuple tuple33 = new Tuple(2);
		tuple33.set(0, new ExternalObject("RESET"));
		Solution solution8 = new Solution();
		{
			Molecule mol26 = new Molecule();
			mol26.add(w);
			solution8.addMolecule(mol26);
		}
		tuple33.set(1, solution8);
		tuple = tuple33;
		mol25.add(tuple);
		this.addType("Tuple");
		
		
		Tuple tuple34 = new Tuple(2);
		tuple34.set(0, new ExternalObject("LOCKED"));
		tuple34.set(1, new ExternalObject(1));
		tuple = tuple34;
		mol25.add(tuple);
		this.addType("Tuple");
		
		
		Tuple tuple35 = new Tuple(2);
		tuple35.set(0, new ExternalObject("INVOKE"));
		tuple35.set(1, new ExternalObject(active));
		tuple = tuple35;
		mol25.add(tuple);
		this.addType("Tuple");
		
		
		return mol25;
	}

} // end of class Reset
