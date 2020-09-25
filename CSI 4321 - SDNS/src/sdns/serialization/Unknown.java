/**
 * 
 */
package sdns.serialization;

import java.io.OutputStream;

/**
 * @author traviscox
 *
 */
public class Unknown extends ResourceRecord {

	public Unknown(String name, int ttl, long typeValue) {
		super(name, ttl, typeValue);
		// TODO Auto-generated constructor stub
	}

	public void encode(OutputStream out) {
		
	}
	
	public String toString() {
		return null;
		
	}
}
