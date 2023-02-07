public class Ejercicio4 {

    public static void main(String[] args) {

        // creación de un nuevo objeto SmartPhone
        SmartPhone iphone8 = new SmartPhone();

        // llamada a los métodos para asignación de valores. Encapsulación
        iphone8.setFabricante("Apple");
        iphone8.setMarca("Iphone");
        iphone8.setModelo("8 Plus");

        // actualizar método de esta clase hija.
        iphone8.setDualSim(true);

        // creación nuevo objeto SmartWatch
        SmartWatch iWatch3 = new SmartWatch();

        // llamada a los métodos para asignación de valores. Encapsulación
        iWatch3.setFabricante("Apple");
        iWatch3.setModelo("iWatch Serie 3");

        // actualizar método de esta clase hija.
        iWatch3.setPhone(true);

        System.out.println("Fabricante:" + iphone8.getFabricante());
        System.out.println("Marca:" + iphone8.getMarca());
        System.out.println("Modelo:" + iphone8.getModelo());
        System.out.println("¿Es dual Sim?:" + iphone8.isDualSim());

        System.out.println("Fabricante:" + iWatch3.getFabricante());
        System.out.println("Modelo:" + iWatch3.getModelo());
        System.out.println("¿Es teléfono?:" + iWatch3.isPhone());


    }


}