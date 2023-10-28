public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Zaq");
        Student s2 = new Student("Alima");
        Student s3 = new Student("Bala");

        EnglishSchool englishSchool = new EnglishSchool();

        englishSchool.attach(s1);
        englishSchool.attach(s2);

        englishSchool.notifyUpdate(new Message("Welcome to English School!")); // s1 and s2 will receive the update

        englishSchool.detach(s1);
        englishSchool.attach(s3);

        englishSchool.notifyUpdate(new Message("New session on Grammar")); // s2 and s3 will receive the update
    }
}
