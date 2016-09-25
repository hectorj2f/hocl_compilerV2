/*
* DO NOT EDIT
* this class has been generated by fr.inria.hocl.core.hoclc2j version0.1->0.2
* on Fri Jan 21 18:19:41 CET 2011
*/

package fr.inria.hocl.workflow.example.sampleChService1;
import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.io.*;
import java.rmi.server.*;
import fr.inria.hocl.core.hocli.*;
import fr.inria.hocl.core.hocli.rmi.*;


/**
* Remote Class for multiset remote I/O
*/
public class SampleChService1Srv extends UnicastRemoteObject implements GeneralSrvInterface {
    private Solution sol;

    /**
     * Construct a remote object
     * @param msg the message of the remote object
     * @exception RemoteException if the object handle cannot be constructed.
     */
    public SampleChService1Srv (Solution s) throws RemoteException {
        sol = s;
    }
   /**
    * Implementation of the remotely invocable method.
    * @return the message of the remote object
    * @exception RemoteException if the remote invocation fails.
    */
   public void remoteOperations(Molecule m) throws RemoteException {
		System.out.println("THis is remote operation Function:");
		System.out.println("Get the input molecule from a remote client:");
		System.out.println(m);
		sol.addMolecule(m);
		sol.printsol();
   }
   public void remoteRemove(Molecule m) throws RemoteException {
		System.out.println("THis is remote operation Function:");
		System.out.println("Get the input molecule from a remote client:");
		System.out.println(m);
		sol.removeFromContainer(m);
		sol.printsol();
   }
   public void remoteCheckState(String hostName, String clientClass) throws RemoteException {
		try{
		System.out.println("Print the solution state to the remote client.");
		Registry registry = LocateRegistry.getRegistry(hostName);
		GeneralCltInterface remoteioclt = (GeneralCltInterface) registry.lookup (clientClass);
		String s = this.sol.prepareprintsol();
		//System.out.println(s);

		remoteioclt.printMultiset(s);
		}catch (Exception e){
			System.out.println(e);
		}

			System.out.print(">");
   }
}
