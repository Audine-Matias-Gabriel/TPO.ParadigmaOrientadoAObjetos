import java.time.MonthDay;

public class BolsaGrande extends Bolsa {
    public BolsaGrande(String per, boolean lavar, boolean secar, boolean planchar) {
        this.fecha = MonthDay.now();
        this.persona = per;
        this.estado = new Estado(lavar, secar, planchar);
        this.precio = this.setPrecio();
    }

    @Override
    public int setPrecio() {
        //El precio no refleja el real, simplemente me olvide de preguntar
        int pre = 0;
        if (this.estado.getLavar()) {
            pre = pre + 1000;
        }
        if (this.estado.getSecar()) {
            pre = pre + 1000;
        }
        if (this.estado.getPlanchar()) {
            pre = pre + 500;
        }
        return pre;
    }
}
