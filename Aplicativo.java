	
	public class Aplicativo {
   	 public static void main(String[] args) {
        Datos obj1= new Datos(6f, 8f);
       
        float valor1,valor2,res,resR,resM,resD;
       
        valor1=obj1.getValor1();
        valor2=obj1.getValor2();
       res=obj1.sumarV(valor1, valor2);
        System.out.println("LA SUMA ES :"+res);
        resR=obj1.restarV(valor1, valor2);
        System.out.println("LA RESTA ES :"+resR);
        resM=obj1.multiplicarV(valor1, valor2);
        System.out.println("LA MULTIPLICACION ES :"+resM);
        resD=obj1.dividirV(valor1, valor2);
        System.out.println("LA DIVISION ES :"+resD);
    
    
}
}