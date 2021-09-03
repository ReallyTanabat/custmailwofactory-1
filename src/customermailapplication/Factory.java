package customermailapplication;
import java.util.Currency;
import java.util.Locale;
public class Factory {
    public static void main(String[] args)
    {
        Customer mai = 
                    CustomerFactory.createCustomer("Delinquent");
        System.out.println(mai);
    }    
}
