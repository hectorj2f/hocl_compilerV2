package fr.inria.hocl.core.hocli.rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;

import fr.inria.hocl.core.hocli.Molecule;

public interface GeneralSrvInterface extends Remote {

	/**
	 * Remotely invocable method.
	 * 
	 * @exception RemoteException
	 *              if the remote invocation fails.
	 */
	public void remoteOperations( Molecule m ) throws RemoteException;


	public void remoteCheckState( String hostName, String clientClass )
			throws RemoteException;


	public void remoteRemove( Molecule m ) throws RemoteException;
	
	
	
	/*
	//FIXME: Hector IOSender 
	public Solution getSolution() throws RemoteException;
	public void remoteCheckState(String clientClass )throws RemoteException;
*/
}
