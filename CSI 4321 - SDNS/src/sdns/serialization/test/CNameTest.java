/**
 * 
 */
package sdns.serialization.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sdns.serialization.*;
import sdns.serialization.ValidationException;

/**
 * @author traviscox
 *
 */
class CNameTest /*extends ResourceRecord*/ {

    /* Tests Constructor */
	@Test
	void testConstructor() {
		assertThrows(ValidationException.class, () -> {new CName(null, 0, "name");});
		assertThrows(ValidationException.class, () -> {new CName("name", 0, null);});
	}
	
    /*Tests setCanonicalName*/	
	@Test
	void testSetCanonicalName() {
	    assertThrows(ValidationException.class, () -> {new CName("name", 0, "name").setCanonicalName(null);});
	}

}
