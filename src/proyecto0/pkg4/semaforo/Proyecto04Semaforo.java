
package proyecto0.pkg4.semaforo;


public class Proyecto04Semaforo {


    public static void main(String[] args) {
      //instancio obxecto tipo semaforo
        Semaforo sema1= new Semaforo();
        String valor=sema1 .damecor();
        System.out.println("cor antes darlle un valor "+ valor);
        sema1.poncor("verde");
        valor=sema1.damecor();
        System.out.println("cor :"+ valor);
        // outro xeito:
        System.out.println("cor :"+ sema1.damecor());
    }
    
}
