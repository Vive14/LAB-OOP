public class Lab6_Pro2_64010451 {
    public static void main(String[] args) {
		Course course = new Course("oop");
        course.addStudent("Game");
        course.addStudent("Boy");
        course.addStudent("two");
        course.dropStudent("Game");

        course.display_Student();
    }
    
}
