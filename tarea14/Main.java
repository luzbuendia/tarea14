package tarea14;

public class Main 
{
    public static void main(String args[]) 
    {
        Docente docente=new Docente("freddy", "Borja", 9521778, 1999,2022);
        docente.setEspecialidad("Programador");
        Docente docente2=new Docente(" Pedro", "villanueva  ", 98845623 ,  1985, 2022);
        docente2.setEspecialidad("Diseñador Grafico");
        
        Curso cursoMatematica = new Curso("Matematica");
        cursoMatematica.setDocente(docente);
        cursoMatematica.setDocente(docente2);
        
        Curso cursoAlgoritmo = new Curso("algoritmo");
        cursoAlgoritmo.setDocente(docente);
        cursoAlgoritmo.setDocente(docente2);
        
        Alumno alumno=new Alumno("alejandro", "Perez", 9485897, 1994,2022);
        alumno.setCurso(cursoAlgoritmo);
        alumno.setCurso(cursoMatematica);
        alumno.setCodigo(202011548);
        
        Matricula matricula = new Matricula(123435);
        matricula.setAlumno(alumno);
        for (Alumno a: matricula.getAlumno()) 
        {
            System.out.println();
            System.out.println(alumno.toString());
            System.out.println("codigo De Matricula: "+matricula.getCodigo());
            System.out.println("edad: "+alumno.calcularEdad());
            System.out.println("Codigo:"+alumno.getCodigo());
            for (Curso c : a.getCurso()) {
                System.out.println();
                System.out.println("Curso: " + c.getNombre());

               
                    for (Docente d : c.getDocente()) {
                      System.out.println(d.toString());
                      System.out.println("edad: " +d.calcularEdad());
                      System.out.println("especialidad:"+ d.getEspecialidad());
                  }
              }
        }   
    } 
        

    
       
       
       
}
 
 
    

