/**
 * 
 */
package sdns.serialization.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sdns.serialization.ValidationException;
import sdns.serialization.*;

/**
 * @author traviscox
 *
 */
class NSTest /*extends ResourceRecord*/ {

	/* Tests constuctor */
	@Test
	void testConstructor() {
		assertThrows(ValidationException.class, () -> {new NS(null, 0, "name");});
		assertThrows(ValidationException.class, () -> {new NS("name", 0, null);});
	}
	
	/* Tests setNameServer */
	@Test
	void testSetNameServer() {
		assertThrows(ValidationException.class, () -> {new NS("name", 0, "name").setNameServer(null);});
	}

}
