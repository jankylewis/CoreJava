// import java.util.*;

// class SudentComparator implements Comparator<Student> {

//     @Override
//     public int compare(Student frStudent, Student secStudent) {



//         return 0;
//     }
// }

// class Priorities {

//     PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>(SudentComparator);

//     public List<Student> getStudents(List<String> events) {

//         return null;
//     }
// }

// class Student {

//     private int id;
//     private String name;
//     private double cgpa;

//     public Student(int id, String name, double cgpa) {
//         super();
//         this.id = id;
//         this.name = name;
//         this.cgpa = cgpa;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     public double getCgpa() {
//         return cgpa;
//     }
// }

// public class _PriorityQueue {

//     private final static Scanner scan = new Scanner(System.in);
//     private final static Priorities priorities = new Priorities();

//     public static void main(String[] args) {
//         int totalEvents = Integer.parseInt(scan.nextLine());
//         List<String> events = new ArrayList<>();

//         while (totalEvents-- != 0) {
//             String event = scan.nextLine();
//             events.add(event);
//         }

//         List<Student> students = priorities.getStudents(events);

//         if (students.isEmpty()) {
//             System.out.println("EMPTY");
//         } else {
//             for (Student st: students) {
//                 System.out.println(st.getName());
//             }
//         }
//     }
// }