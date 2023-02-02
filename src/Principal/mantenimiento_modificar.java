package Principal;

public class mantenimiento_modificar {
    
    private static String marca_0 = "Rellenitas";
    private static double precio_0 = 18;
    private static int cantidad_0 = 12;
    private static double peso_0 = 612;
    private static String sabor_0 = "Chocolate";

//    **********************************************
    private static String marca_1 = "Oreo";
    private static double precio_1 = 30;
    private static int cantidad_1 = 24;
    private static double peso_1 = 1320;
    private static String sabor_1 = "Fresa";
//    **********************************************
    private static String marca_2 = "Casino";
    private static double precio_2 = 16.8;
    private static int cantidad_2 = 12;
    private static double peso_2 = 720;
    private static String sabor_2 = "Vainilla";
//    **********************************************
    private static String marca_3 = "Picaras";
    private static double precio_3 = 32.4;
    private static int cantidad_3 = 24;
    private static double peso_3 = 1250;
    private static String sabor_3 = "Menta";
//    **********************************************
    private static String marca_4 = "Glacitas";
    private static double precio_4 = 19.2;
    private static int cantidad_4 = 12;
    private static double peso_4 = 780;
    private static String sabor_4 = "Avena";
//    **********************************************
    /*
    
     */
    //**********************************************
    private static double porcentaje_1 = 0.01;
    private static double porcentaje_2 = 0.02;
    private static double porcentaje_3 = 0.03;
    private static double porcentaje_4 = 0.04;
    /*
   // 
    Inicializacion de los porcentajes con valores predeterminados.
     */
    private static int cantidadOptima = 40;
    /*
    Valores de cantidad optima
     */
 /*
   valores de primo sorpresa
     */
    private static int numeroClienteSorpresa = 5;
    private static String premioSorpresa = "Un polo";
    /*
    Valores de obsequio
     */
    private static int importeMinimoObsequio = 18;
    private static String obsequio = "Billetera";
    /*
    Contador de clientes en el dia
     */
    private static int cliente_dia = 0;
    /*
    ---------------------------------------------------------------
     */
    private static String marca_auxiliar = "";
    /*
     ---------------------------------------------------------------
     */
    private static String venta_marca_0 = "";
    private static String venta_marca_1 = "";
    private static String venta_marca_2 = "";
    private static String venta_marca_3 = "";
    private static String venta_marca_4 = "";
    //--------------------------------------------------------------
    private static int cont_1 = 0;
    private static int cont_2 = 0;
    private static int cont_3 = 0;
    private static int cont_4 = 0;
    private static int cont_5 = 0;
    //-------------------------------------------------------------
    private static int cantidad_unidades_1 = 0;
    private static int cantidad_unidades_2 = 0;
    private static int cantidad_unidades_3 = 0;
    private static int cantidad_unidades_4 = 0;
    private static int cantidad_unidades_5 = 0;
    //------------------------------------------------------------
    private static int total_1 = 0;
    private static int total_2 = 0;
    private static int total_3 = 0;
    private static int total_4 = 0;
    private static int total_5 = 0;
    //-----------------------------------------------------------
    private static int total_general = 0;
    private static int cantidad_ventas_general = 0;
    //----------------------------------------------------------
    private static String venta_optima_general = "";
    private static String cadena = ""; // acumulamos la cadena _ generar reportes 1
    public static String cadenita_1="";
   

    public mantenimiento_modificar(){
    }
    
    public mantenimiento_modificar(String opcion, double precio_, double peso_, int cantidad_, String sabor_) {
        if (opcion.equals("Rellenitas")) {
            precio_0 = precio_; // graba el dato ingresado // 20
            cantidad_0 = cantidad_;
            peso_0 = peso_;
            sabor_0 = sabor_;
        }
        if (opcion.equals("Oreo")) {
            precio_1 = precio_;
            cantidad_1 = cantidad_;
            peso_1 = peso_;
            sabor_1 = sabor_;
        }
        if (opcion.equals("Casino")) {
            precio_2 = precio_;
            cantidad_2 = cantidad_;
            peso_2 = peso_;
            sabor_2 = sabor_;
        }
        if (opcion.equals("Picaras")) {
            precio_3 = precio_;
            cantidad_3 = cantidad_;
            peso_3 = peso_;
            sabor_3 = sabor_;
        }
        if (opcion.equals("Glacitas")) {
            precio_4 = precio_;
            cantidad_4 = cantidad_;         
            peso_4 = peso_;
            sabor_4 = sabor_;
        }
    }

