public class MataKuliah {
    private String nama;
    private String kode;

    public MataKuliah(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    @Override
    public String toString() {
        return "MataKuliah{" +
                "nama='" + nama + '\'' +
                ", kode='" + kode + '\'' +
                '}';
    }
}
