package lab8;

/**
 *
 * @author Rey
 */
public class Lab8 
{
    public static void main(String[] args) 
    {
        User user1 = new User("Kevin");
        user1.setPassword("rey");
        user1.setLogin_status(true);
        
        System.out.println("Username    : " + user1.getUser_id());
        System.out.println("Password    : " + user1.getPassword());
        System.out.println("Status      : " + user1.verifylogin() + "\n");
        
        Customer cust = new Customer("Reynaldi");
        cust.register("Reynaldi", "halo");
        cust.setCustomer_name("Kevin Rey");
        cust.setAddress("Araya gang 15");
        cust.setEmail("reynaldivin@gmail.com");
        cust.setCredit_card("7322349019031900");
        cust.setShipping_info("On process");
        
        System.out.println("Username        : " + cust.getUser_id());
        System.out.println("Password        : " + cust.getPassword());
        System.out.println("Name            : " + cust.getCustomer_name());
        System.out.println("Address         : " + cust.getAddress());
        System.out.println("Email           : " + cust.getEmail());
        System.out.println("Credit card     : " + cust.getCredit_card());
        System.out.println("Shipping info   : " + cust.getShipping_info() + "\n");
        
        Admin adm = new Admin("Vin");
        adm.setAdmin_name("Sinyo");
        adm.setPassword("onyis");
        adm.setEmail("engkohrey@gmail.com");

        System.out.println("Username    : " + adm.getUser_id());
        System.out.println("Password    : " + adm.getPassword());
        System.out.println("Name        : " + adm.getAdmin_name());
        System.out.println("Email       : " + adm.getEmail());
    }
    
}
