public class Estado {
    private boolean lavar = false;
    private boolean secar = false;
    private boolean planchar = false;
    private boolean terminado = false;

    public Estado(boolean Lavar, boolean secar, boolean planchar) {
        this.lavar = Lavar;
        this.secar = secar;
        this.planchar = planchar;
    }

    public void setTerminado(boolean a) {
        this.terminado = a;
    }
    public boolean getLavar() {
        return this.lavar;
    }

    public boolean getSecar() {
        return this.secar;
    }

    public boolean getPlanchar() {
        return this.planchar;
    }
    public boolean getTerminado() {
        return this.terminado;
    }
}
