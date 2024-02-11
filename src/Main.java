public class Main {
    public static void main(String[] args){
        Invoice i = new Invoice("Contoso/2024/01");
        Product p;

        p = new Product("Milk", 100, 22);
        i.addProduct(p);
        p = new Product("Butter", 150, 12);
        i.addProduct(p);
        p = new Product("Bread", 130, 7);
        i.addProduct(p);

        i.print();

        i.saveToFile("invoice.csv");

        Invoice j = new Invoice("Contoso/2024/04");
        j.readFromFile("invoice.csv");
        j.print();


    }
}