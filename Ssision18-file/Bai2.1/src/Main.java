import java.io.*;
import java.util.Scanner;

import static jdk.jpackage.internal.IOUtils.copyFile;

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
            sourceFileUsing(sourceFile, targerFile);
            System.out.println("copy file thành công ");
        } catch (Exception e) {
            System.out.println("không hoàn thành ");
            throw new RuntimeException(e);
        }
    }

    //phthuq copy
    private static void sourceFileUsing(File sourceFile, File targerFile) throws IOException {
        InputStream is = null; //
        OutputStream os = null;
        //Khai báo và khởi tạo biến is và os để lưu trữ luồng đầu vào và
        // luồng đầu ra tương ứng. Ban đầu, chúng được gán giá trị null.
        try {
            //Mở luồng đầu vào (is) và luồng đầu ra (os) bằng cách tạo FileInputStream
            // và FileOutputStream với các tệp nguồn và đích tương ứng.
            is = new FileInputStream(sourceFile);
            os = new FileOutputStream(targerFile);
            byte[] buffer = new byte[1024];
            //Khai báo một mảng byte (buffer) với kích thước 1024 byte.
            // Đây là kích thước của buffer sẽ được sử dụng để sao chép dữ liệu.
            int length;
            // Khai báo biến length để lưu trữ số byte đã đọc vào buffer trong mỗi lần đọc từ luồng đầu vào.

            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            is.close();
            os.close();
        }
    }
}