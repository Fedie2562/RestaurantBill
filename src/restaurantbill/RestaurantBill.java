/*
 * Program that displays the bill of a Restaurant
 */

package restaurantbill;
import java.text.DecimalFormat;
/**
 * @author fedie2562
 */
public class RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Decare all the variables
        double meal = 49.89;
        double hst = meal * 0.13;
        double total = meal + hst;
        //Create a new Decimal Format
        DecimalFormat x = new DecimalFormat("###.##");
        //Display the calculated data
        System.out.println("Artisan Sandwich Deluxo $"+meal);
        System.out.println("HST $"+x.format(hst)+"\nTotal $"+x.format(total));
    }
}
