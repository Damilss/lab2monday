package task_3;

import java.util.HashMap;

public class Student {
    //class variables
    private static int totalNumOfStudents = 0;

    //object variables
    private String name;
    private HashMap<String, Double> courseAndGrades = new HashMap<>();

    //constructors
    Student(){totalNumOfStudents++;}

    Student(String stName, HashMap<String, Double> courseAndGrades) {
        this.name = stName;
        this.courseAndGrades = courseAndGrades;
    }
    //set methods
    void setName(String studentName) {
        this.name = studentName;
    }

    void setCourseAndGrades(HashMap<String, Double> coursesAndGrades) {
        this.courseAndGrades = coursesAndGrades;
    }
    //get methods
    String getName() {
        return this.name;
    }

    HashMap<String, Double> getCoursesandGrades() {
        return this.courseAndGrades;
    }

    static int getTotalNumberOfStudents() {
        return totalNumOfStudents;
    }

    void printCoursesAndGrades() {
        System.out.println(this.courseAndGrades.toString());

        String[] setOfKeys = new String[this.courseAndGrades.keySet().size()];
        for (String key : setOfKeys) {
            System.out.printf("%s, %f\n", key, this.courseAndGrades.get(key));
        }
    }
}
