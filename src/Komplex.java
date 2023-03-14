public class Komplex{
    private double rea;
    private double ima;

    public Komplex(double rea, double ima) {
        this.rea = rea;
        this.ima = ima;
    }

    @Override
    public String toString() {
        if (this.ima > 0){
            return rea + " + " + ima + 'i';
        }else return rea + " " + ima + 'i';

    }

    public Komplex add(Komplex b) {
        return new Komplex(this.rea + b.rea, this.ima + b.ima);
    }

    public Komplex multiply(Komplex b) {
        return new Komplex(this.rea * b.rea - this.ima * b.ima,this.ima * b.rea + this.rea * b.ima);
    }

    public double arg() {
        return  Math.atan(this.ima / this.rea);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this.getClass() != obj.getClass())return false;
        if (this.rea == ((Komplex) obj).rea && this.ima == ((Komplex) obj).ima)return true;
        else return false;
    }
}