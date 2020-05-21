package app.lib;

public interface Poligono {

    /**
     * Retorna a area do poligono
     */
    public double area();
    /**
     * Retorna o perimentro do poligono
     */
    public double perimetro();

    /**
     * Mostra todas as infos(Area, perimetro, filled e cor) do poligono
     */
    public void showInfos();
}