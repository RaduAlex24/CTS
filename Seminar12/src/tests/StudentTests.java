package tests;

import clase.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTests {

    @Test
    public void testCorectitudineConstructorCuParametru(){
        String nume = "Alex";
        Student student = new Student(nume);

        assertEquals(nume, student.getNume());
    }

    @Test
    public void testInitializareListaInconstructor(){
        Student student = new Student("Alex");

        assertNotNull(student.getNote());
    }

    @Test
    public void testCorectitudineConstructorFaraParametri(){
        Student student = new Student();

        assertNotNull("Numele nu a fost initializat", student.getNume());
        assertNotNull("Lista nu a fost initializata", student.getNote());
    }

    @Test
    public void testMetodaAdaugareNotaInLista(){
        int nota = 10;
        Student student = new Student();
        student.adaugaNota(nota);

        assertEquals(student.getNota(0), nota);
        assertEquals(student.getNote().size(), 1);
    }

}