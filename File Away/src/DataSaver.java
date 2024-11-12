import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataSaver {

    public static void main(String[] args) {
        ArrayList<String> records = new ArrayList<>();
        int idCounter = 1;
        boolean moreRecords = true;

        while (moreRecords) {
            String firstName = SafeInput.getString("Enter First Name: ");
            String lastName = SafeInput.getString("Enter Last Name: ");
            String idNumber = String.format("%06d", idCounter);
            String email = SafeInput.getString("Enter Email: ");
            int yearOfBirth = SafeInput.getInt("Enter Year of Birth (4 digits): ");

            String record = String.join(", ", firstName, lastName, idNumber, email, String.valueOf(yearOfBirth));
            records.add(record);
            idCounter++;

            String response = SafeInput.getString("Would you like to add another record? (yes/no): ");
            moreRecords = response.equalsIgnoreCase("yes");
        }

        String fileName = SafeInput.getString("Enter the file name to save records (include .csv extension): ");

        try (FileWriter writer = new FileWriter("src/" + fileName)) {
            for (String record : records) {
                writer.write(record + "\n");
            }
            System.out.println("Records saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the file.");
            e.printStackTrace();
        }
    }
}
