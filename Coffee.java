package gib114.malinstarost;
import java.text.NumberFormat;

public class Coffee {
    private String title, type;
    private double cost;

    public Coffee (String name, String sort, double price)
    {
        title = name;
        type = sort;
        cost = price;
    }

    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String description;
        description = fmt.format(cost) + "\t";
        description += title + "\t" + type;
        return description;
    }

}
