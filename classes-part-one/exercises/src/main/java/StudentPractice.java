import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args){
        Student newStudent1 = new Student("Mark", 12345, 1, 4.0);

        ArrayList<String> historyBooks = new ArrayList<>();
        historyBooks.add("American History");
        historyBooks.add("History Workbook");
        historyBooks.add("Syllabus");

        Course history101 = new Course("American History", 3.5, historyBooks);

        Teacher teacher1 = new Teacher("John", "Smith", "American History 101", 6);

        System.out.println(newStudent1.getName());
        System.out.println(history101.getHoursInClass());
        System.out.println(teacher1.getSubject());

        ArrayList<String> historyBooksList = history101.getBooksNeeded();

        for ( String book : historyBooksList ) {
            System.out.println(book);
        }
    }
}
