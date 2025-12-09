package Java;

//import java.util.ArrayList;

// class ArrayList{
//     public static void main(String[] args) {
//         // Create an ArrayList of Student objects
//         ArrayList<Student> students = new ArrayList<>();

//         // Add some students
//         Student student1 = new Student("Alice", 20);
//         student1.addGrade(85);
//         student1.addGrade(90);
//         students.add(student1);

//         Student student2 = new Student("Bob", 22);
//         student2.addGrade(78);
//         student2.addGrade(82);
//         students.add(student2);

//         // Print average grades
//         for (Student student : students) {
//             System.out.println(student.getAverageGrade());
//         }
//     }
// }
// class Student{
//     private String name;
//     private int age;
//     private ArrayList<Integer> grades;

//     public Student(String name, int age){
//         this.name=name;
//         this.age=age;
//         this.grades=new ArrayList<>();
//     }
//     public void addGrade(int grade){
//         grades.add(grade);
//     }
//     public double getAverageGrade(){
//         if(grades.size()==0){
//             return 0.0;
//         }
//         int sum=0;
//         for(int grade:grades){
//             sum+=grade;
//         }
//         return (double)sum/grades.size();
//     } 
    
// }

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int RollN;
    String name;

    Student(int RollN, String name) {
        this.RollN = RollN;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.RollN - s.RollN;
    }

    public String toString() {
        return this.RollN + " " + this.name;
    }
}

class hello {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Mahiru"));
        list.add(new Student(2, "Amane"));

        Collections.sort(list);
        System.out.println(list);
}
}