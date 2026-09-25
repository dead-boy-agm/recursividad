package datos.unidad1.recursividad.java;

public class Recursividad {

     public static void saludo(int total) {

    if(total <= 0) //condiciones Base
       return;

    else {
            System.out.println("hola")};
            saludo(total-1);
       }



}


public static void cuentaRegresiva(int n){
if( n < 1 ) {
    return;

} else {
        System.out.print(n + "");
        cuentaRegresiva(n-1);
}

}

public static void main(String[] a){

//saludo ("Gabriel", 100);
cuentaRegresiva(100);

}



