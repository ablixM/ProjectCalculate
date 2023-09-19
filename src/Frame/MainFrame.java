package Frame;
import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import Panel.*;

public class MainFrame extends JFrame {
    Container container = new Container();
    TopPanel topPanel = new TopPanel();
    MiddlePanel middlePanel = new MiddlePanel();
    BottomPanel bottomPanel = new BottomPanel();

    MainFrame() throws IOException {
        super("Calculator");
        setLayout(null);
        this.setPreferredSize(new Dimension(424 ,626));

        String icon32 = "assets/icons/Icon-calculator32.png";
        String icon16 = "assets/icons/Icon-calculator16.png";

        URL url16 = new URL("https://i.stack.imgur.com/m0KKu.png");
        URL url32 = new URL("https://i.stack.imgur.com/LVVMb.png");

        final List<Image> icons = new ArrayList<Image>();
        icons.add(ImageIO.read(new File("Icons/Icon-calculator32.png")));
        icons.add(ImageIO.read(new File("Icons/Icon-calculator16.png")));
        //ImageIcon customIcon = new ImageIcon("assets/icons/Icon-calculator16.png");
        this.setIconImages(icons);


        add(topPanel);
        add(middlePanel);
        add(bottomPanel);


        pack();
        setLocationRelativeTo(null);
        setLocationByPlatform(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = null;
            try {
                mainFrame = new MainFrame();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            mainFrame.setVisible(true);
    });
    }
}
