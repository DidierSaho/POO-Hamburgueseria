public class HamburguesaDoble extends Hamburguesa{
    private Medallon medallon1;
    private Medallon medallon2;

    private Ingrediente ingrediente;

    public void setMedallon(Medallon medallon1, Medallon medallon2) {
        this.medallon1 = medallon1;
        this.medallon2 = medallon2;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
    public int getPrecioTotal(){
        return precioBase + this.medallon1.getPrecioMedallon() + this.medallon2.getPrecioMedallon() + this.ingrediente.getValorIngrediente();
    }
}
