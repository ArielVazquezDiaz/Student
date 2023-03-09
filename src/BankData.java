import java.io.IOException;
import java.util.Scanner;
public class BankData {
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("¿Que desea realizar en su cuenta?");
        System.out.println("[1] Saldo");
        System.out.println("[2] Deportar");
        System.out.println("[3] Retirar");
        System.out.println("[0] Salir");
        opc = sc.nextInt();
        return opc;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int opc=0,ban;
        double newBalance;
        double balance;
        bankingElements primeraCuenta = new bankingElements(
                "Pedro",
                4000,
                123456789,
                "Banamex");

        do{
            opc=menu();
            if(opc==1){
                System.out.println("Su saldo es :"+primeraCuenta.getCurrentbalance());
            }
            if(opc==2){
                System.out.println("Ingrese la catidad");
                ban=sc.nextInt();
                System.out.println("Ingrese el valor a depositar");
                newBalance= (double) primeraCuenta.getCurrentbalance()+ban;
                primeraCuenta.setCurrentbalance(newBalance);
                System.out.println("Su saldo actual es: "+ newBalance);
            }
            if(opc==3){
                System.out.println("Ingrese la catidad");
                ban=sc.nextInt();
                System.out.println("Ingrese el valor a retirar");
                newBalance= (double) primeraCuenta.getCurrentbalance()-ban;
                primeraCuenta.setCurrentbalance(newBalance);
                System.out.println(" Su saldo es de:" + newBalance);
            }
        }while (opc!=0);
        System.out.println("La opcion seleccionada es: "+ opc);

        primeraCuenta.toString();
    }
}

