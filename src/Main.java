import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Arrays;

public class Main {

    static private final String version = "1.0.0";

    public static void main(String[] args) {

        MainFrame gui = new MainFrame("Pack Creator", false, new int[]{500,200});
        gui.getContentPane().setBackground(Color.WHITE);

        Font standardFont = new Font("Verdana", Font.PLAIN, 16);

        JLabel versionLabel = new JLabel();
        versionLabel.setText("V" + version);
        versionLabel.setForeground(Color.GRAY);
        versionLabel.setHorizontalAlignment(JLabel.RIGHT);
        versionLabel.setVerticalAlignment(JLabel.BOTTOM);
        versionLabel.setFont(standardFont);

        JButton createNewPackButton = new JButton();
        createNewPackButton.setFont(standardFont);
        createNewPackButton.setText("Create New Pack");
        createNewPackButton.setFocusable(false);
        createNewPackButton.setBackground(Color.lightGray);
        createNewPackButton.addActionListener(e -> createNewPack());


        JButton editExistingPackButton = new JButton();
        editExistingPackButton.setFont(standardFont);
        editExistingPackButton.setText("Edit Existing Pack");
        editExistingPackButton.setFocusable(false);
        editExistingPackButton.setBackground(Color.lightGray);

        gui.add(createNewPackButton);
        gui.add(editExistingPackButton);
        gui.add(versionLabel);

    }

    private static void createNewPack() {
        String packName = JOptionPane.showInputDialog("Enter pack name: ");
        while (true) {
            String gameVersion = JOptionPane.showInputDialog("Enter desired game version:");
            if (Arrays.asList(Const.acceptedGameVersions).contains(gameVersion)) break;
            JOptionPane.showMessageDialog(null, "Unsupported game version, please try again.");
        }
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        File fPath = null;
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            fPath = new File(fileChooser.getSelectedFile().getAbsolutePath());
        }
        

    }
}
