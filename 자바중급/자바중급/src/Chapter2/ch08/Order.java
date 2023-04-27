package Chapter2.ch08;

public class Order {
    private String orderNumber;
    private int orderPhoneNumber;
    private String orderAddress;
    private String orderDate;
    private String orderTime;
    private int menuPrice;

    public Order(String orderNumber, int orderPhoneNumber, String orderAddress, String orderDate, String orderTime, int menuPrice, int menuNum) {
        this.orderNumber = orderNumber;
        this.orderPhoneNumber = orderPhoneNumber;
        this.orderAddress = orderAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.menuPrice = menuPrice;
        this.menuNum = menuNum;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    private int menuNum;



    public String getOrderNumber() {
        return orderNumber;
    }


    public int getOrderPhoneNumber() {
        return orderPhoneNumber;
    }

    public void setOrderPhoneNumber(int orderPhoneNumber) {
        this.orderPhoneNumber = orderPhoneNumber;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public int getMenuNum() {
        return menuNum;
    }

    public void setMenuNum(int menuNum) {
        this.menuNum = menuNum;
    }

    public void printOrder(){
        System.out.println("주문 접수 번호 : "+orderNumber);
        System.out.println("주문 핸드폰 번호 : "+orderPhoneNumber);
        System.out.println("주문 집 주소 : "+orderAddress);
        System.out.println("주문 날짜 :" + orderDate);
        System.out.println("주문 시간 : "+orderTime);
        System.out.println("메뉴 가격 : "+menuPrice);
        System.out.println("메뉴 번호 :" +menuNum);
    }
}
