class SavingAccount
{
   double balance;
   static double interest;

   public SavingAccount(Double balance)
   {
      this.balance = balance;
   }
   public void calMonthlyInterest()
   {
      double monthlyInterest =(balance * interest /12) / 100;//(10000 * 4.0/12)/100 =3333.3333333/100 =33.333
      balance += monthlyInterest;  //10000 + 33.333
   }

   public static void changeInterest(double newInterest)
   {
      interest = newInterest; //4166.667/100
   }
   public void showBalance()
   {
      System.out.println("Balance: "+balance);
   }

   public static void main(String[] args)
   {
      SavingAccount saver1 = new SavingAccount(10000.00);
      SavingAccount saver2 = new SavingAccount(20000.00);

      saver1.showBalance();
      saver1.changeInterest(4.0);
      saver1.calMonthlyInterest();
      saver1.showBalance();
      saver1.changeInterest(5.0);
      saver1.calMonthlyInterest();
      saver1.showBalance();

      System.out.println();

      saver2.showBalance();
      saver2.changeInterest(4.0);
      saver2.calMonthlyInterest();
      saver2.showBalance();
      saver2.changeInterest(5.0);
      saver2.calMonthlyInterest();
      saver2.showBalance();

      System.out.println();
   }

    
}