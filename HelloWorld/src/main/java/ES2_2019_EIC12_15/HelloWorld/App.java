package ES2_2019_EIC12_15.HelloWorld;


/**
 * Classe "Hello world!" simples para 1� fase do projeto de ES2
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
	 * @param info Valor com o qual o atributo "info" ir� ser inicializado
	 */
	public App(String info) {
		this.info=info;
	}
	/**
	 * M�todo main para iniciar o programa
	 * @param args Argumentos de entrada
	 */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    /**
     * M�todo somar para testar a soma de dois n�meros
     * @param a Primeiro n�mero a ser somado
     * @param b Segundo n�mero a ser somado
     * @return Soma de a com b
     */
    public static int somar(int a, int b) {
    	return a+b;
    }
    /**
     * M�todo para concatenar duas strings
     * @param a String inicial
     * @param b String que vai ser acrescentada no final da string a
     * @return Concatena��o das strings a e b
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
	 * @param info Valor que o atributo "info" ir� passar a tomar
	 */
	public void setInfo(String info) {
		this.info = info;
	}
}
