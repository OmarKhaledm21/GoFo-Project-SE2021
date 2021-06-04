package System_model;
import Player_Playground_model.Player;

public class eWallet {
    ////////////////// Attributes ///////////////////
    private Player wallet_owner;
    private double balance;

    ////////////////// Constructors //////////////////
    /**
     * This is a parametrized constructor that take object of type player and set waller attribute wallet_owner to this object */
    public eWallet(Player wallet_owner) {
        this.wallet_owner = wallet_owner;
        balance=0;
    }


    ////////////////// Setters and Getters //////////////////
    /**
     * This function returns
    * @return wallet_owner object*/
    public Player getWallet_owner() {
        return wallet_owner;
    }
    /**
     * this function take object of type Player and set it to wallet_owner object
     * @param wallet_owner*/
    public void setWallet_owner(Player wallet_owner) {
        this.wallet_owner = wallet_owner;
    }
    /**
     * @return balance attribute*/
    public double getBalance() {
        return balance;
    }
    /**
     * @param balance and sets attribute balance to it*/
    public void setBalance(double balance) {
        this.balance = balance;
    }

    ////////////////// Methods //////////////////
    /**
     * This function take attribute balance and adds its value to attribute balance*/
    public void deposit(double balance){
        this.balance+=balance;
        System.out.println("Balance deposited successfully");
    }
    /**
     * This function take attribute balance and subtracts its value from attribute balance*/
    public void withdraw(double balance){
        if(this.balance>balance){
            this.balance-=balance;
            System.out.println("Balance withdrawal successfully");
        }else{
            System.out.println("Can't withdraw this amount due to insufficient balance!");
        }
    }
    /**
     * This function take attribute balance and subtracts its value from attribute balance*/
    public boolean makePayment(double balance){
        if(this.balance>balance){
            this.balance-=balance;
            System.out.println("Payment made successfully!");
            return true;
        }else{
            System.out.println("Can't make payments due to insufficient balance!");
        }
        return false;
    }

    /**
     * this function displays value of attribute balance*/
    public void displayBalance(){
        System.out.println("\nYour current balance is: "+balance+"\n");
    }
}
