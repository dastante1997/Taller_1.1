
package arreglos;
import arreglos.Arreglos;

public class test{
    
    public static void main (String[] args){
       Arreglos cursoA = new Arreglos();    
        double [] notas = new double [12];
             for (int i=0;i<12;i++){
             notas[i] = Math.random()*6;
             }
        llenaNotas(notas);     
    cursoA.setNotas(notas);
     cursoA.mostrarNotas();
     cursoA.setPromedio();
      System.out.println("Promedio del curso "+cursoA.getPromedio());
      cursoA.setEstudianEncimaPromedio();
      System.out.println("Encima del promedio: "+cursoA.getnroEstudiantesEncimaPromedio());
   } 
 public static void llenaNotas(double[] notas){
 for (int i=0;i<12;i++){
         notas[i] = Math.random()*6;
}
 }           

}
    