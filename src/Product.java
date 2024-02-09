public class Product {
        private String name;
        private int netPrice;
        private int vat;

        public Product(String name, int netPrice, int vat){
            this.name = name;
            this.netPrice = netPrice;
            this.vat = vat;
        }

        public int getNetPrice() { return netPrice; }

        public int getGrossPrice() { return (100 + vat) * netPrice / 100; }

        public String getDescription(){
            return String.format("%-10s : %5d / %5d", name, getNetPrice(), getGrossPrice());
        }

        public String toString() {
            return String.format("produkt:%s", name);
        }

        public String getCSVString(){ return String.format("%s,%d,%d", name, netPrice, vat); }
}

