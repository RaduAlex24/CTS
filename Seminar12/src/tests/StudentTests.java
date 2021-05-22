package tests;

import clase.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTests {

    @Test
    public void testCorectitudineConstructorCuParametru() {
        String nume = "Alex";
        Student student = new Student(nume);

        assertEquals(nume, student.getNume());
    }

    @Test
    public void testInitializareListaInconstructor() {
        Student student = new Student("Alex");

        assertNotNull(student.getNote());
    }

    @Test
    public void testCorectitudineConstructorFaraParametri() {
        Student student = new Student();

        assertNotNull("Numele nu a fost initializat", student.getNume());
        assertNotNull("Lista nu a fost initializata", student.getNote());
    }

    @Test
    public void testMetodaAdaugareNotaInLista() {
        int nota = 10;
        Student student = new Student();
        student.adaugaNota(nota);

        assertEquals(student.getNota(0), nota);
        assertEquals(student.getNote().size(), 1);
    }

    @Test
    public void testDimensiuneLista() {
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        assertEquals(2, student.getNote().size());
    }

    @Test
    public void testCalculeazaMediaCorecta() {
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        assertEquals(9.5f, student.calculeazaMedie(), 0.01);
    }

    @Test
    public void testStudentCuRestanta(){
        Student student = new Student();
        student.adaugaNota(4);
        assertTrue(student.areRestante());
    }

    @Test
    public void testStudentFaraRestanta(){
        Student student = new Student();
        student.adaugaNota(10);
        assertFalse(student.areRestante());
    }

    @Test
    public void testGetNotaIndexInvalid(){
        Student student = new Student();
        student.adaugaNota(10);
//1
        try{
            //2
            int nota = student.getNota(-1);
            //3-nu se ajunge
            fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie");
        }
        catch (IndexOutOfBoundsException exception){
            //4
        }
        catch (Exception exception){
            //5-nu se ajunge
            fail("Tipul exceptiei aruncate nu este corect");
        }
        //6
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNotaIndexInvalidJunit4(){
        Student student = new Student();
        student.adaugaNota(10);

        int nota = student.getNota(-1);
    }

}