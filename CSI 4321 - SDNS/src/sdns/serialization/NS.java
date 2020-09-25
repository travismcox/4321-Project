/**
 * 
 */
package sdns.serialization;

/**
 * @author traviscox
 *
 */
public class NS extends ResourceRecord {

	private String nameServer;
	
	public NS(String name, int ttl, String nameServer) throws ValidationException {
		super(name, ttl, Utility.NS_TYPE_VALUE);
		setNameServer(nameServer);
	}
	
	public String getNameServer() {
		return this.nameServer;
		
	}
	
	public NS setNameServer(String nameServer) throws ValidationException {
		this.nameServer = nameServer;
		
		return this;
		
	}
	
	public String toString() {
		return null;
		
	}
}
