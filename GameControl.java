import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class GameControl implements KeyListener {

    private Snake snake;

    public GameControl(Snake snake) {

        this.snake = snake;
    }

    public void keyReleased(KeyEvent ke) {

        switch(ke.getKeyCode()) {

            case KeyEvent.VK_UP:
                snake.setDirection(0);
                break;
            case KeyEvent.VK_RIGHT:
                snake.setDirection(1);
                break;
            case KeyEvent.VK_DOWN:
                snake.setDirection(2);
                break;
            case KeyEvent.VK_LEFT:
                snake.setDirection(3);
                break;
            case KeyEvent.VK_ENTER:

                SnakeGameView.gameState = SnakeGameView.gameState != true;

                break;
            case KeyEvent.VK_ESCAPE:
                System.exit(0);
                break;
        }
    }
}