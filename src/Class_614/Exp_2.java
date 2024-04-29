package Class_614;
class Video {
    private String title;
    private boolean checkedOut;
    private double averageRating;
    private int numberOfRatings;
    public Video(String title) {
        this.title = title;
        this.checkedOut = false;
        this.averageRating = 0.0;
        this.numberOfRatings = 0;
    }
    public String getTitle() {
        return title;
    }
    public boolean isCheckedOut() {
        return checkedOut;
    }
    public void checkOut() {
        checkedOut = true;
    }
    public void returnVideo() {
        checkedOut = false;
    }
    public void receiveRating(int rating) {
        averageRating = (averageRating * numberOfRatings + rating) / (numberOfRatings + 1);
        numberOfRatings++;
    }
    public double getAverageRating() {
        return averageRating;
    }
}
class VideoStore {
    private Video[] inventory;
    public VideoStore() {
        this.inventory = new Video[10];
    }
    public void addVideo(String title) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = new Video(title);
                System.out.println("Video '" + title + "' added to the inventory.");
                return;
            }
        }
        System.out.println("Error: Inventory is full. Cannot add video '" + title + "'.");
    }
    public void checkOut(String title) {
        for (Video video : inventory) {
            if (video != null && video.getTitle().equals(title) && !video.isCheckedOut()) {
                video.checkOut();
                System.out.println("Video '" + title + "' checked out.");
                return;
            }
        }
        System.out.println("Error: Video '" + title + "' not found or already checked out.");
    }
    public void returnVideo(String title) {
        for (Video video : inventory) {
            if (video != null && video.getTitle().equals(title) && video.isCheckedOut()) {
                video.returnVideo();
                System.out.println("Video '" + title + "' returned.");
                return;
            }
        }
        System.out.println("Error: Video '" + title + "' not found or not checked out.");
    }
    public void receiveRating(String title, int rating) {
        for (Video video : inventory) {
            if (video != null && video.getTitle().equals(title)) {
                video.receiveRating(rating);
                System.out.println("Rating of " + rating + " received for video '" + title + "'.");
                return;
            }
        }
        System.out.println("Error: Video '" + title + "' not found.");
    }
    public void listInventory() {
        System.out.println("Current Inventory:");
        for (Video video : inventory) {
            if (video != null) {
                System.out.println("Title: " + video.getTitle() +
                        ", Checked Out: " + video.isCheckedOut() +
                        ", Average Rating: " + video.getAverageRating());
            }
        }
    }
}
public class Exp_2 {
    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();
        videoStore.addVideo("The 100");
        videoStore.addVideo("Reacher");
        videoStore.addVideo("Dark");
        videoStore.receiveRating("The 100", 4);
        videoStore.receiveRating("The 100", 5);
        videoStore.receiveRating("Reacher", 5);
        videoStore.receiveRating("Reacher", 4);
        videoStore.receiveRating("Dark", 5);
        videoStore.checkOut("The 100");
        videoStore.returnVideo("The 100");
        videoStore.checkOut("Reacher");
        videoStore.returnVideo("Reacher");
        videoStore.checkOut("Dark");
        videoStore.returnVideo("Dark");
        videoStore.listInventory();
    }
}

