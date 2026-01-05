package StockClassPhase3;

public class ObjectCopy
{
    public static void main(String[] args)
    {
        Stock company1 = new Stock("xyz", 6.92);
        Stock company2;

        company2 = company1.copy();

        System.out.println("company 1:\n" + company1);
        System.out.println();
        System.out.println("company 2:\n" + company2);

        if (company1 == company2)
        {
            System.out.println("company 1 and company " +
                    " variables reference the same object.");
        }

        else
        {
            System.out.println("The company1 and company2 " +
                    "variables reference different objects.");
        }
    }
}
