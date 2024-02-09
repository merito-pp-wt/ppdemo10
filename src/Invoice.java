import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Invoice {
    private String id;

    private ArrayList<Product> products;

    public Invoice(String id){
        this.id = id;
        products = new ArrayList<>();
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public int getTotalGross(){
        int totalGross = 0;

        for(Product p: products){
            totalGross += p.getGrossPrice();
        }

        return totalGross;
    }

    public int getTotalNet(){
        int totalNet = 0;

        for(Product p: products){
            totalNet += p.getNetPrice();
        }

        return totalNet;
    }

    public void print(){
        int position = 1;
        System.out.println("===========================");
        System.out.println("Invoice "+id);
        for(Product p: products){
            System.out.printf("%d . %s\n", position, p.getDescription());
            position++;
        }
        System.out.println("Total: " + getTotalNet() + " / " + getTotalGross());
        System.out.println("===========================");
    }

    public int getNumberOfItems(){
        return products.size();
    }

    public String toString() {
        return "src.Invoice " + id;
    }

    public String removeProduct(int position){
        if(position < 0 || position >= getNumberOfItems()) {
            return "not removed";
        }
        else {
            String s = products.get(position).toString();
            products.remove(position);
            return "removed product name:" + s;
        }
    }

    public void readFromFile(String fileName){
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(",");
                String name = columns[0];
                String price = columns[1];
                String vat = columns[2];
                Product newProduct = new Product(name, Integer.parseInt(price), Integer.parseInt(vat));
                products.add(newProduct);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveToFile(String fileName){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for(Product product : products) {
                writer.write( product.getCSVString() );
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}