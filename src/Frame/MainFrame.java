package Frame;
import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
        this.setPreferredSize(new Dimension(426 ,650));

        //getClass().getResource("assets/icons/Icon-calculator32.png");
        //getClass().getResource("assets/icons/Icon-calculator.png");
        //URL url32 = new URL("https://github.com/ablixM/ProjectCalculate/blob/main/src/assets/icons/Icon-calculator32.png?raw=true");
        //URL url48 = new URL("https://github.com/ablixM/ProjectCalculate/blob/main/src/assets/icons/Icon-calculator.png?raw=true");
        //File icon32 = new File("assets/icons/Icon-calculator32.png");
       // File icon48 = new File("assets/icons/Icon-calculator.png");
        final List<Image> icons = new ArrayList<Image>();
        //icons.add(ImageIO.read(url32));
        //icons.add(ImageIO.read(url48));
        icons.add(ImageIO.read(Objects.requireNonNull(getClass().getResource("/resources/icons/Icon-calculator32.png"))));
        icons.add(ImageIO.read(Objects.requireNonNull(getClass().getResource("/resources/icons/Icon-calculator.png"))));
        //icons.add(ImageIO.read(new File("assets/icons/Icon-calculator16.png")));
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
