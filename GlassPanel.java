import javax.swing.*;
import java.awt.*;

public class GlassPanel extends JPanel {

    private int cornerRadius = 40;

    public GlassPanel() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();

        // Smooth edges
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // 🔥 Soft shadow
        g2.setColor(new Color(0, 0, 0, 40));
        g2.fillRoundRect(6, 6, width - 6, height - 6, cornerRadius, cornerRadius);

        // 💎 Glass background (transparent white)
        g2.setColor(new Color(255, 255, 255, 60)); // opacity low = glass look
        g2.fillRoundRect(0, 0, width - 6, height - 6, cornerRadius, cornerRadius);

        // ✨ Light border (glass shine)
        g2.setStroke(new BasicStroke(1.5f));
        g2.setColor(new Color(255, 255, 255, 120));
        g2.drawRoundRect(0, 0, width - 6, height - 6, cornerRadius, cornerRadius);

        g2.dispose();
    }
}