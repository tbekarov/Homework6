public class student {
    int id;
    String firstName;
    String lastName;
    int grades;
    boolean graduate = false;

    void grading(int grades){
        if (grades > 60){
            graduate = true;
        } else {
            graduate = false;
        }
    }
    void showStudent(){
        if (graduate == true){
            System.out.println("Student ID " + id + " Student Name " + firstName + " " + lastName + " passed");
        } else {
            System.out.println("Student ID " + id + " Student Name " + firstName +  " " + lastName + " failed");
        }
    }

    public static void main(String[] args) {
        student person = new student();
        person.id = 123;
        person.firstName = "John";
        person.lastName = "Doe";
        person.grades = 80;
        person.grading(person.grades);
        System.out.println("*************************************************");
        person.showStudent();
        System.out.println("*************************************************");
        person.id = 456;
        person.firstName = "Jane";
        person.lastName = "Doe";
        person.grades = 50;
        person.grading(person.grades);
        System.out.println("*************************************************");
        person.showStudent();
        System.out.println("*************************************************");
    }
}
