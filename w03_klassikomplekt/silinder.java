class silinder{
    double pikkus, raadius;
    public silinder(double upikkus, double uraadius){
        this.pikkus=upikkus; this.raadius=uraadius;
    }
    public double KysiPohjaPindala(){
        return Math.PI*raadius*raadius;
    }
    public double KysiKorgus(){
        return pikkus;
    }
    public double PohjaYmbermoot(){
        return Math.PI*raadius*2;
    }
    public double KyljePindala(){
        return PohjaYmbermoot()*pikkus;
    }
}