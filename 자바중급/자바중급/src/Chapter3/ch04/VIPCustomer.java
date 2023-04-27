package Chapter3.ch04;

public class VIPCustomer extends Customer {
    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade="VIP";
    }
    double salesRatio;

    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        price -= (price * salesRatio);
        return  price;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    private String agentID;



}
