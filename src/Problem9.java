import java.util.Scanner;

public class Problem9
{
    public static void main(String[] args)
    {
        inputArray();
    }

    private static void inputArray()
    {

        double[] userInputs;
        userInputs = new double[10];
        Scanner input = new Scanner(System.in);

        for (int i=0;i<10;i++)
        {
            System.out.println("Please enter the weight of the animal: ");
            userInputs[i] = input.nextDouble();
        }
        printWeights(userInputs);

    }

    private static void printWeights(double[] userInputs)
    {
        int weightUnder250=0;
        for(int i=0;i<10;i++)
        {
           // weight += userInputs[i] + ", ";
            if (userInputs[i]<250)
            {
                weightUnder250++;
            }
            System.out.printf("%.2f, ",userInputs[i]);
        }
        System.out.println("\nNumber under 250KG: " + weightUnder250);
        System.out.println("\nPercentage over 400KG: ");
    }
}
