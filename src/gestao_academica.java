import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.text.DecimalFormat;

public class gestao_academica {
	
	public static void main(String[] args) {
			
			Scanner sn = new Scanner (System.in);
		
			//Inicialmente a turma ser� composta por 10 alunos. Passivel de ajustes quando necess�rio.
			Map<String, String> alunos = new HashMap<>();
			alunos.put("01", "Galileo Galilei");
			alunos.put("02", "Isaac Newton");
			alunos.put("03", "Rosalind Franklin");
			alunos.put("04", "Marie Curie.");
			alunos.put("05", "Nikola Tesla");
			alunos.put("06", "Albert Einstein");
			alunos.put("07", "Charles Darwin");
			alunos.put("08", "Ada Lovelace");
			alunos.put("09", "Stephen Hawking");
			alunos.put("10", "Cristina Pineda");
		
			String aluno;
			int turma = 0;
			int aprovados = 0;
			int avaliacao = 0;
			int reprovados = 0;
			double totalMedias = 0;
			double mediaGeral;
			DecimalFormat x = new DecimalFormat("0.00");
			
			
			// Verificar se existe aluno com o n�mero de matricula e inserir as notas de toda a turma.
			while(turma < 2) {
				
				do {
					System.out.println("***SISTEMA DE GEST�O DE NOTAS DE ALUNOS***\n	Seja bem vindo!\nDigite o n�mero de matr�cula do aluno: ");
					aluno= sn.nextLine();
					
						if(alunos.containsKey(aluno)) {
							System.out.println("MATR�CULA: " + aluno + "	ALUNO(A): "+ alunos.get(aluno));
							turma++;
						}else{
							System.out.println("N�mero de matr�cula inv�lido!\nEssa turma possui 10 matriculas, tente um n�mero entre 01 e 10.\n\n");
						}
				}while((alunos.containsKey(aluno)==false));
				
				
				//vari�veis de composi��o das m�dias
				double notaProva1, notaProjeto1, notaExercicios1, media1, mediaSemestre;
				double notaProva2, notaProjeto2, notaExercicios2, media2;
				double notaProva3, notaProjeto3, notaExercicios3, media3;
				
				
				// Primeiro bimestre
				do {
					System.out.print("Digite a nota da prova do primeiro bimestre: ");
					notaProva1 = sn.nextDouble();
				}while(notaProva1 < 0 || notaProva1 > 10);
				
				do {
					System.out.print("Digite a nota do projeto do primeiro bimestre: ");
					notaProjeto1 = sn.nextDouble();
				}while(notaProjeto1 < 0 || notaProjeto1 > 10);
				
				do {
					System.out.print("Digite a nota da lista de exercic�os do primeiro bimestre: ");
					notaExercicios1 = sn.nextDouble();
				}while(notaExercicios1 < 0 || notaExercicios1 > 10);
				
				
				media1 = ((notaProva1*5) + (notaProjeto1*3) + (notaExercicios1*2)) / 10; 
				String media1f = x.format(media1);
				System.out.println("M�dia primeiro bimestre: " + media1f +"\n");
				
				
				//Segundo bimestre
				do {
					System.out.print("Entre com as notas do segundo bimestre \nDigite a nota da prova do segundo bimestre: ");
					notaProva2 = sn.nextDouble();
				}while(notaProva2 < 0 || notaProva2 > 10);
				
				do {
					System.out.print("Digite a nota do projeto do segundo bimestre: ");
					notaProjeto2 = sn.nextDouble();
				}while(notaProjeto2 < 0 || notaProjeto2 > 10);
				
				do {
					System.out.print("Digite a nota da lista de exercic�os do segundo bimestre: ");
					notaExercicios2 = sn.nextDouble();
				}while(notaExercicios2 < 0 || notaExercicios2 > 10);
				
				
				media2 = ((notaProva2*3) + (notaProjeto2*3) + (notaExercicios2*2)) / 10;
				String media2f = x.format(media2);
				System.out.println("M�dia segundo bimestre: " + media2f +"\n");
				
				
				//Terceiro bimestre
				do {
					System.out.print("Entre com as notas do terceiro bimestre \nDigite a nota da prova do terceiro bimestre: ");
					notaProva3 = sn.nextDouble();
				}while(notaProva3 < 0 || notaProva3 > 10);
				
				do {
					System.out.print("Digite a nota do projeto do terceiro bimestre: ");
					notaProjeto3 = sn.nextDouble();
				}while(notaProjeto3 < 0 || notaProjeto3 > 10);
				
				do {
					System.out.print("Digite a nota da lista de exercic�os do terceiro bimestre: ");
					notaExercicios3 = sn.nextDouble();
				}while(notaExercicios3 < 0 || notaExercicios3 > 10);
				
					
				media3 = ((notaProva3*3) + (notaProjeto3*3) + (notaExercicios3*2)) / 10;
				String media3f = x.format(media1);
				System.out.println("M�dia terceiro bimestre: " + media3f +"\n");

				
				//M�dia do semestre
				
				
				mediaSemestre = (media1 + media2 + media3)/3;
				totalMedias = totalMedias + mediaSemestre;
				
				String mediaSemestref = x.format(mediaSemestre);
				
				
				if (mediaSemestre >= 8) {
					System.out.println("O aluno: "+ alunos.get(aluno) + " foi APROVADO com a m�dia semestral de: " + mediaSemestref + ".\n");
					aprovados++;
					
				}else if(mediaSemestre >= 5 && mediaSemestre <= 7.9 ) {
					System.out.println("O aluno: "+ alunos.get(aluno) + " obteve m�dia semestral de: " + mediaSemestref + " e deve realizar a Avalia��o Final (AF).\n");
					avaliacao++;
				}else{
					System.out.println("O aluno: "+ alunos.get(aluno) + " obteve m�dia semestral de: " + mediaSemestref + " e foi REPROVADO.\n");
					reprovados++;
				}
				
			}
			
			if(turma == 2) {
				mediaGeral = totalMedias/10;
				String mediaGeralf = x.format(mediaGeral);
				
				System.out.println("A m�dia geral da turma foi de: "+ mediaGeralf);
				System.out.println("O total de alunos aprovados � de: " + aprovados + " alunos.");
				System.out.println("O total de alunos reprovados � de: " + reprovados + " alunos.");
				System.out.println("O total de alunos em avalia��o final � de: " + avaliacao + " alunos.");
			}
			
			sn.close();
		}
	
}

