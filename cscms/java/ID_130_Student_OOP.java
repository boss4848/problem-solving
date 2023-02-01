
public class ID_130_Student_OOP {
    public static void main(String[] args) {
        Student boy = new Student(1133, "Thanaphon", 'M', 73);
        Student c = new Student(1130, "Sethanant", 'M', 60);
        boy.setName("Thanaphon Sombunkaeo");

        System.out.println(boy.getName());
        System.out.println(boy.getGender());
        System.out.println(boy.calGPA());

        boy.setScore(53);
        System.out.println("After change score : ");
        System.out.println(boy.calGPA());

        System.out.println("----C-----");
        System.out.println(c.getGender());
        System.out.println(c.getId());
        c.setId(230);
        c.setGender('F');
        System.out.println(c.getId());
        System.out.println(c.getScore());
        System.out.println(c.calGPA());
        System.out.println(c.getGender());
    }
}

class Student {
    private char gpa;
    private int id;
    private String name;
    private char gender;
    private int score;

    public Student(int id, String name, char gender, int score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    void setName(String name) {
        this.name = name;
    }

    void setScore(int score) {
        this.score = score;
    }

    void setId(int id) {
        this.id = id;
    }

    void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public char calGPA() {
        if (score > 79 && score <= 100) {
            gpa = 'A';
        }
        if (score > 69 && score <= 79) {
            gpa = 'B';
        }
        if (score > 59 && score <= 69) {
            gpa = 'C';
        }
        if (score > 49 && score <= 59) {
            gpa = 'D';
        }
        if (score >= 0 && score <= 49) {
            gpa = 'F';
        }
        return gpa;
    }
}
