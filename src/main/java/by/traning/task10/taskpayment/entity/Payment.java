package by.traning.task10.taskpayment.entity;

import by.traning.task10.taskpayment.service.FileService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Payment {

    private Receipt receipt;
    private double balance;
    private Discount discount;
    private Product product;
    private FileService fileService = new FileService();

    public Payment(Discount discount, Product... product) {
        ArrayList<Product> products = new ArrayList<>();
        Collections.addAll(products, product);
        this.discount = discount;
        receipt = new Receipt(products);
        fileService.createFile();
        fileService.writeText(products.toString() + "\n");
        fileService.writeText("Стоимость всех товаров " + receipt.getBalance() +"\n");
        fileService.writeText(String.format("Стоимость товаров со скидкой %.2f", totalPriceWithDiscount(receipt.getTotalPrice(),discount)) + "\n");
    }

    public Payment(Receipt receipt, double balance, Discount discount, Product product, FileService fileService) {
        this.receipt = receipt;
        this.balance = balance;
        this.discount = discount;
        this.product = product;
        this.fileService = fileService;
    }

    public double totalPriceWithDiscount(double price, Discount discount){
     if (discount == Discount.STOCK){
         return price * 0.75;
     }
     if (discount==Discount.SALE){
         return price * 0.5;
     } else return price;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public FileService getFileService() {
        return fileService;
    }

    public void setFileService(FileService fileService) {
        this.fileService = fileService;
    }


    public static class Receipt {
        private List<Product> products;
        private double balance;

        public Receipt(List<Product> products) {
            this.products = products;
            balance = getTotalPrice();
        }

        public double getTotalPrice() {
            double totalPrice = 0;
            for (Product product: products) {
                totalPrice += product.getPrice();
            }
            return totalPrice;
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProduct(Product product){
            products.remove(product);
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Receipt{" +
                    "products=" + products +
                    ", balance=" + balance +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Receipt receipt = (Receipt) o;
            return Double.compare(receipt.balance, balance) == 0 &&
                    Objects.equals(products, receipt.products);
        }

        @Override
        public int hashCode() {
            return Objects.hash(products, balance);
        }
    }
}