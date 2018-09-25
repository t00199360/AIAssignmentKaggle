import javax.swing.*;

public class Problem4 {
    public static void main(String[] args)
    {
        inputName();
    }

    private static void inputName()
    {
        String fullName = JOptionPane.showInputDialog("Please enter your full name (include your first name, surname and middle name)");
        findInt(fullName);
    }

    private static void findInt(String fullName)
    {
        char initial = fullName.charAt(0);
        String initialAsString=Character.toString(initial);

        nameLength(fullName, initialAsString);
    }

    private static void nameLength(String fullName, String initialAsString)
    {
        printInfo(initialAsString,fullName);
    }

    private static void printInfo(String initialAsString, String fullName)
    {
        JOptionPane.showMessageDialog(null, "Your information is as follows: "
        + "\nThe initials of your first name is: " + initialAsString + "\nYour full name is: " + fullName);
    }
}
