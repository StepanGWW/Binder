import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwipeFeature());
    }
}

class SwipeFeature extends JFrame {
    private int cardIndex = 0;
    private JLabel[] cards;

    public SwipeFeature() {
        super("Swipe Feature");

        cards = new JLabel[5]; // Assuming you want to display 5 cards
        cards[0] = new JLabel("Card 1");
        cards[1] = new JLabel("Card 2");
        cards[2] = new JLabel("Card 3");
        cards[3] = new JLabel("Card 4");
        cards[4] = new JLabel("Card 5");

        setLayout(new CardLayout());

        for (JLabel card : cards) {
            card.setHorizontalAlignment(JLabel.CENTER);
            card.setVerticalAlignment(JLabel.CENTER);
            add(card);
        }

        addMouseListener(new SwipeHandler());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class SwipeHandler extends MouseAdapter {
        private int initialX;

        @Override
        public void mousePressed(MouseEvent e) {
            initialX = e.getX();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            int deltaX = e.getX() - initialX;

            if (deltaX > 50) {
                // Swipe to the right
                showNextCard();
            } else if (deltaX < -50) {
                // Swipe to the left
                showPreviousCard();
            }
        }
    }

    private void showNextCard() {
        cardIndex = (cardIndex + 1) % cards.length;
        ((CardLayout) getContentPane().getLayout()).next(getContentPane());
    }

    private void showPreviousCard() {
        cardIndex = (cardIndex - 1 + cards.length) % cards.length;
        ((CardLayout) getContentPane().getLayout()).previous(getContentPane());
    }
}
