import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Student {


//    name is a String that holds the name of the student.


    String name;
    public Student(String name) {
    }
    public Object getName() {
        return name;
    }

    //    grades is an ArrayList that contains a list of Integer numbers.

    public void addGrades(){
        Integer grade = null;
        grades.add(grade);
    }
    private ArrayList<Integer> grades = new ArrayList<>();
    public Student(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public int getAverage(){
        int addedGrades = 0;
        int numberOfGrades = 0;
        for(int i = 0; i < grades.size();i++){
            numberOfGrades ++;
            addedGrades += i; ;
        }
        return addedGrades / numberOfGrades;
    }


    static long counter;
    private long id;

    public Student() {
        counter++;
        id = counter;
        this.getName();
    }

    public long getId() {
        return id;
    }


}
