import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
public class CharacterSheet {
	static JFrame f;
	
	
	public static void main(String[] args) {
		//Character Variables
		String charName;
		String charClass;
		String charLanguage;
		int charGold;
		int strength;
		int constitution;
		int dextderity;
		int intelligence;
		int wisdom;
		int charisma;
		
		//Goblin Variable
		int gobHealth = 12;
		
		
		
		
		//Images
		 ImageIcon dndLogo = new ImageIcon("dndLogo.png");
		 ImageIcon goldImage = new ImageIcon("goldImage.jpg");
		 ImageIcon darkRoad = new ImageIcon("darkRoad.jpg");
		 ImageIcon goblin = new ImageIcon("goblin.jpg");
		f= new JFrame();
		
		
		
		
		//Basic info
		JOptionPane.showMessageDialog(f, "Welcome to your very own character sheet!", " Welcome!",
				JOptionPane.INFORMATION_MESSAGE,dndLogo);
		
		charName = JOptionPane.showInputDialog(f, "Enter your character's name: ");
		JOptionPane.showMessageDialog(f,"Your character's name is: " + charName);
		
		charClass = JOptionPane.showInputDialog("What class is " + charName + "?");
		JOptionPane.showMessageDialog(f, charName + " is now a " + charClass);
		
		charLanguage = JOptionPane.showInputDialog("What additional language does " + charName +" speak?");
		JOptionPane.showMessageDialog(f, charName + " can speak " + charLanguage + " in addition to common");
		
		 charGold = 100;
		 JOptionPane.showMessageDialog(f, charName + " will start with " + charGold + " gold.",null,JOptionPane.INFORMATION_MESSAGE,goldImage);
		 
		
		 
		 //Statistics 
		 constitution = Integer.parseInt(JOptionPane.showInputDialog("What is " + charName + "'s constitution?"));
		 strength =  Integer.parseInt(JOptionPane.showInputDialog("What is " + charName + "'s strength?"));
		dextderity =  Integer.parseInt(JOptionPane.showInputDialog("What is " + charName + "'s dextderity?"));
		wisdom =  Integer.parseInt(JOptionPane.showInputDialog("What is " + charName + "'s wisdom?"));
		charisma =  Integer.parseInt(JOptionPane.showInputDialog("What is " + charName + "'s charisma?"));
		intelligence =  Integer.parseInt(JOptionPane.showInputDialog("What is " + charName + "'s intelligence?"));
		
		//Show Sheet 
		JOptionPane.showMessageDialog(f, new JTextArea ("Character Name: " + charName + "\t" + "Class: " + charClass + "\n" 
		+ "Language: " + charLanguage + "\n" + "Constitution: " + constitution + "\n" + "Strength: " + strength + "\n" + "Dextderity: " + dextderity +"\n"
		+ "Wisdom: " + wisdom + "\n" + "Charisma: " + charisma + "\n" + "Intelligence: " + intelligence));
		
	
		//Start Adventure
		int adventure= JOptionPane.showConfirmDialog(f, "Would you like to go on an adventure?",null, JOptionPane.YES_NO_OPTION);
		if(adventure == JOptionPane.NO_OPTION) {
			System.exit(0);
			
			}
		//Combat
				Random randomGenerator = new Random();
				int attackRoll = strength + randomGenerator.nextInt(6);
				int attackDamage = gobHealth - attackRoll;
		JOptionPane.showMessageDialog(f,"You leave the tavern and begin to follow down a dark forest road.",null, JOptionPane.INFORMATION_MESSAGE,darkRoad);
		JOptionPane.showMessageDialog(f, "AMBUSH! A goblin appears before you brandishing a spear!",null, JOptionPane.INFORMATION_MESSAGE,goblin);
		
		while(gobHealth > 0) {
		JOptionPane.showMessageDialog(f, "You attack the goblin with your weapon!", null, JOptionPane.INFORMATION_MESSAGE,goblin);
		gobHealth = attackDamage;
		JOptionPane.showMessageDialog(f, "The goblin swings back but is too clumsy to hit!!", null, JOptionPane.INFORMATION_MESSAGE,goblin);
		}
		JOptionPane.showMessageDialog(f, "You have defeated the goblin! Wow so powerful!", null, JOptionPane.INFORMATION_MESSAGE,goblin);
		}
		
	
	}
	
	


