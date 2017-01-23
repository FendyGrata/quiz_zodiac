import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingJavaCode {
    public  static void main(String[]args){
        JFrame frmMain = new JFrame("Hello From Java Code");
        frmMain.setSize(400,140);
        frmMain.setLocationRelativeTo(null);
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.getContentPane().setLayout(null);
        
        JLabel lblName= new JLabel("Your Name");
        lblName.setBounds(20, 10, 100, 20);
        frmMain.getContentPane().add(lblName);
        
        JTextField txtName = new JTextField();
        txtName.setBounds(110, 10, 270, 20);
        frmMain.getContentPane().add(txtName);
        
        JButton btnHello = new JButton("Say Hello!");
        btnHello.setBounds(20,50,360,50);
        btnHello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frmMain, "Hello "+ txtName.getText());
            }
        });
        frmMain.getContentPane().add(btnHello);
        
        frmMain.setVisible(true);
            
        
}
}
