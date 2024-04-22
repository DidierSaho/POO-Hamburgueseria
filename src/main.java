public class main {
    public static void main(String[] args) {
    //Hamburguesa simple
    HamburguesaSimple simple = new HamburguesaSimple();
    simple.setPrecioBase(1000);

    Medallon pollo = new Medallon();
    pollo.precioMedallon(1000);

    Ingrediente cheddar = new Ingrediente();
    cheddar.setValorIngrediente(500);

    simple.setMedallon(pollo);
    simple.setIngrediente(cheddar);

    System.out.println("Hamburguesa simple: " + simple.getPrecioTotal());

    // Hamburguesa doble

    HamburguesaDoble doble = new HamburguesaDoble();
    doble.setPrecioBase(2000);

    Medallon carne = new Medallon();
    carne.precioMedallon(1500);


    Ingrediente tomate = new Ingrediente();
    tomate.setValorIngrediente(500);

    doble.setMedallon(pollo, carne);
    doble.setIngrediente(tomate);

    System.out.println("Hamburguesa doble: " +doble.getPrecioTotal());


    // Hamburguesa plus o triple.
    HamburguesaPlus plus = new HamburguesaPlus();
    plus.setPrecioBase(3000);

    Medallon vegano = new Medallon();
    vegano.precioMedallon(100);

    plus.setMedallon(pollo, carne, vegano);
    plus.setIngrediente(tomate);

    System.out.println("Hamburguesa plus: " +plus.getPrecioTotal());



    }
}
