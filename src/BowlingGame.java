import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented
		if(frames.size() < 10)
			frames.add(frame);
	}
	
	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}

	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
		
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score
		int score = 0;
		for(Frame f : frames)
		{
			score += f.score();
		}
		return score;
	}
}
