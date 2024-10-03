import java.util.Scanner;
public class LabA
{
  public static void main(String[]args)
  {
      Scanner kb = new Scanner(System.in);
      System.out.println("You are at a fork in the road while on your way to the city. On the left is a dirt path that says it's a shortcut. On the right is a paved road that you think would take twice as long. Do you take path A, the dirt path, or path B, the paved road?");
      String choice = kb.next();
      if (choice.equals("A"))
      {
          System.out.println("You begin to walk down the dirt path, but as you go along, you eventually encounter a river. It looks shallow, but you can't really tell. Do you (A) cross it or (B) look for a way around?");
          choice = kb.next();
          if (choice.equals("A"))
          {
              System.out.println("You begin to cross the river, but as you rech the middle, your foot slips on a rock and you fall in. You slowly get pulled down the river, but see a branch that you can grab. Do you (A) grab the branch, or (B) try to swim to a rock in the middle of the river?");
              choice = kb.next();
              if (choice.equals("A"))
              {
                 System.out.println("You grab the branch but it breaks off the tree. You continue getting pulled down the river until you manage to swim to the edge, but you lost all your rescources and need to head back home. ");
                 System.out.println("Game Over");
              }
              else
              {
                  System.out.println("You reach the rock, but slip off when you try to grab it. You get sucked into some rapids behind the rock that you didn't see and get pulled under the water. You hit your head on a rock and everything goes dark.");
                  System.out.println("Game Over");
              }
          }
          else
          {
              System.out.println("You walk up the river for several miles, but it begins to get dark. You hear animals howling, and they sound close to you. Do you (A) make camp for the night or (B) keep looking for a way across the river");
              choice = kb.next();
              if (choice.equals("A"))
              {
                 System.out.println("The fire keeps the animals away for the night, but you are still stuck on this side of the river. You keep looking for a way to cross, but can't find anything.");
                 System.out.println("Game Over");
              }
              else
              {
                  System.out.println("The animals keep getting closer over the night until something jumps at you from the shadows. You don't even get a good look at what it is until you are already on the ground. You hit your head and everything goes dark. ");
                  System.out.println("Game Over");
              }
          }
      }
      else
      {
          System.out.println("As you walk down the road you see a car apporaching in the distance. It seems to be coming towards you fast. Do you (A) hide on the side of the road and let it pass, or (B) continue walking in the road");
          choice = kb.next();
          if (choice.equals("A"))
          {
              System.out.println("You hide on the side of the road and watch as the car passes. Its a police car. Once you're sure that it's gone, you get up and keep moving. Do you (A) go walk through the forest or (B) stay on the road");
              choice = kb.next();
              if (choice.equals("A"))
              {
                  System.out.println("You walk through the forst until it begins to get dark, but you realize that you have nothing to make a fire. You try to stay alert for the night, but you nod off in the cold. You don't wake up");
                  System.out.println("Game Over");
                }
              else
              {
                  System.out.println("You keep walking on the road but don't notice the police car as it comes up from behind you. They don't stop.");
                  System.out.println("Game Over");
                }
          }
          else
          {
              System.out.println("You stay in the road, and see that it is a police car headed towards you. Do you (A) begin to run or (B) stay in the road");
              choice = kb.next();
              if (choice.equals("A"))
              {
                  System.out.println("The police get out of the car and begin chasing you. They have guns, and you didn't have much of a headstart. You collapse before you make it to the treeline.");
                  System.out.println("Game Over");
              }
              else
              {
                  System.out.println("The police get out of the car and yell at you to get down. They handcuff you on the ground before throwing you in the back of their car. You don't know where you're going now.");
                  System.out.println("Game Over");
              }
          }
      }
    }
}