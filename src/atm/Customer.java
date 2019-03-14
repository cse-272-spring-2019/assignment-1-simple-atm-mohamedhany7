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

public class Customer {
    
    private String name,job;
    private int age;
    public double card_num;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private double current_balance;
    private int password;
    
    public Customer (double card_number, double balance, int pass, String name ,int age,String job){
        
        card_num = card_number;
        current_balance = balance;
        password = pass;
        this.age = age;
        this.job = job;
        this.name = name;
    }

    public String getName() {
        return name;
    }
   
    public void add_balance (double balance){
        current_balance += balance;
    }
    
    public boolean dif_balance (double balance){
        if (balance > current_balance){  
        return false ;
        }
        else {
            current_balance -= balance;
            return true;
        }
    }
    
    public double get_balance (){
        return current_balance;
    }
    
    public boolean checkpassword (int pass)
    {
        if (password == pass)
        return true;
        else return false;
    }
}
 