package fr.inria.hocl.workflow.example.clientChService;
import fr.inria.hocl.core.hocli.*;
import fr.inria.hocl.core.hocli.*;
import fr.inria.hocl.core.hocli.rmi.*;
import java.io.*;

public class PassInfo extends ReactionRule implements Serializable {

	
	public PassInfo(){
		super("passInfo", Shot.N_SHOT);
		setTrope(Trope.OPTIMIZER);
			AtomIterator[] _HOCL_atomIteratorArray11;
		_HOCL_atomIteratorArray11 = new AtomIterator[1];
		{
			AtomIterator[] _HOCL_atomIteratorArrayTuple11;
			_HOCL_atomIteratorArrayTuple11 = new AtomIterator[4];
			{
				class AtomIterator__HOCL_literal0 extends IteratorForExternal {
					public AtomIterator__HOCL_literal0(){
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
							
							IteratorForTuple _HOCL_tupleAtomIterator37 = (IteratorForTuple)permutation.getAtomIterator(0);
							String _HOCL_literal0 = (String)((IteratorForExternal)_HOCL_tupleAtomIterator37.getAtomIterator(0)).getObject();
							satisfied = _HOCL_literal0.equals("PASS");
						}
						return satisfied;
					}
				
				} // end of class AtomIterator__HOCL_literal0
				_HOCL_atomIteratorArrayTuple11[0] = new AtomIterator__HOCL_literal0();
			}
			{
				class AtomIterator_idChWS extends IteratorForExternal {
					public AtomIterator_idChWS(){
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
							satisfied = true;
						}
						return satisfied;
					}
				
				} // end of class AtomIterator_idChWS
				_HOCL_atomIteratorArrayTuple11[1] = new AtomIterator_idChWS();
			}
			{
				class AtomIterator_className extends IteratorForExternal {
					public AtomIterator_className(){
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
							
							IteratorForTuple _HOCL_tupleAtomIterator38 = (IteratorForTuple)permutation.getAtomIterator(0);
							String className = (String)((IteratorForExternal)_HOCL_tupleAtomIterator38.getAtomIterator(2)).getObject();
							IteratorForTuple _HOCL_tupleAtomIterator39 = (IteratorForTuple)permutation.getAtomIterator(0);
							IteratorForSolution _HOCL_iteratorSolution2 = (IteratorForSolution)_HOCL_tupleAtomIterator39.getAtomIterator(3);
							Molecule w = _HOCL_iteratorSolution2.getSubPermutation().getSolution().getContents();
							satisfied = ((IOSender.send("clientChService", className, w)));
						}
						return satisfied;
					}
				
				} // end of class AtomIterator_className
				_HOCL_atomIteratorArrayTuple11[2] = new AtomIterator_className();
			}
			{
				class IteratorSolution0 extends IteratorForSolution {
					protected Permutation makeSubPermutation(){
						Permutation perm;
						AtomIterator[] _HOCL_atomIteratorArray11;
						_HOCL_atomIteratorArray11 = new AtomIterator[0];
						
						MoleculeIterator[] _HOCL_moleculeIteratorArray11 = new MoleculeIterator[1];
						_HOCL_moleculeIteratorArray11[0] = new MoleculeIterator(1); // w
						
						perm = newPermutation(_HOCL_atomIteratorArray11, _HOCL_moleculeIteratorArray11);
						return perm;
					}
				
				} // class IteratorSolution0
				_HOCL_atomIteratorArrayTuple11[3] = new IteratorSolution0();
			}
			_HOCL_atomIteratorArray11[0] = new IteratorForTuple(_HOCL_atomIteratorArrayTuple11, PassInfo.this);
		}
		MoleculeIterator[] _HOCL_moleculeIteratorArray12 = new MoleculeIterator[0];
		permutation = newPermutation(_HOCL_atomIteratorArray11, _HOCL_moleculeIteratorArray12);
	}

	public PassInfo clone() {
		 return new PassInfo();
	}
	public void addType(String s){}

	// compute result of the rule passInfo
	protected Molecule computeResult(){
		ExternalObject object;
		ReactionRule rule;
		String[] string;
		Tuple tuple;
		
		IteratorForTuple _HOCL_tupleAtomIterator40 = (IteratorForTuple)permutation.getAtomIterator(0);
		String idChWS = (String)((IteratorForExternal)_HOCL_tupleAtomIterator40.getAtomIterator(1)).getObject();
		Molecule mol0 = new Molecule();
		Tuple tuple31 = new Tuple(2);
		tuple31.set(0, new ExternalObject("Success_Pass"));
		tuple31.set(1, new ExternalObject(idChWS));
		tuple = tuple31;
		mol0.add(tuple);
		this.addType("Tuple");
		
		
		return mol0;
	}

} // end of class PassInfo
