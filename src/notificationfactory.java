

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author miracle
 */
public class notificationfactory 
{
   
  static  public Notification  note(String s)
    {
        
     if (s.equals("sms")) 
        {
            return new  smsnotification();
        }
   else  if (s.equals("push")) 
        {
            return new  pushnotification();
        }
   else  if (s.equals("email")) 
        {
            return new  emailnotification();
        }
   else{
       System.out.println("enter valid value");
   }
        return null;
        
        
    
}
} 
