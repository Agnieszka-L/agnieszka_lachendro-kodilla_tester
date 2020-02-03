public class SimpleArray {
    public static void main(String[] args){
        String [] names = new String [5];
        names[0] = "Ania";
        names[1] = "Basia";
        names[2] = "Kasia";
        names[3] = "Zosia";
        names[4] = "Krysia";

        String name = names[3];
        System.out.println("name = " + name);

        int numbersOfElements = names.length;
        System.out.println("Moja tablica zawiera " + numbersOfElements + " elementów.");

        for (int i = 0; i < names.length; i ++){
            System.out.println(names[i]);
        }

        for (int i = names.length - 1; i >= 0; i--){
            System.out.println(names[i]);
        }
    }

}
