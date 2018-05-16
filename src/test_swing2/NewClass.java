/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_swing2;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author anne
 */
public class NewClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frameE=new JFrame("patatilla");
        //creo el frame
        
        frameE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //así no se cierra nunca
        
        frameE.pack();
        //ajusta el tamaño a los componentes integrados
        frameE.setSize(200, 200);
        
        frameE.setVisible(true);
        //si no se ve no lo ves
        
        frameE.setLocationRelativeTo(null);
        
        ImageIcon aaa=new ImageIcon("src/test_swing2/axeworm.png");
        frameE.setIconImage(aaa.getImage());
        //ruta relativa para llamar iconos
        
        JButton QWE=new JButton("qweqweqwe");
        QWE.setSize(30, 30);
        //crea un botón
        
        JButton ASD=new JButton("qweqweqwe");
        ASD.setSize(30, 30);
        //crea un botón
        
        frameE.add(QWE);
        frameE.add(ASD);
        //añade el botón al frame
        
        /******************     JComponents    ******************************/
        
        //AbstractButton abstraButon=new AbstractButton();
        //No puede ser instanciado
        
        //BasicInternalFrameTitlePane titlePane=new BasicInternalFrameTitlePane( Internal Frame HERE );
        //Necesita JInternalFrame como parámetro
        
        /*        
        Box caja=new Box(2); 
        Box(int axis)
        Creates a Box that displays its components along the the specified axis.
        */
        /*Box.Filler llenaCaja=new Box.Filler();*/
        
        //JColorChooser, JComboBox, JFileChooser, JInternalFrame, JInternalFrame.JDesktopIcon, JLabel, JLayer, JLayeredPane, JList, JMenuBar, JOptionPane, JPanel, JPopupMenu, JProgressBar, JRootPane, JScrollBar, JScrollPane, JSeparator, JSlider, JSpinner, JSplitPane, JTabbedPane, JTable, JTableHeader, JTextComponent, JToolBar, JToolTip, JTree, JViewport
        
    }
    
}