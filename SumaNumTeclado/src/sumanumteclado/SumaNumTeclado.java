
package sumanumteclado;

/** 
 * 
 * @author Aley
 */

import javax.swing.JOptionPane; 

public class SumaNumTeclado {
   
    /**
     * @param args the command line arguments
     */
    public static  void main(String[] args) {
        // TODO code application logic here
        
     //variable para almacenar  el return de indicar operacion
     
     int resDefOperacion ;
     
     do {
     resDefOperacion = indicarOperacion ();
    
         //froma de hacerlo mediante IF - else
        /*if (resDefOperacion == 1 ) { 
            mostrarPantalla () ;
            
        } else if (resDefOperacion == 2) {  
            //aqui llamo restar
        } else if (resDefOperacion == 3) {
           //aqui se llama el metodo Multiplicar
        } else if (resDefOperacion == 4) {
            //aqui se llama el metodo Dividir
        } else if (resDefOperacion ==5){
            //salir
        } else {
            JOptionPane.showMessageDialog(null,"Usted selecciono una opcion no valida") ;
        }*/
        
        // forma de hacerlo mediante Uso de Case, es lo mismo que el IF-ELse 
        
        switch (resDefOperacion) {
            case 1: mostrarPantallaSuma (); break;
            case 2: mostrarPantallaResta () ; break;
            case 3: mostrarPantallaMultiplicacion (); break ;
            case 4: mostrarPantallaDivision (); break ;
            case 5:  break ; 
            //para controlar los errores
            default: JOptionPane.showMessageDialog(null, "El dato ingresado no es valido", "ERROR" , JOptionPane.ERROR_MESSAGE); break ;
           
    } 
    
    } while  (resDefOperacion != 5) ; 
     
    }
     
    /** Metodo que recibe un numero que indica la operacion a realizar
     * 
     * @return 
     */
        public static int indicarOperacion ()  {
          
            try {
            String definirOperacion  = JOptionPane.showInputDialog("Por favor relacione el numero de la operacion que va a realizar \n"
                    + "1.Suma \n "
                    + "2.Resta \n"
                    + "3.Multiplicacion \n"
                    + "4.Division \n"
                    + "5.Salir") ;
            
            return  (Integer.parseInt(definirOperacion)) ;
            
        } catch (NumberFormatException e) {
            
           return -1 ;  
            
        }
         
        }
    /**
     *
     * @return
     */
    
      //Todo lo que se reciba de pantalla por defecto es un string, se debe modificar el tipo de dato , en este caso se uso parseint
     
      public  static void  mostrarPantallaSuma () 
      {
          //el Try catch es para validar las excepciones, todo lo que hace el metodo debe ir entre el try catch
         try {
             
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el primer numero para sumar: ") );
           
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese es segundo numero para la suma: ") );
                
            int resultadoSuma = suma ((numero1),numero2) ; 
        
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultadoSuma, "Resultado Suma",JOptionPane.QUESTION_MESSAGE);
            
                  
         } catch (NumberFormatException e) {
              
           JOptionPane.showMessageDialog(null, "Uno de los datos ingresados no es valido" ,"ERROR", JOptionPane.ERROR_MESSAGE);
             
           System.out.print(e);
          } 
      
      } 
    
     /** metodo de resta de dos numeros, debe ser invocado por el main
      * 
      */
      
      public static void mostrarPantallaResta ()
      {
          try {
         int numero1 = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresa el primer numero para la resta")) ;
         int numero2 = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresar el segundo numero para la resta"));
         
         int resultadoResta = resta (numero1,numero2) ;
         
         JOptionPane.showMessageDialog(null, "el resutado de la resta es: " + resultadoResta, "Resultado Resta", JOptionPane.INFORMATION_MESSAGE);
     
      
      } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(null, "Uno de los datos ingresados no es valido", "ERROR", JOptionPane.ERROR_MESSAGE);
          
          System.out.print(e);
      }
          
      }
              
       public static void mostrarPantallaMultiplicacion () {
           try  {
                  
           int numero1 = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresa el primer numero para la Multiplicacion"));
           int numero2 = Integer.parseInt (JOptionPane.showInputDialog(null,"Ingresar el segundo numero para la Multiplicacion")) ;
           
           int resultadoMultiplicacion = multiplicacion  (numero1,numero2) ;
           
           JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + resultadoMultiplicacion,"Resultado Multiplicacion",JOptionPane.INFORMATION_MESSAGE );
       }  catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "Uno de los datos ingresados no es valido", "ERROR", JOptionPane.ERROR_MESSAGE);
       }
           
       }    
       
       public static void mostrarPantallaDivision () {
           try {
           int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el primer numero para realizar la division")) ;
           int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el segundo numero para realizar la division")) ;
           
           double resultadoDivision = division (numero1,numero2) ;
           
           JOptionPane.showMessageDialog(null, "El resultado de la division es: "+ resultadoDivision, "resultado division", JOptionPane.INFORMATION_MESSAGE);
       
       } catch (NumberFormatException e) {
           JOptionPane.showConfirmDialog(null, "Uno de los datos ingresados es invalido", "ERROR", JOptionPane.ERROR_MESSAGE);
       }
       
       }
           
        /**
     * Metodos de suma, resta, multiplicacion y division 
     * @param numeroinicial - primer numero para la operacion
     * @param numerofinal -  segundo numero para la operacion
     * @return - resultado de la operacion
     */
    public static int suma (int numeroinicial, int numerofinal) {
       
        int resultado;
             
         resultado = numeroinicial + numerofinal ; 
         
         return resultado ;
    }
    
    public static int resta (int numeroInicial, int numeroFinal) {
        int resultado;
        
        resultado = numeroInicial - numeroFinal ;
        return resultado ;
    }
    
    public static int multiplicacion  (int numeroInicial, int numeroFinal) {
        int resultado;
        
        resultado = numeroInicial * numeroFinal ;
        
        return resultado;
    }
   
    public static double division (int numeroInicial, int numeroFinal) {
        int resultado ; 
        
        resultado = numeroInicial / numeroFinal;
        
        return resultado ;
    }
}
