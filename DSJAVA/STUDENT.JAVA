class Student {

    private String studentId;
    private String name;
    private int age;
    private String department;
    private double gpa;

    static String universityName = "JAMHURIYA UNIVERSITY";

    public Student(String studentId, String name, int age, String department, double gpa) {

        this.studentId = studentId;
        this.name = name;
        this.department = department;

        if (age > 0) {
            this.age = age;
        }

        if (gpa >= 0 && gpa <= 4) {
            this.gpa = gpa;
        }
    }

    public void displayStudentInfo() {

        System.out.println("UNIVERSITY: " + universityName);
        System.out.println("STUDENT ID: " + studentId);
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
        System.out.println("DEPARTMENT: " + department);
        System.out.println("GPA: " + gpa);
        System.out.println("PASSED: " + hasPassed());
        System.out.println("----------------------------");
    }

    public boolean hasPassed() {
        return gpa >= 3.0;
    }
}


   class StudentManagementSystem {

    public static void main(String[] args) {

        Student student1 = new Student(
                "C6240",
                "SAMIRA",
                20,
                "COMPUTER NETWORK",
                3.5
        );

        Student student2 = new Student(
                "C6241",
                "AHMED",
                21,
                "COMPUTER SCIENCE",
                2.8
        );

        Student student3 = new Student(
                "C6242",
                "MUNA",
                22,
                "INFORMATION TECHNOLOGY",
                1.7
        );

        Student student4 = new Student(
                "C6243",
                "HANNA",
                20,
                "SOFTWARE ENGINEERING",
                3.9
        );

        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
        student4.displayStudentInfo();
    }
}