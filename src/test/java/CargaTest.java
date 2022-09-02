import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargaTest {

    @Test
    public void deveRetornarClasse1() {
        Carga carga = new Carga();
        carga.setAno(1970);
        carga.setPeso(1199);
        assertEquals(1, carga.calcularClasse());
    }

    @Test
    public void deveRetornarClasse2() {
        Carga carga = new Carga();
        carga.setAno(1970);
        carga.setPeso(1700);
        assertEquals(2, carga.calcularClasse());
    }
    @Test
    public void deveRetornarClasse3() {
        Carga carga = new Carga();
        carga.setAno(1970);
        carga.setPeso(1701);
        assertEquals(3, carga.calcularClasse());
    }
    @Test
    public void deveRetornarClasse4() {
        Carga carga = new Carga();
        carga.setAno(1979);
        carga.setPeso(1199);
        assertEquals(4, carga.calcularClasse());
    }
    @Test
    public void deveRetornarClasse5() {
        Carga carga = new Carga();
        carga.setAno(1979);
        carga.setPeso(1700);
        assertEquals(5, carga.calcularClasse());
    }
    @Test
    public void deveRetornarClasse6() {
        Carga carga = new Carga();
        carga.setAno(1979);
        carga.setPeso(1701);
        assertEquals(6, carga.calcularClasse());
    }
    @Test
    public void deveRetornarClasse7() {
        Carga carga = new Carga();
        carga.setAno(1980);
        carga.setPeso(1599);
        assertEquals(7, carga.calcularClasse());
    }
    @Test
    public void deveRetornarClasse8() {
        Carga carga = new Carga();
        carga.setAno(1980);
        carga.setPeso(1600);
        assertEquals(8, carga.calcularClasse());
    }

    @Test
    public void deveRetornarTaxaClasse1() {
        Carga carga = new Carga();
        carga.setAno(1970);
        carga.setPeso(1199);
        assertEquals(16.50, carga.calcularTaxa());
    }

    @Test
    public void deveRetornarTaxaClasse2() {
        Carga carga = new Carga();
        carga.setAno(1970);
        carga.setPeso(1700);
        assertEquals(25.50, carga.calcularTaxa());
    }
    @Test
    public void deveRetornarTaxaClasse3() {
        Carga carga = new Carga();
        carga.setAno(1970);
        carga.setPeso(1701);
        assertEquals(46.50, carga.calcularTaxa());
    }
    @Test
    public void deveRetornarTaxaClasse4() {
        Carga carga = new Carga();
        carga.setAno(1979);
        carga.setPeso(1199);
        assertEquals(27.50, carga.calcularTaxa());
    }
    @Test
    public void deveRetornarTaxaClasse5() {
        Carga carga = new Carga();
        carga.setAno(1979);
        carga.setPeso(1700);
        assertEquals(30.50, carga.calcularTaxa());
    }
    @Test
    public void deveRetornarTaxaClasse6() {
        Carga carga = new Carga();
        carga.setAno(1979);
        carga.setPeso(1701);
        assertEquals(52.50, carga.calcularTaxa());
    }
    @Test
    public void deveRetornarTaxaClasse7() {
        Carga carga = new Carga();
        carga.setAno(1980);
        carga.setPeso(1599);
        assertEquals(19.50, carga.calcularTaxa());
    }
    @Test
    public void deveRetornarTaxaClasse8() {
        Carga carga = new Carga();
        carga.setAno(1980);
        carga.setPeso(1600);
        assertEquals(55.50, carga.calcularTaxa());
    }
}