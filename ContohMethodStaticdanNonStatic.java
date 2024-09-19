public class ContohMethodStaticdanNonStatic {
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        double luasPersegi = ContohMethodStaticdanNonStatic.hitungLuasPersegi(20);
        System.out.println("Luas Persegi : " + luasPersegi);

        ContohMethodStaticdanNonStatic object = new ContohMethodStaticdanNonStatic();
        object.tampilkanPesanSelamatDatang("Arvind Simanjuntak");
    }

    public void tampilkanPesanSelamatDatang(String nama) {
        System.out.println("Selamat datang, " + nama + " !");

    }
}
