package Chapter_11.Synchronization;

          public class UnsynchBankTest
          {
             public static final int NACCOUNTS = 3;
             public static final double INITIAL_BALANCE = 1;
             public static final double MAX_AMOUNT = 1;


             public static void main(String[] args)
             {
                var bank = new Bank1(NACCOUNTS, INITIAL_BALANCE);
                for (int i = 0; i < NACCOUNTS; i++)
                {
                   int fromAccount = i;
                   Runnable r = () -> {
                      try
                      {
                         while (true)
                         {
                            int toAccount = (int) (bank.size() * Math.random());
                            double amount = MAX_AMOUNT * Math.random();
                            bank.transfer(fromAccount, toAccount, amount);
                            Thread.sleep(1000);
                         }
                      }
                      catch (InterruptedException e)
                      {
                      }
                   };
                   var t = new Thread(r);
                   t.start();
                }
             }
          }
