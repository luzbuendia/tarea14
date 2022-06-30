package tarea14;

public abstract class Persona 
{
    protected String nombre;
    protected String apellido;
    protected Integer dni;
    protected Integer fechaNacimiento;
    protected Integer anActual;
    
    
    public Persona(String nombre,String apellido,Integer dni,Integer fechaNacimiento ,Integer anActual)
    {
        this.nombre=nombre;
        this.apellido= apellido;
        this.dni=dni;
        this.fechaNacimiento=fechaNacimiento;
        this.anActual=anActual;
        
        
    }
    protected String getNombre()
    {
       return nombre;  
    }
    protected String getApellido()
    {
        return apellido;
    }
    protected Integer getDni()
    {
       return dni;  
    }
    protected Integer getFechaNacimiento()
    {
        return fechaNacimiento;
    
    }
    protected Integer getAnActual()
    {
       return anActual;  
    }
    public abstract Integer calcularEdad();

      
    
    
}
