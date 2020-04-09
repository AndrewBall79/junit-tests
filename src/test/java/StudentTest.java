import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
        Student student1 = new Student("gory");
        Student student2 = new Student();
        Student student3 = new Student();
    @Test
    public void getStudentId(){
        assertEquals(0, student1.getId());
        assertEquals(1, student2.getId());
        assertEquals(2, student3.getId());
    }

    @Test
    public void getStudentName(){
        assertEquals("gory", student1.getName());
    }

    @Test
    public void testAddStudentGrade(){
        student1.addGrades();
    }
}
