import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

class Files {
    public static void main(String[] args) throws java.io.IOException {
        String filePath = "file.txt";
        
        String nextLine = null;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((nextLine = br.readLine()) != null) {
                System.out.println( nextLine );
            }
        }
        catch (FileNotFoundException e) {            
            System.out.println(e.getLocalizedMessage()); // display the error, but continue on with our code.
        }
        catch (java.io.IOException e) {
            System.out.println("Shutting down the program because there was an error reading or closing the file.");
            throw e; // means I have to add ( throws java.io.IOException ) to the end of my method header because I am throwing a Checked Exception.
        }
                
        System.out.println("stuff here blah blah...");

    }
}
