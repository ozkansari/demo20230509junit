package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class CikarmaTest {

	@Test
	public void testIslemYapBirinciIkincidenKucukken() {
		int sonuc = Cikarma.islemYap(80, 90);
		assertEquals(-10, sonuc);
	}
	
	@Test
	public void testIslemYapBirinciIkincidenBuyukken() {
		int sonuc = Cikarma.islemYap(100, 1);
		assertEquals(99, sonuc);
	}
	
	@Test
	public void testIslemYapIkiNegatifSayiIcin() {
		int sonuc = Cikarma.islemYap(-10, -20);
		assertEquals(10, sonuc);
	}
}
