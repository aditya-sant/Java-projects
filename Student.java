package collections;

/**
 * Represents a student with a name and grade associated
 */
public class Student implements Comparable<Student> {
    private String name;
    private int grade;

    /**
     * A predefined list of students for testing
     */
    public static final Student[] STUDENTS_ARRAY = {
            new Student("Daniel", 70),
            new Student("Ashley", 99),
            new Student("Christopher", 59),
            new Student("Elizabeth", 84),
            new Student("David", 69),
            new Student("Jessica", 35),
            new Student("James", 50),
            new Student("Nicole", 50),
            new Student("Michael", 76),
            new Student("Sarah", 95),
            new Student("Joseph", 32),
            new Student("Jennifer", 100),
            new Student("Joshua", 92),
            new Student("Amanda", 33)
    };

    /**
     * Constructs and initialises a new Student
     * @param name The name of the new Student
     * @param grade The grade of the new Student
     */
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    /**
     * Gets the student's current grade
     * @return The student's grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Sets the student's current grade
     * @param newGrade The new grade to assign to the student
     */
    public void setGrade(int newGrade) {
        grade = newGrade;
    }

    /**
     * Gets the student's name
     * @return The student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the student's name
     * @param newName The new name to assign to the student
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Compares two students by lexicographical order of their names
     * @param o The other student to compare this student to
     * @return An integer less than, equal to or greater than zero if the other student's name compares
     * lexicographically before, the same or after this student's name.
     */
    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }
}