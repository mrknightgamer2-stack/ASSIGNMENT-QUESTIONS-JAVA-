import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Filehandling {
    public static void main(String[] args) {
        String filepath="C:\\Users\\rizwa\\Desktop\\joke.txt";
        String text="Leader: Okay guys, project deadline kal hai.\nStudent 1: No problem, main font change kar dunga.\nStudent 2: Main cover page ka color badal dunga.\nStudent 3 (Me): Main... main dua karunga ke prof check na kare.";
        try(FileWriter writer= new FileWriter(filepath)) {
            writer.write(text);
            System.out.println("FILE HAS BEEN WRIITEN");
        } 
        catch(FileNotFoundException w){
            System.out.println("Could not find file. Look at your path.");
        }
        catch (IOException e) {
            System.out.println("Could not write file.");
        }
        
    }
}
