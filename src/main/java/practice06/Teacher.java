package practice06;

public class Teacher extends Person{
    private int Klass;

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int klass) {
        Klass = klass;
    }

    public Teacher(String name, int age,int Klass) {
        super(name,age);
        this.Klass=Klass;
    }
    public Teacher(String name, int age) {
        super(name,age);
    }

    @Override
    public String introduce() {
        if(this.Klass!=0){
            return super.introduce()+" I am a Teacher. I teach Class "+this.getKlass()+".";
        }
        return super.introduce()+" I am a Teacher. I teach No Class.";
    }
}
