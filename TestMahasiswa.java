public class TestMahasiswa {
public static void main(String[] args) {
    Mahasiswa mhs1=new Mahasiswa();
    mhs1.nim=101;
    mhs1.nama="Lestari";
    mhs1.Alamat="JL. Vinolia No 1A";
    mhs1.kelas="1A";
    mhs1.tampilBiodata();

    mhs1.nim=988;
    mhs1.nama="Xavier";
    mhs1.Alamat="JL. Simpang Sulfat Utara";
    mhs1.kelas="1i";
    mhs1.tampilBiodata();

    mhs1.nim=321;
    mhs1.nama="Rafa";
    mhs1.Alamat="JL. Batubara";
    mhs1.kelas="1B";
    mhs1.tampilBiodata();

}
}