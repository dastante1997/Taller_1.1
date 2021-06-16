
package arreglos;


public class Arreglos {    
        private double []notas;
        private double promedio;
        private int estudiantesEncimaPromedio;
   
        public Arreglos(){
            notas = new double[12];
            }
       
        
        

    public  void setNotas(double notas[]){
        this.notas = notas;
    }
    public void mostrarNotas(){
    for (int i=0;i<12;i++){
System.out.println("Estudiante: "+this.notas[i]);  
   }
    }
    public void setPromedio (){
        //Cambia el valor de la nota del alumno No1 con este procedimiento
        double promedio=0;
        for (int i=0;i<12;i++){
      this.notas[0]=this.notas[0]+this.notas[i];
    }
     this.promedio=this.notas[0]/12;
      }
            
  public void  setEstudianEncimaPromedio() {
      int estudiantes = 0;
      for (int i=0;i<12;i++){
          if(this.notas[i]<this.getPromedio()){
              estudiantes ++;
          }
      }
      this.estudiantesEncimaPromedio=estudiantes; 
     
  }
    public double getPromedio() {
        return this.promedio;
    }
  
    public int getnroEstudiantesEncimaPromedio(){
       
        return this.estudiantesEncimaPromedio;
    }

}

    
