import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student student1;
@Before
public void setUp(){
    student1 = new Student("gory");

}
//@Test
//public void tstCountIsWorking(){
//    long expected = Student.getCount();
//    Student s2 = new Student();
//    assertEquals(expected, Student.getCount());
//}


    @Test
    public void testGetId(){
        assertEquals(0, student1.getId());
        assertNotNull(student1.getId());
    }

    @Test
    public void testGetName(){
        assertEquals("gory", student1.getName());
    }

    @Test
    public void testAddGrade(){
        assertEquals(98, student1.getAverage());
    }

    @Test
    public void testGetGradeAverage(){
        assertEquals(98, student1.getAverage());

    }
}
