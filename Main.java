import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String cpf, senha, menu3;
    int Saldo = 1000;
    int Depósito, Saque, Sair, agencia, banco, conta, valor;  
    int Menu = 0;

    System.out.println("Seja bem vindo a tela inicial do Banco ADS!");
    System.out.print("Coloque o seu cpf: ");
    cpf = ler.next();

    for (int cpf2 = 1; cpf2 <= 5; cpf2++)
    {
    if(cpf.equals("123.456.789-00"))
    {
      System.out.print("Acesso liberado.\n");
      cpf2 = 6;
    } else {
switch (cpf2){
  case 1:
      System.out.print("Tela de acesso não permitida.\n Tente novamente: ");
      cpf = ler.next();
      break;
      
  case 2:
      System.out.print("Tela de acesso não permitida.\n Tente novamente: ");
      cpf = ler.next();
      break;
      
  case 3:
      System.out.print("Tela de acesso não permitida.\n Tente novamente: ");
      cpf = ler.next();
      break;
      
  case 4:
      System.out.print("Tela de acesso não permitida.\n Tente novamente: ");
      cpf = ler.next();
      break;
  
  case 5:
      System.out.print("Tela de acesso não permitida.\n Tente novamente: ");
      cpf = ler.next();
      System.out.print("Acesso negado.");
      System.exit(0);
    }
    }
    } 
    System.out.print("Digite sua senha, por favor: ");
    senha = ler.next();
    
    for (int senha2 = 1; senha2 <= 3; senha2++)
  {
    if(senha.equals("01020304"))
    {
      System.out.println("Senha correta, vamos prosseguir.");
      senha2 = 4;
    } else {
switch (senha2){
  case 1:
  System.out.print("Senha incorreta, tente novamente.\n Senha:");
  senha = ler.next();
  break;

  case 2:
  System.out.println("Ultima tentativa, caso errada sua conta sera bloqueada!\n Senha:");
  senha = ler.next();
  break;

  case 3:
  System.out.print("Sua conta foi bloqueada.");
  System.exit(0);

}
    }
  }
  
    for (int menu2 = 0; menu2 < 1;){
 
    System.out.println("Menu: \n" + "1 – Saldo \n" + "2 – Depósito \n" + "3 – Saque \n" + "4 - Transferencia \n" + "0 – Sair\n" + "Escolha uma opção, por favor: ");
    Menu = ler.nextInt();

  switch (Menu){
      case 1:
      System.out.println("Saldo atual: R$"+Saldo);      
      System.out.println("Se quiser fazer uma nova transação digite: menu, caso queira sair digite: cancelar.");
      menu3 = ler.next();
      if(menu3.equals("cancelar"))
      {    
      menu2++;
      } 
      break;

      case 2:
      System.out.println("Digite o valor do Depósito: ");
      Depósito = ler.nextInt();
      System.out.print("Depósito efetuado com sucesso!\n");
      Saldo = Saldo + Depósito;
      System.out.print("Saldo atual: R$"+Saldo);   
      System.out.println("Se quiser fazer uma nova transação digite: menu, caso queira sair digite: cancelar.");
      menu3 = ler.next();
      if(menu3.equals("cancelar"))
      {    
      menu2++;
      } 
      break;

      case 3:
      System.out.println("Digite o valor que deseja sacar: ");
      Saque = ler.nextInt();
      if (Saque <= Saldo){
      System.out.println("Saque efetuado, no valor R$"+Saque);
      Saldo = Saldo - Saque;
      System.out.println("Saldo atual: R$"+Saldo);   
      System.out.println("Se quiser fazer uma nova transação digite: menu, caso queira sair digite: cancelar.");
      menu3 = ler.next();
      if(menu3.equals("cancelar"))
      {    
      menu2++;
      } 
      } else {
      System.out.println("O valor digitado é maior do que seu saldo.");
      
      }
      break;
      case 0:
      System.out.print("Sessão encerrada com sucesso.");
      System.exit(0);

      case 4:
      System.out.println("Digite a conta que voce deseja transferir: \n");
      conta = ler.nextInt();
      System.out.println("Digite o numero da agência: \n");
      agencia = ler.nextInt();
      System.out.println("Digite o numero do banco: \n");
      banco = ler.nextInt();
      System.out.println("Digite o valor que deseja transferir: \n");
      valor = ler.nextInt();
      System.out.println("Transferencia efetuada com sucesso no valor de R$"+valor);
      Saldo = Saldo - valor;
      System.out.println("Saldo na conta: R$"+Saldo);
      System.out.println("Se quiser fazer uma nova transação digite: menu, caso queira sair digite: cancelar.");
      menu3 = ler.next();
      if(menu3.equals("cancelar"))
      {    
      menu2++;
      } 
      break;
      
  } 
  }
    } 

    
  }

  
