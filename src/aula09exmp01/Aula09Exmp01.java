package aula09exmp01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Aula09Exmp01 extends JFrame {

    private JPanel principal = new JPanel();
    private JLabel lbl01 = new JLabel("Etiqueta 1");
    private JLabel lbl02 = new JLabel("Etiqueta 2");
    private JLabel lbl03 = new JLabel("Etiqueta 3");
    private JLabel lbl04 = new JLabel("Etiqueta 4");
    private JTextField txt01 = new JTextField("Texto 1");
    private JTextField txt02 = new JTextField("Texto 2");
    private JTextField txt03 = new JTextField("Texto 3");
    private JTextField txt04 = new JTextField("Texto 4");
    
    public Aula09Exmp01() throws HeadlessException {
        super ("Exemplos de Layout");
        //configuraFlowLayout();
        //configuraBorderLayout();
        //configuraLayoutAbsoluto();
        //configurarGridLayout();
        configurarGridBagLayout();
        add(principal);
    }

    public static void main(String[] args) {
        Aula09Exmp01 janela = new Aula09Exmp01();
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }    

/*    private void configuraFlowLayout() {
        principal.setLayout(new FlowLayout());
        principal.add(lbl01);
        principal.add(txt01);
        principal.add(lbl02);
        principal.add(txt02);
        principal.add(lbl03);
        principal.add(txt03);
        principal.add(lbl04);
        principal.add(txt04);
    }
*/ /*    private void configuraBorderLayout() {
        principal.setLayout(new BorderLayout());
        principal.add(lbl01, BorderLayout.NORTH);
        principal.add(txt01, BorderLayout.WEST);
        principal.add(txt02, BorderLayout.CENTER);
        principal.add(lbl03, BorderLayout.EAST);
        principal.add(txt03, BorderLayout.SOUTH);
    }
*/

/*    private void configuraLayoutAbsoluto() {
        principal.setLayout(null);
        
        principal.add(lbl01);
        principal.add(txt01);
        principal.add(lbl02);
        principal.add(txt02);
        principal.add(lbl03);
        principal.add(txt03);
        principal.add(lbl04);
        principal.add(txt04); 
    
        lbl01.setSize(100, 30);
        lbl02.setSize(100, 30);
        lbl03.setSize(100, 30);
        lbl04.setSize(100, 30);
        
        lbl01.setLocation(10, 10);
        lbl02.setLocation(10, 50);
        lbl03.setLocation(10, 90);
        lbl04.setLocation(10, 130);
        
        txt01.setSize(200, 30);
        txt02.setSize(200, 30);
        txt03.setSize(200, 30);
        txt04.setSize(200, 30);
        
        txt01.setLocation(120, 10);
        txt02.setLocation(120, 50);
        txt03.setLocation(120, 90);
        txt04.setLocation(120, 130);
         }
    */      

/*    private void configurarGridLayout() {
        principal.setLayout(new GridLayout(4, 2));
        principal.add(lbl01);
        principal.add(txt01);
        principal.add(lbl02);
        principal.add(txt02);
        principal.add(lbl03);
        principal.add(txt03);
        principal.add(lbl04);
        principal.add(txt04);
    }
*/

    private void configurarGridBagLayout() {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        
        principal.setLayout(gbl);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        
        principal.add(lbl01);
        gbl.setConstraints(lbl01, gbc);
        
        principal.add(lbl02);
        gbc.gridy = 1;
        gbl.setConstraints(lbl02, gbc);
        
        principal.add(lbl03);
        gbc.gridy = 2;
        gbl.setConstraints(lbl03, gbc);
        
        principal.add(lbl04);
        gbc.gridy = 3;
        gbl.setConstraints(lbl04, gbc);

        principal.add(txt01);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 2;
        gbl.setConstraints(txt01, gbc);

        principal.add(txt02);
        gbc.gridy++;
        gbl.setConstraints(txt02, gbc);
        
        principal.add(txt03);
        gbc.gridy++;
        gbl.setConstraints(txt03, gbc);
        
        principal.add(txt04);
        gbc.gridy++;
        gbl.setConstraints(txt04, gbc);

    }
}
