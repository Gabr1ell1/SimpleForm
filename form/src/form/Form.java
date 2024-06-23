package form;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form extends JFrame
{
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, autor;
    ButtonGroup grupo;
    JCheckBox um, dois, tres;
    JRadioButton M, F;
    String ec [] = {"Solteiro(a)", "Viúvo(a)","Casado(a)","Divorciado(a)", "Separado(a)"};
    JComboBox lista;
    JTextField text1, text2;
    JButton limpar,enviar;
    
    public Form()
    {
    super("Formulário");
    Container tela = getContentPane();
    setLayout(null);
     // Ícone da página
        ImageIcon icone = new ImageIcon("cliente.png");
        setIconImage(icone.getImage());
       
        
    rotulo1 = new JLabel("Nome: "); 
    rotulo2 = new JLabel("Idade: ");
    text1 = new JTextField(50); 
    text2 = new JTextField(3);
    
    //DEFININDO AS POSIÇÕES
    //-COLUNA-LINHA-COMPRIMENTO-ALTURA
    rotulo1.setBounds(50,20,80,20);
    rotulo2.setBounds(50,50,80,20);
    text1.setBounds  (110,20,200,20);
    text2.setBounds  (110,50,70,20);

   
    rotulo3 = new JLabel("Sexo: ");
    M = new JRadioButton("Masculino");
    //ATALHO
    M.setMnemonic(KeyEvent.VK_M);
    F = new JRadioButton("Feminino");
    //ATALHO
    F.setMnemonic(KeyEvent.VK_F);
   
    //DEFININDO AS POSIÇÕES
    //-COLUNA-LINHA-COMPRIMENTO-ALTURA
    rotulo3.setBounds(50,100,80,20);
    M.setBounds      (100,100,100,20);
    F.setBounds      (200,100,100,20);

    
    grupo = new ButtonGroup();
    grupo.add(M);
    grupo.add(F);
    tela.add(M);
    tela.add(F);
    
    rotulo4 = new JLabel("Interesses: ");
    um = new JCheckBox("Automóveis");
    dois = new JCheckBox("Barcos");
    tres = new JCheckBox("Aviões");
    
    //DEFININDO AS POSIÇÕES
    //-COLUNA-LINHA-COMPRIMENTO-ALTURA
    rotulo4.setBounds(50,150,200,20);
    um.setBounds     (50,180,100,20);
    dois.setBounds   (50,200,100,20);
    tres.setBounds   (50,220,100,20);
    
    rotulo5 = new JLabel("Estado Civil: ");
    lista = new JComboBox(ec);
    lista.setMaximumRowCount(4);
    
    rotulo5.setBounds(50,250,80,20);
    lista.setBounds(125,250,150,20); 
    
    limpar =  new  JButton("Limpar os Dados"); 
    //ATALHO
    limpar.setMnemonic(KeyEvent.VK_L);
    enviar =  new  JButton("Enviar os Dados");
    limpar.setBounds(50,300,140,20); 
    enviar.setBounds(200,300,140,20); 
    
    
    autor = new JLabel("Desenvolvido por: Gabrielly - 2DS/AMS");
    autor.setFont(new Font("SansSerif",Font.BOLD+Font.ITALIC,12));
    autor.setBounds(80,350,300,20);
    
    
    limpar.addActionListener(
    new ActionListener(){  
            public void actionPerformed(ActionEvent e) { 
                text1.setText(null);
                text2.setText(null);
                grupo.clearSelection();
                um.setSelected(false);
                dois.setSelected(false);
                tres.setSelected(false);        
                text1.requestFocus();
            }
         }
    );
    
    enviar.addActionListener(
    new ActionListener(){  
            public void actionPerformed(ActionEvent e) { 
                text1.setText(null);
                text2.setText(null);
                grupo.clearSelection();
                um.setSelected(false);
                dois.setSelected(false);
                tres.setSelected(false);
                //CAIXA DE DIÁLOGO
                 JOptionPane.showMessageDialog(null,"Dados enviados!");
                   
                text1.requestFocus();
            }
         }
    );
    
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(text1);
    tela.add(text2);
    tela.add(rotulo3);
    
    tela.add(rotulo4);
    tela.add(um);
    tela.add(dois);
    tela.add(tres);
    tela.add(rotulo5);
    tela.add(lista);
    tela.add(autor);
    tela.add(limpar);
    tela.add(enviar);
    
   setSize(500,500);
   setLocationRelativeTo(null);
   setVisible(true);
    }
    
    public static void main(String[] args) {
        Form app = new Form();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
