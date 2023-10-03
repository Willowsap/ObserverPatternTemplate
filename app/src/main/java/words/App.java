package words;

import java.util.Scanner;

/**
 * A simple demo for the WordList Observer example.
 * 
 * @author Willow Sapphire
 * @version 10/03/2023
 */
public class App
{
    /**
     * Runs the demo.
     * 
     * @param args unused.
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        WordList wl = new WordList(input);
        WordStats ws = new WordStats();
        wl.registerObserver(ws);
        boolean exit = false;
        while (!exit)
        {
            System.out.println("Please select from the following options:");
            System.out.println("1) Add words to the word list");
            System.out.println("2) Print stats of the word list");
            System.out.println("3) Quit");
            String answer = input.nextLine();
            switch (answer)
            {
                case "1":
                    wl.addWords();
                    break;
                case "2":
                    ws.displayStats();
                    break;
                case "3":
                    exit = true;
                    break;
            }
        }
    }
}
