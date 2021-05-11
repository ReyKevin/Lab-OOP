/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Rey
 */
public class User 
{
    private String user_id;
    private String password;
    private Boolean login_status = false;
    
    User(String user_id)
    {
        this.user_id = user_id;
    }
    
    public void setUser_id(String user_id)
    {
        this.user_id = user_id;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public void setLogin_status(boolean login_status)
    {
        this.login_status = true;
    }
    
    public String getUser_id()
    {
        return user_id;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String verifylogin() 
    {
        if(login_status = true)
        {
            return "Logged in";
        }
        else
        {
            return "You are not logged in";
        }
    }
}

class Customer extends User 
{
    private String customer_name;
    private String address;
    private String email;
    private String credit_card_info;  
    private String shipping_info;
    
    Customer(String user_id)
    {
        super(user_id);
    }
    
    public void setCustomer_name(String customer_name)
    {
        this.customer_name = customer_name;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setCredit_card(String credit_card_info)
    {
        this.credit_card_info = credit_card_info;
    }
    
    public void setShipping_info(String shipping_info)
    {
        this.shipping_info = shipping_info;
    }
    
    public String getCustomer_name()
    {
        return this.customer_name;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public String getCredit_card()
    {
        return this.credit_card_info;
    }
    
    public String getShipping_info()
    {
        return this.shipping_info;
    }
    
    public void register(String user_id, String password)
    {
        setUser_id(user_id);
        setPassword(password);
    }
    
    public void login(boolean login_status)
    {
        setLogin_status(login_status);
    }
    
    public void update_profile (String user_id, String password, String customer_name, String address,
            String email, String credit_card_info, String shipping_info)
    {
        setUser_id(user_id);
        setPassword(password);
        this.customer_name = customer_name;
        this.address = address;
        this.email = email;
        this.credit_card_info = credit_card_info;
        this.shipping_info = shipping_info;
    }
}

    
class Admin extends User 
{
    private String admin_name;
    private String email;
    
    Admin(String user_id)
    {
        super(user_id);
    }
    
    public void setAdmin_name(String admin_name)
    {
        this.admin_name = admin_name;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getAdmin_name()
    {
        return this.admin_name;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public void update_catalog()
    {
        
    }
}