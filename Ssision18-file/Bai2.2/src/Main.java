import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập file nguồn :");
        String source = scanner.nextLine();
        System.out.println("nhập file đích :");
        String target = scanner.nextLine();

        File sourceFile = new File(source);
        File targerFile = new File(target);

        try {
            copyFileUsingStream(sourceFile, targerFile);
            System.out.println(" copy file hoàn thành");
        } catch (IOException ioe) {
            System.out.println("không thể copy");
            System.out.println(ioe.getMessage());
        }
    }



    private static void copyFileUsingStream(File sourceFile, File targerFile) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(sourceFile);
            os = new FileOutputStream(targerFile);

            byte[] buffer = new byte[1024];
            int length;
            while( (length = is.read(buffer))>0){
                os.write(buffer,0,length);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            is.close();
            os.close();
        }
    }
}