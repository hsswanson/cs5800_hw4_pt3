//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("CS5800_hw4_pt3"));
    Ship[] ships = new Ship[3];
    ships[0] = new Ship("SHIP_NAME", "DEFAULT_YEAR");
    ships[1] = new CargoShip("Honest cargo ship", "1995", 2000);
    ships[2] = new CruiseShip("Pleasure Cruise", "2020",100);

    for (Ship ship : ships) {
        ship.print();
    }

}