        public String  listarDatos() { 
        String cadena = "";
        cadena = "Marca: " + "Dia" + "\n" + "Precio: " + precio_0 + "\n" + "Cantidad: " + cantidad_0 + "\n" + "Peso: " + peso_0 + "\n" + "Sabor: " + sabor_0 + "\n"
                + "\nMarca: " + "Rellenitas" + "\n" + "Precio: " + precio_1 + "\n" + "Cantidad: " + cantidad_1 + "\n" + "Peso: " + peso_1 + "\n" + "Sabor: " + sabor_1 + "\n"
                + "\nMarca: " + "Oreo" + "\n" + "Precio: " + precio_2 + "\n" + "Cantidad: " + cantidad_2 + "\n" + "Peso: " + peso_2 + "\n" + "Sabor: " + sabor_2 + "\n"
                + "\nMarca: " + "Casino" + "\n" + "Precio: " + precio_3 + "\n" + "Cantidad: " + cantidad_3 + "\n" + "Peso: " + peso_3 + "\n" + "Sabor: " + sabor_3 + "\n"
                + "\nMarca: " + "Glacitas" + "\n" + "Precio: " + precio_4 + "\n" + "Cantidad: " + cantidad_4 + "\n" + "Peso: " + peso_4 + "\n" + "Sabor: " + sabor_4 + "\n";
        return cadena;
    }

    public double precioAlfajor(String marca) {
        double precio = 0;
        switch (marca) {
            case "Rellenitas":
                precio = precio_0;
                break;
            case "Oreo":
                precio = precio_1;
                break;
            case "Casino":
                precio = precio_2;
                break;
            case "Picaras":
                precio = precio_3;
                break;
            case "Glacitas":
                precio = precio_4;
                break;
        }
        return precio;
    }

    public double descuentos(int cantidad, double precio) {
        double descuento = 0, sub = 0;
        if (cantidad >= 1 && cantidad <= 5) {
            sub = precio * cantidad;
            descuento = sub * porcentaje_1;
        }

        if (cantidad >= 6 && cantidad <= 10) {
            sub = precio * cantidad;
            descuento = sub * porcentaje_2;
        }

        if (cantidad >= 11 && cantidad <= 15) {
            sub = precio * cantidad;
            descuento = sub * porcentaje_3;
        }
        if (cantidad > 15) {
            sub = precio * cantidad;
            descuento = sub * porcentaje_4;
        }
        return descuento;
    }

    public String obesquio_(int cantidad) {
        String cadena = "";
        if (cantidad >= importeMinimoObsequio) {
            cadena = obsequio;
        } else {
            cadena = "No hay obsequio";
        }
        return cadena;
    }

    public String premio(int cliente) {
        String cadena = "";
        if (cliente == numeroClienteSorpresa) {
            cadena = premioSorpresa;
        } else {
            cadena = "Sin premio";
        }
        return cadena;
    }

    public int incremento() {
        cliente_dia += 1;
        return cliente_dia;
    }

