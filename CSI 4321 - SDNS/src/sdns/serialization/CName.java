/**
 * 
 */
package sdns.serialization;

/**
 * @author traviscox
 *
 */
public class CName extends ResourceRecord {

	private String canonicalName;
	
	public CName(String name, int ttl, String canonicalName) throws ValidationException {
		super(name, ttl, Utility.CNAME_TYPE_VALUE);
		setCanonicalName(canonicalName);
	}
	
	public String getCanonicalName() {
		return this.canonicalName;
		
	}
	
	public CName setCanonicalName(String canonicalName) throws ValidationException {
		this.canonicalName = canonicalName;
		
		return this;
		
	}
	
	public String toString() {
		return null;
		
	}
}
