/**
 * 
 */
package sdns.serialization;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author traviscox
 *
 */
public class ResourceRecord {
	
	private String name;
	private long typeValue;
	private int ttl;

	public ResourceRecord(String name, int ttl, long typeValue) {
		try {
			setName(name);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			setTTL(ttl);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setTypeValue(typeValue);
	}
	
	public static ResourceRecord decode(InputStream in) throws ValidationException, IOException {
		return null;
		
	}
	
	public void encode(OutputStream out) throws IOException {
		
	}
	
	public long getTypeValue() {
		return this.typeValue;
		
	}
	
	public ResourceRecord setTypeValue(long typeValue) {
		this.typeValue = typeValue;
		
		return this;
	}
	
	public String getName() {
		return name;
		
	}
	
	public ResourceRecord setName(String name) throws ValidationException {
		this.name = name;
		
		return this;
		
	}
	
	public int getTTL() {
		return this.ttl;
		
	}
	
	public ResourceRecord setTTL(int ttl) throws ValidationException {
		this.ttl = ttl;
		
		return this;
		
	}
}
