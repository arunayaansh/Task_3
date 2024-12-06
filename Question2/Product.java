package Task3;

public class Product implements Taxable{
        private int pid;
        private double price;
        private int quantity;

        public Product(int pid, double price, int quantity) {
            this.pid = pid;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public void calcTax() {
            double tax = (salesTax / 100) * price;
            System.out.println("Sales Tax for Product ID " + pid + ": " + tax);
        }
    }

