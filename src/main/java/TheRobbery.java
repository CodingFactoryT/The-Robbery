package main.java;

import java.util.Scanner;

public class TheRobbery {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String introduction = "Du bist ein Raeuber und moechtest das Haus einer alten Dame ausrauben.\n" +
							  "Nach einer langen Fahrt bist du endlich am Haus angekommen.\n" + 
							  "Nun stellt sich die Frage:";
		System.out.println(introduction);

		if(askUser("Wie moechtest du loslegen?", "Ich breche gleich in das Haus ein", 
				   "Ich gehe erst einmal um das Haus herum")) gleichEinbrechen();
		else umsHausHerumGehen();
		
	}
	
	public static boolean askUser(String question, String answerOption_1, String answerOption_2) {
		int answer = 0;
		
		while(answer != 1 || answer != 2) {
			System.out.println("\n" + question);
			System.out.println("   1. " + answerOption_1);
			System.out.println("   2. " + answerOption_2);
			
			try {
				answer = scanner.nextInt();
			} catch(Exception e) {
				scanner.next();
			}
			
			if(answer == 1) return true;
			else if(answer == 2) return false;
		    else System.out.println("Bitte gebe eine 1 oder eine 2 ein");
		}
		
		return false;
		
	}
	
	public static void gleichEinbrechen() {
		System.out.println("\nDu moechtest also gleich einbrechen.");
		System.out.println("Du stellst dir die Frage: War das die richtige Entscheidung?");
		System.out.println("Naja, egal, jetzt musst du erstmal weiter.");
		if(askUser("Aber Wie?", "Ich breche durch die Vordertuer ein", 
				   "Ich breche durch das Fenster neben der Vordertuer ein")) durchDieVorderTuerRein();
		else durchDasFensterRein();
	}
	
	public static void umsHausHerumGehen() {
		System.out.println("Du moechtest also um das Haus herumgehen. Also dann! Du siehst den Garten und betrittst ihn.");
		System.out.println("Da es vor einigen Stunden noch geregnet hat,");
		System.out.println("musst du dich auf dem nassen Rasen besonders vorsichtig bewegen.");
		System.out.println("Du siehst ein Fenster am Haus, das nicht beleuchtet ist.");
		
		if(askUser("Was tust du nun?", "Ich breche durch das Fenster ins Haus ein",
				   "Ich bleibe weiterhin auf dem Rasen und laufe weiter")) durchDasFensterRein();
		else aufDemRasenWeiterlaufen();
	}
	
	public static void durchDieVorderTuerRein() {
		System.out.println("Du holst dein altes Dietrichset aus deiner Tasche und versuchst durch die Tuer zu kommen.");
		System.out.println("Ploetzlich hoerst du einen schrillen Alarm!");
		System.out.println("Mist!, die Tuer war wohl Alarmgesichert.");
		System.out.println("Du verschwindest sofort, ohne einen einzigen Penny erbeutet zu haben.");
		System.out.println("GAME OVER!");
		System.out.println("Deine ganzen Anstrengungen waren umsonst.");
	}
	
	public static void durchDieVorderTuerRaus() {
		System.out.println("Du willst die Tuer oeffnen, jedoch ist sie verschlossen. Ein Schluessel ist nirgends zu sehen.");
		System.out.println("Ploetzlich hoerst du einen schrillen Alarm!");
		System.out.println("Mist!, die Tuer war wohl Alarmgesichert.");
		System.out.println("Du bist eingeschlossen und musst genervt warten, dass die Polizei kommt und dich verhaftet.");
		System.out.println("GAME OVER!");
		System.out.println("Deine ganzen Anstrengungen waren umsonst.");
	}
	
	public static void durchDasFensterRein() {
		System.out.println("Du holst dein altes Dietrichset aus deiner Tasche und hebelst das Fenster auf.");
		System.out.println("Lautlos wie eine Katze schleichst du hinein.");
		System.out.println("Auf einem Tisch siehst du einen Tresor, der voll mit Bargeld gefuellt ist.");
		if(askUser("Aber was machst du jetzt damit?", "Du nimmst ihn mit", 
				   "Du sprengst ihn an Ort und Stelle auf, um das Geld sofort zu bekommen")) TresorMitnehmen();
		else TresorSprengen();
	}
	
	public static void durchDasFensterRaus() {
		System.out.println("Du entscheidest dich fuer das Fenster.");
		System.out.println("Flink verlaesst du das Haus und verschwindest von dem Grundstueck.");
		System.out.println("Zu Hause saegst du den Tresor auf und entdeckst 500.000 Euro in Bar.");
		System.out.println("Herzlichen Glueckwunsch, du hast es geschafft!");
		System.out.println("Und jetzt kannst du dir einen schoenen Urlaub auf Mallorca leisten.");
	}
	
	public static void aufDemRasenWeiterlaufen() {
		System.out.println("Du laeufst also auf dem Rasen weiter.\n"
						 + "Aber da siehst du, wie ploetzlich ein Licht in dem Haus der alten Dame\n"
					     + "angeht. Du erschreckst dich und moechtest fluechten!\n"
					     + "Als du zurueck laeufst, siehst du in der Eile die Harke, die die alte\n"
					     + "Dame am Vortag ausversehen im Garten liegen gelassen hat, nicht.\n"
					     + "Du trittst genau darauf, die Harke schnell nach oben und du wirst ohnmaechtig!\n\n"
					     + "Als du wieder aufwachst, liegst du mit Handschellen gefesselt auf dem Rasen.\n"
						 + "Die Nachbarn hatten dich gefunden, konnten 1 und 1 zusammenzaehlen und riefen die Polizei.\n"
						 + "GAME OVER!\n"
						 + "Das war wohl nichts.\n");
	}
	
	public static void TresorMitnehmen() {
		System.out.println("Du klemmst dir den Tresor unter den Arm und laeufst los.");
		if(askUser("Aber wie verschwindest du jetzt am Besten?", "Ich gehe durch die Vordertuer raus",
				   "Ich verschwinde durch das Fenster")) durchDieVorderTuerRaus();
		else durchDasFensterRaus();
	}
	
	public static void TresorSprengen() {
		System.out.println("Du bist sehr ungeduldig und entscheidest dich, den Tresor zu sprengen.");
		System.out.println("Leider hoeren die Nachbarn den Krach und rufen die Polizei.");
		System.out.println("GAME OVER!");
		System.out.println("Du wirst verhaftet.");
	}
}
