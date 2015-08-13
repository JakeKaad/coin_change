import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;

public class Coin {
    public static void main(String[] args) {}

      public String isCoin(int userInput) {
        int pennies = 0;
        int nickels = 0;
        int dimes = 0;
        int quarters = 0;

          while (userInput > 0) {
            if (userInput >= 25) {
              userInput -= 25;
              quarters++;
            }
            else if (userInput >= 10 ) {
              userInput -= 10;
              dimes++;
            }
            else if (userInput >=5 ) {
              userInput -= 5;
              nickels++;
            }
            else if (userInput < 5) {
              userInput -= 1;
              pennies++;
            }
          }

          // "3 nickles"
          String pennyString = String.format("%d pennies", pennies);
          String nickelString = String.format("%d nickels", nickels);
          String dimeString = String.format("%d dimes", dimes);
          String quarterString = String.format("%d quarters", quarters);
          String totalChange = String.format("Here is your change: %s %s %s %s.", quarterString, dimeString, nickelString, pennyString);
          return totalChange;
      }

}
