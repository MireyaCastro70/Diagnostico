public class Avion {
    private String modelo;
    private int noPasajeros;
    public Avion(){
        this.modelo ="Desconocido";
        this.noPasajeros= 0;
    }
    public Avion(String modelo, int noPasajeros){
        this.modelo = modelo;
        this.noPasajeros= noPasajeros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNoPasajeros() {
        return noPasajeros;
    }

    public void setNoPasajeros(int noPasajeros) {
        this.noPasajeros = noPasajeros;
    }
    public void Despegar(){
        System.out.println("Despegando...");
    }
    public void Aterrizar(){
        System.out.println("Aterrizando...");
    }
}
