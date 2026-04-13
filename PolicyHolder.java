public class PolicyHolder
{
  
    // Instance variables
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    
    //Constructors
    public PolicyHolder(String f, String l, int a, String s, double h, double w)
    {
        firstName = f;
        lastName = l;
        age = a;
        smokingStatus = s;
        height = h;
        weight = w;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSmokingStatus() { return smokingStatus; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }


    // calculating BMI
   
    public double calculateBMI()
    {
        return (weight * 703) / (height * height);
    }

    
    // Returns a string 
    public String toString()
    {
        return "Policyholder's First Name: " + firstName + "\n" +
               "Policyholder's Last Name: " + lastName + "\n" +
               "Policyholder's Age: " + age + "\n" +
               "Policyholder's Smoking Status (Y/N): " + smokingStatus + "\n" +
               "Policyholder's Height: " + height + " inches\n" +
               "Policyholder's Weight: " + weight + " pounds\n" +
               "Policyholder's BMI: " + String.format("%.2f", calculateBMI());
    }
}