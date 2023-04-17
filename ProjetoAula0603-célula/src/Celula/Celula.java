package Celula;

public class Celula <t> {
    private Celula<t> proxima;
    private Object elemento;

    public Celula(Celula<t> celula, Object elemento){
        this.proxima = celula;
        this.elemento = elemento;
    }
    public Celula(Object elemento){
        this.elemento = elemento;
    }
    public Celula<t> getProxima() {
        return proxima;
    }
    public Object getElemento() {
        return elemento;
    }
    public void setProxima(Celula<t> proxima) {
        this.proxima = proxima;
    }

}
