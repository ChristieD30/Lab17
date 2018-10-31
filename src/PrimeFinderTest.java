import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PrimeFinderTest  {

	@Test
	void prime1() {
		assertEquals(PrimeFinder.findPrime(1), 2);	
	}
	@Test
	void prime2() {
		assertEquals(PrimeFinder.findPrime(2), 3);	
	}
	@Test
	void prime3() {
		assertEquals(PrimeFinder.findPrime(3), 5);	
	}
	@Test
	void prime4() {
		assertEquals(PrimeFinder.findPrime(4), 7);	
	}
	@Test
	void prime5() {
		assertEquals(PrimeFinder.findPrime(5), 11);	
	}
	@Test
	void prime6() {
		assertEquals(PrimeFinder.findPrime(795), 6091);	
	}
	@Test
	void prime7() {
		assertEquals(PrimeFinder.findPrime(12964), 139459);	
	}
	
	

}
