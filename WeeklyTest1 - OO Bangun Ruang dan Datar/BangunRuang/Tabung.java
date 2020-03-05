package BangunRuang;

public class Tabung extends BangunRuang{
    private int tinggi, jarijari;
    private double volumet, luasPermukaan;
    
    public void setTinggi(int t){
      this.tinggi=t;
    }
    public void setJari(int r){
      this.jarijari=r;
    }
    public void hitungVolume()
    {
        volumet =  Math.PI * Math.pow(jarijari, 2) * tinggi;
        System.out.println("Volume Tabung: "+volumet);
    }
    public void setLuasPermukaan()
    {
        luasPermukaan = 2 * Math.PI * jarijari * (jarijari + tinggi);
    }
    public int getJariJari()
    {
        return jarijari;
    }
    public int getTinggi()
    {
        return tinggi;
    }
    public double getVolume()
    {
        return volumet;
    }
    public double getLuasPermukaan()
    {
        return luasPermukaan;
    }
}
