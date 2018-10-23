public class Lingkaran implements BangunDatar {

    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungKeliling() {
        return 2*Math.PI*r;
    }

    @Override
    public double hitungLuas() {
        return Math.PI*(r*r);
    }
}
