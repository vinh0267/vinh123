import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Lấy ngày giờ hiện tại của hệ thống
        LocalDateTime systemDateTime = LocalDateTime.now();
        System.out.println("Ngày giờ hiện tại của hệ thống: " + systemDateTime);

        // Lấy ngày giờ theo múi giờ Asia/Tokyo
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        LocalDateTime tokyoDateTime = LocalDateTime.now(tokyoZone);
        System.out.println("Ngày giờ hiện tại ở Tokyo: " + tokyoDateTime);

        // Lấy ngày giờ theo múi giờ Australia/Sydney
        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        LocalDateTime sydneyDateTime = LocalDateTime.now(sydneyZone);
        System.out.println("Ngày giờ hiện tại ở Sydney: " + sydneyDateTime);

        // Lấy ngày giờ theo múi giờ America/Sao_Paulo
        ZoneId SaopaoloZoneId = ZoneId.of("America/Sao_Paulo");
        LocalDateTime SaopaolodateTime = LocalDateTime.now(sydneyZone);
        System.out.println("Ngày giờ hiện tại ở Sao_Paolo : " + SaopaolodateTime);



    }
}


