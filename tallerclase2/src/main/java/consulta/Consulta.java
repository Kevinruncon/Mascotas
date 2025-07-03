/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consulta;
public class Consulta {
// Estas son las variables que va a tener cada consulta: un código, una fecha y un diagnóstico
    public String codigo;
    public String fecha;
    public Diagnostico diag;
// Este es el constructor, aquí es donde se inicializa una consulta con sus datos
    public Consulta(String codigo, String fecha, Diagnostico diag) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.diag = diag;
    }
    // Este método sirve para mostrar toda la información de la consulta
        public void mostrarConsulta(){
        // Imprime el código de la consulta
            System.out.println("Consulta " + codigo);
        // Imprime la fecha de la consulta  
            System.out.println("Fecha:" + fecha);
        // Indica que se va a mostrar el diagnóstico asociado
            System.out.println("Diagnostico asociado" );
        // Muestra la descripción del diagnóstico llamando al método getDescripcion del objeto diag
            System.out.println("Descipcion:" + diag.getDescripcion());
        // Muestra el tratamiento del diagnóstico llamando al método getTratamiento del objeto diag
            System.out.println("Tratamiento:" + diag.getTratamiento());
        // Aquí evalúo si el tratamiento es largo usando el método esTratamientoLargo()    
            if (diag.esTratamientoLargo()){
        // Si es largo, se recomienda seguimiento adicional
                System.out.println(" El tratamiento es extenso, se requiere seguimiento adicional.");
            }else{
        // Si no es largo, no es necesario hacer seguimiento
                System.out.println("El tratamiento es corto, por lo tanto no requiere seguimiento.");
            }
        }
    }


