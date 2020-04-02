public class MadLibs {
  
  /*
  This program generates a mad libbed story.
  Author: Laura
  Date: 2/19/2049
  */
  	
    public static void main(String[] args){
      
      //Declaring variables
      String name1="Vicky";
      String adjective1="Pleasent";
      String adjective2="his";
      String noun1="people";
      String noun2="vegetables";
      String verb1="fight";
      String noun3="music";
      String noun4="human";
      String adjective3="irritating";
      String name2="Jack";
      String place1="Newyork";
      String noun5="Ice";
      int number=2020;
      String noun6="religeon";

      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      //To read the story
      System.out.println(story);
    }       
}
