package cse;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class TotalCostCalculator {

    public static void main(String[] args) {
        List<Integer> quantities = Arrays.asList(2, 3, 1, 5);
        
        List<Double> prices = Arrays.asList(10.0, 15.5, 7.0, 20.0);
        
        BiConsumer<List<Integer>, List<Double>> calculateTotalCost = (qtyList, priceList) -> {
            double totalCost = 0.0;
            for (int i = 0; i < qtyList.size(); i++) {
                totalCost += qtyList.get(i) * priceList.get(i);
            }
            System.out.println("Total Cost: " + totalCost);
        };
        
        calculateTotalCost.accept(quantities, prices);
    }
}

/*{
 * Biconsumer<Integer,Double> bic =(q,p)->
 * {
 * double cost=q*p;
 * sysout("Cost=" +cost);
 * 
 *}
 *for (int i = 0; i < qtyList.size(); i++) {
 */

	//Write a program to write a tree set of circle and for each circle print the area of the circle
//creation of tree set of circles
