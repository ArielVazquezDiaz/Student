public class bankingElements {
    private String ownerName;
    private double Currentbalance;
    private long interbanKey;
    private String bankName;

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public double getCurrentbalance() {
        return Currentbalance;
    }
    public void setCurrentbalance(double currentbalance) {
        Currentbalance = currentbalance;
    }
    public long getInterbanKey() {
        return interbanKey;
    }
    public void setInterbanKey(long interbanKey) {
        this.interbanKey = interbanKey;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public bankingElements(String ownerName, double Currentbalance, long interbanKey, String bankName){
        this.ownerName = ownerName;
        this.Currentbalance = Currentbalance;
        this.interbanKey = interbanKey;
        this.bankName = bankName;
    }
    public bankingElements(){
    }
    public String toString() {
        System.out.println("Los datos del banco son:");
        System.out.println("El nombre del propietario es: " + getOwnerName());
        System.out.println("El saldo actual es: " + getCurrentbalance());
        System.out.println("La clave Intervancaria es: " + getInterbanKey());
        System.out.println("El banco es: " + getBankName());
        return "";
    }
}

