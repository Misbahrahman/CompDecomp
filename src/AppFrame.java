import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AppFrame extends JFrame implements ActionListener {
    JButton compressButton;
    JButton decompressButton;

    AppFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        compressButton = new JButton("Select File to Compress");
        compressButton.setBounds(20, 100,200 ,30);
        compressButton.addActionListener(this);

        decompressButton = new JButton("Select File to Decompress");
        decompressButton.setBounds(250, 100,200 ,30);
        decompressButton.addActionListener(this);


        this.add(compressButton);
        this.add(decompressButton);
        this.setSize(1000, 500);
        this.getContentPane().setBackground(new Color(248, 244, 255)); // Light Purple or Lavender background color
//        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME); // Set the title bar style
//        this.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG); // Set the title bar style
        this.setTitle("Compressor and Decompressor"); // Set the title
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == compressButton) {
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION) {
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try {
                    compressor.method(file);
                }
                catch(Exception ee) {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }
        if(e.getSource() == decompressButton){
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION) {
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try {
                    decompressor.method(file);
                }
                catch(Exception ee) {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }
    }


}




