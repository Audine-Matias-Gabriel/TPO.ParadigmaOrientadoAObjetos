public class Main {
    public static void main(String[] args) {

        BolsaChica bolsaChica1 = new BolsaChica("Pedro", true, true, false);

        bolsaChica1.getEstado().setTerminado(true);

        System.out.println(bolsaChica1.getPersona());
        System.out.println(bolsaChica1.getPrecio());
        System.out.println(bolsaChica1.getEstado().getTerminado());
    }
}