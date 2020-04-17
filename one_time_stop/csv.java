import java.io.*;
import java.util.ArrayList;

//Yes I name it database, because it's the the rigth name, I no longer gives a fuck what you think.
//therefore put your opinion in your own ass, thank you,
// best regards Saber.
public class Database {

    public static void main(String[] args) {
        String[] headers = {"id", "username", "password"};
        String[] data = {"0", "Saber0", "password"};
        try {
            writeNewFile("admins", headers);
            addRecord("admins", data);
            for (int i = 1; i < 10; i++) {
                String id =  String.valueOf((Integer.parseInt(getLastId("admins")) +  1));
                String[] x = {id, "Saber" + i , "password"};
                addRecord("admins", x);
            }
            deleteRecord("admins", "4");
            deleteRecord("admins", "8");
        }catch (Exception e){}
    }

    public static void writeNewFile(String fileName, String[] headers) throws IOException {
        FileWriter fw = new FileWriter(fileName + ".csv");

        for (String header : headers) {
            fw.append(header);
            if (! headers[headers.length - 1 ].equals(header)){
                fw.append(",");
            }else fw.append("\n");
        }
        fw.flush();
        fw.close();
    }

    public static void addRecord(String fileName, String[] fields) throws IOException {
        FileWriter fw = new FileWriter(fileName + ".csv", true);

        for (String field : fields) {
            fw.append(field);
            if (! fields[fields.length - 1 ].equals(field)){
                fw.append(",");
            }else fw.append("\n");
        }
        fw.flush();
        fw.close();
    }

    public static ArrayList<String[]> readData(String fileName) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader(fileName + ".csv"));
        ArrayList<String[]> data = new ArrayList<>();
        String row = "";
        while ((row = fr.readLine()) != null) {

            String[] rowdata = row.split(",");
            data.add(rowdata);
        }
        fr.close();
        return data;
    }

    public static String getLastId(String fileName) throws IOException {
        ArrayList<String[]> data = readData(fileName);
        return data.get(data.size() - 1)[0];
    }

    public static boolean deleteRecord(String fileName, String id) throws IOException{
        File inputFile = new File(fileName + ".csv");
        File tempFile = new File("temp.csv");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String lineToRemove = "bbb";
        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            String[] data = currentLine.split(",");
            if (data[0].equals(id)){
                lineToRemove = currentLine;
                String trimmedLine = currentLine.trim();
                if(trimmedLine.equals(lineToRemove)) continue;
            }
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        if (inputFile.delete()){
            tempFile.renameTo(new File(fileName + ".csv"));
            return true;
        }else {
            return false;
        }

    }

}
