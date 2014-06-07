package co.edu.udea.AppEmpresariales.example;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CodeBreakerTest {
	private CodeBreaker codeBreaker= new CodeBreaker();
	private String resultado;
	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void cuando_numero_esXXXX() {
		
		resultado= codeBreaker.convertirNumero("2344","2344");
		Assert.assertEquals("XXXX", resultado);
	}
	@Test
	public void cuando_numero_esXXX() {
		String convertido = "2346";
		String original = "2345";
		resultado = codeBreaker.convertirNumero(convertido,original);
		Assert.assertEquals("XXX", resultado);
	}

	@Test
	public void cuando_numero_esXX() {
		String convertido = "2346";
		String original = "2745";
		resultado = codeBreaker.convertirNumero(convertido,original);
		Assert.assertEquals("XX", resultado);
	}
	
	@Test
	public void cuando_numero_esX() {
		String convertido = "2346";
		String original = "8745";
		resultado = codeBreaker.convertirNumero(convertido,original);
		Assert.assertEquals("X", resultado);
	}
	
	@Test
	public void cuando_numero_es_() {
		String convertido = "2349";
		String original = "8475";
		resultado = codeBreaker.convertirNumero(convertido,original);
		Assert.assertEquals("_", resultado);
	}
	@Test
	public void cuando_numero_es__() {
		String convertido = "2344";
		String original = "8475";
		resultado = codeBreaker.convertirNumero(convertido,original);
		Assert.assertEquals("__", resultado);
	}
	@Test
	public void cuando_numero_es___() {
		String convertido = "2847";
		String original = "8475";
		resultado = codeBreaker.convertirNumero(convertido,original);
		Assert.assertEquals("___", resultado);
	}
	@Test
	public void cuando_numero_es____() {
		String convertido = "7548";
		String original = "8475";
		resultado = codeBreaker.convertirNumero(convertido,original);
		Assert.assertEquals("____", resultado);
	}
	@Test
	public void cuando_numero_es_X() {
		String convertido = "4379";
		String original = "8475";
		resultado = codeBreaker.convertirNumero(convertido,original);
		Assert.assertEquals("_X", resultado);
	}
	@Test
	public void cuando_numero_es_XX() {
		String convertido = "4375";
		String original = "8475";
		resultado = codeBreaker.convertirNumero(convertido,original);
		Assert.assertEquals("_XX", resultado);
	}
	@Test
	public void cuando_numero_es_XXX() {
		String convertido = "5475";
		String original = "8475";
		resultado = codeBreaker.convertirNumero(convertido,original);
		Assert.assertEquals("_XXX", resultado);
	}
	@Test
	public void cuando_numero_es_X_X() {
		String convertido = "5455";
		String original = "8475";
		resultado = codeBreaker.convertirNumero(convertido,original);
		Assert.assertEquals("_X_X", resultado);
	}
	//pruebas 
}
