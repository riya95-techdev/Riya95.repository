import java.util.List;

public class LearningInheritance {

    public static void main(String[] args) {
    //testing :

//        //idhar constructor ki help se values set kiye, then getter methods ko call karke consol pe laaye, then average find kiye
//        Student st = new Student(1,"riya namdev", List.of(55.5, 66.6,77.7,88.8,9.9));
//        System.out.println("Student ID : "+st.getStudentId());
//        System.out.println("Student ID : "+st.getStudentName());
//        System.out.println("Student Marks : "+st.getStudentMarks());
//        double averageOfStudentMarks = st.averageOfStudentMarks();
//        System.out.println(averageOfStudentMarks);

//        //idhar constructor ke use se values set karna , and .toString() method se print karna  and then average find out ho raha hai
        Student st = new Student(1,"riya namdev", List.of(55.5, 66.6,77.7,88.8,99.9));
        System.out.println(st.toString());
        double averageOfStudentMarks = st.averageOfStudentMarks();
        System.out.println(averageOfStudentMarks);

//        // maine sikha hai ismein values set karna and get karna ,through getter and setter method and then average findout karna
//        Student st = new Student(); //object creation
//
//        st.setStudentId(1);
//        System.out.println("Student ID : "+st.getStudentId());
//        st.setStudentName("Riya Namdev");
//        System.out.println("Student Name :"+ st.getStudentName());
//        st.setStudentMarks(List.of(55.5, 66.6,77.7,88.8,99.9));
//        System.out.println("Student Marks : "+st.getStudentMarks());
//
//        double averageOfStudentMarks = st.averageOfStudentMarks();
//        System.out.println(averageOfStudentMarks);

    }
}
