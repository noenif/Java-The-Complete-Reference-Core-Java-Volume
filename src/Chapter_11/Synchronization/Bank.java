package Chapter_11.Synchronization;

  import java.util.*;

          /**
  6   * A bank with a number of bank accounts.
  7   */
          public class Bank
   {
              private final double[] accounts;

            /**
      * Constructs the bank.
      * @param n the number of accounts
      * @param initialBalance the initial balance for each account
      */
            public Bank(int n, double initialBalance)
            {
               accounts = new double[n];
               Arrays.fill(accounts, initialBalance);
            }

            /**
 24      * Transfers money from one account to another.
 25      * @param from the account to transfer from
 26      * @param to the account to transfer to
 27      * @param amount the amount to transfer
 28      */
          public void transfer(int from, int to, double amount)
          {
              //amount == MAX_AMOUNT * Math.random()
             if (accounts[from] < amount) return;
             System.out.println(Thread.currentThread());
             System.out.print("------------------------------------\n");
             accounts[from] -= amount;
             //from == i
             //accounts[from] == NACCOUNTS - amount;
             System.out.printf(" %10.2f from %d to %d\n", amount, from, to);
             accounts[to] += amount;
             //to == (int) (bank.size() * Math.random())
              //这里从from 拿出，从to放进
             double mnu = getTotalBalance();
             System.out.printf(" Total Balance: %10.2f%n\n",mnu );
          }

          /**
 40      * Gets the sum of all account balances.
 41      * @return the total balance
 42      */
            public double getTotalBalance()
            {
               double sum = 0;

               for (double a : accounts)
                  sum += a;

               return sum;
            }

         /**
      * Gets the number of accounts in the bank.
      * @return the number of accounts
      */
             public int size()
             {
                return accounts.length;
             }
          }