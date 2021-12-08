public class SumarIva {

    public static void main(String[] args) {

        float precio = 19.99f;
        int iva = 21;
        float precioConIva = addIva(precio, iva);
        System.out.println(precioConIva);

    }

    static float addIva(float precio, int iva){
        float conIva = precio + (precio * iva / 100);
        return conIva;
    }
}
