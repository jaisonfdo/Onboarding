package droidmentor.onboardingdemo;

/**
 * Created by Jaison
 */

public class OnBoardItem
{
    int imageID;
    String title;
    String description;

    public OnBoardItem() {
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
