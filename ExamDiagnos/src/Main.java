public class Main {
    public static void main(String[] args) {
        Aeroplano aeroplano1 = new Aeroplano();
        aeroplano1.Despegar();
        aeroplano1.Aterrizar();

        Avioneta avioneta = new Avioneta();
        avioneta.volar();
        avioneta.Aterrizar();
        avioneta.Despegar();
    }
}
