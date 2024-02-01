public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Nam", 85.5),
                new Student(2, "Mạnh", 90.0),
                new Student(3, "Ba", 78.3),
                new Student(4, "Cao", 95.8),
                new Student(5, "Em", 88.2)
        };

        System.out.println("Danh sách học viên trước khi sắp xếp:");
        displayStudents(students);


        // Sắp xếp bằng Insertion Sort
        SortingStudent.insertionSort(students);
        System.out.println("\nDanh sách học viên sau khi sắp xếp bằng Insertion Sort:");
        displayStudents(students);

        // Khởi tạo lại danh sách học viên
        students = new Student[]{
                new Student(1, "Nam", 85.5),
                new Student(2, "Mạnh", 90.0),
                new Student(3, "Ba", 78.3),
                new Student(4, "Cao", 95.8),
                new Student(5, "Em", 88.2)
        };



        // Sắp xếp bằng Selection Sort
        SortingStudent.selectionSort(students);
        System.out.println("\nDanh sách học viên sau khi sắp xếp bằng Selection Sort:");
        displayStudents(students);

        // Khởi tạo lại danh sách học viên
        students = new Student[]{
                new Student(1, "Nam", 85.5),
                new Student(2, "Mạnh", 90.0),
                new Student(3, "Ba", 78.3),
                new Student(4, "Cao", 95.8),
                new Student(5, "Em", 88.2)
        };

        // Sắp xếp bằng Bubble Sort
        SortingStudent.bubbleSort(students);
        System.out.println("\nDanh sách học viên sau khi sắp xếp bằng Bubble Sort:");
        displayStudents(students);
    }

    private static void displayStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
        }
    }
}
