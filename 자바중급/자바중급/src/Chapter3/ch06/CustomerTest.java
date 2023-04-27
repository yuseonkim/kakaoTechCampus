package Chapter3.ch06;


import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer(10010,"Tomas");
        Customer customer2 = new Customer(10020, "James");
        Customer customer3 = new GoldCustomer(10030,"Edward");
        Customer customer4 = new GoldCustomer(10040,"Percy");
        Customer customer5 = new VIPCustomer(10050,"Kim");

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);


        for(Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }
        int price = 10000;
        for(Customer customer:customerList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName()+"님이 "+cost+ "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName()+"님의 보너스포인트는" +customer.bonusPoint+"원 입니다");
        }

    }

}
