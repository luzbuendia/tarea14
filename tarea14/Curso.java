package tarea14;

public class Curso 
{
    private String nombre;
    private Docente docente[];
    private int contador;

    public Curso(String nombre)
    {
      this.nombre=nombre;
      this.docente=new Docente[2];
      this.contador=0;

    }
    public void setnombre(String nombre)
    {
      this.nombre=nombre;
    }
    public String getNombre()
    {
       return nombre;
    }
    public void setDocente(Docente docente)
    {
      this.docente[this.contador]=docente;
      this.contador++;
    }
   public Docente[]getDocente()
   {
     return docente;
   }


    

  
}

