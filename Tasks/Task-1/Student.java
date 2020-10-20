import java.util.Arrays;

public class Student {
    private String name;
    private int standard, roll;
    private int[] marks = new int[6];
    private boolean result = false;

    Student(String name, int standard, int roll, int[] marks) {
        this.name = name;
        this.standard = standard;
        this.roll = roll;
        this.marks = marks;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return this.standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getRoll() {
        return this.roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public boolean getResult() {
        return this.result;
    }

    public void setResult(boolean result) throws IncorrectMarksException {
        int avg = 0;
        for (int num : this.marks) {
            if (num < 50)
                throw new IncorrectMarksException("Marks less than 50 are not allowed");
            else
                avg += num;
        }
        avg /= this.marks.length;
        if (avg < 50)
            throw new IncorrectMarksException("Average marks less than 50 is not allowed");
        this.result = result;
    }

    public int[] getMarks() {
        return this.marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return ("Student Details: \nName: " + this.name + " Class: " + this.standard + " Roll: " + this.roll
                + "\nMarks: " + Arrays.toString(this.marks) + "\nResult: " + this.result + "\n");
    }
}
