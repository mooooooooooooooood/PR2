package PR2.tut10.ex4;

import PR2.tut10.ex4.IOFile;

public class IOFileTest {
    public static void main(String[] args) {
        IOFile ioFile = new IOFile("src/PR2/tut10/ex4/file.txt");

        int linesCount = ioFile.countLines();
        System.out.println("Number of lines in the file: " + linesCount);

        System.out.println("Content of the file:");
        ioFile.write(System.out);
        System.out.println();

        System.out.println("Printing the content of the file:");
        ioFile.print();
        System.out.println();

        ioFile.copy("src/PR2/tut10/ex4/file_copy.txt");
        System.out.println("Content copied to file_copy.txt");

    }
}

