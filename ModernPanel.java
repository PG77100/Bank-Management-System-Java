import javax.swing.*;
import java.awt.*;

public class ModernPanel extends JPanel {

    private int cornerRadius = 40;

    public ModernPanel() {
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

        // 🔥 Shadow (strong for dark theme)
        g2.setColor(new Color(0, 0, 0, 80));
        g2.fillRoundRect(8, 8, width - 8, height - 8, cornerRadius, cornerRadius);

        // 💎 Black Glass Effect
        g2.setColor(new Color(0, 0, 0, 100)); // transparency adjust kar sakte ho
        g2.fillRoundRect(0, 0, width - 8, height - 8, cornerRadius, cornerRadius);

        // ✨ Soft border (glass edge)
        g2.setStroke(new BasicStroke(1.5f));
        g2.setColor(new Color(255, 255, 255, 40));
        g2.drawRoundRect(0, 0, width - 8, height - 8, cornerRadius, cornerRadius);

        g2.dispose();
    }
}
