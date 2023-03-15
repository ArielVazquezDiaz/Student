public class TenisShoes {
    private String name;
    private short age;
    private char sex;
    private String mark;
    private byte size;
    private String color;
    private int cantidad;

    public TenisShoes(String name, short age, char sex, String mark, byte size, String color,int cantidad) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mark = mark;
        this.size = size;
        this.color = color;
        this.cantidad = cantidad;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public byte getSize() {
        return size;
    }
    public void setSize(byte size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String toString() {
        System.out.println("Los datos de la persona son:");
        System.out.println("El nombre es: " + getName());
        System.out.println("Su sexo es: " + getSex());
        System.out.println("Su edad es: " + getAge());
        System.out.println("Su talla es de : " + getSize());
        System.out.println("Su cantidad de tenis es: " + getCantidad());
        System.out.println("La marca de sus tenis es: " + getMark());
        System.out.println("El color de sus tenis es: " + getColor());
        return "";
    }
}
