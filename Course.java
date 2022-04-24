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


