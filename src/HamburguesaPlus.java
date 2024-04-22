public class HamburguesaPlus extends Hamburguesa {
    private Medallon medallon1;
    private Medallon medallon2;
    private Medallon medallon3;

    private Ingrediente ingrediente;

    public void setMedallon(Medallon medallon1, Medallon medallon2, Medallon medallon3) {
        this.medallon1 = medallon1;
        this.medallon2 = medallon2;
        this.medallon3 = medallon3;

    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getPrecioTotal(){
        return this.precioBase + this.medallon1.getPrecioMedallon() + this.medallon2.getPrecioMedallon() + this.medallon3.getPrecioMedallon() + this.ingrediente.getValorIngrediente();
    }
}