public class TestStudent {
    public static void main(String[] args) {
        System.out.println("Probando clase Student");
        //los metodos que me permiten indiar que voy a construir un metodo se llama constructor
        Student SuNombre = new Student(
                22670036L,
                "ariel",
                "Vazquez Diaz",
                "Informatica",
                2);

        SuNombre.toString();
        SuNombre.setControlNumber(22670008);
        SuNombre.setName("Mario");
        SuNombre.setLastname("Hasin");
        SuNombre.setCareer("Informatica");
        SuNombre.setSemester(2);
        SuNombre.toString();

    }
}
