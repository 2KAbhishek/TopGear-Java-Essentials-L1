public class Task1Demo {
    public static void main(String[] args) throws IncorrectMarksException {
        Student student1 = new Student("Abhishek Keshri", 12, 10, new int[] { 79, 80, 96, 85, 83, 80 });
        Student student2 = new Student("2KAbhishek", 12, 10, new int[] { 79, 80, 96, 45, 83, 80 });
        System.out.println(student1);
        System.out.println(student2);
        System.out.println("Setting student1 result to true.");
        student1.setResult(true);
        System.out.println("Setting student2 result to true.");
        student2.setResult(true);
    }
}
