package Random;

import javax.swing.JOptionPane;

public class MenuJOption1 {
    public MenuJOption1(){
    int pil=0;
    JOptionPane.showMessageDialog(null, "Menu dengan JOptionPane");
    while(pil<=3){
    pil = menu();
    }
    
    
    }
    public static void main(String args[]){
    new MenuJOption1();
    }
    public void keluar(){
    if (JOptionPane.showConfirmDialog(null, "Yakin ni da mau Keluar?","Pilihan",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION){
    System.exit(0);
    }else{
    JOptionPane.showMessageDialog(null, "Ya harus mau!!!");
    System.exit(0);
    }
    
    }
    int menu(){
    int pil=0;
    String data="";
    data = JOptionPane.showInputDialog(null, "Pilihan:\n1. Input Data\n2. Edit Data\n3. Keluar\nSilahkan masukkan pilihan anda:","Menu",JOptionPane.PLAIN_MESSAGE);
    pil = Integer.parseInt(data);
    switch(pil){
    case 1: JOptionPane.showMessageDialog(null, "Anda memilih Input Data ");
    break;
    case 2: JOptionPane.showMessageDialog(null, "Anda memilih Edit Data ");
    break;
    case 3: keluar();
    break;
    default: keluar();
    break;
    }
    return pil;
    }
    }