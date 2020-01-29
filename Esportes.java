
package esportes;
import java.text.DecimalFormat;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Esportes {


       private static DecimalFormat df2 = new DecimalFormat("#.##");
    
    
    public static void main(String[] args) {
      

        
   
 
        int[] modalidade;
        String[] nome;
         
        //ALOCA MEMÓRIA PARA 10 INTEIROS
        modalidade = new int[26];
        nome = new String[26];
        
        nome[0]="Futebol ";
        nome[1]="Futebol de Salão ";
        nome[2]="Vôlei ";
        nome[3]="Vôlei de Praia ";
        nome[4]="Basquete ";
        nome[5]="Handball ";
        nome[6]="Rugbi ";
        nome[7]="Futebol Americano ";
        nome[8]="Ciclismo ";
        nome[9]="Tenis ";
        nome[10]="Natação ";
        nome[11]="Atletismo ";
        nome[12]="Musculação ";
        nome[13]="Ginástica ";
        nome[14]="Corrida ";
        nome[15]="Tênis de Mesa ";
        nome[16]="Xadrez ";
        nome[17]="Surf ";
        nome[18]="Golf ";
        nome[19]="Boliche ";
        nome[20]="Bocha ";
        nome[21]="Remo ";
        nome[22]="Badminton ";
        nome[23]="Boxe ";
        nome[24]="Karate ";
        nome[25]="Luta Greco-Romana ";
        
        double altura=0;
        double peso=0;
        double imc=0;
        
        
      


        
        
   java.awt.Toolkit.getDefaultToolkit().beep();
        
       
     Scanner recebe = new Scanner(System.in);

 System.out.println("");    
  JOptionPane.showMessageDialog(null,
                "\n ======================================================== \n\n"
              + "                                Bem vindo ao Conselheiro Esportivo \n\n"
              + "              Responda as questões com as letras correspondentes. \n \n"
              + "                                          Aperte ENTER para iniciar \n\n"
              + "========================================================\n\n");

     

        
        
        
        
        
        String usuario;
         usuario = JOptionPane.showInputDialog(null,"Por favor, informe seu nome");
        
          
        
        
        
        
        
        
           // INICIO PERGUNTA ALTURA ////////////////////
    
      int b = 0;
            while(b!=1)
        {
          
 
        String respostaa;
        double resposta;
        
         respostaa = JOptionPane.showInputDialog(null,"     Por favor informe sua altura em cm");
         
          System.out.print("\n     R: "); 
          //resposta = recebe.nextDouble();
          resposta = Float.parseFloat(respostaa);

        if(resposta>40 && resposta<300)
        {
            b=1;
            altura = resposta/100;
        }
        else
        {
          b=0; //para continuar no while
            JOptionPane.showMessageDialog(null," \n RESPONDA CORRETAMENTE! \n \n");
}
} // WHILE END
            
             System.out.println("\n     ======================================================== \n ");   
            
            //////////////// FIM PERGUNTA ALTURA ////////////////
            
            
            
            
            
            
            
            
            
            
            
            
            //////////// COMECO PERGUNTA PESO ///////////////////////
            
            b = 0;
            while(b!=1)
        {
       
 
               String respostaa;
        double resposta;
        
         respostaa = JOptionPane.showInputDialog(null,"     Por favor informe seu peso em kg");
         
       
 
          resposta = Float.parseFloat(respostaa);

        if(resposta>0 && resposta<200)
        {
            peso = resposta;
            b=1;
        }
        else
        {
          b=0; //para continuar no while
            JOptionPane.showMessageDialog(null," \n RESPONDA CORRETAMENTE! \n \n");
        }
        } // WHILE END
            
            
            
            
            ///////////// FIM PERGUNTA PESO ////////////////////a
        
        
        
        
        
        
             
      
             ///// LA PREGUNTA ////////////
             
         int a = 0;
            while(a!=1)
        {
       // System.out.println("     1) O que voce espera de uma atividade fisica?");
       // System.out.println("     a) Apenas diversao");
       // System.out.println("     b) Ganhar massa muscular"); 
       //  System.out.println("     c) Perder peso");

   
        
        
        String resposta;
      //  System.out.print("\n     R: ");
      // resposta = recebe.nextLine();
      resposta =  JOptionPane.showInputDialog("1) O que você espera de uma atividade física? \n\n a) Apenas diversão \n b) Ganhar massa muscular \n c) Perder peso \n\n");
    //  JOptionPane.showInputDialog(null, "", resposta);
         
        // System.out.println("\n \n     ========================================================");    
       
    
        if ("a".equals(resposta)) {
          
            
            modalidade[0]++;
            modalidade[1]++;
            modalidade[2]++;
            modalidade[3]++;
            modalidade[4]++;
            modalidade[5]++;
            
            modalidade[8]++;
            modalidade[9]++;
            
            modalidade[15]++;
            modalidade[16]++;
            modalidade[17]++;
            modalidade[18]++;
            modalidade[19]++;
            modalidade[20]++;
            modalidade[21]++;
            modalidade[22]++;
            
            a=1; // para sair do WHILE
        }
       
        else if("b".equals(resposta))
        {
            modalidade[6]++;
            modalidade[7]++;
            
            modalidade[10]++;
            modalidade[11]++;
            modalidade[12]++;
            
            modalidade[24]++;
         a=1;//para sair do while
        }
        else if("c".equals(resposta))
       {
           modalidade[13]=modalidade[13]+9;
           modalidade[14]=modalidade[14]+9;
           
           modalidade[23]=modalidade[23]+9;
           
           modalidade[25]=modalidade[25]+9;
           a=1; //para sair do while
    }
        
       
        
        
        else
        {
            
         a=0; //para continuar no while
           JOptionPane.showMessageDialog(null," \n RESPONDA CORRETAMENTE! \n \n");
        }
        
       
        
        } // WHILE END
    
    
    
    
  //  for(int i=0;i<26;i++) // TESTADOR DA CONTAGEM
 //   {
 //       System.out.print(modalidade[i]);
        //System.out.print(" | ");
        
        
 //   }  // FIM TESTADOR DA CONTAGEM
 
 
    System.out.println("\n");
     
    
    // FIM DA PERGUNTA 1
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      ///// LA PREGUNTA 2 ////////////
             
          a = 0;
            while(a!=1)
        {
     //   System.out.println("     2) Que tipo de esporte você gosta mais?");
     //   System.out.println("     a) Esportes coletivos");
      //  System.out.println("     b) Atividades individuais"); 
       //  System.out.println("     c) Tanto faz");

        
        
        String resposta;
       // System.out.print("\n     R: ");
       
 resposta =  JOptionPane.showInputDialog("2) Que tipo de esporte você gosta mais? \n\n a) Esportes coletivos \n b) Atividades individuais \n c) Tanto faz\n\n");

       
     //    System.out.println("\n \n     ========================================================");    

       
        
       
    
        if ("a".equals(resposta)) {
          
            
            modalidade[0]++;
            modalidade[1]++;
            modalidade[2]++;
            modalidade[3]++;
            modalidade[4]++;
            modalidade[5]++;
            modalidade[6]++;
            modalidade[7]++;
           
           
            
            a=1; // para sair do WHILE
        }
       
        else if("b".equals(resposta))
        {
             modalidade[8]++;
             modalidade[9]++;
            modalidade[10]++;
            modalidade[11]++;
            modalidade[12]++;
            modalidade[13]++;
            modalidade[14]++;
            modalidade[15]++;
            modalidade[16]++;
            modalidade[17]++;
            modalidade[18]++;
            modalidade[19]++;
            modalidade[20]++;
            modalidade[21]++;
            modalidade[22]++;
            modalidade[23]++;
            modalidade[24]++;
            modalidade[25]++;

         a=1;//para sair do while
        }
        else if("c".equals(resposta))
       {

           a=1; //para sair do while
    }
        
       
        
        
        else
        {
            
         a=0; //para continuar no while
            JOptionPane.showMessageDialog(null," \n RESPONDA CORRETAMENTE! \n \n");
        }
        
       
        
        } // WHILE END
    
    
    
    

    System.out.println("\n");
    
    
    // FIM DA PERGUNTA 2
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
         ///// LA PREGUNTA 3 ////////////
             
          a = 0;
            while(a!=1)
        {
       // System.out.println("     3) Você gosta de esportes com bola?");
      //  System.out.println("     a) Sim");
     //   System.out.println("     b) Nao"); 
      //  System.out.println("     c) Tanto faz");


        
        
        String resposta;
     //   System.out.print("\n     R: ");
       // resposta = recebe.nextLine();
resposta =  JOptionPane.showInputDialog("3) Você gosta de esportes com bola? \n\n a) Sim \n b) Não \n c) Tanto faz\n\n");
       
         System.out.println("\n \n     ========================================================");    

       
        
       
    
        if ("a".equals(resposta)) {
          
            
            modalidade[0]++;
            modalidade[1]++;
            modalidade[2]++;
            modalidade[3]++;
            modalidade[4]++;
            modalidade[5]++;
            modalidade[6]++;
            modalidade[7]++;

            modalidade[9]++;
            
            modalidade[15]++;
            
            modalidade[18]++;
            modalidade[19]++;
            modalidade[20]++;
            
            a=1; // para sair do WHILE
        }
       
        else if("b".equals(resposta))
        {
            modalidade[8]++;
            modalidade[9]++;
            modalidade[10]++;
            modalidade[11]++;
            modalidade[12]++;
            modalidade[13]++;
            modalidade[14]++;

            modalidade[16]++;
            modalidade[17]++;

            modalidade[21]++;
            modalidade[22]++;
            modalidade[23]++;
            modalidade[24]++;
            modalidade[25]++;

         a=1;//para sair do while
        }
        else if("c".equals(resposta))
       {

           a=1; //para sair do while
    }
        
       
        
        
        else
        {
            
         a=0; //para continuar no while
            JOptionPane.showMessageDialog(null," \n RESPONDA CORRETAMENTE! \n \n");
        }
        
       
        
        } // WHILE END
    
    
    
    

    System.out.println("\n");
    
    
    // FIM DA PERGUNTA 3
    
    
        ///// LA PREGUNTA 4 ////////////
             
          a = 0;
            while(a!=1)
        {
        //System.out.println("     4) Quanto ao seu folego:");
      //  System.out.println("     a) Sou uma pessoa com muito folego");
      //  System.out.println("     c"); 
       // System.out.println("     c) Prefiro esportes que nao cansem");


        
        
        String resposta;
     //   System.out.print("\n     R: ");
       // resposta = recebe.nextLine();
resposta =  JOptionPane.showInputDialog("4) Quanto ao seu fôlego: \n\n a) Sou uma pessoa com MUITO folego\n b) Sou uma pessoa com MÉDIO folego \n c) Prefiro esportes que não cansem\n\n");
       
        // System.out.println("\n \n     ========================================================");    

       
        
       
    
        if ("a".equals(resposta)) {
          
            
            modalidade[0]++;
            
            
            modalidade[3]++;
            
            modalidade[6]++;
            modalidade[7]++;
            modalidade[8]++;
            
            
            modalidade[10]++;
            modalidade[11]++;
            modalidade[12]++;
            modalidade[13]++;
            modalidade[14]++;
            
            modalidade[21]++;
            
            modalidade[23]++;
            modalidade[24]++;
            modalidade[25]++;
            
            a=1; // para sair do WHILE
        }
       
        else if("b".equals(resposta))
        {
            modalidade[1]++;
            modalidade[2]++;

            modalidade[4]++;
            modalidade[5]++;;

            modalidade[9]++;
            
            modalidade[17]++;

            modalidade[22]++;


         a=1;//para sair do while
        }
        else if("c".equals(resposta))
       {
           modalidade[15]++;
           modalidade[16]++;
           
           modalidade[18]++;
           modalidade[19]++;
           modalidade[20]++;
           a=1; //para sair do while
    }
        
       
        
        
        else
        {
            
         a=0; //para continuar no while
            JOptionPane.showMessageDialog(null," \n RESPONDA CORRETAMENTE! \n \n");
        }
        
       
        
        } // WHILE END
    
    
    
  
    System.out.println("\n");
    
    
    // FIM DA PERGUNTA 4
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
              ///// LA PREGUNTA 5 ////////////
             
          a = 0;
            while(a!=1)
        {
      //  System.out.println("     5) Você se considera uma pessoa competitiva?");
      //  System.out.println("     a) Sim muito");
      //  System.out.println("     b) Sim um pouco"); 
      //   System.out.println("     c) Apenas contra meus proprios limites");


        
        
        String resposta;
        System.out.print("\n     R: ");
        //resposta = recebe.nextLine();
resposta =  JOptionPane.showInputDialog("5) Você se considera uma pessoa competitiva?\n\n a) Sim muito \n b) Sim um pouco \n c) Apenas contra meus próprios limites\n\n");
       //  System.out.println("\n \n     ========================================================");    

       
        
       
    
        if ("a".equals(resposta)) {
          
            
            modalidade[0]++;
            modalidade[1]++;
            modalidade[2]++;
            modalidade[3]++;
            modalidade[4]++;
            modalidade[5]++;
            modalidade[6]++;
            modalidade[7]++;
            modalidade[8]++;
            modalidade[9]++;
            modalidade[10]++;
            
            modalidade[14]++;
            modalidade[15]++;
            modalidade[16]++;
            
            modalidade[21]++;
            
            modalidade[23]++;
            modalidade[24]++;
            modalidade[25]++;
           
            
            a=1; // para sair do WHILE
        }
       
        else if("b".equals(resposta))
        {

            modalidade[18]++;
            modalidade[19]++;
            modalidade[20]++;
           
            modalidade[22]++;
        

         a=1;//para sair do while
        }
        else if("c".equals(resposta))
       {
            modalidade[11]++;
            modalidade[12]++;
            modalidade[13]++;
            
            modalidade[17]++;
            
           a=1; //para sair do while
    }
        
       
        
        
        else
        {
            
         a=0; //para continuar no while
            JOptionPane.showMessageDialog(null," \n RESPONDA CORRETAMENTE! \n \n");
        }
        
       
        
        } // WHILE END
    
    
    

    System.out.println("\n");
    
    
    // FIM DA PERGUNTA 5
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
          ///// LA PREGUNTA 6 ////////////
             
          a = 0;
            while(a!=1)
        {
      //  System.out.println("     6) Em que lugar você prefere praticar esportes?");
      //  System.out.println("     a) Locais fechados");
      //  System.out.println("     b) Locais abertos"); 
      //   System.out.println("     c) Tanto faz");


        
        
        String resposta;
       // System.out.print("\n     R: ");
      //  resposta = recebe.nextLine();
resposta =  JOptionPane.showInputDialog("6) Em que lugar você prefere praticar esportes?\n\n a) Locais fechados \n b) Locais abertos \n c) Tanto faz\n\n");
   
       
         //System.out.println("\n \n     ========================================================");    

       
        
       
    
        if ("a".equals(resposta)) {
          
            

            modalidade[1]++;
            modalidade[2]++;

            modalidade[4]++;
            modalidade[5]++;
   

 
    
            modalidade[10]++;
            modalidade[11]++;
            modalidade[12]++;
            modalidade[13]++;
            
            modalidade[15]++;
            modalidade[16]++;
            
            modalidade[19]++;
            modalidade[20]++;
            
            modalidade[23]++;
            modalidade[24]++;
            modalidade[25]++;
            
            a=1; // para sair do WHILE
        }
       
        else if("b".equals(resposta))
        {

            modalidade[0]++;
            
            modalidade[3]++;
            
            modalidade[6]++;
            modalidade[7]++;
            modalidade[8]++;        
           
            modalidade[9]++;
            
            modalidade[14]++;
            
            modalidade[17]++;
            modalidade[18]++;
            
            modalidade[21]++;
            modalidade[22]++;
         a=1;//para sair do while
        }
        else if("c".equals(resposta))
       {

            
           a=1; //para sair do while
    }
        
       
        
        
        else
        {
            
         a=0; //para continuar no while
            JOptionPane.showMessageDialog(null," \n RESPONDA CORRETAMENTE! \n \n");
        }
        
       
        
        } // WHILE END
    
    
    
    
 
    System.out.println("\n");
    
    
    // FIM DA PERGUNTA 6
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      ///// LA PREGUNTA 7 ////////////
             
          a = 0;
            while(a!=1)
        {
    //    System.out.println("     7) E quanto aos esportes de combate:");
     //   System.out.println("     a) GOSTO de esportes de luta corporal");
     //   System.out.println("     b) Prefiro esportes SEM luta corporal"); 
      //   System.out.println("     c) Tanto faz");


        
        
        String resposta;
      //  System.out.print("\n     R: ");
       // resposta = recebe.nextLine();
resposta =  JOptionPane.showInputDialog("7) E quanto aos esportes de combate:\n\n a) GOSTO de esportes de luta corporal \n b) Prefiro esportes SEM luta corporal \n c) Tanto faz\n\n");
 
       
        // System.out.println("\n \n     ========================================================");    

       
        
       
    
        if ("a".equals(resposta)) {
          
            

            modalidade[23]++;
            modalidade[24]++;
            modalidade[25]++;
 
           
            
            a=1; // para sair do WHILE
        }
       
        else if("b".equals(resposta))
        {
            
            
            
            modalidade[0]++;
            modalidade[1]++;
            modalidade[2]++;
            modalidade[3]++;
            modalidade[4]++;
            modalidade[5]++;
            modalidade[6]++;
            modalidade[7]++;
            modalidade[8]++;
            modalidade[9]++;
            modalidade[10]++;
            modalidade[11]++;
            modalidade[12]++;
            modalidade[13]++;
            modalidade[14]++;
            modalidade[15]++;
            modalidade[16]++;
            modalidade[17]++;
            modalidade[18]++;
            modalidade[19]++;
            modalidade[20]++;
            modalidade[21]++;
            modalidade[22]++;


         a=1;//para sair do while
        }
        else if("c".equals(resposta))
       {

           a=1; //para sair do while
    }
        
       
        
        
        else
        {
            
         a=0; //para continuar no while
           JOptionPane.showMessageDialog(null," \n RESPONDA CORRETAMENTE! \n \n");
        }
        
       
        
        } // WHILE END
    
    
    

    System.out.println("\n");
    
    
    // FIM DA PERGUNTA 7
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      
    
      ///// LA PREGUNTA 8 ////////////
             
          a = 0;
            while(a!=1)
        {
      //  System.out.println("     8) Em relacao a sua coordenacao motora:");
      //  System.out.println("     a) Alta coordenacao motora");
      //  System.out.println("     b) Media coordenacao motora"); 
       //  System.out.println("     c) Baixa coordenacao motora");


        
        
        String resposta;
       // System.out.print("\n     R: ");
        //resposta = recebe.nextLine();

       resposta =  JOptionPane.showInputDialog("8) Em relacao a sua coordenacao motora:\n\n a) Alta coordenacao motora \n b) Media coordenacao motora \n c) Baixa coordenacao motora\n\n");
 
       //  System.out.println("\n \n     ========================================================");    
       
        
       
    
        if ("a".equals(resposta)) {
          
            
            modalidade[0]++;
            modalidade[1]++;
            modalidade[2]++;
            modalidade[3]++;
            modalidade[4]++;
            modalidade[5]++;
            modalidade[6]++;
            modalidade[7]++;
            modalidade[8]++;
            modalidade[9]++;
         
            modalidade[15]++;
        
            modalidade[17]++;
            modalidade[18]++;
            modalidade[19]++;
            modalidade[20]++;
         
          
            modalidade[23]++;
            modalidade[24]++;
            modalidade[25]++;
           
            
            a=1; // para sair do WHILE
        }
       
        else if("b".equals(resposta))
        {
           
            modalidade[10]++;
            modalidade[11]++;
            modalidade[12]++;
            modalidade[13]++;
            modalidade[14]++;
            
            modalidade[21]++;
            modalidade[22]++;


         a=1;//para sair do while
        }
        else if("c".equals(resposta))
       {

            modalidade[16]++;

           a=1; //para sair do while
    }
        
       
        
        
        else
        {
            
         a=0; //para continuar no while
            JOptionPane.showMessageDialog(null," \n RESPONDA CORRETAMENTE! \n \n");
        }
        
       
        
        } // WHILE END
    
    
    
    

    System.out.println("\n");
    
    
    // FIM DA PERGUNTA 8
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      
    
      ///// LA PREGUNTA 9 ////////////
             
          a = 0;
            while(a!=1)
        {
      //  System.out.println("     9) Você prefere esportes que exijam mais dos bracos, pernas ou mente?");
      //  System.out.println("     a) Bracos");
     //   System.out.println("     b) Pernas"); 
      //   System.out.println("     c) Mente");


        
        
        String resposta;
      //  System.out.print("\n     R: ");
       // resposta = recebe.nextLine();

        resposta =  JOptionPane.showInputDialog("9) Você prefere esportes que exijam mais dos braços, pernas ou da mente? \n\n a) Bracos \n b) Pernas \n c) Mente\n\n");
 
       //  System.out.println("\n \n     ========================================================");    
       
        
       
    
        if ("a".equals(resposta)) {
          
            

            modalidade[2]++;
            modalidade[3]++;
            modalidade[4]++;
            modalidade[5]++;
            modalidade[6]++;
            modalidade[7]++;

            modalidade[9]++;
            modalidade[10]++;

            modalidade[12]++;
 

            modalidade[15]++;

            modalidade[18]++;
            modalidade[19]++;
            modalidade[20]++;
            modalidade[21]++;
            modalidade[22]++;
            modalidade[23]++;

            modalidade[25]++;
           
            
            a=1; // para sair do WHILE
        }
       
        else if("b".equals(resposta))
        {
            modalidade[0]++;
            modalidade[1]++;
            modalidade[8]++;
            modalidade[11]++;

            modalidade[13]++;
            modalidade[14]++;


            modalidade[17]++;


            modalidade[24]++;
 

         a=1;//para sair do while
        }
        else if("c".equals(resposta))
       {


            modalidade[16]=modalidade[16]+6;


           a=1; //para sair do while
    }
        
       
        
        
        else
        {
            
         a=0; //para continuar no while
            JOptionPane.showMessageDialog(null," \n RESPONDA CORRETAMENTE! \n \n");
        }
        
       
        
        } // WHILE END
    
    
    
    
 
    System.out.println("\n");
    
    
    // FIM DA PERGUNTA 9
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      
    
      ///// LA PREGUNTA 10 ////////////
             
      
      
      
      
      
      
          a = 0;
            while(a!=1)
        {
     //   System.out.println("     10) Em relacao ao contato no esporte");
    //    System.out.println("     a) Prefiro esportes com MUITO contato");
      //  System.out.println("     b) Prefiro esportes com POUCO contato"); 
      //  System.out.println("     c) Prefiro esportes sem NENHUM contato");


        
        
        String resposta;
     //   System.out.print("\n     R: ");
       // resposta = recebe.nextLine();
  resposta =  JOptionPane.showInputDialog("10) Em relação ao contato no esporte \n\n a) Prefiro esportes com MUITO contato \n b) Prefiro esportes com POUCO contato \n c) Prefiro esportes sem NENHUM contato\n\n");
 
       
       //  System.out.println("\n \n     ========================================================");    
       
        
       
    
        if ("a".equals(resposta)) {
          

            modalidade[5]++;
            modalidade[6]++;
            modalidade[7]++;

           
            modalidade[23]++;
            modalidade[24]++;
            modalidade[25]++;
           
            
            a=1; // para sair do WHILE
        }
       
        else if("b".equals(resposta))
        {
            modalidade[0]++;
            modalidade[1]++;
           
            modalidade[4]++;

         a=1;//para sair do while
        }
        else if("c".equals(resposta))
       {

            modalidade[2]=modalidade[2]+6;
            modalidade[3]=modalidade[3]+6;
            modalidade[8]=modalidade[8]+6;
            modalidade[9]=modalidade[9]+6;
            modalidade[10]=modalidade[10]+6;
            modalidade[11]=modalidade[11]+6;
            modalidade[12]=modalidade[12]+6;
            modalidade[13]=modalidade[13]+6;
            modalidade[14]=modalidade[14]+6;
            modalidade[15]=modalidade[15]+6;
            modalidade[16]=modalidade[16]+6;
            modalidade[17]=modalidade[17]+6;
            modalidade[18]=modalidade[18]+6;
            modalidade[19]=modalidade[19]+6;
            modalidade[20]=modalidade[20]+6;
            modalidade[21]=modalidade[21]+6;
            modalidade[22]=modalidade[22]+6;

 

           a=1; //para sair do while
    }
        
       
        
        
        else
        {
            
         a=0; //para continuar no while
            JOptionPane.showMessageDialog(null," \n RESPONDA CORRETAMENTE! \n \n");
        }
        
       
        
        } // WHILE END
    
    
    
     
    System.out.println("\n");

    
    
    // FIM DA PERGUNTA 10 
    
    
    
 
            
            /////////// ESPACOS DAS PERGUNTAS FINAIS
            
            
            
    
       imc = peso/(altura*altura);
        
     //   System.out.println("Seu IMC e de: " + imc);
    
    if(imc<=25)
    {
            modalidade[0]=modalidade[0]+3;

            modalidade[3]=modalidade[3]+3;
            modalidade[4]=modalidade[4]+3;
            modalidade[5]=modalidade[5]+3;

            modalidade[8]=modalidade[8]+3;
            modalidade[9]=modalidade[9]+3;
            modalidade[10]=modalidade[10]+3;
            modalidade[11]=modalidade[11]+3;

            modalidade[17]=modalidade[17]+3;

            modalidade[21]=modalidade[21]+3;
            
            modalidade[25]=modalidade[25]+3;
           
    }
    else if(imc>25 && imc <=30)
    {

            modalidade[1]=modalidade[1]+3;
            modalidade[2]=modalidade[2]+3;
           
            modalidade[6]=modalidade[6]+3;
            modalidade[7]=modalidade[7]+3;
            modalidade[12]=modalidade[12]+3;

  
            modalidade[15]=modalidade[15]+3;
           
            modalidade[22]=modalidade[22]+3;
            modalidade[23]=modalidade[23]+3;
            modalidade[24]=modalidade[24]+3;

    }
    else
    {

 
            modalidade[13]=modalidade[13]+6;
            modalidade[14]=modalidade[14]+6;

            modalidade[16]=modalidade[16]+6;

            modalidade[18]=modalidade[18]+6;
            modalidade[19]=modalidade[19]+6;
            modalidade[20]=modalidade[20]+6;

    }
    
    if (altura>190 && imc<30)
    {
        modalidade[2]=modalidade[2]+2;
        modalidade[3]=modalidade[3]+2;
        modalidade[4]=modalidade[4]+6;
        modalidade[5]=modalidade[5]+5;
        modalidade[9]=modalidade[9]+5;
        modalidade[10]=modalidade[10]+5;
    }
    
    if(imc>30)
    {
        modalidade[13]=modalidade[13]+9;
        modalidade[14]=modalidade[14]+9;
        
    }
    
    
    
  
    
    int primeiro1 = 0;
  
    int ref1=0;
    int ref2 = 0;
    int ref3 = 0;
      int ref4 = 0;
        int ref5 = 0;
        
        
//for(int i=0;i<26;i++)   // ANALISA A QTDADE DE VOTOS
 //{
 //   System.out.println("nome["+i+"] = " + modalidade[i] + " - " + nome[i]);
// }
    
    int i=0;
    for(i=0;i<26;i++)
    {

      
        for(int c=0;c<26;c++)
        {

            if (modalidade[i]>primeiro1)
            {
            //       System.out.println(" CONDICAO OK ");   
           primeiro1 = modalidade[i]; 
            //  System.out.println("i =  " + i);
              
          
            ref1 = i;
          //     System.out.println("ref1 = " + ref1) ;

            }
        }

    }

    modalidade[ref1]=0;
    
    
    
    int primeiro2=0;
      for(i=0;i<26;i++)  // segundo teste
    {
        for(int c=0;c<26;c++)
        {

            if (modalidade[i]>primeiro2)
            {

                    primeiro2 = modalidade[i]; 
                    ref2 = i;
            }
        }

    }
          int perc2=i; // envia o codigo la pra baixo
       modalidade[ref2]=0;
       
       
       
       
       
       
           int primeiro3=0; // comeco terceira analise
      for(i=0;i<26;i++)  // segundo teste
    {
        for(int c=0;c<26;c++)
        {

            if (modalidade[i]>primeiro3)
            {

                    primeiro3 = modalidade[i]; 
                    ref3 = i;


            }
        }

    }
          int perc3=i; // envia o codigo la pra baixo
       modalidade[ref3]=0; // fim da terceira analise


       
       
       
       
                  int primeiro4=0; // comeco quarta analise
      for(i=0;i<26;i++)  // segundo teste
    {
        for(int c=0;c<26;c++)
        {

            if (modalidade[i]>primeiro4)
            {
                    primeiro4 = modalidade[i]; 
                    ref4 = i;

            }
        }

    }
          int perc4=i; // envia o codigo la pra baixo
       modalidade[ref4]=0; // fim da quarta analise
    
    

    
      int primeiro5=0; // comeco quinta analise
      for(i=0;i<26;i++)  // segundo teste
    {
        for(int c=0;c<26;c++)
        {

            if (modalidade[i]>primeiro5)
            {
                    primeiro5 = modalidade[i]; 
                    ref5 = i;
            }
        }

    }
      int perc5=i; // envia o codigo la pra baixo
    // fim da quinta analise
 

    
 System.out.println("\n \n \n     ========================================================");   
    
   String imctext="";
   String pesotext="";
   String esportetext="";
 
 
System.out.print("     Seu IMC corresponde a: ");
System.out.println(df2.format(imc)+ "\n");

if(imc<18.5)
{
    //System.out.println("     Isso significa que voce esta abaixo do peso.");
    imctext = "Isso significa que você esta abaixo do peso.";
}
else if(imc>=18.5 && imc < 25)
{
        //System.out.println("     Parabens, voce esta no seu peso ideal");
    imctext = "Parabéns, você está no seu peso ideal";
}
else if(imc>=25 && imc < 30)
    {
        //System.out.println("     Voce esta levemente acima do peso ideal");
        imctext = "Você está levemente acima do peso ideal";
}
else if(imc>=30 && imc < 35)
    {
        //System.out.println("     Atencao, voce esta em situacao de obesidade grau I");
         imctext = "Atencão, você está em situacao de obesidade grau I";
}
else if(imc>=35 && imc < 40)
    {
        //System.out.println("     Atencao, voce esta em situacao de obesidade grau II (Obesidade severa)");
         imctext = "Atenção, você está em situação de obesidade grau II (Obesidade severa)";
}
else
{
  //  System.out.println("     Atencao, voce esta em situacao de obesidade grau III (Obesidade morbida) \n     Procure um medico");
    imctext = "Atenção, você está em situação de obesidade grau III (Obesidade morbida) \nProcure um médico";
}
System.out.println();
double pesoideal=(23 * altura * altura);
        






if(imc>=25)
{
   // System.out.println("     O seu peso ideal seria proximo de: " +df2.format(pesoideal) + "kg \n");
    //System.out.println("     Para alcançar o peso ideal voce precisaria perder " + df2.format((peso - pesoideal)) + "kg");
    
    pesotext = "O seu peso ideal seria próximo de: " +df2.format(pesoideal) + "kg \n "
            + "Para alcançar o peso ideal você precisaria perder " + df2.format((peso - pesoideal)) + "kg";
}
else if(imc<=18.5)
{
   // System.out.println("     O seu peso ideal seria proximo de: " +df2.format(pesoideal) + "kg \n");
   // System.out.println("     Para alcançar o peso ideal voce precisaria ganhar " + df2.format((peso - pesoideal)*-1) + "kg");
    
    pesotext = "O seu peso ideal seria próximo de: " +df2.format(pesoideal) + "kg \n"
            + " Para alcançar o peso ideal você precisaria ganhar " + df2.format((peso - pesoideal)*-1) + "kg";
}
    
    
    int soma=primeiro1+primeiro2+primeiro3+primeiro4+primeiro5;
    
    

    
//System.out.println("\n\n     O esporte ideal para você: \n");

//System.out.println("     1º: " + nome[ref1] + "  "+ (primeiro1*100/soma) +"%");
//System.out.println("     2º: " + nome[ref2] + "  "+ (primeiro2*100/soma) +"%");
//System.out.println("     3º: " + nome[ref3] + "  "+ (primeiro3*100/soma) +"%");
//System.out.println("     4º: " + nome[ref4] + "  "+ (primeiro4*100/soma) +"%");
//System.out.println("     5º: " + nome[ref5] + "  "+ (primeiro5*100/soma) +"%");



esportetext = "O esporte ideal para você: \n\n"
        + "1º: " + nome[ref1] + "  "+ (primeiro1*100/soma) +"%\n"
        + "2º: " + nome[ref2] + "  "+ (primeiro2*100/soma) +"%\n"
        + "3º: " + nome[ref3] + "  "+ (primeiro3*100/soma) +"%\n"
        + "4º: " + nome[ref4] + "  "+ (primeiro4*100/soma) +"%\n"
        + "5º: " + nome[ref5] + "  "+ (primeiro5*100/soma) +"%\n";
        


JOptionPane.showMessageDialog(null, "Olá " + usuario + "\nSua altura: " + altura + "m\nSeu peso: " + peso + "kg\nSeu IMC corresponde a: " +df2.format(imc) +"\n\n" + imctext + "\n\n" + pesotext + "\n\n" + esportetext + "\n\n");


    System.out.println("\n     ======================================================== \n \n \n"); 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
