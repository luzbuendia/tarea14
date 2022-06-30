package tarea14;

public class Alumno extends Persona 
{
   private int codigo;
   private Curso curso[];
   private int contador;

        
   public Alumno(String nombre,String apellido,Integer dni,Integer fechaNacimiento,Integer anActual)
   {
     super(nombre,apellido,dni,fechaNacimiento,anActual);
     this.curso=new Curso[2];
     this.contador=0;
   } 
   public void setCodigo(int codigo)
  {
    this.codigo=codigo;  
  }
  public int getCodigo()
  {
    return codigo;
  }
  public void setCurso(Curso curso)
    {
      this.curso[this.contador]=curso;
      this.contador++;
    }
   public Curso[]getCurso()
   {
     return curso;
   }

  public String toString()
  {
    return ("\nnombresAlumno: "+this.getNombre()+ 
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
