public class Student {
    private long ControlNumber;
    private String Name;
    private String Lastname;
    private String Career;
    private int semester;

    public Student(long ControlNumber, String Name, String Lastname, String Career, int semester) {
        this.ControlNumber = ControlNumber;
        this.Name = Name;
        this.Lastname = Lastname;
        this.Career = Career;
        this.semester = semester;
    }

    //Primera parte donde se define los getters y setters
    public long getControlNumber() {
        return ControlNumber;
    }
    public void setControlNumber(long controlNumber) {
        ControlNumber = controlNumber;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getLastname() {
        return Lastname;
    }
    public void setLastname(String lastname) {
        Lastname = lastname;
    }
    public String getCareer() {
        return Career;
    }
    public void setCareer(String career) {
        Career = career;
    }
    public int getSemester() {
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    //Segunda parte donde se definen los metodos explisitos, harcore es colocar un valor arbitrariamente de manera literal
    public double
    generalAvg(long controlNumber) {
        return 0.0;
    }
    public double semesterAvg(long controlNumber, short semester) {
        return 0.0;
    }
    public double subjectGrade(long controlNumber, String subject) {
        return 0.0;
    }
    public String toString() {
        System.out.println("Los datos del estudiante son:");
        System.out.println("Numero de cotrol: " + this.ControlNumber);
        System.out.println("Nombre: " + this.Name);
        System.out.println("Apellido: " + this.Lastname);
        System.out.println("Carrera: " + this.Career);
        System.out.println("Semestre: " + this.semester);
        return "";
    }
}
