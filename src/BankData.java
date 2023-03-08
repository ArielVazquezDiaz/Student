import java.util.Scanner;
public class BankData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc,ban;
        double newBalance;
        double balance;
        bankingElements primeraCuenta = new bankingElements(
                "Pedro",
                45000.67,
                123456789,
                "Banamex");
        System.out.println("¿Que desea realizar en su cuenta?");
        System.out.println("1) depositar o 2) retirar");
        opc=sc.nextInt();
        System.out.println("Ingrese la catidad");
        ban=sc.nextInt();

        if(opc==1){
            System.out.println("Ingrese el valor a depositar");
            newBalance= (double) primeraCuenta.getCurrentbalance()+ban;
            primeraCuenta.setCurrentbalance(newBalance);
        }
        else if(opc==2){
            System.out.println("Ingrese el valor a retirar");
            newBalance= (double) primeraCuenta.getCurrentbalance()-ban;
            primeraCuenta.setCurrentbalance(newBalance);
        }
        primeraCuenta.toString();

        bankingElements segundaCuenta = new bankingElements();
        System.out.println("El nombre es:"+segundaCuenta.getOwnerName());
        System.out.println("El saldo actual es:"+segundaCuenta.getCurrentbalance());
        System.out.println("La clave intervancaria es:"+segundaCuenta.getInterbanKey());
        System.out.println("Eñ banco es:"+segundaCuenta.getBankName());
        segundaCuenta.toString();
    }
}

