class risttahukas{
    double pikkus, laius, korgus;
    public risttahukas(double upikkus, double ulaius, double ukorgus){
        this.pikkus=upikkus; this.laius=ulaius; this.korgus=ukorgus;
    }
    public double KysiPohjaPindala(){
        return pikkus*laius;
    }
    public double KysiKorgus(){
        return korgus;
    }
    public double PohjaYmbermoot(){
        return (2*pikkus)+(2*laius);
    }
    public double KyljePindala(){
        return PohjaYmbermoot()*korgus;
    }
    public double Ruumala(){
        return KysiPohjaPindala()*korgus;
    }
} 