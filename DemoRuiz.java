import java.util.ArrayList;

public class DemoRuiz
{

      //ArrayList to store Policy objects
    public static void main(String[] args)
    {
        ArrayList<Policy> policies = new ArrayList<Policy>();

        policies.add(new Policy(3450, "State Farm",
            new PolicyHolder("Alice","Jones",20,"smoker",65,110)));

        policies.add(new Policy(3455, "Aetna",
            new PolicyHolder("Bob","Lee",54,"non-smoker",72,200)));

        policies.add(new Policy(2450, "Met Life",
            new PolicyHolder("Chester","Williams",40,"smoker",71,300)));

        policies.add(new Policy(3670, "Global",
            new PolicyHolder("Cindy","Smith",55,"non-smoker",62,140)));

        policies.add(new Policy(1490, "Reliable",
            new PolicyHolder("Jenna","Lewis",30,"smoker",60,105)));

        policies.add(new Policy(3477, "State Farm",
            new PolicyHolder("Craig","Duncan",23,"smoker",66,215)));

        // Counters
        int smokers = 0;
        int nonSmokers = 0;
        
        // Looping through ArrayList

        for (int i = 0; i < policies.size(); i++)
        {
            Policy p = policies.get(i);

            System.out.println(p);

            if (p.getHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
                smokers++;
            else
                nonSmokers++;
        }
        
        //output results

        System.out.println("There were " + Policy.getCount() + " Policy objects created.\n");
        System.out.println("The number of policies with a smoker is: " + smokers);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
    }
}