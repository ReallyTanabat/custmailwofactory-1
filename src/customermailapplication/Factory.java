package customermailapplication;
public class Factory {
    public static void main(String[] args)
    {
        Customer mai = CustomerFactory.createCustomer("Delinquent Customer");
        System.out.println(mai);
    }    
}
