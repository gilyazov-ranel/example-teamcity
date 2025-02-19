package plaindoll;
import java.util.Random;

public class Welcomer{
	private String[] messages = {
        "Welcome, brave hunter!",
        "Hello there, hunter! Ready for the adventure?",
        "Greetings, hunter! Your journey begins now.",
        "Ahoy, hunter! What brings you here?",
        "Salutations, hunter! May fortune favor you.",
    };

	public String sayWelcome() {
		return "Welcome home, good hunter. What is it your desire?";
	}
	public String sayFarewell() {
		return "Farewell, good hunter. May you find your worth in waking world.";
	}
	public String sayNeedGold(){
		return "Not enough gold";
	}
	public String saySome(){
		return "something in the way";
	}
	public String getRandomMessage() {
        Random random = new Random();
        int index = random.nextInt(messages.length);
        return messages[index];
    }
}
