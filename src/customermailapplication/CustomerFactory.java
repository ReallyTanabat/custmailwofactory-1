package customermailapplication;
public class CustomerFactory {
    public static Customer createCustomer(String type)
    {
         if (type.equals("Delinquent Customer"))
            return new DelinquentCustomer();
         else if (type.equals("Mountain Customer"))
            return new MountainCustomer();
         else if (type.equals("Regular Customer"))
            return new RegularCustomer();
         return null;
    }
    
}
