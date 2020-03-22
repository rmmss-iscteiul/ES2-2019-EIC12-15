package ES2_2019_EIC12_15.HelloWorld;


/**
 * Classe "Hello world!" simples para 1ª fase do projeto de ES2
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
	 * @param info Valor com o qual o atributo "info" irá ser inicializado
	 */
	public App(String info) {
		this.info=info;
	}
	/**
	 * Método main para iniciar o programa
	 * @param args Argumentos de entrada
	 */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    /**
     * Método somar para testar a soma de dois números
     * @param a Primeiro número a ser somado
     * @param b Segundo número a ser somado
     * @return Soma de a com b
     */
    public static int somar(int a, int b) {
    	return a+b;
    }
    /**
     * Método para concatenar duas strings
     * @param a String inicial
     * @param b String que vai ser acrescentada no final da string a
     * @return Concatenação das strings a e b
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
	 * @param info Valor que o atributo "info" irá passar a tomar
	 */
	public void setInfo(String info) {
		this.info = info;
	}
}
