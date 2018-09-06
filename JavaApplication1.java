/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 
{

   
    public static void main(String[] args)
    {
        int year =1900;
        boolean leap=false;
        
            if(year % 4==0)
            {
                if(year%100==0)
                {
                    if(year%400==0)
                    {
                        leap=true;
                  }
                    else
                        leap=false;
                }
                else
                    leap=true;
            }
            else
                leap=false;
            if(leap)
                System.out.println(year+"is a leap year");
            else
                  System.out.println(year+"is a not leap year");               
    }
    
}
