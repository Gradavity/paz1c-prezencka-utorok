package sk.upjs.paz;

import javax.swing.tree.VariableHeightLayoutCache;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void testPodielChlapcov() {
        var students = List.of(
                new Student(1L,
                        "Ujo",
                        "Ferenci",
                        Sex.MALE,
                        LocalDate.of(1993, 3, 31)),
                new Student(2L,
                        "Cotaje",
                        "Bal",
                        Sex.FEMALE,
                        LocalDate.of(1995, 6, 20)),
                new Student(3L,
                        "Vkre",
                        "Denci",
                        Sex.MALE,
                        LocalDate.of(1991, 3, 3))
        );
        StudentService sd = new StudentService(students);
        var got = sd.podielChlapcov();
        var expected = 2.0/3;

        assertEquals(expected, got);

    }
}