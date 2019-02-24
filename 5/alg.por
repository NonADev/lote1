programa
{
	inclua biblioteca Matematica --> m 	
	funcao inicio()
	{
		real a, b, c, d, x1, x2
		leia(a, b, c)
		d = (b*b)-(4*a*c)
		x1 = ((-b)+m.raiz(d, 2.0))/2*a
		x2 = ((-b)-m.raiz(d, 2.0))/2*a

		escreva(x1+"\n"+x2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 223; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */