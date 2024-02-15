public class TimSoLonNhat {
    public static int timSoLonNhatTrongMang(int[] mang) {
        if (mang.length == 0) {
            throw new IllegalArgumentException("Mảng không có phần tử. Không thể tìm số lớn nhất.");
        }

        int soLonNhat = mang[0];
        for (int i = 1; i < mang.length; i++) {
            if (mang[i] > soLonNhat) {
                soLonNhat = mang[i];
            }
        }

        return soLonNhat;
    }
}
