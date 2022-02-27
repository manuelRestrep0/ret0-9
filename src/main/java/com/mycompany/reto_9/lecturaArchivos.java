package com.mycompany.reto_9;

import java.nio.file.Path;

public abstract class lecturaArchivos {
    public abstract void lecturaEscritura(Path archivo);
    public String conceptoPrecioCierre(String precioCierre){
        double precio = Double.parseDouble(precioCierre);
        if(precio<30000) return "MUY BAJO";
        if(precio>=30000 && precio<40000) return "BAJO";
        if(precio>=40000 && precio<50000) return "MEDIO";
        if(precio>=50000 && precio<60000) return "ALTO";
        if(precio>=60000) return "MUY ALTO";
        return "";
    }
}
