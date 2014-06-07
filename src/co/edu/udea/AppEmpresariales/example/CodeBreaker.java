package co.edu.udea.AppEmpresariales.example;

public class CodeBreaker {

	public String convertirNumero(String convertido, String original){
		String digito = "";
		for(int i = 0; i < convertido.length(); i++)
		{
			if(convertido.charAt(i) == original.charAt(i))
			{
				digito = digito+"X";
				
			}else if(original.contains(String.valueOf(convertido.charAt(i)))){
				
				digito= digito + "_";
			}
		}
		return digito;
		
	}
	
}
