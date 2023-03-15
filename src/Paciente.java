public class Paciente {
    private String name;
    private double weight;
    private double height;
    private short age;
    private char sex;
    private  String Compotition;
    public Paciente(String name, double weight, double height, short age, char sex) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.sex = sex;
    }
    public Paciente() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public short getAge() {
        return age;
    }
    public void setAge(short age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getCompotition() {
        return Compotition;
    }
    public void setCompotition(String compotition) {
        Compotition = compotition;
    }
    public double imc(double weight, double height) {
        return weight/(height*height);
    }
    public String Compotition(double imc) {
        if (imc < 18.5) {
            return "Underweight";
        }
        else if (imc >= 18.5 & imc < 25) {
            return "Normal";
        }
        else if (imc >= 25 & imc < 30) {
            return "Overweight";
        }
        else
        return "Obesity";
    }
    public String toString() {
        System.out.println("Los datos del paciente son:");
        System.out.println("El nombre es: " + getName());
        System.out.println("Su sexo es: " + getSex());
        System.out.println("Su edad es: " + getAge());
        System.out.println("Su Altura es : " + getHeight());
        System.out.println("Su peso es: " + getWeight());
        System.out.println("Su imc");
        return "";
    }
}
