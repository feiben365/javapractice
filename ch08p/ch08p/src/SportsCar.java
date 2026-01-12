public class SportsCar
{
    private CarType make;
    private CarColor color;
    private double price;

    public SportsCar(CarType amake, CarColor aColor, double aPrice)
    {
        make = amake;
        color = aColor;
        price = aPrice;
    }

    public CarType getMake()
    {
        return make;
    }

    public CarColor getColor()
    {
        return color;
    }

    public double getPrice()
    {
        return price;
    }

    public String toString(){
        String str = String.format("Make: %s\nColor: %s\nPrice: $%, .2f",
                make, color, price);
        return str;
    }

}
