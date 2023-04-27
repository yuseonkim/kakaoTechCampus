package Chapter3.ch06;

public class GoldCustomer extends Customer{

    double salesRatio;
    public GoldCustomer(int customerID, String customerName){
        super(customerID,customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        salesRatio = 0.1;
    }
    @Override
    public int calcPrice(int price){
        bonusPoint +=  price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }


}
