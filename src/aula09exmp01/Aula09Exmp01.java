package aula09exmp01;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Aula09Exmp01 extends JFrame {

    private JPanel principal = new JPanel();
    private JComboBox<String> layouts = new JComboBox<>(new String[]{"Absolute", "FlowLayout", "BorderLayout", "GridLayout", "GridBagLayout", "HorizontalBox", "VerticalBox"});
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
        configuraLayoutAbsoluto();
        add(layouts, BorderLayout.NORTH);
        add(principal, BorderLayout.CENTER);
        layouts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println (layouts.getSelectedIndex());
                switch (layouts.getSelectedIndex())
                {
                    case 0: 
                        configuraLayoutAbsoluto();
                        pack();
                        break;
                    case 1:
                        configuraFlowLayout();
                        pack();
                        break;
                    case 2:
                        configuraBorderLayout();
                        pack();
                        break;
                    case 3:
                        configurarGridLayout();
                        pack();
                        break;
                    case 4:
                        configurarGridBagLayout();
                        pack();
                        break;
                    case 5: 
                        configurarHorizontalBox();
                        pack();
                        break;
                    case 6:
                        configurarVerticalBox();
                        pack();
                        break;
                }
                pack();
            }
        }
        );
    }

    public static void main(String[] args) {
        Aula09Exmp01 janela = new Aula09Exmp01();
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }    

    private void configuraFlowLayout() {
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
    private void configuraBorderLayout() {
        principal.setSize(400, 300);
        principal.setPreferredSize(new Dimension(400, 300));
        
        principal.setLayout(new BorderLayout());
        principal.add(lbl01, BorderLayout.NORTH);
        principal.add(txt01, BorderLayout.WEST);
        principal.add(txt02, BorderLayout.CENTER);
        principal.add(lbl03, BorderLayout.EAST);
        principal.add(txt03, BorderLayout.SOUTH);
    }


    private void configuraLayoutAbsoluto() {
        principal.setLayout(null);
        principal.setPreferredSize(new Dimension(400, 300));
        
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
      

    private void configurarGridLayout() {
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


    private void configurarGridBagLayout() {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        
        principal.setLayout(gbl);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.ipadx = 5;
        gbc.ipady = 10;
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

        gbc.ipady = 0;
        
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
    
    private void configurarHorizontalBox() {
        Box horizontal = Box.createHorizontalBox();
        
            horizontal.add(lbl01);
            horizontal.add(txt01);
            horizontal.add(lbl02);
            horizontal.add(txt02);
            horizontal.add(lbl03);
            horizontal.add(txt03);
            horizontal.add(lbl04);
            horizontal.add(txt04);
            principal.add(horizontal);
    }
    private void configurarVerticalBox() {
        Box vertical = Box.createVerticalBox();
        
            vertical.add(lbl01);
            vertical.add(txt01);
            vertical.add(lbl02);
            vertical.add(txt02);
            vertical.add(lbl03);
            vertical.add(txt03);
            vertical.add(lbl04);
            vertical.add(txt04);
            principal.add(vertical);
    }

    private void configurarBoxLayout() {
        }
}
