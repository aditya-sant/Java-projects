package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Main {
    /**
     * Displays a collection of students and their grades, nicely formatted in 2 columns
     * @param students The collection of students to display
     */
    public static void displayStudents(Collection<Student> students) {
        for (Student student : students) {
            System.out.format("%15s %d\n", student.getName(), student.getGrade());
        }
    }

    public static void main(String[] args)
    {
        // 1. Declare an ArrayList<Student> variable
        ArrayList<Student> students = new ArrayList<>();

        // 2. Add the students in Student.STUDENTS_ARRAY to your ArrayList
        for (Student student : Student.STUDENTS_ARRAY) {
            students.add(student);
        }

        // 3. Create a function named displayStudents(), which takes an ArrayList<Student>
        //    and prints the list of students and their grades. (No code needs to be added to
        //    main() for this step.

        // 4. Sort the ArrayList into alphabetical order by student name and then display
        //    its contents with displayStudents(). First, change the Student class to implement
        //    Comparable<Student>, then write a compareTo method to handle the sorting by name
        //    Then call sort(null) on the ArrayList before displaying it.

        students.sort(null);
        displayStudents(students);

        // 5. Create a HashMap<String, Student> and add the students in the ArrayList to it.
        //    Use the student's name as the key and the student object as the value. This way
        //    students can be efficiently looked up in the HashMap.

        HashMap<String, Student> studentHashMap = new HashMap<>();
        for (Student student : students) {
            studentHashMap.put(student.getName(), student);
        }

        // 6. Use the HashMap to help you set Joshua's grade to 95. Then print out the list of students again.
        studentHashMap.get("Joshua").setGrade(95);
        displayStudents(students);
    }
}
