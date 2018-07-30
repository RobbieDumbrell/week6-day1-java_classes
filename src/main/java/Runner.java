public class Runner {
    public static void main(String[] args) {

//        Calculator my_calc = new Calculator();
//        System.out.println(my_calc.add(1, 4));
//        System.out.println(my_calc.subtract(1, 4));
//        System.out.println(my_calc.multiply(1, 4));
//        System.out.println(my_calc.divide(1, 4));

//
//        WaterBottle bottle = new WaterBottle();
//        bottle.drink();
//        bottle.drink();
//        bottle.drink();
//        System.out.println(bottle.getVolume());
//        bottle.empty();
//        System.out.println(bottle.getVolume());
//        bottle.fill();
//        System.out.println(bottle.getVolume());

        Printer my_printer = new Printer(100, 200);
        my_printer.print(49, 2);
        System.out.println(my_printer.getPapersheets());
        my_printer.refill(50);
        System.out.println(my_printer.getPapersheets());
        System.out.println(my_printer.getTonervolume());



    }
}
