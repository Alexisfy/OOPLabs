package gib114.malinstarost;


public class Tester {
    public static void main (String[] args)
    {
        CoffeeCollection coff = new CoffeeCollection ();

        coff.addCoffee ("Storm Front", "Billy Joel", 14.95);
        coff.addCoffee ("Come On Over", "Shania Twain", 14.95);
        coff.addCoffee ("Soundtrack", "Les Miserables", 17.95);
        System.out.println (coff);

        coff.addCoffee ("Double Live", "Garth Brooks", 19.99);
        coff.addCoffee ("Greatest Hits", "Jimmy Buffet", 15.95);
        System.out.println (coff);
    }

}
