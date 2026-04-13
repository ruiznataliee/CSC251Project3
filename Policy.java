public class Policy
{

 // Fields
    private int policyNumber;
    private String providerName;
    private PolicyHolder holder;

// Static variable 
    private static int count = 0;

// Constructor
    public Policy(int num, String provider, PolicyHolder h)
    {
        policyNumber = num;
        providerName = provider;
        holder = h;
        count++;
    }

 // Getters
    public int getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }
    public PolicyHolder getHolder() { return holder; }


//to get number of objects
    public static int getCount()
    {
        return count;
    }


//calculating policy price
    public double calculatePrice()
    {
        double price = 600;

        if (holder.getAge() > 50)
            price += 75;

        if (holder.getSmokingStatus().equalsIgnoreCase("smoker"))
            price += 100;

        if (holder.calculateBMI() > 35)
            price += (holder.calculateBMI() - 35) * 20;

        return price;
    }

    public String toString()
    {
        return "Policy Number: " + policyNumber + "\n\n" +
               "Provider Name: " + providerName + "\n\n" +
               holder.toString() + "\n" +
               "Policy Price: $" + String.format("%.2f", calculatePrice()) + "\n";
    }
}