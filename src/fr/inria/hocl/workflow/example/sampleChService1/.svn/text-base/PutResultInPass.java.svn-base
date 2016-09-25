package fr.inria.hocl.workflow.example.sampleChService1;
import fr.inria.hocl.core.hocli.*;
import fr.inria.hocl.core.hocli.rmi.*;
import java.io.*;

public class PutResultInPass extends ReactionRule implements Serializable {

	
	public PutResultInPass(){
		super("putResultInPass", Shot.N_SHOT);
		setTrope(Trope.OPTIMIZER);
			AtomIterator[] _HOCL_atomIteratorArray5;
		_HOCL_atomIteratorArray5 = new AtomIterator[2];
		{
			AtomIterator[] _HOCL_atomIteratorArrayTuple4;
			_HOCL_atomIteratorArrayTuple4 = new AtomIterator[3];
			{
				class AtomIterator__HOCL_literal10 extends IteratorForExternal {
					public AtomIterator__HOCL_literal10(){
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
							
							IteratorForTuple _HOCL_tupleAtomIterator14 = (IteratorForTuple)permutation.getAtomIterator(0);
							String _HOCL_literal10 = (String)((IteratorForExternal)_HOCL_tupleAtomIterator14.getAtomIterator(0)).getObject();
							satisfied = _HOCL_literal10.equals("DEST");
						}
						return satisfied;
					}
				
				} // end of class AtomIterator__HOCL_literal10
				_HOCL_atomIteratorArrayTuple4[0] = new AtomIterator__HOCL_literal10();
			}
			{
				class AtomIterator_nameRegService extends IteratorForExternal {
					public AtomIterator_nameRegService(){
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
				
				} // end of class AtomIterator_nameRegService
				_HOCL_atomIteratorArrayTuple4[1] = new AtomIterator_nameRegService();
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
							satisfied = true;
						}
						return satisfied;
					}
				
				} // end of class AtomIterator_className
				_HOCL_atomIteratorArrayTuple4[2] = new AtomIterator_className();
			}
			_HOCL_atomIteratorArray5[0] = new IteratorForTuple(_HOCL_atomIteratorArrayTuple4, PutResultInPass.this);
		}
		{
			AtomIterator[] _HOCL_atomIteratorArrayTuple5;
			_HOCL_atomIteratorArrayTuple5 = new AtomIterator[3];
			{
				class AtomIterator__HOCL_literal11 extends IteratorForExternal {
					public AtomIterator__HOCL_literal11(){
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
							
							IteratorForTuple _HOCL_tupleAtomIterator15 = (IteratorForTuple)permutation.getAtomIterator(1);
							String _HOCL_literal11 = (String)((IteratorForExternal)_HOCL_tupleAtomIterator15.getAtomIterator(0)).getObject();
							satisfied = _HOCL_literal11.equals("RESULT");
						}
						return satisfied;
					}
				
				} // end of class AtomIterator__HOCL_literal11
				_HOCL_atomIteratorArrayTuple5[0] = new AtomIterator__HOCL_literal11();
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
				_HOCL_atomIteratorArrayTuple5[1] = new AtomIterator_idChWS();
			}
			{
				class AtomIterator_result extends IteratorForExternal {
					public AtomIterator_result(){
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
				
				} // end of class AtomIterator_result
				_HOCL_atomIteratorArrayTuple5[2] = new AtomIterator_result();
			}
			_HOCL_atomIteratorArray5[1] = new IteratorForTuple(_HOCL_atomIteratorArrayTuple5, PutResultInPass.this);
		}
		MoleculeIterator[] _HOCL_moleculeIteratorArray5 = new MoleculeIterator[0];
		permutation = newPermutation(_HOCL_atomIteratorArray5, _HOCL_moleculeIteratorArray5);
	}

	public PutResultInPass clone() {
		 return new PutResultInPass();
	}
	public void addType(String s){}

	// compute result of the rule putResultInPass
	protected Molecule computeResult(){
		ExternalObject object;
		ReactionRule rule;
		String[] string;
		Tuple tuple;
		
		IteratorForTuple _HOCL_tupleAtomIterator16 = (IteratorForTuple)permutation.getAtomIterator(0);
		String nameRegService = (String)((IteratorForExternal)_HOCL_tupleAtomIterator16.getAtomIterator(1)).getObject();
		IteratorForTuple _HOCL_tupleAtomIterator17 = (IteratorForTuple)permutation.getAtomIterator(1);
		String idChWS = (String)((IteratorForExternal)_HOCL_tupleAtomIterator17.getAtomIterator(1)).getObject();
		IteratorForTuple _HOCL_tupleAtomIterator18 = (IteratorForTuple)permutation.getAtomIterator(0);
		String className = (String)((IteratorForExternal)_HOCL_tupleAtomIterator18.getAtomIterator(2)).getObject();
		IteratorForTuple _HOCL_tupleAtomIterator19 = (IteratorForTuple)permutation.getAtomIterator(1);
		String result = (String)((IteratorForExternal)_HOCL_tupleAtomIterator19.getAtomIterator(2)).getObject();
		Molecule mol6 = new Molecule();
		Tuple tuple9 = new Tuple(4);
		tuple9.set(0, new ExternalObject("PASS"));
		tuple9.set(1, new ExternalObject(nameRegService));
		tuple9.set(2, new ExternalObject(className));
		Solution solution1 = new Solution();
		{
			Molecule mol7 = new Molecule();
			Tuple tuple10 = new Tuple(3);
			tuple10.set(0, new ExternalObject("COMPLETED"));
			tuple10.set(1, new ExternalObject(idChWS));
			tuple10.set(2, new ExternalObject(result));
			tuple = tuple10;
			mol7.add(tuple);
			this.addType("Tuple");
			
			
			solution1.addMolecule(mol7);
		}
		tuple9.set(3, solution1);
		tuple = tuple9;
		mol6.add(tuple);
		this.addType("Tuple");
		
		
		Tuple tuple11 = new Tuple(3);
		tuple11.set(0, new ExternalObject("RESULT"));
		tuple11.set(1, new ExternalObject(idChWS));
		tuple11.set(2, new ExternalObject(result));
		tuple = tuple11;
		mol6.add(tuple);
		this.addType("Tuple");
		
		
		return mol6;
	}

} // end of class PutResultInPass
