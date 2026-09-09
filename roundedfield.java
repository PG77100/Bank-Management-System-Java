import javax.swing.*;
import java.awt.*;

public class roundedfield extends JTextField {
    private int radius = 20;

    public roundedfield(int size) {
        super(size);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(new Color(200, 200, 200));
        g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, radius, radius);
    }
}