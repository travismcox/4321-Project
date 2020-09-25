/**
 * 
 */
package sdns.serialization.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import sdns.serialization.*;

/**
 * @author traviscox
 *
 */
class ResourceRecordTest {

	/*Testing decode*/
	@Test
	void testDecode() {
		assertThrows(NullPointerException.class, () -> {ResourceRecord.decode(null);});
		assertThrows(ValidationException.class, () -> {ResourceRecord.decode(null/*bad InputStream*/);});
		assertThrows(IOException.class, () -> {ResourceRecord.decode(null/*io error/EOS*/);});
	}
	
	/*Testing encode*/
	@Test
	void testEncode() {
		assertThrows(IOException.class, () -> {new ResourceRecord(null, 0, 0).encode(null/*io error*/);});
		assertThrows(NullPointerException.class, () -> {new ResourceRecord(null, 0, 0).encode(null);});
	}
	
	/*Testing setName*/
	@Test
	void testSetName() {
		assertThrows(ValidationException.class, () -> {new ResourceRecord(null, 0, 0).setName(null);});
	}
	
	/*Testing setTTL*/
	@Test
	void testSetTTL() {
		assertThrows(ValidationException.class, () -> {new ResourceRecord(null, 0, 0).setTTL(-1);});
	}

}
