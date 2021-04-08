/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author miraclenotify
 */

import java.util.*;
public class factory
{
    public static void main(String[] args)
    {
        
       
        notificationfactory factory1 = new  notificationfactory();
        System.out.println("enter ur search");
        Scanner sc=new Scanner(System.in);
        String k=sc.nextLine();
        Notification s =notificationfactory.note(k);
        s.notifyUser();
        
        
    }
}

