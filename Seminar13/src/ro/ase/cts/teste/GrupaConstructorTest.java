package ro.ase.cts.teste;

import org.junit.Test;
import ro.ase.cts.clase.Grupa;

import static org.junit.Assert.*;

public class GrupaConstructorTest {

    // right bicep
    @Test
    public void testRight(){
        Grupa grupa = new Grupa(1085);
        assertEquals(1085, grupa.getNrGrupa());
    }

    @Test
    public void testBoundaryLimitaInferiara(){
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    @Test
    public void testBoundaryLimitaSuperioara(){
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testErroarLimitaInferioara(){
        Grupa grupa = new Grupa(700);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testErroarLimitaSuperioara(){
        Grupa grupa = new Grupa(1700);
    }

    @Test(timeout = 500)
    public void testPerformanta(){
        Grupa grupa = new Grupa(1085);
    }


    // Corect
    @Test
    public void testExistance(){
        Grupa grupa = new Grupa(1085);

        assertNotNull(grupa.getStudenti());
    }

}