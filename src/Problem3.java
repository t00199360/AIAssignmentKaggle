import javax.swing.*;

public class Problem3 {
    public static void main(String[] args) {
        inputDetails();
    }

    private static void inputDetails()
    {
        double length=0;
        double breadth=0;

        String askLength = JOptionPane.showInputDialog("Please enter the length of the room you wish to carpet (only enter the dimension you want to cover in carpet!!)");
        String askBreadth = JOptionPane.showInputDialog("Please enter the breadth of the room you wish to carpet (only enter the dimension you want to cover in carpet!!)");
        String askName = JOptionPane.showInputDialog("Please enter your name");

        length=Double.parseDouble(askLength);
        breadth=Double.parseDouble(askBreadth);

        double areaRoom=length*breadth;

      calculations(length,breadth,areaRoom, askName);
    }
    private static void calculations(double length, double breadth, double areaRoom, String askName)
    {
        double totalCost=areaRoom*33.50;

        printInvoice(length, breadth, areaRoom, totalCost, askName);
    }

    private static void printInvoice(double length, double breadth, double areaRoom, double totalCost,String askName)
    {
        double costPerMeter=33.50;

        System.out.printf("Quotation for " + askName + "\n %-60s%.2f m.\n %-60s%.2f m.\n%-60s%.2f m.\n %-60s%.2f €.\n %-60s%.2f €.\n","Length of room: ",
                length,
                "Breadth of room: ",
                breadth,
                " Total area of the room: ",
                areaRoom,
                "Cost per square metre of carpet: ",
                costPerMeter,
                "Total cost of carpet: ",
                totalCost);
    }

}
