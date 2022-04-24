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
