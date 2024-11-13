package PR2.tut10.ex4;

import java.io.*;

public class IOFile {
    private String filename;
    // Constructor
    public IOFile(String filename) {
        this.filename = filename;
    }

    //getter& setter

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    // Method to count the number of lines in the file
    public int countLines() {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while (reader.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    // Method to write the content of the file to an OutputStream
    public void write(OutputStream os) {
        try (InputStream is = new FileInputStream(filename)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to print the content of the file to the screen
    public void print() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to copy the content of the file to another file
    public void copy(String newFilename) {
        try (InputStream is = new FileInputStream(filename);
             OutputStream os = new FileOutputStream(newFilename)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to delete the file
    public void delete() {
        File file = new File(filename);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully: " + filename);
            } else {
                System.out.println("Failed to delete the file: " + filename);
            }
        } else {
            System.out.println("File does not exist: " + filename);
        }
    }
}

