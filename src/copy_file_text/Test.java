package copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public List<String> readFile(String filePath) throws IOException {
        List<String> strings = new ArrayList<>();

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return strings;
    }

    public void writeFile(List<String> strings,String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String p : strings) {
                System.out.println(p);
                bufferedWriter.write(p);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
