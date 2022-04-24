public class StudentInformationSystems{

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
