public class Course {
    private String courseName;
    private String[] students = new String[2];
    private int number_Of_Students;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student_name) {
        if (number_Of_Students >= students.length) {
            String[] new_Student= new String[number_Of_Students*2];
            System.arraycopy(students, 0, new_Student, 0, students.length);
            students = new_Student;
        }
        students[number_Of_Students] = student_name;
        number_Of_Students++;
    }

    public void dropStudent(String student_name) {
        for (int i = 0; i < number_Of_Students; i++) {
            if (students[i].equals(student_name)) {
                System.arraycopy(students, i+1, students, i, number_Of_Students-i-1);
                number_Of_Students--;
                students[number_Of_Students] = null;
                break;
            }
        }
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return number_Of_Students;
    }

    public String getCourseName() {
        return courseName;
    }


    public void clear() {
        students = new String[2];
        number_Of_Students = 0;
    }

    public void display_Student(){
        for (int i = 0; i < getNumberOfStudents(); i++) {
            System.out.println("Studen" + " "+(i+1) + " is " + getStudents()[i]);
        }
    }
}
