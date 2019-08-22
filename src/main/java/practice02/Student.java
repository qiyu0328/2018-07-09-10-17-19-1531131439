package practice02;

public class Student extends Person{

    private int Klass;

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int klass) {
        Klass = klass;
    }

    public Student(String name, int age,int Klass) {
        super(name,age);
        this.Klass=Klass;
    }

    @Override
    public String introduce() {
        return "I am a Student. I am at Class "+this.Klass+".";
    }
}
