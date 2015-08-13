import org.junit.*;
import static org.junit.Assert.*;

public class CoinTest {

 @Test
  public void isCoinReturningAmountofPennies_String() {
  Coin testCoin = new Coin();
  String test = "Here is your change: 0 quarters 0 dimes 0 nickels 4 pennies.";
  assertEquals(test, testCoin.isCoin(4));
  }

  @Test
   public void isCoinReturningAmountofNickels_String() {
   Coin testCoin = new Coin();
   String test = "Here is your change: 0 quarters 0 dimes 1 nickels 4 pennies.";
   assertEquals(test, testCoin.isCoin(9));
   }

   @Test
    public void isCoinReturningAmountofDimes_String() {
    Coin testCoin = new Coin();
    String test = "Here is your change: 0 quarters 1 dimes 0 nickels 2 pennies.";
    assertEquals(test, testCoin.isCoin(12));
    }

    @Test
     public void isCoinReturningAmountofQuarters_String() {
     Coin testCoin = new Coin();
     String test = "Here is your change: 0 quarters 1 dimes 1 nickels 1 pennies.";
     assertEquals(test, testCoin.isCoin(16));
     }

     @Test
      public void isCoinReturningCorrestOutput_String() {
      Coin testCoin = new Coin();
      String test = "Here is your change: 1 quarters 0 dimes 0 nickels 1 pennies.";
      assertEquals(test, testCoin.isCoin(26));
      }
}
