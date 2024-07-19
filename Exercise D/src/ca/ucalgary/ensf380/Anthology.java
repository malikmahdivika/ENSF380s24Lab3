package ca.ucalgary.ensf380;

public class Anthology {

	//Private Data Members:
	
	private Story[] stories;
	
	//Public Getter Member Methods/Functions:
	
	public Story[] getStory() {
		return stories;
	}
	
	//Public Setter Member Methods/Functions:
	
	public void setStory(Story[] stories) {
		this.stories = stories;
	}

	//Other Member Methods/Functions:
	
	public String storyOrder() {
        if (stories == null || stories.length == 0) {
            return "No Stories Are Available";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stories.length; i++) {
            sb.append("Story ").append(i + 1).append(": ").append(stories[i].toString()).append("\n");
        }

        return sb.toString();
    }
}

