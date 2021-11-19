class student {
    String name;
    int roll;
    int marks;
    static int numStudent=0;

    public student(String studentName, int studentRoll, int studentMarks) {
        this.name = studentName;
        this.roll = studentRoll;
        this.marks = studentMarks;
        numStudent++;

    }

    public static void main(String[] args) {
            student St1 = new student("Aravind",23, 45);
            student St2 = new student("Nico",34, 87);
            student St3 = new student("Zee",61, 24);
        System.out.println("Number of Student is: "+ numStudent);
        }
    }


