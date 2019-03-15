/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Lenovo
 */
public class ATM {
    
    public static Customer customer1 = new Customer(12345,0,1234,"Mohamed",20,"Engineer");         
    public static Customer customer2 = new Customer(78910,5000,7891,"Ahmed",50,"doctor");
    public static Customer customer3 = new Customer(13579,10000,1359,"kareem",30,"lawyer");
    public static Customer c1 = new Customer(0,0,0,"",0,"");
    
    public static int counter=3;
    public static int count=0;
    public static int count2=0;
    public static double card_num=0;
    public static int type=0;
    public static boolean found;

    public static double [] array = new double [5];
    public static String [] history = new String [5];
    
  public static void main(String[] args){
    
        array[0] = customer1.card_num;
        array[1] = customer2.card_num;
        array[2] = customer3.card_num;
        
        Login n = new Login();
        n.setVisible(true);
        
        
  }
  
  public static void history (String message)
  {
      int i;
      if (count==5)
      {
          for(i=0;i<4;i++)
              history[i]=history[i+1];
          count =4;
      }
      if (count<5)
      {
      history[count] = message;
      count++;
      }
      count2=count-1;
  }
  
  public static boolean check ()
  {
      int i;
        int f = 0;
                for (i=0;i<counter;i++)
                { 
                    if (array[i] == card_num)
                    {
                        found = true;
                        f = i;
                    }
                }
        switch (f)
                {
            case 0: c1=customer1;
            break;
            case 1: c1=customer2;
            break;
            case 2: c1=customer3;
            break;
        }
        return found;
  }
}
