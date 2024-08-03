package Problems;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class SgResult {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    static Integer findTheNextMultipleOfFive(Integer grade) {

        Integer nextMultipleOfFive = grade;

        int idx;
        for (idx = 0; idx < 3; idx++) {

            nextMultipleOfFive += 1;

            if (idx < 2 && nextMultipleOfFive %5 == 0)
                return nextMultipleOfFive;

            if (idx == 2)
                return grade;
        }

        return nextMultipleOfFive;
    }

    static Integer doRounding(Integer grade) {

        if (grade < 38)
            return grade;

        grade = findTheNextMultipleOfFive(grade);

        return grade;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> roundedGrades = new ArrayList<>();

        for (Integer grade : grades) {
            roundedGrades.add(doRounding(grade));
        }

        return roundedGrades;
    }
}

public class StudentGrading {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine().replaceAll("\\s+$", "");
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());

        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(38);

        List<Integer> result = SgResult.gradingStudents(grades);

        System.out.println(result);

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
