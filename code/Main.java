package Sounds;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.println("If you want to play the game choose 1");
        System.out.println("If your od not want to play the game choose 2");
int choose=sc.nextInt();

        while(choose!=1){
            System.out.println("GAME END");
            System.out.println("Choose another number to play");
            choose=sc.nextInt();
            sc.nextLine();
        }

System.out.println("Enter your name to know about animals");
String identity=sc.nextLine();
System.out.println("Participant name is"+" "+":"+" "+identity);
sc.nextLine();

        System.out.println("Enter the animal u want to hear sound about:");
        System.out.println("ANIMALS:lion,elephant,duck.");
        String choose_animal=sc.nextLine();
        System.out.println("The participant chose:"+" "+choose_animal);

        //lion
Lion yellow=new Lion("Lion","Grassland",4,true,false,"Yellow/orange","Roar");

        //elephant
Elephant huge=new Elephant("Elephant","Grassland",4,true,true,"Grey or muddy","Trumpet")   ;

    //duck
Duck face=new Duck("Duckling","Water",2,true,false,"White","Quakle");

 //done
       // System.out.println("hello");
        //System.out.println("the color of lion is "+yellow.getColor());

//switch
switch(choose_animal){
    case "Lion":
        System.out.println("Animal name:"+" "+yellow.getName());
        System.out.println("lions sound:"+" "+yellow.getSound());
        System.out.println("lions have:"+" "+yellow.getLegs()+"legs");
        System.out.println("lions color is :"+" "+yellow.getColor());
        System.out.println("lions live in:"+" "+yellow.getHabitat());

        break;
    case "Elephant":
        System.out.println("Animal name :"+" "+huge.getName());
        System.out.println("Elephant sound:"+" "+huge.getSound());
        System.out.println("Elephant have:"+" "+huge.getLegs()+" legs");
        System.out.println("Elephant color is:"+" "+huge.getColor());
        System.out.println("Elephant live is :"+" "+huge.getHabitat());

        break;
    case "Duck":
        System.out.println("Animal name :"+" "+face.getSound());
        System.out.println("Ducks sound:"+" "+face.getSound());
        System.out.println("Ducks have:"+" "+face.getLegs()+" legs");
        System.out.println("Ducks are of :"+" "+face.getColor()+" color");
        System.out.println("Ducks live in :"+" "+face.getHabitat()+" their habitat");
        break;
}


    }
}
