public class HamburguesaSimple extends Hamburguesa{ // usar herencia, tipo de dato protected . Una clase abstracta es cuando se genera una misma clase sin instancia.

    private Medallon medallon;
    private Ingrediente ingrediente;

    public void setMedallon(Medallon medallon) {
        this.medallon = medallon;
    }
    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
    public int getPrecioTotal() {
        return this.precioBase + this.medallon.getPrecioMedallon() + this.ingrediente.getValorIngrediente();
    }
}
