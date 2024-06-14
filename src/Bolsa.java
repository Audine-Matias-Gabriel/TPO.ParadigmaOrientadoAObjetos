import java.time.MonthDay;

public abstract class Bolsa {
    protected int precio;
    protected String persona;
    protected MonthDay fecha;
    protected Estado estado;

    public abstract int setPrecio();

    public int getPrecio() {
        return this.precio;
    }
    public Estado getEstado() {
        return this.estado;
    }
    public String getPersona() {
        return this.persona;
    }
}
