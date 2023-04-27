package Chapter3.ch02;

public class VIPCustomer extends Customer{
    public VIPCustomer(){
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade="VIP";
        System.out.println("VIPCustomer() call");
    }
    double salesRatio;



    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    private String agentID;

//    public VIPCustomer(){
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//        customerGrade="VIP";
//    }


}
