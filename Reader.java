package Tests;

import java.io.*;
public class Reader {
    // Fields
    private File file;
    private BufferedReader br;
    private String contents;

    public Reader(String filename) throws FileNotFoundException {
        this.file = new File(filename);
        this.br = new BufferedReader(new FileReader(file));
    }

    /* Create a class method called read() that reads the file using
    * the BufferedReader created in the constructor that stores it in contents
     * and returns the all the contents field. Remember to check if
    * the file has been already read. HINT: Use StringBuilder OR
    * concatenation of the field contents along with
     * a "\n" at the end. Ex contents += ______ + "\n"; OR
     * a "\n" at the end. Ex contents += ______ + "\n"; OR
     * var.append(_____ + "\n")*/
    public String read() {
        try {
            if (this.contents != null) {
                String line = "";
                while((line = this.br.readLine()) != null) {
                  this.contents += line + "\n";  
                } 
                this.br.close();
            }
            return this.contents;
            
        } catch (Exception e) {}
        return this.contents;
    }
    /* Create a method called readAsArray that returns an array that in
     * each index has a line of the file. HINT: use the split() method */
    public String[] readAsArray() {
        if (this.contents != null) {
            return this.contents.split("\n");   
        } else {
            read();
            return this.contents.split("\n");
        }
    }

    /* cratea method that returns the number of letters in the contents
    * read from the file. HINT use Character.isLetter(char c) */
    public int countLetters() {
        int count = 0;
        for (int i = 0; i < this.contents.length(); i++) {
            if (Character.isLetter(this.contents.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try {
        Reader r = new Reader("yes.txt");
        System.out.println(r.read());
        for (String e : r.readAsArray()) {
            System.out.println(e);
        }
        System.out.println(r.countLetters());
            
        }catch(Exception e) {}
    }
}
