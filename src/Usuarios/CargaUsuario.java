package Usuarios;



import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class CargaUsuario {
    
    public static void main(String[] args) {
    String nombre;
    String apellido;
    String dni;
    String mes ;
    String dia ;
    String ano;
    String fecha;

    int imes;
    int idia;
    int iano;
    int iopcion;
    
     List<String> listaUsuarios = new ArrayList<>();
     
   String opcion = JOptionPane.showInputDialog("Ingrese la opcion correspondiente \n 0-terminar carga \n 1-cargar datos  ");
   iopcion=Integer.parseInt(opcion); 
   while(0==opcion.length() || iopcion!=0 || iopcion !=1){
    opcion = JOptionPane.showInputDialog("Ingrese la opcion correspondiente \n 0-terminar carga \n 1-cargar datos  ");
    iopcion=Integer.parseInt(opcion); 
   }
    
   
    
  while(iopcion==1){
  //ingreso nombre con verificacion que el campo no este vacio
 nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
  while(nombre.length()== 0 ){
        nombre = JOptionPane.showInputDialog("PORFAVOR COMPLETE EL NOMBRE");
        }
//ingreso apellido con verificacion que el campo no este vacio
    apellido= JOptionPane.showInputDialog("Ingrese el apellido:");
  while(apellido==null || apellido.length()==0  ){
       apellido = JOptionPane.showInputDialog("PORFAVOR COMPLETE EL APELLIDO");
        }
  
  //ingreso dni con verificacion que sea igual a 8 digitos
  dni= JOptionPane.showInputDialog("Ingrese el DNI");
  while( dni==null  || dni.length()!=8 ){
       dni = JOptionPane.showInputDialog("PORFAVOR COMPLETE EL DNI CON 8 NUMEROS");
        }
  
  //ingreso año de nacimiento comprobando que no tenga mas de 100 años y que no sea un año superior a 2023
     ano = JOptionPane.showInputDialog("Ingrese el año de nacimiento con numeros");
   iano=Integer.parseInt(ano);
  while(iano>2023 || iano<1923  ){
       ano= JOptionPane.showInputDialog("por favor ingrese un año valido ");
       iano=Integer.parseInt(ano);
        }
  
  
  //ingreso  mes comprobando que no sea 0, negativo o mayor a 12 
   mes= JOptionPane.showInputDialog("Ingrese el mes de nacimiento con numeros");
   imes=Integer.parseInt(mes);
  while(imes >12 || imes<=0 ){
       mes= JOptionPane.showInputDialog("por favor ingrese un mes valido ");
       imes=Integer.parseInt(mes);
        }
  
  
   //ingreso dia del mes comprobando que corresponda la cantidad de dias al mes ingresado
   dia= JOptionPane.showInputDialog("Ingrese el dia de nacimiento con numeros");
     while(dia==null || dia.length()==0  ){
      dia = JOptionPane.showInputDialog("PORFAVOR COMPLETE EL DIA DE NECIMIENTO");
        }
   idia=Integer.parseInt(dia);
        switch (imes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                while(idia>31 || idia==0){
                    dia = JOptionPane.showInputDialog("EL DIA INGRESADO NO CORRESPONDE A L MES"  );
                    while( dia==null ||dia.length()==0  ){
                        dia = JOptionPane.showInputDialog("PORFAVOR COMPLETE EL MES DE NECIMIENTO");
                    }
                    idia=Integer.parseInt(dia);
                }
                break;
            }
            case 4, 6, 9, 11 -> {
                while(idia>30 || idia==0){
                    dia = JOptionPane.showInputDialog("EL DIA INGRESADO NO CORRESPONDE A L MES"  );
                    while( dia==null || dia.length()==0){
                        dia= JOptionPane.showInputDialog("PORFAVOR COMPLETE EL MES DE NECIMIENTO");
                    }
                    idia=Integer.parseInt(dia);
                }
                break;
            }
            case 2 -> {
                while (idia > 29 || idia == 0) {
                    dia = JOptionPane.showInputDialog("EL DÍA INGRESADO NO CORRESPONDE AL MES");
                    while ( dia == null || dia.length() == 0 ) {
                        dia = JOptionPane.showInputDialog("POR FAVOR COMPLETE EL DÍA DE NACIMIENTO");
                        
                    }
                    idia = Integer.parseInt(dia);
                }
                break;
            }
            default -> {
                System.out.println("mes no valido");
            }
        }
  
   fecha = dia + "/" + mes + "/" + ano;
   //guardamos los datos de los usuarios en una lista
   
              String usuario = "Nombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + dni + "\nFecha de nacimiento: " + fecha;
            listaUsuarios.add(usuario);
            
 opcion = JOptionPane.showInputDialog("Ingrese la opcion correspondiente \n 0-terminar carga \n 1-cargar datos \n 2-mostrar datos\n ");
  iopcion=Integer.parseInt(opcion); 
   
   while(iopcion!=0 || iopcion !=1 || iopcion !=2 || opcion.length()==0){
    opcion = JOptionPane.showInputDialog("Ingrese la opcion correspondiente \n 0-terminar carga \n 1-cargar datos  ");
    iopcion=Integer.parseInt(opcion); 
   }
    
  }
  
  if (iopcion == 2){
        for (String usuario : listaUsuarios) {
                JOptionPane.showMessageDialog(null, usuario, "Datos del Usuario", JOptionPane.INFORMATION_MESSAGE);
            }
  }
  
  
    }
    
}
