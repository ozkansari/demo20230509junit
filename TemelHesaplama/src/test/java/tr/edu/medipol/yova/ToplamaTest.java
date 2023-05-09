package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToplamaTest {

	@Test
	public void testToplaNegatifVePozitifSayi() {
		// GIVEN - ONKOSULLAR
		int sayi1 = -99;
		int sayi2 = 100;
		
		// WHEN - ASIL TEST
		int gercekSonuc = Toplama.islemYap(sayi1, sayi2);
		
		// THEN - KONTROL / VALIDASYON
		assertEquals("Sonuc 1 olmaliydi", 1, gercekSonuc);
	}
	
	@Test
	public void testToplaIkiNegatifSayi() {
		// GIVEN - ONKOSULLAR
		int sayi1 = -99;
		int sayi2 = -1;
		
		// WHEN - ASIL TEST
		int gercekSonuc = Toplama.islemYap(sayi1, sayi2);
		
		// THEN - KONTROL / VALIDASYON
		assertEquals(-100, gercekSonuc);
	}

}
