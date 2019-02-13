package Prueba.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("My Test Class")
class PruebaTest {

	@Test
	@DisplayName("My Name")
	void test() {
		
		assertAll("Multiples pruebas", 
				()-> assertEquals(3,3),
				()->assertTrue(3>2));
		
		assertNotEquals(3, 4, "Error. Datos Iguales");
		//fail("Not yet implemented");
	}

}
