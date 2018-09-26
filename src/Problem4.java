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
        int nameLength=fullName.length();
        printInfo(initialAsString,fullName,nameLength);

    }



    private static void printInfo(String initialAsString, String fullName, int nameLength)
    {
        int index;
        index = fullName.indexOf(' ');
        String firstName = fullName.substring(1, index);

        int index2 = fullName.lastIndexOf(" ");
        String lastName=fullName.substring(index2);
        JOptionPane.showMessageDialog(null, "Your information is as follows: "
        + "\nThe initials of your first name is: " + initialAsString + "\nYour full name is: " + fullName
        + "\nYour name is this many digits long: (This includes spaces) " + nameLength + "\nYour name is all caps is: " +
                fullName.toUpperCase() + "\nYour second name is: " + lastName);

    }
}
