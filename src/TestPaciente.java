public class TestPaciente {
    public static void main(String[] args) {
     double imc=0;
     Paciente patient = new Paciente("Ariel",50.0,1.74, (short) 18,'M');
     imc=patient.imc(patient.getWeight(),patient.getHeight());

        System.out.println("Hola " + patient.getName() + ",Tu IMC es: " + imc);
        String Compotition = patient.getCompotition();
        System.out.println("tu composicion corporal es de: " + Compotition);
    }
}