    public String venta_por_marca(String marca, int cantidad, double total) {
        String cadena = "";
        switch (marca) {                                                                                                                            
            case "Rellenitas":
                cont_1++;
                cantidad_unidades_1 += cantidad;
                total_1 += total; //100
                break;
            case "Oreo":
                cont_2++;
                cantidad_unidades_2 += cantidad;
                total_2 += total;
                break;
            case "Casino":
                cont_3++;
                cantidad_unidades_3 += cantidad;
                total_3 += total;
                break;
            case "Picaras":
                cont_4++;
                cantidad_unidades_4 += cantidad;
                total_4 += total;
                break;
            case "Glacitas":
                cont_5++;
                cantidad_unidades_5 += cantidad;
                total_5 += total;
                break;
        }
        total_general = (total_1 + total_2 + total_3 + total_4 + total_5);
        cantidad_ventas_general = (cont_1 + cont_2 + cont_3 + cont_4 + cont_5);
        cadena = "Venta de Yogurts: " + "\n\n"
                + "Nombre\t\t :" + "    Rellenitas" + "\n"
                + "Cantidad de ventas\t      :" + cont_1 + "\n"
                + "Cantidad total de unidades vendias :" + cantidad_unidades_1 + "\n"
                + "Importe total acumulado :" + total_1 + "\n\n"
                + //--------------------------------------------------------------------------------------------------------
                "Nombre\t\t :" + "    Oreo" + "\n"
                + "Cantidad de ventas\t      :" + cont_2 + "\n"
                + "Cantidad total de unidades vendias :" + cantidad_unidades_2 + "\n"
                + "Importe total acumulado :" + total_2 + "\n\n"
                + //------------------------------------------------------------------------------------------------------
                "Nombre\t\t :" + "    Casino" + "\n"
                + "Cantidad de ventas\t      :" + cont_3 + "\n"
                + "Cantidad total de unidades vendias :" + cantidad_unidades_3 + "\n"
                + "Importe total acumulado :" + total_3 + "\n\n"
                + //-------------------------------------------------------------------------------------------------------
                "Nombre\t\t :" + "    Picaras" + "\n"
                + "Cantidad de ventas\t      :" + cont_4 + "\n"
                + "Cantidad total de unidades vendias :" + cantidad_unidades_4 + "\n"
                + "Importe total acumulado :" + total_4 + "\n\n"
                + //------------------------------------------------------------------------------------------------------
                "Nombre\t\t :" + "    Glacitas" + "\n"
                + "Cantidad de ventas\t      :" + cont_5 + "\n"
                + "Cantidad total de unidades vendias :" + cantidad_unidades_5 + "\n"
                + "Importe total acumulado :" + total_5 + "\n\n"
                + //-------------------------------------------------------------------------------------------------------
                "****************************************************************" + "\n\n"
                + "Importe total general acumulado: " + total_general + "\n"
                + "Cantidad total general de ventas: " + cantidad_ventas_general + "\n";
        return cadena;
    }

