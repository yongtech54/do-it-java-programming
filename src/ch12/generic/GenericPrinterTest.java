package src.ch12.generic;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);

        powderPrinter.printing();
        plasticPrinter.printing();

//        GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
//        waterPrinter.setMaterial(new Water());
//        Water water = waterPrinter.getMaterial();
//        System.out.println(waterPrinter);
    }
}
