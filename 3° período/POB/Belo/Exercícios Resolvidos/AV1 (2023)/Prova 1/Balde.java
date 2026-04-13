public class Balde
{
    private double volumeTotal;
    private double volumeAtual;
    
    public Balde(double vt)
    {
        volumeAtual = 0;
        volumeTotal = vt;
    }
    
    public double getVolume(){
        return volumeAtual;
    }
    
    public double encher(double vol)
    {
        double volumeExcedido = 0;
        
        if((volumeAtual + vol) < volumeTotal)
        {
            volumeAtual = volumeAtual + vol;
        }
        else
        {
            volumeExcedido = volumeTotal - (volumeAtual + vol);
            volumeAtual = volumeTotal;
        }
        
        return volumeExcedido;
    }
    
    public double verter(double vol)
    {
        double volumeVertido;
        
        if(volumeAtual - vol > 0)
        {
            volumeVertido = volumeAtual - vol;
        }
        else
        {
            volumeAtual = 0;
            volumeVertido = volumeTotal;
        }
        
        return volumeVertido;
    }
}