    public String venta_optima() {
        String cadena_1 = "", cadena_2 = "", cadena_3 = "", cadena_4 = "", cadena_5 = "";
        String cadena_general = "";
        int resto_1 = 0, resto_2 = 0, resto_3 = 0, resto_4 = 0, resto_5 = 0, validar = 0;
        // Primera marca----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        if (cantidad_unidades_1 > cantidadOptima) {
            validar = 1;
            resto_1 = cantidad_unidades_1 - cantidadOptima;
            cadena_1 = "Marca: " + "\t\t" + ": Rellenitas" + "\n"
                    + "Cantidad total de unidades vendidas" + "\t" + " :" + cantidad_unidades_1 + "  (" + resto_1 + " mas que la cantidad optima)" + "\n\n";
        }
        // Segunda marca----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        if (cantidad_unidades_2 > cantidadOptima) {
            validar = 1;
            resto_2 = cantidad_unidades_2 - cantidadOptima;
            cadena_2 = "Marca: " + "\t\t" + ": Oreo" + "\n"
                    + "Cantidad total de unidades vendidas" + "\t" + " :" + cantidad_unidades_2 + "  (" + resto_2 + " mas que la cantidad optima)" + "\n\n";
        }
        // Tercera  marca----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        if (cantidad_unidades_3 > cantidadOptima) {
            validar = 1;
            resto_3 = cantidad_unidades_3 - cantidadOptima;
            cadena_3 = "Marca: " + "\t\t" + ": Casino" + "\n"
                    + "Cantidad total de unidades vendidas" + "\t" + " :" + cantidad_unidades_3 + "  (" + resto_3 + " mas que la cantidad optima)" + "\n\n";
        }
        // Cuarta  marca----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        if (cantidad_unidades_4 > cantidadOptima) {
            validar = 1;
            resto_4 = cantidad_unidades_4 - cantidadOptima;
            cadena_4 = "Marca: " + "\t\t" + ": Picaras" + "\n"
                    + "Cantidad total de unidades vendidas" + "\t" + " :" + cantidad_unidades_4 + "  (" + resto_4 + " mas que la cantidad optima)" + "\n\n";
        }
        // Quinta  marca----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        if (cantidad_unidades_5 > cantidadOptima) {
            validar = 1;
            resto_5 = cantidad_unidades_5 - cantidadOptima;
            cadena_5 = "Marca: " + "\t\t" + ": Glacitas" + "\n"
                    + "Cantidad total de unidades vendidas" + "\t" + " :" + cantidad_unidades_5 + "  (" + resto_5 + " mas que la cantidad optima)" + "\n\n";
        }
        // Fin  marca----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        if (validar == 0) {
            cadena_general = "No existen marcas con venta optima";
        } else {
            cadena_general = "Alfajores con venta optima" + "\n" + cadena_1 + cadena_2 + cadena_3 + cadena_4 + cadena_5;
        }
        return cadena_general;
    }

    public String relacion_promedio() {
        double promedio = 0;
        promedio = (precio_0 + precio_1 + precio_2 + precio_3 + precio_4) / 5;
        String cadena_1 = "", cadena_2 = "", cadena_3 = "", cadena_4 = "", cadena_5 = "";
        String cadena_general = "";
        // Primera marca ------------------------------------------------------------------------------------------
        if (precio_0 > promedio) {
            cadena_1 = "Nombre" + "\t" + ": Rellenitas" + "\n"
                    + "Precio" + "\t: " + precio_0 + " (mayor al promedio)" + "\n\n";
        } else if (precio_0 < promedio) {
            cadena_1 = "Nombre" + "\t" + ": Rellenitas" + "\n"
                    + "Precio" + "\t: " + precio_0 + " (menor al promedio)" + "\n\n";
        } else if (precio_0 == promedio) {
            cadena_1 = "Nombre" + "\t" + ": Rellenitas" + "\n"
                    + "Precio" + "\t: " + precio_0 + " (igual al promedio)" + "\n\n";
        }
        // Segunda  marca ------------------------------------------------------------------------------------------
        if (precio_1 > promedio) {
            cadena_2 = "Nombre" + "\t" + ": Oreo" + "\n"
                    + "Precio" + "\t: " + precio_1 + " (mayor al promedio)" + "\n\n";
        } else if (precio_1 < promedio) {
            cadena_2 = "Nombre" + "\t" + ": Oreo" + "\n"
                    + "Precio" + "\t: " + precio_1 + " (menor al promedio)" + "\n\n";
        } else if (precio_1 == promedio) {
            cadena_2 = "Nombre" + "\t" + ": Oreo" + "\n"
                    + "Precio" + "\t: " + precio_1 + " (igual al promedio)" + "\n\n";
        }
        // Tercera  marca ------------------------------------------------------------------------------------------
        if (precio_2 > promedio) {
            cadena_3 = "Nombre" + "\t" + ": Casino" + "\n"
                    + "Precio" + "\t: " + precio_2 + " (mayor al promedio)" + "\n\n";
        } else if (precio_2 < promedio) {
            cadena_3 = "Nombre" + "\t" + ": Casino" + "\n"
                    + "Precio" + "\t: " + precio_2 + " (menor al promedio)" + "\n\n";
        } else if (precio_2 == promedio) {
            cadena_3 = "Nombre" + "\t" + ": Casino" + "\n"
                    + "Precio" + "\t: " + precio_2 + " (igual al promedio)" + "\n\n";
        }
        // Cuarta  marca ------------------------------------------------------------------------------------------
        if (precio_3 > promedio) {
            cadena_4 = "Nombre" + "\t" + ": Picaras" + "\n"
                    + "Precio" + "\t: " + precio_3 + " (mayor al promedio)" + "\n\n";
        } else if (precio_3 < promedio) {
            cadena_4 = "Nombre" + "\t" + ": Picaras" + "\n"
                    + "Precio" + "\t: " + precio_3 + " (menor al promedio)" + "\n\n";
        } else if (precio_3 == promedio) {
            cadena_4 = "Nombre" + "\t" + ": Picaras" + "\n"
                    + "Precio" + "\t: " + precio_3 + " (igual al promedio)" + "\n\n";
        }
        // Quinta  marca ------------------------------------------------------------------------------------------
        if (precio_4 > promedio) {
            cadena_5 = "Nombre" + "\t" + ": Glacitas" + "\n"
                    + "Precio" + "\t: " + precio_4 + " (mayor al promedio)" + "\n\n";
        } else if (precio_4 < promedio) {
            cadena_5 = "Nombre" + "\t" + ": Glacitas" + "\n"
                    + "Precio" + "\t: " + precio_4 + " (menor al promedio)" + "\n\n";
        } else if (precio_4 == promedio) {
            cadena_5 = "Nombre" + "\t" + ": Glacitas" + "\n"
                    + "Precio" + "\t: " + precio_4 + " (igual al promedio)" + "\n\n";
        }
        //fin marcas ---------------------------------------------------------------------------------------------
        cadena_general="Precios en relacion al promedio"+"\n\n"+cadena_1+cadena_2+cadena_3+cadena_4+cadena_5+
                                         "Precio promedio"+"\t:  "+" S/   "+String.format("%.2f", promedio);
        return cadena_general;
    }

    public String menor_mayor(){
        double promedio=0;
        String cadena_general="";
        String cadena_1="",cadena_2="",cadena_3="";
        promedio=(precio_0+precio_1+precio_2+precio_3+precio_4)/5;
        cadena_1="Precio promedio"+":"+"S/  "+String.format("%.2f", promedio);
        // cadena de mayor
        if(precio_0>precio_1 && precio_0>precio_2 && precio_0>precio_3 && precio_0>precio_4){
            cadena_2="Precio mayor"+"\t:"+"S/  "+String.format("%.2f", precio_0);
        }
        else if(precio_1>precio_0 && precio_1>precio_2 && precio_1>precio_3 && precio_1>precio_4){
            cadena_2="Precio mayor"+"\t:"+"S/  "+String.format("%.2f", precio_1);
        }
         else if(precio_2>precio_0 && precio_2>precio_1 && precio_2>precio_3 && precio_2>precio_4){
            cadena_2="Precio mayor"+"\t:"+"S/  "+String.format("%.2f", precio_2);
        }
        else if(precio_3>precio_0 && precio_3>precio_1 && precio_3>precio_2 && precio_3>precio_4){
            cadena_2="Precio mayor"+"\t:"+"S/  "+String.format("%.2f", precio_3);
        }
         else if(precio_4>precio_0 && precio_4>precio_1 && precio_4>precio_2 && precio_4>precio_3){
            cadena_2="Precio mayor"+"\t:"+"S/  "+String.format("%.2f", precio_4);
        }
        // cadena de menor
          if(precio_0<precio_1 && precio_0<precio_2 && precio_0<precio_3 && precio_0<precio_4){
            cadena_3="Precio menor"+"\t:"+"S/  "+String.format("%.2f", precio_0);
        }
        else if(precio_1<precio_0 && precio_1<precio_2 && precio_1<precio_3 && precio_1<precio_4){
            cadena_3="Precio menor"+"\t:"+"S/  "+String.format("%.2f", precio_1);
        }
         else if(precio_2<precio_0 && precio_2<precio_1 && precio_2<precio_3 && precio_2<precio_4){
            cadena_3="Precio menor"+"\t:"+"S/  "+String.format("%.2f", precio_2);
        }
        else if(precio_3<precio_0 && precio_3<precio_1 && precio_3<precio_2 && precio_3<precio_4){
            cadena_3="Precio menor"+"\t:"+"S/  "+String.format("%.2f", precio_3);
        }
         else if(precio_4<precio_0 && precio_4<precio_1 && precio_4<precio_2 && precio_4<precio_3){
            cadena_3="Precio menor"+"\t:"+"S/  "+String.format("%.2f", precio_4);
        }
          cadena_general="Precio promedio, menor, mayor"+"\n\n"+cadena_1+"\n"+cadena_2+"\n"+cadena_3;
        return cadena_general;
    }
    
    
    public String mostrar_Venta(double precio, int cantidad, double sub_total, double total, double descuento, String obsequi, String premio) {
        String cadena_ = "";
        cadena_ = "El precio es: " + "\t" + precio + "\n"
                + "La cantidad es: " + "\t" + cantidad + "\n"
                + "El sub total es: " + "\t" + sub_total + "\n"
                + "El descuento: " + "\t" + descuento + "\n"
                + "El total es: " + "\t" + total + "\n"
                + "____________________________" + "\n"
                + "El obsequio: " + obsequi + "\n"
                + "El premio : " + premio + "\n";
        return cadena_;
    }

    public static String getVenta_optima_general() {
        return venta_optima_general;
    }

    public static void setVenta_optima_general(String aVenta_optima_general) {
        venta_optima_general = aVenta_optima_general;
    }

    public static String getMarca_0() {
        return marca_0;
    }

    public static void setMarca_0(String aMarca_0) {
        marca_0 = aMarca_0;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String aCadena) {
        cadena = aCadena;
    }

    public static double getPrecio_0() {
        return precio_0;
    }

    public static void setPrecio_0(double precio_0) {
        mantenimiento_modificar.precio_0 = precio_0;
    }

    public static int getCantidad_0() {
        return cantidad_0;
    }

    public static void setCantidad_0(int cantidad_0) {
        mantenimiento_modificar.cantidad_0 = cantidad_0;
    }

    public static double getPeso_0() {
        return peso_0;
    }

    public static void setPeso_0(double peso_0) {
        mantenimiento_modificar.peso_0 = peso_0;
    }

    public static String getSabor_0() {
        return sabor_0;
    }

    public static void setSabor_0(String sabor_0) {
        mantenimiento_modificar.sabor_0 = sabor_0;
    }

    public static double getPrecio_1() {
        return precio_1;
    }

    public static void setPrecio_1(double precio_1) {
        mantenimiento_modificar.precio_1 = precio_1;
    }

    public static int getCantidad_1() {
        return cantidad_1;
    }

    public static void setCantidad_1(int cantidad_1) {
        mantenimiento_modificar.cantidad_1 = cantidad_1;
    }

    public static double getPeso_1() {
        return peso_1;
    }

    public static void setPeso_1(double peso_1) {
        mantenimiento_modificar.peso_1 = peso_1;
    }

    public static String getSabor_1() {
        return sabor_1;
    }

    public static void setSabor_1(String sabor_1) {
        mantenimiento_modificar.sabor_1 = sabor_1;
    }

    public static double getPrecio_2() {
        return precio_2;
    }

    public static void setPrecio_2(double precio_2) {
        mantenimiento_modificar.precio_2 = precio_2;
    }

    public static int getCantidad_2() {
        return cantidad_2;
    }

    public static void setCantidad_2(int cantidad_2) {
        mantenimiento_modificar.cantidad_2 = cantidad_2;
    }

    public static double getPeso_2() {
        return peso_2;
    }

    public static void setPeso_2(double peso_2) {
        mantenimiento_modificar.peso_2 = peso_2;
    }

    public static String getSabor_2() {
        return sabor_2;
    }

    public static void setSabor_2(String sabor_2) {
        mantenimiento_modificar.sabor_2 = sabor_2;
    }

    public static double getPrecio_3() {
        return precio_3;
    }

    public static void setPrecio_3(double precio_3) {
        mantenimiento_modificar.precio_3 = precio_3;
    }

    public static int getCantidad_3() {
        return cantidad_3;
    }

    public static void setCantidad_3(int cantidad_3) {
        mantenimiento_modificar.cantidad_3 = cantidad_3;
    }

    public static double getPeso_3() {
        return peso_3;
    }

    public static void setPeso_3(double peso_3) {
        mantenimiento_modificar.peso_3 = peso_3;
    }

    public static String getSabor_3() {
        return sabor_3;
    }

    public static void setSabor_3(String sabor_3) {
        mantenimiento_modificar.sabor_3 = sabor_3;
    }

    public static double getPrecio_4() {
        return precio_4;
    }

    public static void setPrecio_4(double precio_4) {
        mantenimiento_modificar.precio_4 = precio_4;
    }

    public static int getCantidad_4() {
        return cantidad_4;
    }

    public static void setCantidad_4(int cantidad_4) {
        mantenimiento_modificar.cantidad_4 = cantidad_4;
    }

    public static double getPeso_4() {
        return peso_4;
    }

    public static void setPeso_4(double peso_4) {
        mantenimiento_modificar.peso_4 = peso_4;
    }

    public static String getSabor_4() {
        return sabor_4;
    }

    public static void setSabor_4(String sabor_4) {
        mantenimiento_modificar.sabor_4 = sabor_4;
    }

    public double getPorcentaje_1() {
        return porcentaje_1;
    }

    public void setPorcentaje_1(double porcentaje_1) {
        this.porcentaje_1 = porcentaje_1;
    }

    public double getPorcentaje_2() {
        return porcentaje_2;
    }

    public void setPorcentaje_2(double porcentaje_2) {
        this.porcentaje_2 = porcentaje_2;
    }

    public double getPorcentaje_3() {
        return porcentaje_3;
    }

    public void setPorcentaje_3(double porcentaje_3) {
        this.porcentaje_3 = porcentaje_3;
    }

    public double getPorcentaje_4() {
        return porcentaje_4;
    }

    public void setPorcentaje_4(double porcentaje_4) {
        this.porcentaje_4 = porcentaje_4;
    }

    public int getCantidadOptima() {
        return cantidadOptima;
    }

    public void setCantidadOptima(int cantidadOptima) {
        this.cantidadOptima = cantidadOptima;
    }

    public int getNumeroClienteSorpresa() {
        return numeroClienteSorpresa;
    }

    public void setNumeroClienteSorpresa(int numeroClienteSorpresa) {
        this.numeroClienteSorpresa = numeroClienteSorpresa;
    }

    public String getPremioSorpresa() {
        return premioSorpresa;
    }

    public void setPremioSorpresa(String premioSorpresa) {
        this.premioSorpresa = premioSorpresa;
    }

    public int getImporteMinimoObsequio() {
        return importeMinimoObsequio;
    }

    public void setImporteMinimoObsequio(int importeMinimoObsequio) {
        this.importeMinimoObsequio = importeMinimoObsequio;
    }

    public String getObsequio() {
        return obsequio;
    }

    public void setObsequio(String obsequio) {
        this.obsequio = obsequio;
    }

    public int getCliente_dia() {
        return cliente_dia;
    }

    public void setCliente_dia(int cliente_dia) {
        this.cliente_dia = cliente_dia;
    }

    public String getVenta_marca_0() {
        return venta_marca_0;
    }

    public void setVenta_marca_0(String venta_marca_0) {
        this.venta_marca_0 = venta_marca_0;
    }

    public String getVenta_marca_1() {
        return venta_marca_1;
    }

    public void setVenta_marca_1(String venta_marca_1) {
        this.venta_marca_1 = venta_marca_1;
    }

    public String getVenta_marca_2() {
        return venta_marca_2;
    }

    public void setVenta_marca_2(String venta_marca_2) {
        this.venta_marca_2 = venta_marca_2;
    }

    public String getVenta_marca_3() {
        return venta_marca_3;
    }

    public void setVenta_marca_3(String venta_marca_3) {
        this.venta_marca_3 = venta_marca_3;
    }

    public String getVenta_marca_4() {
        return venta_marca_4;
    }

    public void setVenta_marca_4(String venta_marca_4) {
        this.venta_marca_4 = venta_marca_4;
    }

    public String getMarca_1() {
        return marca_1;
    }

    public void setMarca_1(String marca_1) {
        this.marca_1 = marca_1;
    }

    public String getMarca_2() {
        return marca_2;
    }

    public void setMarca_2(String marca_2) {
        this.marca_2 = marca_2;
    }

    public String getMarca_3() {
        return marca_3;
    }

    public void setMarca_3(String marca_3) {
        this.marca_3 = marca_3;
    }

    public String getMarca_4() {
        return marca_4;
    }

    public void setMarca_4(String marca_4) {
        this.marca_4 = marca_4;
    }

    public String getMarca_auxiliar() {
        return marca_auxiliar;
    }

    public void setMarca_auxiliar(String marca_auxiliar) {
        this.marca_auxiliar = marca_auxiliar;
    }

    public int getCont_1() {
        return cont_1;
    }

    public void setCont_1(int cont_1) {
        this.cont_1 = cont_1;
    }

    public int getCont_2() {
        return cont_2;
    }

    public void setCont_2(int cont_2) {
        this.cont_2 = cont_2;
    }

    public int getCont_3() {
        return cont_3;
    }

    public void setCont_3(int cont_3) {
        this.cont_3 = cont_3;
    }

    public int getCont_4() {
        return cont_4;
    }

    public void setCont_4(int cont_4) {
        this.cont_4 = cont_4;
    }

    public int getCont_5() {
        return cont_5;
    }

    public void setCont_5(int cont_5) {
        this.cont_5 = cont_5;
    }

    public int getCantidad_unidades_1() {
        return cantidad_unidades_1;
    }

    public void setCantidad_unidades_1(int cantidad_unidades_1) {
        this.cantidad_unidades_1 = cantidad_unidades_1;
    }

    public int getCantidad_unidades_2() {
        return cantidad_unidades_2;
    }

    public void setCantidad_unidades_2(int cantidad_unidades_2) {
        this.cantidad_unidades_2 = cantidad_unidades_2;
    }

    public int getCantidad_unidades_3() {
        return cantidad_unidades_3;
    }

    public void setCantidad_unidades_3(int cantidad_unidades_3) {
        this.cantidad_unidades_3 = cantidad_unidades_3;
    }

    public int getCantidad_unidades_4() {
        return cantidad_unidades_4;
    }

    public void setCantidad_unidades_4(int cantidad_unidades_4) {
        this.cantidad_unidades_4 = cantidad_unidades_4;
    }

    public int getCantidad_unidades_5() {
        return cantidad_unidades_5;
    }

    public void setCantidad_unidades_5(int cantidad_unidades_5) {
        this.cantidad_unidades_5 = cantidad_unidades_5;
    }

    public int getTotal_1() {
        return total_1;
    }

    public void setTotal_1(int total_1) {
        this.total_1 = total_1;
    }

    public int getTotal_2() {
        return total_2;
    }

    public void setTotal_2(int total_2) {
        this.total_2 = total_2;
    }

    public int getTotal_3() {
        return total_3;
    }

    public void setTotal_3(int total_3) {
        this.total_3 = total_3;
    }

    public int getTotal_4() {
        return total_4;
    }

    public void setTotal_4(int total_4) {
        this.total_4 = total_4;
    }

    public int getTotal_5() {
        return total_5;
    }

    public void setTotal_5(int total_5) {
        this.total_5 = total_5;
    }

    public int getTotal_general() {
        return total_general;
    }

    public void setTotal_general(int total_general) {
        this.total_general = total_general;
    }

    public int getCantidad_ventas_general() {
        return cantidad_ventas_general;
    }

    public void setCantidad_ventas_general(int cantidad_ventas_general) {
        this.cantidad_ventas_general = cantidad_ventas_general;
    }

}
