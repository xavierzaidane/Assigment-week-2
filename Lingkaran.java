public class Lingkaran {
    public double phi = 3.14;  
    public double r;           


    public Lingkaran(double r) {
        this.r = r;
    }


    public double hitungLuas() {
        return phi * r * r;  
    }


    public double hitungKeliling() {
        return 2 * phi * r;  
    }
}
