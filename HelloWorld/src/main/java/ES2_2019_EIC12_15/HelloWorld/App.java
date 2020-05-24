package ES2_2019_EIC12_15.HelloWorld;


/**
 * Classe "Hello world!" simples para 1a fase do projeto de ES2
 *
 */
public class App 
{
	/**
	 * Atributo "info" da classe
	 */
	private String info;
	
	/**
	 * Construtor da classe
	 * @param info Valor com o qual o atributo "info" ira ser inicializado
	 */
	public App(String info) {
		this.info=info;
	}
	/**
	 * Metodo main para iniciar o programa
	 * @param args Argumentos de entrada
	 */
    public static void main( String[] args )
    {
    	System.out.println( "Hello World! 1" );
    	System.out.println( "Hello World! 2" );
    	System.out.println( "Hello World! 3" );
    	System.out.println( "Hello World! 4" );
    	System.out.println( "Hello World! 5" );
    	System.out.println( "Hello World! 6" );
    	System.out.println( "Hello World! 78" );
    }
    
    
    
    
    
    /**
     * Metodo somar para testar a soma de dois numeros
     * @param a Primeiro numero a ser somado
     * @param b Segundo numero a ser somado
     * @return Soma de a com b
     */
    public static int somar(int a, int b) {
    	return a+b;
    }
    /**
     * Metodo para concatenar duas strings
     * @param a String inicial
     * @param b String que vai ser acrescentada no final da string a
     * @return Concatenacao das strings a e b
     */
    public static String conc(String a, String b) {	
    	return a+b;
    	
    }
    /**
     * Getter do atributo "info"
     * @return Valor do atributo "info"
     */
	public String getInfo() {
		return info;
	}
	/**
	 * Setter do atributo "info"
	 * @param info Valor que o atributo "info" ira passar a tomar
	 */
	public void setInfo(String info) {
		this.info = info;
	}
}
