package tarea14;

public class Docente extends Persona
{
    private String especialidad;
        
    public Docente(String nombre,String apellido,Integer dni,Integer fechaNacimiento,Integer anActual)
    {
       super(nombre,apellido,dni,fechaNacimiento,anActual);
    } 
   public void setEspecialidad(String especialidad)
   {
      this.especialidad= especialidad;  
   }
   public String getEspecialidad()
   {
      return especialidad;
   }
   
   public String toString()
   {
     return ("\nnombreDocente: "+this.getNombre()+ 
     "\nApellidos: " +this.getApellido()+
     "\nDni:  "+this.getDni()+
     "\nAnio De Nac.: "+this.getFechaNacimiento());
   }
  
   @Override
   public  Integer calcularEdad()
   {
      return this.anActual - this.fechaNacimiento;
   }
  
      
  
}
