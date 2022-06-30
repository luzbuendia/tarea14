package tarea14;

public class Matricula 
{
    private int codigo;
    private Alumno alumno[];
    private int contador;
    
    public Matricula(int codigo) 
    {
        this.codigo=codigo;
        this.alumno = new Alumno[1];
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
   public void setAlumno(Alumno alumno)
   {
    this.alumno[this.contador]=alumno;
    this.contador++;
  }
  public Alumno[]getAlumno()
 {
   return alumno;
 } 

   
  

 

   






}

