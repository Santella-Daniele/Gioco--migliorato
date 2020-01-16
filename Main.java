import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main (String[] args){
        
        String nomeEroe;
        String nomeMostro;
        Scanner s= new Scanner(System.in);
        System.out.println("Add Hero's name\n");
        nomeEroe = s.nextLine();
        System.out.println("Add Monster's name\n");
        nomeMostro = s.nextLine();

        Personaggio human = new Personaggio(nomeEroe);
        Personaggio monster = new Personaggio(nomeMostro);
    
        int cont;
        cont=0;
   
        do{
            
         human.hit(monster.getPower());
         monster.hit(human.getPower());
         cont=cont+1;
         }while(human.getLife()>0 && monster.getLife()>0);


        if(human.isAlive() == 0 ){

            System.out.printf ("You've lost in %d round\n",cont);
            System.out.printf ("The Human's life is %d", human.getLife());
        }else {
            System.out.printf ("You've won in %d round\n",cont);
            System.out.printf("The Monster's life is %d", monster.getLife());

        }
        

}


}