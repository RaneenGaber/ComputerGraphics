/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Keyboard1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author hp
 */
public class Keyboard1 extends JFrame implements KeyListener {
    String firstRow[] = {"~","1","2","3","4","5","6","7","8","9","0","-","=","backspace"};
String secondRow[] = {"Tab","Q","W","E","R","T","Y","U","I","O","P","[","]","\\"};
String thirdRow[] = {"Caps","A","S","D","F","G","H","J","K","L",";","'","Enter"};
String fourthRow[] = {"Shift","Z","X","C","V","B","N","M",",",".","/","   ^" };
String fifthRow[]={"ctrl" ,"fn" ,"wind","alt","space","alt","wind","ctrl","<","V",">" };

 ArrayList<String> gfg = new ArrayList<String>( 
            Arrays.asList("Geeks", 
                          "for", 
                          "Geeks")); 

JButton first[];

JButton second[];

JButton third[];

JButton fourth[];

JButton fifth[];
JLabel ll;

Color cc = new JButton().getBackground();

public static void main(String[] args) {
    //launch typing tutor
    
    new Keyboard1();
}

public Keyboard1(){
    super("keyboard");

       ll=new JLabel("type");
        setSize(975, 600);
        setResizable(false);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    JTextArea  text = new JTextArea();
     JScrollPane scrollPane = new JScrollPane(text);
    text.setPreferredSize(new Dimension(800,200));

    JPanel jpCenter = new JPanel();
    JPanel jp = new JPanel();
    
    jp.add(ll);
    add(jp,BorderLayout.NORTH);
    
    JPanel jpKeyboard = new JPanel();
    jpCenter.add(scrollPane);
  
    add( jpCenter, BorderLayout.NORTH);

    add(jpKeyboard, BorderLayout.CENTER);

    jpCenter.add(text, BorderLayout.WEST);
    jpCenter.add(text, BorderLayout.CENTER);    
    
    JPanel f = new JPanel();

    first = new JButton[firstRow.length];
    for(int i=0 ; i<firstRow.length;i++){
        first[i] = new JButton(firstRow[i]) ;
        if(firstRow[i]=="backspace"){
         first[i].setPreferredSize(new Dimension(100,50));

        }
        else{
         first[i].setPreferredSize(new Dimension(60,50));
        }
        f.add(first[i]);
        }
    jpKeyboard.add(f);
    
    JPanel s = new JPanel();

    second = new JButton[secondRow.length];
    for(int i=0 ; i<secondRow.length;i++){
        second[i] = new JButton(secondRow[i]) ;
        if(secondRow[i]=="Tab"){
         second[i].setPreferredSize(new Dimension(90,50));

        }
        else{
         second[i].setPreferredSize(new Dimension(60,50));
        }
        s.add(second[i]);
        }
    jpKeyboard.add(s);
    
     JPanel t = new JPanel();

    third = new JButton[thirdRow.length];
    for(int i=0 ; i<thirdRow.length;i++){
        third[i] = new JButton(thirdRow[i]) ;
        if(thirdRow[i]=="Caps"){
         third[i].setPreferredSize(new Dimension(100,50));

        }
        else if(thirdRow[i]=="Enter"){
         third[i].setPreferredSize(new Dimension(120,50));

        }
        else{
         third[i].setPreferredSize(new Dimension(60,50));
        }
        t.add(third[i]);
        }
    jpKeyboard.add(t);
    
    JPanel fo = new JPanel();

    fourth = new JButton[fourthRow.length];
    for(int i=0 ; i<fourthRow.length;i++){
        fourth[i] = new JButton(fourthRow[i]) ;
        if(fourthRow[i]=="Shift"){
         fourth[i].setPreferredSize(new Dimension(100,50));

        }
        else{
         fourth[i].setPreferredSize(new Dimension(60,50));
        }
        if(i==fourthRow.length-1){

            fo.add(new JPanel());

        }
        fo.add(fourth[i]);
        }
            fo.add(new JPanel());
            fo.add(new JPanel());

    jpKeyboard.add(fo);
        JPanel fi = new JPanel();

    fifth = new JButton[fifthRow.length];
    for(int i=0 ; i<fifthRow.length;i++){
        fifth[i] = new JButton(fifthRow[i]) ;
        if(fifthRow[i]=="space"){
         fifth[i].setPreferredSize(new Dimension(250,50));

        }
        else{
         fifth[i].setPreferredSize(new Dimension(60,50));
        }
       
        fi.add(fifth[i]);
        }
            fo.add(new JPanel());
            fo.add(new JPanel());

    jpKeyboard.add(fi);
    
    
    this.addKeyListener(this);
   
    text.addKeyListener(this);


    setVisible(true);

}
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_0) {
           first[10].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_BACK_QUOTE){
            first[0].setBackground(Color.CYAN);

        }
        else if(e.getKeyCode()==KeyEvent.VK_1){
            first[1].setBackground(Color.CYAN);

        }
        else if(e.getKeyCode()==KeyEvent.VK_2){
            first[2].setBackground(Color.CYAN);

        }
        else if(e.getKeyCode()==KeyEvent.VK_3){
            first[3].setBackground(Color.CYAN);

        }
        else if(e.getKeyCode()==KeyEvent.VK_4){
            first[4].setBackground(Color.CYAN);

        }
        else if(e.getKeyCode()==KeyEvent.VK_5){
            first[5].setBackground(Color.CYAN);

        }
        else if(e.getKeyCode()==KeyEvent.VK_6){
            first[6].setBackground(Color.CYAN);

        }
        else if(e.getKeyCode()==KeyEvent.VK_7){
            first[7].setBackground(Color.CYAN);

        }
        else if(e.getKeyCode()==KeyEvent.VK_8){
            first[8].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_9){
            first[9].setBackground(Color.CYAN);

        }
        else if(e.getKeyCode()==KeyEvent.VK_MINUS){
            first[11].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_EQUALS){
            first[12].setBackground(Color.CYAN);

        }
         else if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE){
            first[13].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_TAB){
            second[0].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_Q){
            second[1].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_W){
            second[2].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_E){
            second[3].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_R){
            second[4].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_T){
            second[5].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_Y){
            second[6].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_U){
            second[7].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_I){
            second[8].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_O){
            second[9].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_P){
            second[10].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_OPEN_BRACKET){
            second[11].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_CLOSE_BRACKET){
            second[12].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_BACK_SLASH){
            second[13].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_CAPS_LOCK){
            third[0].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_A){
            third[1].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_S){
            third[2].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_D){
            third[3].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_F){
            third[4].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_G){
            third[5].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_H){
            third[6].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_J){
            third[7].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_K){
            third[8].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_L){
            third[9].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_SEMICOLON){
            third[10].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_QUOTE){
            third[11].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_ENTER){
            third[12].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_SHIFT){
            fourth[0].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_Z){
            fourth[1].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_X){
            fourth[2].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_C){
            fourth[3].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_V){
            fourth[4].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_B){
            fourth[5].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_N){
            fourth[6].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_M){
            fourth[7].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_COMMA){
            fourth[8].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_BACK_SLASH){
            fourth[9].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_BACK_SLASH){
            fourth[10].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_UP){
            fourth[11].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_CONTROL){
            fifth[0].setBackground(Color.CYAN);
        }
        
        else if(e.getKeyCode()==KeyEvent.VK_WINDOWS){
            fifth[2].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_ALT){
            fifth[3].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_SPACE){
            fifth[4].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_ALT){
            fifth[5].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_WINDOWS){
            fifth[6].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_CONTROL){
            fifth[7].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_LEFT){
            fifth[8].setBackground(Color.CYAN);
        }
         else if(e.getKeyCode()==KeyEvent.VK_DOWN){
            fifth[9].setBackground(Color.CYAN);
        }
        else if(e.getKeyCode()==KeyEvent.VK_UP){
            fifth[10].setBackground(Color.CYAN);
        }
        
        
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_0) {
           first[10].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_BACK_QUOTE){
            first[0].setBackground(cc);

        }
         else if(e.getKeyCode()==KeyEvent.VK_1){
            first[1].setBackground(cc);

        }
        else if(e.getKeyCode()==KeyEvent.VK_2){
            first[2].setBackground(cc);

        }
        else if(e.getKeyCode()==KeyEvent.VK_3){
            first[3].setBackground(cc);

        }
        else if(e.getKeyCode()==KeyEvent.VK_4){
            first[4].setBackground(cc);

        }
        else if(e.getKeyCode()==KeyEvent.VK_5){
            first[5].setBackground(cc);

        }
        else if(e.getKeyCode()==KeyEvent.VK_6){
            first[6].setBackground(cc);

        }
        else if(e.getKeyCode()==KeyEvent.VK_7){
            first[7].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_8){
            first[8].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_9){
            first[9].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_MINUS){
            first[11].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_EQUALS){
            first[12].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE){
            first[13].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_TAB){
            second[0].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_Q){
            second[1].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_W){
            second[2].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_E){
            second[3].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_R){
            second[4].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_T){
            second[5].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_Y){
            second[6].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_U){
            second[7].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_I){
            second[8].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_O){
            second[9].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_P){
            second[10].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_OPEN_BRACKET){
            second[11].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_CLOSE_BRACKET){
            second[12].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_BACK_SLASH){
            second[13].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_CAPS_LOCK){
            third[0].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_A){
            third[1].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_S){
            third[2].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_D){
            third[3].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_F){
            third[4].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_G){
            third[5].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_H){
            third[6].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_J){
            third[7].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_K){
            third[8].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_L){
            third[9].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_SEMICOLON){
            third[10].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_QUOTE){
            third[11].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_ENTER){
            third[12].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_SHIFT){
            fourth[0].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_Z){
            fourth[1].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_X){
            fourth[2].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_C){
            fourth[3].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_V){
            fourth[4].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_B){
            fourth[5].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_N){
            fourth[6].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_M){
            fourth[7].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_COMMA){
            fourth[8].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_BACK_SLASH){
            fourth[9].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_BACK_SLASH){
            fourth[10].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_UP){
            fourth[11].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_CONTROL){
            fifth[0].setBackground(cc);
        }
        
        else if(e.getKeyCode()==KeyEvent.VK_WINDOWS){
            fifth[2].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_ALT){
            fifth[3].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_SPACE){
            fifth[4].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_ALT){
            fifth[5].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_WINDOWS){
            fifth[6].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_CONTROL){
            fifth[7].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_LEFT){
            fifth[8].setBackground(cc);
        }
         else if(e.getKeyCode()==KeyEvent.VK_DOWN){
            fifth[9].setBackground(cc);
        }
        else if(e.getKeyCode()==KeyEvent.VK_UP){
            fifth[10].setBackground(cc);
        }
        
    }
    
}
