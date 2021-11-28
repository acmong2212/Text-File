package copy_file_text;

import java.io.IOException;
import java.util.List;

public class Run {
    public static void main(String[] args) throws IOException {
        Test test = new Test();
        List<String> strings = test.readFile("D:\\Module 2\\IO-TextFile\\src\\copy_file_text\\source.txt");
        test.writeFile(strings,"D:\\Module 2\\IO-TextFile\\src\\copy_file_text\\target.txt");
    }
}
