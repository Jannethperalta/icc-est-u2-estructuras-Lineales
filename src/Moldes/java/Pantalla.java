package Moldes.java;

public class Pantalla {
    
    private int id;
    private String nombre;
    private String ruta;



    // Constructor con parámetros
    public Pantalla(int id, String nombre, String ruta) {
        this.id = id;
        this.nombre = nombre;
        this.ruta = ruta;
    }

    // Métodos getter
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRuta() {
        return ruta;
    }

    @Override
    public String toString() {
        return "Pantalla [ruta=" + ruta + "]";
    }

    
    
}

    

