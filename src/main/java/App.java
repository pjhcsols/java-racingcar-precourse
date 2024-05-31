import controller.RacingcarController;
import view.EndView;
import view.StartView;

public class App {
    public static void main(String[] args) {
        RacingcarController racingcarController = new RacingcarController(
                new StartView(),
                new EndView()
        );
        racingcarController.startGame();
    }
}