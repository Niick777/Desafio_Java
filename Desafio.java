import java.util.Scanner;

public class Desafio {
	

	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int x=0, y=0, opcao=0;
		do {
			System.out.println("Movimentos de uma torre no xadrez!");
		    System.out.print("Digite a linha em que a torre se encontra(horizontal): ");
		x=entrada.nextInt();
		System.out.print("Digite a linha em que a torre se encontra(Vertical): ");
		y=entrada.nextInt();
		if(x==1 && y==1) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| x  x  x  x  x  x  x  x\r\n" + 
					" 2| x  -  -  -  -  -  -  -\r\n" + 
					" 3| x  -  -  -  -  -  -  -\r\n" + 
					" 4| x  -  -  -  -  -  -  -\r\n" + 
					" 5| x  -  -  -  -  -  -  -\r\n" + 
					" 6| x  -  -  -  -  -  -  -\r\n" + 
					" 7| x  -  -  -  -  -  -  -\r\n" + 
					" 8| x  -  -  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
					
		if(x==2 && y==1) {
				System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
						"   -----------------------\r\n" + 
						" 1| x  -  -  -  -  -  -  -\r\n" + 
						" 2| x  x  x  x  x  x  x  x\r\n" + 
						" 3| x  -  -  -  -  -  -  -\r\n" + 
						" 4| x  -  -  -  -  -  -  -\r\n" + 
						" 5| x  -  -  -  -  -  -  -\r\n" + 
						" 6| x  -  -  -  -  -  -  -\r\n" + 
						" 7| x  -  -  -  -  -  -  -\r\n" + 
						" 8| x  -  -  -  -  -  -  -");
				System.out.println("Digite a opção que deseja realizar: \n"
						+"1- Continuar\n"
						+"2- Sair");
					opcao=entrada.nextInt();}
		if(x==3 && y==1) {		
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| x  -  -  -  -  -  -  -\r\n" + 
					" 2| x  -  -  -  -  -  -  -\r\n" + 
					" 3| x  x  x  x  x  x  x  x\r\n" + 
					" 4| x  -  -  -  -  -  -  -\r\n" + 
					" 5| x  -  -  -  -  -  -  -\r\n" + 
					" 6| x  -  -  -  -  -  -  -\r\n" + 
					" 7| x  -  -  -  -  -  -  -\r\n" + 
					" 8| x  -  -  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==4 && y==1) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| x  -  -  -  -  -  -  -\r\n" + 
					" 2| x  -  -  -  -  -  -  -\r\n" + 
					" 3| x  -  -  -  -  -  -  -\r\n" + 
					" 4| x  x  x  x  x  x  x  x\r\n" + 
					" 5| x  -  -  -  -  -  -  -\r\n" + 
					" 6| x  -  -  -  -  -  -  -\r\n" + 
					" 7| x  -  -  -  -  -  -  -\r\n" + 
					" 8| x  -  -  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==5 && y==1) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| x  -  -  -  -  -  -  -\r\n" + 
					" 2| x  -  -  -  -  -  -  -\r\n" + 
					" 3| x  -  -  -  -  -  -  -\r\n" + 
					" 4| x  -  -  -  -  -  -  -\r\n" + 
					" 5| x  x  x  x  x  x  x  x\r\n" + 
					" 6| x  -  -  -  -  -  -  -\r\n" + 
					" 7| x  -  -  -  -  -  -  -\r\n" + 
					" 8| x  -  -  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==6 && y==1) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| x  -  -  -  -  -  -  -\r\n" + 
					" 2| x  -  -  -  -  -  -  -\r\n" + 
					" 3| x  -  -  -  -  -  -  -\r\n" + 
					" 4| x  -  -  -  -  -  -  -\r\n" + 
					" 5| x  -  -  -  -  -  -  -\r\n" + 
					" 6| x  x  x  x  x  x  x  x\r\n" + 
					" 7| x  -  -  -  -  -  -  -\r\n" + 
					" 8| x  -  -  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==7 && y==1) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| x  -  -  -  -  -  -  -\r\n" + 
					" 2| x  -  -  -  -  -  -  -\r\n" + 
					" 3| x  -  -  -  -  -  -  -\r\n" + 
					" 4| x  -  -  -  -  -  -  -\r\n" + 
					" 5| x  -  -  -  -  -  -  -\r\n" + 
					" 6| x  -  -  -  -  -  -  -\r\n" + 
					" 7| x  x  x  x  x  x  x  x\r\n" + 
					" 8| x  -  -  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==8 && y==1) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| x  -  -  -  -  -  -  -\r\n" + 
					" 2| x  -  -  -  -  -  -  -\r\n" + 
					" 3| x  -  -  -  -  -  -  -\r\n" + 
					" 4| x  -  -  -  -  -  -  -\r\n" + 
					" 5| x  -  -  -  -  -  -  -\r\n" + 
					" 6| x  -  -  -  -  -  -  -\r\n" + 
					" 7| x  -  -  -  -  -  -  -\r\n" + 
					" 8| x  x  x  x  x  x  x  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==1 && y==2) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| x  x  x  x  x  x  x  x\r\n" + 
					" 2| -  x  -  -  -  -  -  -\r\n" + 
					" 3| -  x  -  -  -  -  -  -\r\n" + 
					" 4| -  x  -  -  -  -  -  -\r\n" + 
					" 5| -  x  -  -  -  -  -  -\r\n" + 
					" 6| -  x  -  -  -  -  -  -\r\n" + 
					" 7| -  x  -  -  -  -  -  -\r\n" + 
					" 8| -  x  -  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==2&&y==2) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  x  -  -  -  -  -  -\r\n" + 
					" 2| x  x  x  x  x  x  x  x\r\n" + 
					" 3| -  x  -  -  -  -  -  -\r\n" + 
					" 4| -  x  -  -  -  -  -  -\r\n" + 
					" 5| -  x  -  -  -  -  -  -\r\n" + 
					" 6| -  x  -  -  -  -  -  -\r\n" + 
					" 7| -  x  -  -  -  -  -  -\r\n" + 
					" 8| -  x  -  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==3 && y==2) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  x  -  -  -  -  -  -\r\n" + 
					" 2| -  x  -  -  -  -  -  -\r\n" + 
					" 3| x  x  x  x  x  x  x  x\r\n" + 
					" 4| -  x  -  -  -  -  -  -\r\n" + 
					" 5| -  x  -  -  -  -  -  -\r\n" + 
					" 6| -  x  -  -  -  -  -  -\r\n" + 
					" 7| -  x  -  -  -  -  -  -\r\n" + 
					" 8| -  x  -  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==4 && y==2) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  x  -  -  -  -  -  -\r\n" + 
					" 2| -  x  -  -  -  -  -  -\r\n" + 
					" 3| -  x  -  -  -  -  -  -\r\n" + 
					" 4| x  x  x  x  x  x  x  x\r\n" + 
					" 5| -  x  -  -  -  -  -  -\r\n" + 
					" 6| -  x  -  -  -  -  -  -\r\n" + 
					" 7| -  x  -  -  -  -  -  -\r\n" + 
					" 8| -  x  -  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==5 && y==2) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  x  -  -  -  -  -  -\r\n" + 
					" 2| -  x  -  -  -  -  -  -\r\n" + 
					" 3| -  x  -  -  -  -  -  -\r\n" + 
					" 4| -  x  -  -  -  -  -  -\r\n" + 
					" 5| x  x  x  x  x  x  x  x\r\n" + 
					" 6| -  x  -  -  -  -  -  -\r\n" + 
					" 7| -  x  -  -  -  -  -  -\r\n" + 
					" 8| -  x  -  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==6 && y==2) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  x  -  -  -  -  -  -\r\n" + 
					" 2| -  x  -  -  -  -  -  -\r\n" + 
					" 3| -  x  -  -  -  -  -  -\r\n" + 
					" 4| -  x  -  -  -  -  -  -\r\n" + 
					" 5| -  x  -  -  -  -  -  -\r\n" + 
					" 6| x  x  x  x  x  x  x  x\r\n" + 
					" 7| -  x  -  -  -  -  -  -\r\n" + 
					" 8| -  x  -  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==7 && y==2) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  x  -  -  -  -  -  -\r\n" + 
					" 2| -  x  -  -  -  -  -  -\r\n" + 
					" 3| -  x  -  -  -  -  -  -\r\n" + 
					" 4| -  x  -  -  -  -  -  -\r\n" + 
					" 5| -  x  -  -  -  -  -  -\r\n" + 
					" 6| -  x  -  -  -  -  -  -\r\n" + 
					" 7| x  x  x  x  x  x  x  x\r\n" + 
					" 8| -  x  -  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==8 && y==2) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  x  -  -  -  -  -  -\r\n" + 
					" 2| -  x  -  -  -  -  -  -\r\n" + 
					" 3| -  x  -  -  -  -  -  -\r\n" + 
					" 4| -  x  -  -  -  -  -  -\r\n" + 
					" 5| -  x  -  -  -  -  -  -\r\n" + 
					" 6| -  x  -  -  -  -  -  -\r\n" + 
					" 7| -  x  -  -  -  -  -  -\r\n" + 
					" 8| x  x  x  x  x  x  x  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==1 && y==3) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| x  x  x  x  x  x  x  x\r\n" + 
					" 2| -  -  x  -  -  -  -  -\r\n" + 
					" 3| -  -  x  -  -  -  -  -\r\n" + 
					" 4| -  -  x  -  -  -  -  -\r\n" + 
					" 5| -  -  x  -  -  -  -  -\r\n" + 
					" 6| -  -  x  -  -  -  -  -\r\n" + 
					" 7| -  -  x  -  -  -  -  -\r\n" + 
					" 8| -  -  x  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==2 && y==3) {		
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  x  -  -  -  -  -\r\n" + 
					" 2| x  x  x  x  x  x  x  x\r\n" + 
					" 3| -  -  x  -  -  -  -  -\r\n" + 
					" 4| -  -  x  -  -  -  -  -\r\n" + 
					" 5| -  -  x  -  -  -  -  -\r\n" + 
					" 6| -  -  x  -  -  -  -  -\r\n" + 
					" 7| -  -  x  -  -  -  -  -\r\n" + 
					" 8| -  -  x  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==3 && y==3) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  x  -  -  -  -  -\r\n" + 
					" 2| -  -  x  -  -  -  -  -\r\n" + 
					" 3| x  x  x  x  x  x  x  x\r\n" + 
					" 4| -  -  x  -  -  -  -  -\r\n" + 
					" 5| -  -  x  -  -  -  -  -\r\n" + 
					" 6| -  -  x  -  -  -  -  -\r\n" + 
					" 7| -  -  x  -  -  -  -  -\r\n" + 
					" 8| -  -  x  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==4 && y==3) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  x  -  -  -  -  -\r\n" + 
					" 2| -  -  x  -  -  -  -  -\r\n" + 
					" 3| -  -  x  -  -  -  -  -\r\n" + 
					" 4| x  x  x  x  x  x  x  x\r\n" + 
					" 5| -  -  x  -  -  -  -  -\r\n" + 
					" 6| -  -  x  -  -  -  -  -\r\n" + 
					" 7| -  -  x  -  -  -  -  -\r\n" + 
					" 8| -  -  x  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==5 && y==3) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  x  -  -  -  -  -\r\n" + 
					" 2| -  -  x  -  -  -  -  -\r\n" + 
					" 3| -  -  x  -  -  -  -  -\r\n" + 
					" 4| -  -  x  -  -  -  -  -\r\n" + 
					" 5| x  x  x  x  x  x  x  x\r\n" + 
					" 6| -  -  x  -  -  -  -  -\r\n" + 
					" 7| -  -  x  -  -  -  -  -\r\n" + 
					" 8| -  -  x  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==6 && y==3) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  x  -  -  -  -  -\r\n" + 
					" 2| -  -  x  -  -  -  -  -\r\n" + 
					" 3| -  -  x  -  -  -  -  -\r\n" + 
					" 4| -  -  x  -  -  -  -  -\r\n" + 
					" 5| -  -  x  -  -  -  -  -\r\n" + 
					" 6| x  x  x  x  x  x  x  x\r\n" + 
					" 7| -  -  x  -  -  -  -  -\r\n" + 
					" 8| -  -  x  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==7 && y==3) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  x  -  -  -  -  -\r\n" + 
					" 2| -  -  x  -  -  -  -  -\r\n" + 
					" 3| -  -  x  -  -  -  -  -\r\n" + 
					" 4| -  -  x  -  -  -  -  -\r\n" + 
					" 5| -  -  x  -  -  -  -  -\r\n" + 
					" 6| -  -  x  -  -  -  -  -\r\n" + 
					" 7| x  x  x  x  x  x  x  x\r\n" + 
					" 8| -  -  x  -  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==8 && y==3) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  x  -  -  -  -  -\r\n" + 
					" 2| -  -  x  -  -  -  -  -\r\n" + 
					" 3| -  -  x  -  -  -  -  -\r\n" + 
					" 4| -  -  x  -  -  -  -  -\r\n" + 
					" 5| -  -  x  -  -  -  -  -\r\n" + 
					" 6| -  -  x  -  -  -  -  -\r\n" + 
					" 7| -  -  x  -  -  -  -  -\r\n" + 
					" 8| x  x  x  x  x  x  x  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==1 && y==4) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| x  x  x  x  x  x  x  x\r\n" + 
					" 2| -  -  -  x  -  -  -  -\r\n" + 
					" 3| -  -  -  x  -  -  -  -\r\n" + 
					" 4| -  -  -  x  -  -  -  -\r\n" + 
					" 5| -  -  -  x  -  -  -  -\r\n" + 
					" 6| -  -  -  x  -  -  -  -\r\n" + 
					" 7| -  -  -  x  -  -  -  -\r\n" + 
					" 8| -  -  -  x  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==2 && y==4) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  x  -  -  -  -\r\n" + 
					" 2| x  x  x  x  x  x  x  x\r\n" + 
					" 3| -  -  -  x  -  -  -  -\r\n" + 
					" 4| -  -  -  x  -  -  -  -\r\n" + 
					" 5| -  -  -  x  -  -  -  -\r\n" + 
					" 6| -  -  -  x  -  -  -  -\r\n" + 
					" 7| -  -  -  x  -  -  -  -\r\n" + 
					" 8| -  -  -  x  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==3 && y==4) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  x  -  -  -  -\r\n" + 
					" 2| -  -  -  x  -  -  -  -\r\n" + 
					" 3| x  x  x  x  x  x  x  x\r\n" + 
					" 4| -  -  -  x  -  -  -  -\r\n" + 
					" 5| -  -  -  x  -  -  -  -\r\n" + 
					" 6| -  -  -  x  -  -  -  -\r\n" + 
					" 7| -  -  -  x  -  -  -  -\r\n" + 
					" 8| -  -  -  x  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==4 && y==4) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  x  -  -  -  -\r\n" + 
					" 2| -  -  -  x  -  -  -  -\r\n" + 
					" 3| -  -  -  x  -  -  -  -\r\n" + 
					" 4| x  x  x  x  x  x  x  x\r\n" + 
					" 5| -  -  -  x  -  -  -  -\r\n" + 
					" 6| -  -  -  x  -  -  -  -\r\n" + 
					" 7| -  -  -  x  -  -  -  -\r\n" + 
					" 8| -  -  -  x  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==5 && y==4) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  x  -  -  -  -\r\n" + 
					" 2| -  -  -  x  -  -  -  -\r\n" + 
					" 3| -  -  -  x  -  -  -  -\r\n" + 
					" 4| -  -  -  x  -  -  -  -\r\n" + 
					" 5| x  x  x  x  x  x  x  x\r\n" + 
					" 6| -  -  -  x  -  -  -  -\r\n" + 
					" 7| -  -  -  x  -  -  -  -\r\n" + 
					" 8| -  -  -  x  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==6 && y==4) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  x  -  -  -  -\r\n" + 
					" 2| -  -  -  x  -  -  -  -\r\n" + 
					" 3| -  -  -  x  -  -  -  -\r\n" + 
					" 4| -  -  -  x  -  -  -  -\r\n" + 
					" 5| -  -  -  x  -  -  -  -\r\n" + 
					" 6| x  x  x  x  x  x  x  x\r\n" + 
					" 7| -  -  -  x  -  -  -  -\r\n" + 
					" 8| -  -  -  x  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();;}
		if(x==7 && y==4) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  x  -  -  -  -\r\n" + 
					" 2| -  -  -  x  -  -  -  -\r\n" + 
					" 3| -  -  -  x  -  -  -  -\r\n" + 
					" 4| -  -  -  x  -  -  -  -\r\n" + 
					" 5| -  -  -  x  -  -  -  -\r\n" + 
					" 6| -  -  -  x  -  -  -  -\r\n" + 
					" 7| x  x  x  x  x  x  x  x\r\n" + 
					" 8| -  -  -  x  -  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
						opcao=entrada.nextInt();}
		if(x==8 && y==4) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  x  -  -  -  -\r\n" + 
					" 2| -  -  -  x  -  -  -  -\r\n" + 
					" 3| -  -  -  x  -  -  -  -\r\n" + 
					" 4| -  -  -  x  -  -  -  -\r\n" + 
					" 5| -  -  -  x  -  -  -  -\r\n" + 
					" 6| -  -  -  x  -  -  -  -\r\n" + 
					" 7| -  -  -  x  -  -  -  -\r\n" + 
					" 8| x  x  x  x  x  x  x  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==1 && y==5) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| x  x  x  x  x  x  x  x\r\n" + 
					" 2| -  -  -  -  x  -  -  -\r\n" + 
					" 3| -  -  -  -  x  -  -  -\r\n" + 
					" 4| -  -  -  -  x  -  -  -\r\n" + 
					" 5| -  -  -  -  x  -  -  -\r\n" + 
					" 6| -  -  -  -  x  -  -  -\r\n" + 
					" 7| -  -  -  -  x  -  -  -\r\n" + 
					" 8| -  -  -  -  x  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==2 && y==5) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  x  -  -  -\r\n" + 
					" 2| x  x  x  x  x  x  x  x\r\n" + 
					" 3| -  -  -  -  x  -  -  -\r\n" + 
					" 4| -  -  -  -  x  -  -  -\r\n" + 
					" 5| -  -  -  -  x  -  -  -\r\n" + 
					" 6| -  -  -  -  x  -  -  -\r\n" + 
					" 7| -  -  -  -  x  -  -  -\r\n" + 
					" 8| -  -  -  -  x  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==3 && y==5) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  x  -  -  -\r\n" + 
					" 2| -  -  -  -  x  -  -  -\r\n" + 
					" 3| x  x  x  x  x  x  x  x\r\n" + 
					" 4| -  -  -  -  x  -  -  -\r\n" + 
					" 5| -  -  -  -  x  -  -  -\r\n" + 
					" 6| -  -  -  -  x  -  -  -\r\n" + 
					" 7| -  -  -  -  x  -  -  -\r\n" + 
					" 8| -  -  -  -  x  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();;}
		if(x==4 && y==5) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  x  -  -  -\r\n" + 
					" 2| -  -  -  -  x  -  -  -\r\n" + 
					" 3| -  -  -  -  x  -  -  -\r\n" + 
					" 4| x  x  x  x  x  x  x  x\r\n" + 
					" 5| -  -  -  -  x  -  -  -\r\n" + 
					" 6| -  -  -  -  x  -  -  -\r\n" + 
					" 7| -  -  -  -  x  -  -  -\r\n" + 
					" 8| -  -  -  -  x  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==5 && y==5) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  x  -  -  -\r\n" + 
					" 2| -  -  -  -  x  -  -  -\r\n" + 
					" 3| -  -  -  -  x  -  -  -\r\n" + 
					" 4| -  -  -  -  x  -  -  -\r\n" + 
					" 5| x  x  x  x  x  x  x  x\r\n" + 
					" 6| -  -  -  -  x  -  -  -\r\n" + 
					" 7| -  -  -  -  x  -  -  -\r\n" + 
					" 8| -  -  -  -  x  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();;}
		if(x==6 && y==5) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  x  -  -  -\r\n" + 
					" 2| -  -  -  -  x  -  -  -\r\n" + 
					" 3| -  -  -  -  x  -  -  -\r\n" + 
					" 4| -  -  -  -  x  -  -  -\r\n" + 
					" 5| -  -  -  -  x  -  -  -\r\n" + 
					" 6| x  x  x  x  x  x  x  x\r\n" + 
					" 7| -  -  -  -  x  -  -  -\r\n" + 
					" 8| -  -  -  -  x  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");;
				opcao=entrada.nextInt();;}
		if(x==7 && y==5) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  x  -  -  -\r\n" + 
					" 2| -  -  -  -  x  -  -  -\r\n" + 
					" 3| -  -  -  -  x  -  -  -\r\n" + 
					" 4| -  -  -  -  x  -  -  -\r\n" + 
					" 5| -  -  -  -  x  -  -  -\r\n" + 
					" 6| -  -  -  -  x  -  -  -\r\n" + 
					" 7| x  x  x  x  x  x  x  x\r\n" + 
					" 8| -  -  -  -  x  -  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();;}
		if(x==8 && y==5) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  x  -  -  -\r\n" + 
					" 2| -  -  -  -  x  -  -  -\r\n" + 
					" 3| -  -  -  -  x  -  -  -\r\n" + 
					" 4| -  -  -  -  x  -  -  -\r\n" + 
					" 5| -  -  -  -  x  -  -  -\r\n" + 
					" 6| -  -  -  -  x  -  -  -\r\n" + 
					" 7| -  -  -  -  x  -  -  -\r\n" + 
					" 8| x  x  x  x  x  x  x  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();;}
		if(x==1 && y==6) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| x  x  x  x  x  x  x  x\r\n" + 
					" 2| -  -  -  -  -  x  -  -\r\n" + 
					" 3| -  -  -  -  -  x  -  -\r\n" + 
					" 4| -  -  -  -  -  x  -  -\r\n" + 
					" 5| -  -  -  -  -  x  -  -\r\n" + 
					" 6| -  -  -  -  -  x  -  -\r\n" + 
					" 7| -  -  -  -  -  x  -  -\r\n" + 
					" 8| -  -  -  -  -  x  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();;}
		if(x==2 && y==6) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  x  -  -\r\n" + 
					" 2| x  x  x  x  x  x  x  x\r\n" + 
					" 3| -  -  -  -  -  x  -  -\r\n" + 
					" 4| -  -  -  -  -  x  -  -\r\n" + 
					" 5| -  -  -  -  -  x  -  -\r\n" + 
					" 6| -  -  -  -  -  x  -  -\r\n" + 
					" 7| -  -  -  -  -  x  -  -\r\n" + 
					" 8| -  -  -  -  -  x  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==3 && y==6) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  x  -  -\r\n" + 
					" 2| -  -  -  -  -  x  -  -\r\n" + 
					" 3| x  x  x  x  x  x  x  x\r\n" + 
					" 4| -  -  -  -  -  x  -  -\r\n" + 
					" 5| -  -  -  -  -  x  -  -\r\n" + 
					" 6| -  -  -  -  -  x  -  -\r\n" + 
					" 7| -  -  -  -  -  x  -  -\r\n" + 
					" 8| -  -  -  -  -  x  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==4 && y==6) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  x  -  -\r\n" + 
					" 2| -  -  -  -  -  x  -  -\r\n" + 
					" 3| -  -  -  -  -  x  -  -\r\n" + 
					" 4| x  x  x  x  x  x  x  x\r\n" + 
					" 5| -  -  -  -  -  x  -  -\r\n" + 
					" 6| -  -  -  -  -  x  -  -\r\n" + 
					" 7| -  -  -  -  -  x  -  -\r\n" + 
					" 8| -  -  -  -  -  x  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==5 && y==6) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  x  -  -\r\n" + 
					" 2| -  -  -  -  -  x  -  -\r\n" + 
					" 3| -  -  -  -  -  x  -  -\r\n" + 
					" 4| -  -  -  -  -  x  -  -\r\n" + 
					" 5| x  x  x  x  x  x  x  x\r\n" + 
					" 6| -  -  -  -  -  x  -  -\r\n" + 
					" 7| -  -  -  -  -  x  -  -\r\n" + 
					" 8| -  -  -  -  -  x  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==6 && y==6) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  x  -  -\r\n" + 
					" 2| -  -  -  -  -  x  -  -\r\n" + 
					" 3| -  -  -  -  -  x  -  -\r\n" + 
					" 4| -  -  -  -  -  x  -  -\r\n" + 
					" 5| -  -  -  -  -  x  -  -\r\n" + 
					" 6| x  x  x  x  x  x  x  x\r\n" + 
					" 7| -  -  -  -  -  x  -  -\r\n" + 
					" 8| -  -  -  -  -  x  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==7 && y==6) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  x  -  -\r\n" + 
					" 2| -  -  -  -  -  x  -  -\r\n" + 
					" 3| -  -  -  -  -  x  -  -\r\n" + 
					" 4| -  -  -  -  -  x  -  -\r\n" + 
					" 5| -  -  -  -  -  x  -  -\r\n" + 
					" 6| -  -  -  -  -  x  -  -\r\n" + 
					" 7| x  x  x  x  x  x  x  x\r\n" + 
					" 8| -  -  -  -  -  x  -  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==8 && y==6) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  x  -  -\r\n" + 
					" 2| -  -  -  -  -  x  -  -\r\n" + 
					" 3| -  -  -  -  -  x  -  -\r\n" + 
					" 4| -  -  -  -  -  x  -  -\r\n" + 
					" 5| -  -  -  -  -  x  -  -\r\n" + 
					" 6| -  -  -  -  -  x  -  -\r\n" + 
					" 7| -  -  -  -  -  x  -  -\r\n" + 
					" 8| x  x  x  x  x  x  x  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==1 && y==7) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| x  x  x  x  x  x  x  x\r\n" + 
					" 2| -  -  -  -  -  -  x  -\r\n" + 
					" 3| -  -  -  -  -  -  x  -\r\n" + 
					" 4| -  -  -  -  -  -  x  -\r\n" + 
					" 5| -  -  -  -  -  -  x  -\r\n" + 
					" 6| -  -  -  -  -  -  x  -\r\n" + 
					" 7| -  -  -  -  -  -  x  -\r\n" + 
					" 8| -  -  -  -  -  -  x  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==2 && y==7) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  -  x  -\r\n" + 
					" 2| x  x  x  x  x  x  x  x\r\n" + 
					" 3| -  -  -  -  -  -  x  -\r\n" + 
					" 4| -  -  -  -  -  -  x  -\r\n" + 
					" 5| -  -  -  -  -  -  x  -\r\n" + 
					" 6| -  -  -  -  -  -  x  -\r\n" + 
					" 7| -  -  -  -  -  -  x  -\r\n" + 
					" 8| -  -  -  -  -  -  x  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==3 && y==7) {
		System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  -  x  -\r\n" + 
					" 2| -  -  -  -  -  -  x  -\r\n" + 
					" 3| x  x  x  x  x  x  x  x\r\n" + 
					" 4| -  -  -  -  -  -  x  -\r\n" + 
					" 5| -  -  -  -  -  -  x  -\r\n" + 
					" 6| -  -  -  -  -  -  x  -\r\n" + 
					" 7| -  -  -  -  -  -  x  -\r\n" + 
					" 8| -  -  -  -  -  -  x  -");
		System.out.println("Digite a opção que deseja realizar: \n"
				+"1- Continuar\n"
				+"2- Sair");
			opcao=entrada.nextInt();}
		if(x==4 && y==7) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  -  x  -\r\n" + 
					" 2| -  -  -  -  -  -  x  -\r\n" + 
					" 3| -  -  -  -  -  -  x  -\r\n" + 
					" 4| x  x  x  x  x  x  x  x\r\n" + 
					" 5| -  -  -  -  -  -  x  -\r\n" + 
					" 6| -  -  -  -  -  -  x  -\r\n" + 
					" 7| -  -  -  -  -  -  x  -\r\n" + 
					" 8| -  -  -  -  -  -  x  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==5 && y==7) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  -  x  -\r\n" + 
					" 2| -  -  -  -  -  -  x  -\r\n" + 
					" 3| -  -  -  -  -  -  x  -\r\n" + 
					" 4| -  -  -  -  -  -  x  -\r\n" + 
					" 5| x  x  x  x  x  x  x  x\r\n" + 
					" 6| -  -  -  -  -  -  x  -\r\n" + 
					" 7| -  -  -  -  -  -  x  -\r\n" + 
					" 8| -  -  -  -  -  -  x  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==6 && y==7) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  -  x  -\r\n" + 
					" 2| -  -  -  -  -  -  x  -\r\n" + 
					" 3| -  -  -  -  -  -  x  -\r\n" + 
					" 4| -  -  -  -  -  -  x  -\r\n" + 
					" 5| -  -  -  -  -  -  x  -\r\n" + 
					" 6| x  x  x  x  x  x  x  x\r\n" + 
					" 7| -  -  -  -  -  -  x  -\r\n" + 
					" 8| -  -  -  -  -  -  x  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==7 && y==7) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  -  x  -\r\n" + 
					" 2| -  -  -  -  -  -  x  -\r\n" + 
					" 3| -  -  -  -  -  -  x  -\r\n" + 
					" 4| -  -  -  -  -  -  x  -\r\n" + 
					" 5| -  -  -  -  -  -  x  -\r\n" + 
					" 6| -  -  -  -  -  -  x  -\r\n" + 
					" 7| x  x  x  x  x  x  x  x\r\n" + 
					" 8| -  -  -  -  -  -  x  -");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==8 && y==7) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  -  x  -\r\n" + 
					" 2| -  -  -  -  -  -  x  -\r\n" + 
					" 3| -  -  -  -  -  -  x  -\r\n" + 
					" 4| -  -  -  -  -  -  x  -\r\n" + 
					" 5| -  -  -  -  -  -  x  -\r\n" + 
					" 6| -  -  -  -  -  -  x  -\r\n" + 
					" 7| -  -  -  -  -  -  x  -\r\n" + 
					" 8| x  x  x  x  x  x  x  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==1 && y==8) {			
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| x  x  x  x  x  x  x  x\r\n" + 
					" 2| -  -  -  -  -  -  -  x\r\n" + 
					" 3| -  -  -  -  -  -  -  x\r\n" + 
					" 4| -  -  -  -  -  -  -  x\r\n" + 
					" 5| -  -  -  -  -  -  -  x\r\n" + 
					" 6| -  -  -  -  -  -  -  x\r\n" + 
					" 7| -  -  -  -  -  -  -  x\r\n" + 
					" 8| -  -  -  -  -  -  -  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==2 && y==8) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  -  -  x\r\n" + 
					" 2| x  x  x  x  x  x  x  x\r\n" + 
					" 3| -  -  -  -  -  -  -  x\r\n" + 
					" 4| -  -  -  -  -  -  -  x\r\n" + 
					" 5| -  -  -  -  -  -  -  x\r\n" + 
					" 6| -  -  -  -  -  -  -  x\r\n" + 
					" 7| -  -  -  -  -  -  -  x\r\n" + 
					" 8| -  -  -  -  -  -  -  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==3 && y==8) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  -  -  x\r\n" + 
					" 2| -  -  -  -  -  -  -  x\r\n" + 
					" 3| x  x  x  x  x  x  x  x\r\n" + 
					" 4| -  -  -  -  -  -  -  x\r\n" + 
					" 5| -  -  -  -  -  -  -  x\r\n" + 
					" 6| -  -  -  -  -  -  -  x\r\n" + 
					" 7| -  -  -  -  -  -  -  x\r\n" + 
					" 8| -  -  -  -  -  -  -  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==4 && y==8) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  -  -  x\r\n" + 
					" 2| -  -  -  -  -  -  -  x\r\n" + 
					" 3| -  -  -  -  -  -  -  x\r\n" + 
					" 4| x  x  x  x  x  x  x  xr\n" + 
					" 5| -  -  -  -  -  -  -  x\r\n" + 
					" 6| -  -  -  -  -  -  -  x\r\n" + 
					" 7| -  -  -  -  -  -  -  x\r\n" + 
					" 8| -  -  -  -  -  -  -  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==5 && y==8) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  -  -  x\r\n" + 
					" 2| -  -  -  -  -  -  -  x\r\n" + 
					" 3| -  -  -  -  -  -  -  x\r\n" + 
					" 4| -  -  -  -  -  -  -  x\r\n" + 
					" 5| x  x  x  x  x  x  x  x\r\n" + 
					" 6| -  -  -  -  -  -  -  x\r\n" + 
					" 7| -  -  -  -  -  -  -  x\r\n" + 
					" 8| -  -  -  -  -  -  -  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==6 && y==8) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  -  -  x\r\n" + 
					" 2| -  -  -  -  -  -  -  x\r\n" + 
					" 3| -  -  -  -  -  -  -  x\r\n" + 
					" 4| -  -  -  -  -  -  -  x\r\n" + 
					" 5| -  -  -  -  -  -  -  x\r\n" + 
					" 6| x  x  x  x  x  x  x  x\r\n" + 
					" 7| -  -  -  -  -  -  -  x\r\n" + 
					" 8| -  -  -  -  -  -  -  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==7 && y==8) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  -  -  x\r\n" + 
					" 2| -  -  -  -  -  -  -  x\r\n" + 
					" 3| -  -  -  -  -  -  -  x\r\n" + 
					" 4| -  -  -  -  -  -  -  x\r\n" + 
					" 5| -  -  -  -  -  -  -  x\r\n" + 
					" 6| -  -  -  -  -  -  -  x\r\n" + 
					" 7| x  x  x  x  x  x  x  x\r\n" + 
					" 8| -  -  -  -  -  -  -  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");
				opcao=entrada.nextInt();}
		if(x==8 && y==8) {
			System.out.println("    1  2  3  4  5  6  7  8\r\n" + 
					"   -----------------------\r\n" + 
					" 1| -  -  -  -  -  -  -  x\r\n" + 
					" 2| -  -  -  -  -  -  -  x\r\n" + 
					" 3| -  -  -  -  -  -  -  x-\r\n" + 
					" 4| -  -  -  -  -  -  -  x\r\n" + 
					" 5| -  -  -  -  -  -  -  x\r\n" + 
					" 6| -  -  -  -  -  -  -  x\r\n" + 
					" 7| -  -  -  -  -  -  -  x\r\n" + 
					" 8| x  x  x  x  x  x  x  x");
			System.out.println("Digite a opção que deseja realizar: \n"
					+"1- Continuar\n"
					+"2- Sair");;
			opcao=entrada.nextInt();}
		
		}while(opcao!=2);}}
		
		

