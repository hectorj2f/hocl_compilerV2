/*
* DO NOT EDIT
* this class has been generated by fr.inria.hocl.core.hoclc2j version0.1->0.2
* on Fri Jan 21 18:19:41 CET 2011
*/

package fr.inria.hocl.workflow.example.sampleChService1;
import java.rmi.*;
import java.io.*;
import java.rmi.server.*;
import fr.inria.hocl.core.hocli.*;
import fr.inria.hocl.core.hocli.rmi.*;


/**
* Remote Class for multiset remote I/O
*/
public class SampleChService1Clt extends UnicastRemoteObject implements GeneralCltInterface {
    private Solution sol;

    /**
     * Construct a remote object
     * @param msg the message of the remote object
     * @exception RemoteException if the object handle cannot be constructed.
     */
    public SampleChService1Clt (Solution s) throws RemoteException {
        sol = s;
    }
   /**
    * Implementation of the remotely invocable method.
    * @return the message of the remote object
    * @exception RemoteException if the remote invocation fails.
    */
   public void printMultiset(String s) throws RemoteException {
		System.out.println("The remote multi-set is :");
		//s.printsol();
		System.out.println(s);
   }
}
