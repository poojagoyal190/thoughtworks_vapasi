
        class Student {
            String name;
            int roll;
            int marks;

            public Student(String studentName, int studentRoll, int studentMarks)
            {
                this.name= studentName;
                this.roll= studentRoll;
                this.marks=studentMarks;

            }
            void studentPassFailStatus() {
                if (marks > 35) {
                    System.out.println("Student passed");
                }
                else System.out.println("Student failed");
            }
        }
