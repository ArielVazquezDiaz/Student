public class TestStudent {
    public static void main(String[] args) {
        System.out.println("Probando clase Student");
        //los metodos que me permiten indiar que voy a construir un metodo se llama constructor
        Student SuNombre = new Student();

        SuNombre.setName("Ariel");
        SuNombre.setLastname("Vazquez Diaz");
        SuNombre.setControlNumber(Long.parseLong("22670036"));
        SuNombre.setCareer("Informatica");
        SuNombre.setSemester(Short.parseShort("2"));

        System.out.println("El nombre es: " + SuNombre.getName());
        System.out.println("El apellido es: " + SuNombre.getLastname());
        System.out.println("El numero de control es: " + SuNombre.getControlNumber());
        System.out.println("El nombre de la carrera es: " + SuNombre.getCareer());
        System.out.println("Semestre es: " + SuNombre.getSemester());
    }
}
