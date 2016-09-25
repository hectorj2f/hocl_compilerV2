package fr.inria.hocl.example.PassRuleReceiver;


import java.io.Serializable;

import fr.inria.hocl.core.hocli.Access;
import fr.inria.hocl.core.hocli.Atom;
import fr.inria.hocl.core.hocli.AtomIterator;
import fr.inria.hocl.core.hocli.ExternalObject;
import fr.inria.hocl.core.hocli.IteratorForExternal;
import fr.inria.hocl.core.hocli.Molecule;
import fr.inria.hocl.core.hocli.MoleculeIterator;
import fr.inria.hocl.core.hocli.ReactionRule;
import fr.inria.hocl.core.hocli.Tuple;

public class Max extends ReactionRule implements Serializable {

	public Max() {
		super( "max", Shot.N_SHOT );
		setTrope( Trope.REDUCER );
		AtomIterator[] _HOCL_atomIteratorArray1;
		_HOCL_atomIteratorArray1 = new AtomIterator[2];
		{
			class AtomIterator_x extends IteratorForExternal {

				public AtomIterator_x() {
					access = Access.READ_ONLY;
				}


				@Override
				public boolean conditionSatisfied() {
					Atom atom;
					boolean satisfied;
					atom = iterator.getElement();
					satisfied = false;
					if( atom instanceof ExternalObject
							&& ( ( ExternalObject ) atom ).getObject() instanceof Integer ) {
						satisfied = true;
					}
					return satisfied;
				}

			} // end of class AtomIterator_x
			_HOCL_atomIteratorArray1[0] = new AtomIterator_x();
		}
		{
			class AtomIterator_y extends IteratorForExternal {

				public AtomIterator_y() {
					access = Access.REWRITE;
				}


				@Override
				public boolean conditionSatisfied() {
					Atom atom;
					boolean satisfied;
					atom = iterator.getElement();
					satisfied = false;
					if( atom instanceof ExternalObject
							&& ( ( ExternalObject ) atom ).getObject() instanceof Integer ) {

						Integer x = ( Integer ) ( ( IteratorForExternal ) permutation
								.getAtomIterator( 0 ) ).getObject();
						Integer y = ( Integer ) ( ( IteratorForExternal ) permutation
								.getAtomIterator( 1 ) ).getObject();
						satisfied = x > y;
					}
					return satisfied;
				}

			} // end of class AtomIterator_y
			_HOCL_atomIteratorArray1[1] = new AtomIterator_y();
		}
		MoleculeIterator[] _HOCL_moleculeIteratorArray1 = new MoleculeIterator[0];
		permutation = newPermutation( _HOCL_atomIteratorArray1,
				_HOCL_moleculeIteratorArray1 );
	}


	public void addType( String s ) {
	} // compute result of the rule max


	protected Molecule computeResult() {
		ExternalObject object;
		ReactionRule rule;
		String[] string;
		Tuple tuple;

		Molecule mol0 = new Molecule();
		return mol0;
	}


	@Override
	public ReactionRule clone() {
		// TODO Auto-generated method stub
		return null;
	}

} // end of class Max
