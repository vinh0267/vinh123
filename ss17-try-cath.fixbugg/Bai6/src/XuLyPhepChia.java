public class XuLyPhepChia {
    public static int thucHienPhepChia(int soChia, int soBiChia) throws IllegalArgumentException {
        if (soBiChia == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0.");
        }

        return soChia / soBiChia;
    }
}
