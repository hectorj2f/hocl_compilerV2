/*
* DO NOT EDIT
* this class has been generated by fr.inria.hocl.core.hoclc2j version0.1->0.2
* on Fri Jan 21 18:52:35 CET 2011
*/

package fr.inria.hocl.workflow.example.clientChService;
import fr.inria.hocl.core.hocli.*;
import java.io.*;
import fr.inria.hocl.core.hocli.*;
import fr.inria.hocl.core.hocli.rmi.*;
import fr.inria.hocl.core.hoclc2j.Hoclc2j;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.net.InetAddress;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RunClientChService_gen {

	public static Molecule addElement(String line, Solution sol) throws Exception{
		Molecule mol = new Molecule();
					if (line.equals("put") || line.equals("p")) {
						mol = sol.addElement();
						//sol.setNonInert();
						//sol.reduce();
					}

					else{
						System.out.println("We are going to construct a solution to contain all the elements that you want to add.");
						mol = ((ClientChService_gen)sol).addElementSubSolution(line);					}
		return mol;
	}

	public static boolean deleteDir(File dir) {
		if (dir.isDirectory()) {
			String[] children = dir.list();

			for (int i=0; i<children.length; i++) {

				boolean success = deleteDir(new File(dir, children[i]));

				if (!success) {

					return false;

				}

			}

		}

		return dir.delete();
	}

	public static void main(String args[]) throws Exception{
		boolean quitshell = false;
		Hocli.init(args);
		Solution sol = new ClientChService_gen();
		System.out.println("HOCL shell");
		System.out.println("Copyright INRIA, 2009");
		while (!quitshell) {
			try{
				System.out.print("hocl> ");
				String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
				if( line == null ) {
					quitshell = true;
					System.out.println();
				} else if (line.startsWith("put")||line.startsWith("p")||line.startsWith("PUT")||line.startsWith("P")){
					sol.addMolecule(addElement(line,sol));
				}

				else if (line.startsWith("get")||line.startsWith("g")||line.startsWith("GET")||line.startsWith("G")){
					if (line.equals("get") || line.equals("g")) {
						// First scanning for display
						SimpleIterator<Atom> it = sol.newIterator();
						Atom atom = null;
						int cpt_at = 1;
						while( it.hasNext() ) {
							atom = it.next();
							System.out.println( cpt_at + ": " + atom );
							cpt_at++;
						}
						System.out.println( cpt_at + ": " + it.next() );
						// Second scanning for removing itself
						System.out.println("Enter the number of the element to be removed:");
						String input = new BufferedReader( new InputStreamReader( System.in ) ).readLine();
						int atomNb = ( new Integer( input ) ).intValue();
						it = sol.newIterator();
						cpt_at = 1;
						while( cpt_at <= atomNb ) {
							atom = it.next();
							cpt_at++;
						}
					sol.removeAtomFromContainer(atom);
					}

					else {
						Molecule mo = new Molecule();
						mo = ((ClientChService_gen)sol).addInheritRemoveTuple(line);
						sol.addMolecule(mo);
						//sol.setNonInert();
						//sol.reduce();
					}

				}
				else{

					if (line.equals("quit") || line.equals("q"))
						quitshell=true;

					else if (line.equals("run") || line.equals("r")){
						sol.setNonInert();
						sol.reduce();
					}

					else if (line.equals("server") || line.equals("srv")) {
						if (System.getSecurityManager() == null) {
							System.setSecurityManager(new RMISecurityManager());
						}
						try {
							String name = "ClientChServiceSrv";
							GeneralSrvInterface Server = new ClientChServiceSrv(sol);
							Registry registry = LocateRegistry.getRegistry();
							registry.rebind(name, Server);
							name = "ClientChServiceClt";
							GeneralCltInterface Client = new ClientChServiceClt(sol);
							registry = LocateRegistry.getRegistry();
							registry.rebind(name, Client);
							System.out.println ("Remote I/O multiset is enabled.");
						} catch (Exception e) {
							System.out.println ("Remote I/O multiset failed: " + e);
						}
					}

					else if (line.startsWith("client") || line.startsWith("clt")) {
						try {
							int out = 0;
							String ipaddr = "";
							String serverClass = "";
							if (line.equals("client") || line.equals("clt")) {
								ipaddr = "localhost";
								serverClass = "ClientChService";
							}

							else {
								String[] cmd = line.split("\\ ");
								if(cmd.length!=3 && cmd.length!=2){
									String errorLog=	"Input command with wrong format.\n"
									+"Use 'client' command in the following ways:\n"
									+	"1: 'client'; (Connect to local server;)\n"
									+	"2: 'client 192.168.0.0 serverClass'\n";
									System.out.println(errorLog);
								}
								else if (cmd.length==3){
									ipaddr = cmd[1];
										serverClass = cmd[2];
								}
								else if (cmd.length==2){
									ipaddr = "localhost";
									serverClass = cmd[1];
								}
							}

							String name = serverClass+"Srv";
							Registry registry = LocateRegistry.getRegistry(ipaddr);
							GeneralSrvInterface remoteiosrv = (GeneralSrvInterface) registry.lookup(name);
							System.out.print(">>This is the client shell.\n");
							while (out ==0){
								System.out.print(">>Input your command for the remote I/O operation:\n>>");
								String Comstr = new BufferedReader(new InputStreamReader(System.in)).readLine();
									if (Comstr.startsWith("put")||Comstr.startsWith("p")||Comstr.startsWith("PUT")||Comstr.startsWith("P")){
									if (Comstr.equals("put")||Comstr.equals("p")||Comstr.equals("PUT")||Comstr.equals("p")){
										Molecule m = addElement(Comstr, sol);
										remoteiosrv.remoteOperations(m);
										System.out.println("The element "+m+" has been added into the remote multi-set.");
									}

									else{
										Molecule m = ((ClientChService_gen)sol).addElementSubSolution(Comstr);
										remoteiosrv.remoteOperations(m);
										System.out.println("The element "+m+" has been added into the remote multi-set.");
									}

								}

								else if (Comstr.startsWith("get")||Comstr.startsWith("g")||Comstr.startsWith("GET")||Comstr.startsWith("G")){
									if (Comstr.equals("get")||Comstr.equals("g")||Comstr.equals("GET")||Comstr.equals("G")){
										Molecule m1 = new Molecule();
										m1 = sol.addElement();
										remoteiosrv.remoteRemove(m1);
										System.out.println("The element "+m1+" has been removed from the remote multi-set.");
										Molecule m = ((ClientChService_gen)sol).addRemoveTuple();
										remoteiosrv.remoteOperations(m);
									}

									else{
										Molecule m = ((ClientChService_gen)sol).addInheritRemoveTuple(Comstr);
										remoteiosrv.remoteOperations(m);
									}

								}

								else if (Comstr.equals("display")||Comstr.equals("dp")){
									//System.out.println("**********\nCALL REMOTE CHECK STATE METHOD\n************");
									InetAddress addr = InetAddress.getLocalHost();
									String ip=addr.getHostAddress();									remoteiosrv.remoteCheckState(ip, "ClientChServiceClt");
								}
								else if (Comstr.equals("q")||Comstr.equals("quit")){
										out = 1;
										System.out.println(">>Quit the client shell.");
								}
							}
						} catch (Exception e) {
								System.out.println ("RemoteIOclient exception: " + e);
						}

					}

					else if (line.equals("debug") || line.equals("d")) {
						System.out.print("Which level (0-9)? ");
						line = new BufferedReader(new InputStreamReader(System.in)).readLine();
						Hocli.setVerboseLevel(Integer.decode(line));
						System.out.println("Debug level set to " + line);
						}

					else if (line.equals("strategy") || line.equals("s")) {
						while( true ) {
							System.out.print("Which strategy (FR / UFR / RAND / KSS) ? ");
							line = new BufferedReader(new InputStreamReader(System.in)).readLine();
							if( line == null || line.isEmpty() ) {
								System.out.println( "You must enter a strategy name!" );
								continue;
							}
							line = line.trim();
							if( line.equalsIgnoreCase( "fr" ) )
								break;
							if( line.equalsIgnoreCase( "ufr" ) )
								break;
							if( line.equalsIgnoreCase( "rand" ) )
								break;
							if( line.equalsIgnoreCase( "kss" ) )
								break;
							System.out.println( line + " is not a valid strategy!" );
						}
						Hocli.setStrategy(line);
						System.out.println("Strategy set to " + line);
						}

					else if (line.equals("display") || line.equals("dp")) {
						sol.printsol();
					}

					else if (line.equals("check") || line.equals("cht")) {
						System.out.println("All the supported types of elements:\n");
						System.out.println(((ClientChService_gen) sol).displayTypes());
					}
					else if (line.equals("help") || line.equals("h")) {
						System.out.println("(q) quit - exit the HOCL shell");
						System.out.println("(r) run - run the HOCL program");
						System.out.println("(d) debug - set debug level");
						System.out.println("(s) strategy - select strategy");
						System.out.println("(p) put - add a molecule to the multi-set");
						System.out.println("(g) get - get a molecule from the multi-set");
						System.out.println("(dp) display - display solution");
						System.out.println("(srv) server - enabling remote I/O multiset");
						System.out.println("(clt) client - enabling remote I/O multiset");
						System.out.println("(cht) check - check all the supported types of elements");
					}
					 else if (line.equals("newrule") || line.equals("nr")){
						System.out.println("Please give your rule name:\n");
						String newRuleName = new BufferedReader(new InputStreamReader(System.in)).readLine();
						System.out.println("Please give your rule definition:\n");
						String newRuleDef = new BufferedReader(new InputStreamReader(System.in)).readLine();
						String newProgram = 
							"let "+newRuleName+ " =\n"+
							newRuleDef+
							"\nin\n"+
							"<"+newRuleName+">\n";
						try{
							File ruledir = new File("./rules/");

							if(!(new File("./rules/").isDirectory())){
								ruledir.mkdir();
							}
							FileOutputStream genFile = new FileOutputStream("./rules/./clientChService.hocl");
							DataOutputStream dataFile = new DataOutputStream(genFile);
							dataFile.writeBytes(newProgram);
							dataFile.close();
							try{
								String inputFiles[] = new String[1];
								inputFiles[0] = "./rules/./clientChService.hocl";
								Hoclc2j compiler = new Hoclc2j(inputFiles);
								compiler.run();
								String ruleClassName = Character.toUpperCase(newRuleName.charAt(0)) + newRuleName.substring(1);
								File file = new File("./rules/"+ruleClassName+".java");
								File dir = new File("./");
								if(file.renameTo(new File(dir, file.getName()))){
									if(deleteDir(ruledir)){
										try{
											Runtime   r   =   Runtime.getRuntime();
											String compile = "javac -cp ../../../bin -d ../../../bin "+ruleClassName+".java";
											r.exec(compile);
											((ClientChService_gen)sol).addType(ruleClassName);
											System.out.println("The new rule have been created!\n");
										}catch(Exception e){
											System.out.println("You might have the following error(s) during compiling new rules:\n" +e);
										}
									}
								}
							}catch(Exception e){
								System.out.println("You might have the following error(s) during your definition of rules:\n" +e);
							}
						}catch(Exception e){
							System.out.println("Exception during creating new HOCL files:\n" +e);
						}
					}
					else{
						System.out.println("Command '"+line+"' does not exist.\nInput 'help' (h) to check all the commands.");					}
				}

			}
			catch (IOException e) {
				//e.printStackTrace();
				System.out.println("e");
			}
		}
	}
} // class RunClientChService_gen