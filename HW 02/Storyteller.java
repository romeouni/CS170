public class Storyteller{

  public static void main(String[] args){
    System.out.println(storyteller("Kevin", "Nate", "crowns", 8, "Alex", "silver", "frogs"));
  }

/*
Method to construct a fairy tale given 3 names, a possesion, a quantity of possessions,
a color of possessions, and an animal. Prints out the story while leaving blanks
to insert the inputs that the method asks for.
*/
  public static String storyteller(String name1, String name2, String poss, int quant, String name3, String color, String animal){
    //construct spell with parameters given in assignment
    String spell = name1.charAt(name1.length()-1) + "aa" + name1.charAt(0) + " ";
    spell += name2.charAt(name2.length()-1) + "ee" + name2.charAt(0) + " ";
    spell += poss.charAt(poss.length()-1) + "ii" + poss.charAt(0);
    spell = spell.toUpperCase();

    String result = "There was once a prince named " + name1 + ". His brother's name was ";
    result += name2 + ". " + name1 + " had " + quant + " " + color + " " + poss + ", which " + name2;
    result += " was very envious of. " + name2 + " only had " + quant/2 + " " + poss;
    result += ". So, " + name2 + " went to the wizard " + name3 + " to ask for advice. ";
    result += name3 + " gave him to spell to use. " + name2 + " went to his brother and said, \"";
    result += spell + "!\" Suddenly, " + name1 + "'s " + poss + " turned into " + animal + "! ";
    result += name1 + " became very sad. Seeing this, " + name2 + " started to feel bad. So, he ";
    result += "reversed the spell and made up with " + name1 + ". They grew closer and even shared their ";
    result += poss + ".";

    return result;
  }
}
