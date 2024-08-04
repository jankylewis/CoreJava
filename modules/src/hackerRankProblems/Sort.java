import java.util.*;

class _Student {
    private int id;
    private String fname;
    private double cgpa;
    public _Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Sort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<_Student> studentList = new ArrayList<>();

        while(testCases>0){

            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            _Student st = new _Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        List<_Student> sortedStudentList = sortStudentList(studentList);

        for(_Student st: sortedStudentList){
            System.out.println(st.getFname());
        }
    }

    static List<_Student> sortStudentList(List<_Student> studentList) {

        List<_Student> sortedStudentList = studentList;

        for (int idx = 0; idx < studentList.size() - 1; idx++) {
            for (int _idx = 0; _idx < studentList.size() - idx - 1; _idx++) {

                _Student frontStudent = studentList.get(_idx);
                _Student backStudent = studentList.get(_idx + 1);

                if (backStudent.getCgpa() != frontStudent.getCgpa()){
                    if (backStudent.getCgpa() > frontStudent.getCgpa()) {
                        sortedStudentList.set(_idx, backStudent);
                        sortedStudentList.set(_idx + 1, frontStudent);
                    }
                }

                else if (!backStudent.getFname().equals(frontStudent.getFname())) {
                    if (backStudent.getFname().compareTo(frontStudent.getFname()) < 0) {
                        sortedStudentList.set(_idx, backStudent);
                        sortedStudentList.set(_idx + 1, frontStudent);
                    }
                }

                else {      //Case sorting by ID
                    if (backStudent.getId() > frontStudent.getId()){
                        sortedStudentList.set(_idx, backStudent);
                        sortedStudentList.set(_idx + 1, frontStudent);
                    }
                }
            }
        }

        return sortedStudentList;
    }
}