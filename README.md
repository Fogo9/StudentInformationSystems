
# **STUDENT INFORMATION SYSTEMS**

# **Information**

* **Student information system: It is the system where the exam grades of the students are entered by the teachers and thanks to this information, it guides the student on the path of self-development.**

# **Technologies Used**

* **JAVA**

# **Contents**

* **Teacher**, **Student** and **Course** class information has been created.

* **Course**, **Teacher** and **Student** names are defined.

* **Teacher class**: Teacher name, mobile phone number, the code of the course name entered by the teacher and the teacher's department are defined.

* **Course class**: Course name, course code and course name abbreviation are defined.

* **Student class**: Student name, class number and class entered by the student are defined.

* Written and oral exam grades of the students were determined.

* Whether the students pass the class or not is determined according to the exam grade point average.

* The average passing grade of the students was determined as 55.

* The teacher's written and verbal exam grade for the student was determined between 0-100. If the grade entered is over 100, the default value of the course grade is set to 0.

* Lessons were determined for each teacher. A warning has been added that if the teacher attends a course other than the one assigned to him, he will not be able to attend the class.

<br />

# **Codes**

```Java

        public class StudentInformationSystem{

            public static void main(String[] args) {

                Course history = new Course("History","101","HST");

                Course physics = new Course("Physics","102","PHY");

                Course biology = new Course("Biology","103", "BIO");



                Teacher t1 = new Teacher("Noah Williams", "1545789","HST");

                history.addTeacher(t1);

                Teacher t2 = new Teacher("Isabella Anderson", "1530268", "PHY");

                physics.addTeacher(t2);

                Teacher t3 = new Teacher("Jennifer Miller", "1542369", "BIO");

                biology.addTeacher(t3);



                Student s1 = new Student("Daniel Wilson", "818","2", history, physics, biology);

                s1.addBulkExamNote(70, 35, 05);

                s1.addVerbalExamNote(80, 30, 60);

                s1.isPass();

                Student s2 = new Student("Oliver Jones", "819","2", history, physics, biology);

                s2.addBulkExamNote(100, 90, 70);

                s2.addVerbalExamNote(75, 82, 68);

                s2.isPass();

                Student s3 = new Student("Thomas Martin", "820","2", history, physics, biology);

                s3.addBulkExamNote(37, 35, 95);

                s3.addVerbalExamNote(65, 60, 70);

                s3.isPass();

            }


        }


```

```Java

        public class Teacher{

            String name;

            String mpno;

            String branch;


            Teacher(String name, String mpno, String branch){

                this.name = name ;

                this.mpno = mpno;

                this.branch = branch;


            }

            void print(){

                System.out.println("Name : " + this.name);

                System.out.println("Telephone Number : " + this.mpno);

                System.out.println("Department : " + this.branch);

            }
        }

```
```Java

        public class Course{

            Teacher teacher;

            String name;

            String code;

            String prefix;

            int note;

            int verbalNote;


            Course(String name, String code, String prefix){

                this.name = name;

                this.code = code;

                this.prefix = prefix;

                this.note = 0;

                this.verbalNote = 0;

            }

            void addTeacher(Teacher teacher){

                if(this.prefix.equals(teacher.branch)){

                    this.teacher = teacher;

                }else{

                    System.out.println(teacher.name + "The teacher cannot attend this lesson. ");

                }
            }

            void printTeacher(){

                this.teacher.print();

            }
        }

```
```Java

    public class Student{

        Course history;

        Course physics;

        Course biology;

        String name;

        String stuNo;

        int classes;

        double average;

        boolean isPass;


        Student(String name, String stuNo, String classes, Course history, Course physics, Course biology){

            this.name = name;

            this.stuNo = stuNo;

            this.history = history;

            this.physics = physics;

            this.biology = biology;

            this.isPass = false;

            this.average = 0.0;

        }

        void addBulkExamNote(int history, int physics, int biology){

            if(history >= 0 && history <= 100){

                this.history.note = history;

            }

            if(physics >= 0 && physics <= 100){

                this.physics.note = physics;

            }

            if(biology >= 0 && biology <= 100){

                this.biology.note = biology;

            }
        }

        void addVerbalExamNote(int history, int physics, int biology){

            if(history >= 0 && history <= 100){

                this.history.verbalNote = history;

            }

            if(physics >= 0 && physics <= 100){

                this.physics.verbalNote = physics;

            }

            if(biology >= 0 && biology <= 100){

                this.biology.verbalNote = biology;

            }

        }

        void isPass(){

            this.average = (this.history.note * 0.8 + this.history.verbalNote * 0.2 + this.physics.note * 0.8 + this.physics.verbalNote * 0.2 + this.biology.note * 0.8 +this.biology.verbalNote * 0.2) / 3.0;

            printNote();

            if(this.average > 55){

                System.out.println("You Passed The Class. Congratulations !");

            }else{

                System.out.println("You Failed The Class !");

            }


        }

        void printNote(){

            System.out.println("");

            System.out.println("Student : " + this.name);

            System.out.println("History note : " + this.history.note);

            System.out.println("Physics note : " + this.physics.note);

            System.out.println("Biology note : " + this.biology.note);

            System.out.println("Your Average : " + this.average);
        }


    }

```

```bash

    Student : Daniel Wilson
    History note : 70
    Physics note : 35
    Biology note : 5
    Your Average : 40.666666666666664
    You Failed The Class !

    Student : Oliver Jones
    History note : 100
    Physics note : 90
    Biology note : 70
    Your Average : 84.33333333333333
    You Passed The Class. Congratulations !

    Student : Thomas Martin
    History note : 37
    Physics note : 35
    Biology note : 95
    Your Average : 57.53333333333333
    You Passed The Class. Congratulations !

```

<br />

# **LINK**

* Click here https://github.com/Fogo9/StudentInformationSystem.git to access the Github page for this project.

<br />

# **LICENSE**

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
