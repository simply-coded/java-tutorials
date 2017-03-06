/**
 * FILE 1
 *      javac BasicExamples.java
 *      java BasicExamples
 */



import java.util.Scanner;
import java.io.*;
/**
 * Nano timer for timing things.
 */
class NanoTimer {
    public long elapsed;
    //
    public void startTimer() {
        elapsed = System.nanoTime();
    }
    //
    public long stopTimer() {
        return (System.nanoTime() - elapsed);
    }    
    //
}
/**
 * Read and Write to file.
 */
class BasicExamples {
    //
    public static void main(String[] args) throws IOException {
                
        // write to a file        
        try (FileWriter fw = new FileWriter("file1.txt")) {
            fw.write("Test this.");
        } 
        
        try (PrintWriter pw = new PrintWriter("file2.txt")){
            pw.println("Test this too.");
            pw.printf("My name is %s", "Jeremy");            
        }
        
        // timed examples
        NanoTimer nt = new NanoTimer();

        nt.startTimer();
        try (FileWriter fw = new FileWriter("file3.txt")) {
            for (int i = 1; i < 100; i++) {
                fw.write("Line number " + i);
                fw.write("\n");
            }
        }
        long fwTime = nt.stopTimer();

        nt.startTimer();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("file4.txt"))) {
            for (int i = 1; i < 100; i++) {
                bw.write("Line number " + i);
                bw.newLine();
            }            
        }
        long bwTime = nt.stopTimer();


        // read from a file
        try (Scanner sr = new Scanner(new FileReader("file1.txt"))) {
            String firstLine = sr.nextLine();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("file2.txt"))) {
            String firstLine = br.readLine();
            String secondLine = br.readLine();
        }

        // timed example
        nt.startTimer();
        try (Scanner srf = new Scanner(new FileReader("file4.txt"))) {
            while(srf.hasNextLine()) {
                System.out.println( srf.nextLine() );
            } 
        }
        long srfTime = nt.stopTimer();

        nt.startTimer();
        try (BufferedReader brf = new BufferedReader(new FileReader("file4.txt"))) {
            String line; 
            while ( (line = brf.readLine()) != null ) {
                System.out.println( line );
            }
        }
        long brfTime = nt.stopTimer();


        System.out.printf("Timer for Write:\n %d = FileWriter\n %d = BufferedWriter\n Timer for Read:\n %d = Scanner\n %d = BufferedReader",
            fwTime, bwTime, srfTime, brfTime
        );

    }
    //
}














/**
 * FILE 2
 *      javac ReadWriteProgram.java
 *      java ReadWriteProgram
 */




import java.util.Scanner;
import java.util.ArrayList;
import java.util.logging.*;
import java.io.*;
/**
 * Choose a file, read that file, choose line of file, write that line to a file.
 */
public class ReadWriteProgram {
    //
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
	FileManager fm = new FileManager();
        
        fm.getFiles();
        ArrayList<String> fileLines = fm.splitIntoLines();
        
        if (fileLines.size() == 0) {
            System.out.println("Program finished.");
            return;
        }

        System.out.println("What line would you like to Read? 1-" + fileLines.size() );

        while(!scan.hasNextInt()) {
            scan.next();
            System.out.print("Not a valid line number. Try again: ");
        }
        int line = scan.nextInt();
        if (line > 0 && line <= fileLines.size()) {
           fm.writeTo("line-" + line + ".txt", fileLines.get(line - 1) );
        }
        else {
            System.out.println("Line doesn't exist.");
        }
    }
    //
}
/**
 * Read, Write, and List files
 */
class FileManager {
    //
    private final static Logger logr = Logr.setup( FileManager.class.getName() );
    //
    ArrayList<String> splitIntoLines() throws IOException {

        Scanner scan = new Scanner(System.in); 
        ArrayList<String> lines = new ArrayList<String>();

        String filePath = scan.nextLine();
        if (filePath.equals("q")) {
            return lines;
        } 
        else if (filePath.equals("a")) {
            getFiles();
        }
        String nextLine = null;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {                        
            try {
                while ((nextLine = br.readLine()) != null) {
                    lines.add(nextLine);
                }   
            }            
            catch(IOException e) {
                System.out.print("Error reading file. Try another ('q' to quit, 'a' for available).\n: ");  
                lines = splitIntoLines();
            }            
        }   
        catch(FileNotFoundException e) {
            System.out.print("File doesn't exist. Try again ('q' to quit, 'a' for available).\n: ");
            lines = splitIntoLines();
        }      
        catch(IOException e) {
            System.out.println("Error closing the file. Program shutting down.");
            logr.log(Level.SEVERE, "BufferedReader close error.", e);
            throw e;
        }   
        return lines;
    }
    //
    void getFiles() {
        File[] files = new File(".").listFiles();        
        System.out.print("What file do you want to read? ('q' to quit). [ " );

        for (File file : files) {
            if ( 
                file.isFile() &&
                !(file.getName().substring(file.getName().lastIndexOf(".") + 1).equals("class"))
            ) {                
                System.out.printf("'%s' ", file.getName());
            }
        }
        System.out.print("]\n: ");
    }
    //
    void writeTo(String fileName, String text) {
        try (FileWriter fwriter = new FileWriter(fileName)) {
            fwriter.write(text);
        }
        catch(IOException e) {
            logr.log(Level.SEVERE, "Error writing to file.", e);            
        }
    }
    //
}
/**
 * Log data out
 */
class Logr {
    //
    public static Logger setup(String name) {
        Logger logr = Logger.getLogger(name);
        logr.setUseParentHandlers(false);
        logr.setLevel(Level.ALL);        
        
        try {
            FileHandler fh = new FileHandler( name + ".log" );
            fh.setLevel(Level.INFO);
            logr.addHandler(fh);           
        }
        catch(IOException e) {
            ConsoleHandler ch = new ConsoleHandler();
            ch.setLevel(Level.INFO);
            logr.addHandler(ch);
            logr.info("Couldn't setup file logger.");    
        }

        return logr;        
    }
    //
}
