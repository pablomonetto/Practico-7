package Clase_7;

public class DescuentoFijo extends Descuento {
    @Override 
    public float valorFinal (float valorInicial) {
            return valorInicial - this.getDesc();
    }
    
}
