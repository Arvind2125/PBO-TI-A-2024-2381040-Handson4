public class ContohOverloading {
    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    public static double hitungLuas(double panjang ,double lebar) {
        return panjang * lebar;
    }

    public static double hitungLuas(double jarijari ,double isiLingkaran) {
        if (isiLingkaran) {
            return Math.PI * jarijari * jarijari;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double luasPersegi = hitungLuas(5);
        System.out.println("Luas Persegi : " + luasPersegiPanjang);

        double luasLingkaran = hitungLuas(4, true);
        System.out.println("Luas persegi panjang : " + luasPersegiPanjang);

        double luasLingkaran = hitungLuas(4,true);
        System.out.println("Luas Lingkaran : " + luasLingkaran);
    }
}
