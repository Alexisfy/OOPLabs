package gib114.malinstarost;
import java.text.NumberFormat;
import java.lang.String;


public class CoffeeCollection {
    private Coffee[] collection;
    private int count;
    private double totalCost;

    public CoffeeCollection ()
    {
        collection = new Coffee[100];
        count = 0;
        totalCost = 0.0;
    }

    public void addCoffee (String title, String type, double cost)
    {
        if (count == collection.length)
            increaseSize();
        collection[count] = new Coffee (title, type, cost);
        totalCost += cost;
        count++;
    }

    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String report = "~~~~\n";
        report += "My Coffee Collection\n\n";
        report += "Number of Coffees: " + count + "\n";
        report += "Total cost: " + fmt.format (totalCost) + "\n";
        report += "Average cost: " + fmt.format (totalCost/count);
        report += "\n\nCoffee List:\n\n";
        for (int coffee = 0; coffee < count; coffee++)
            report += collection[coffee].toString() + "\n";
        return report;
    }

    private void increaseSize ()
    {
        Coffee[] temp = new Coffee[collection.length * 2];
        for (int coffee = 0; coffee < collection.length; coffee++)
            temp[coffee] = collection[coffee]; collection = temp;
    }

}
