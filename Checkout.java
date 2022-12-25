package checkout;

import java.util.Scanner;

public class Checkout {
    Scanner scan = new Scanner(System.in);
    private String customerName;
    private String userGoods;
    private double noOfUserGoods;
    private double priceOfGoods;
    private String cashierName;
    private double amountPay;
    private double discount;

   // private double vat;
    private double balance;
    private double vat ;
    private String conditionCheck;


    public double balance() {
        balance = priceOfGoods * noOfUserGoods;
        return balance;
    }

    public double vat() {
        vat = (balance * 75)/1000 ;
        return vat;
    }

//    public double getVat() {
//        return vat;
//    }

    public void setAmountPay(int amountPay) {
        this.amountPay = amountPay;
    }

    public double getAmountPay() {
        return amountPay;
    }

    public double totalBill (){
        double bill = balance + discount + vat ;
        return bill;
    }

    public void setDiscount() {
        System.out.println("How much discount will he get");
        discount = scan.nextInt();
        discount = (balance * discount) / 100 ;
    }

    public double getDiscount() {
        return discount;
    }

    public void setCashierName() {
        System.out.println("What is your name? ");
        cashierName = scan.next();
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCustomerName() {
        System.out.println("What is the customer's name");
        customerName = scan.nextLine();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setUserGoods() {
        System.out.println("What did the user buy?");
        userGoods = scan.next();
    }

    public String getUserGoods() {
        return userGoods;
    }

    public void setNoOfUserGoods() {
        System.out.println("How many pieces? ");
        noOfUserGoods = scan.nextInt();
       // noOfUserGoods += noOfUserGoods;
    }

    public double getNoOfUserGoods() {
        return noOfUserGoods;
    }

    public void setPricePerUnit() {
        System.out.println("How much per unit? ");
        priceOfGoods = scan.nextInt();
      //  priceOfGoods += priceOfGoods;
    }

    public double getPerUnit() {
        return priceOfGoods;
    }

    public void branchDisplay(){

        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Date: 25-DEC-22 8:31:11 pm");
        System.out.printf("Cashier: %s%n", cashierName);
        System.out.printf("Customer Name: %s%n", customerName);
    }

    public void invoice(){
        branchDisplay();
        System.out.println("==".repeat(32));
        System.out.printf("%20s %10s %10s %20s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("--".repeat(32));
        System.out.printf("%20s %,10.2f %,10.2f %,20.2f%n",getUserGoods(),getNoOfUserGoods(),getPerUnit(), balance());
        System.out.println("--".repeat(32));
        System.out.printf("%35s %,25.2f%n", "Sub Total: ", balance());
        System.out.printf("%35s %,25.2f%n", "Discount: ", getDiscount());
        System.out.printf("%35s %,25.2f%n", "VAT @ 17.50%: ", vat());
        System.out.println("==".repeat(32));
        System.out.printf("%35s %,25.2f%n", "Bill Total: ", totalBill());
        System.out.println("==".repeat(32));
        System.out.printf("THIS IS NOT AN RECEIPT KINDLY PAY %-60.2f%n", totalBill() );
        System.out.println("==".repeat(32));


    }

    public void prompts(){
        setCustomerName();
        do {
            setUserGoods();
            setNoOfUserGoods();
            setPricePerUnit();
            System.out.println("Add more Items? yes or no ");
            conditionCheck = scan.next();
        }while (conditionCheck.equalsIgnoreCase("yes"));

        setCashierName();
        setDiscount();
    }













}
