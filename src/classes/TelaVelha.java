/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Arrays;
import javax.swing.JButton;

/**
 *
 * @author Marcelo
 */
public class TelaVelha extends javax.swing.JFrame {

    /**
     * Creates new form TelaVelha
     */
    public TelaVelha() {
        initComponents();
        Arrays.fill(f,true);
        new Thread(){
            public void run(){
                int x = 600;
                int y = menuanimado.getLocation().y;
                
                while(true){
                    x--;
                    if(x<-460){
                        x = 760;                  
                    }
                    menuanimado.setLocation(x,y);
                    try{
                        sleep(3);
                    } catch (Exception e){
                }
            }
        }
        
    }.start();
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panSuper = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        menuanimado = new javax.swing.JLabel();
        multiplayer = new javax.swing.JButton();
        singleplayer = new javax.swing.JButton();
        menuback = new javax.swing.JLabel();
        Jogo = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        anuncia = new javax.swing.JLabel();
        tabuleiro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(816, 650));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        panSuper.setBackground(new java.awt.Color(47, 72, 78));
        panSuper.setForeground(new java.awt.Color(47, 72, 78));
        panSuper.setPreferredSize(new java.awt.Dimension(816, 600));
        panSuper.setLayout(new java.awt.CardLayout());

        menu.setBackground(new java.awt.Color(47, 72, 78));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuanimado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuanima.png"))); // NOI18N
        menu.add(menuanimado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        multiplayer.setBackground(new java.awt.Color(47, 72, 78));
        multiplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/multiplayer.png"))); // NOI18N
        multiplayer.setBorder(null);
        multiplayer.setBorderPainted(false);
        multiplayer.setDefaultCapable(false);
        multiplayer.setVerifyInputWhenFocusTarget(false);
        multiplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplayerActionPerformed(evt);
            }
        });
        menu.add(multiplayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 190, 40));

        singleplayer.setBackground(new java.awt.Color(47, 72, 78));
        singleplayer.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        singleplayer.setForeground(new java.awt.Color(204, 204, 0));
        singleplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/single player.png"))); // NOI18N
        singleplayer.setBorder(null);
        singleplayer.setBorderPainted(false);
        singleplayer.setDefaultCapable(false);
        singleplayer.setFocusPainted(false);
        singleplayer.setFocusable(false);
        singleplayer.setRequestFocusEnabled(false);
        singleplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleplayerActionPerformed(evt);
            }
        });
        menu.add(singleplayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 190, 40));

        menuback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu2.png"))); // NOI18N
        menu.add(menuback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        panSuper.add(menu, "card3");

        Jogo.setBackground(new java.awt.Color(47, 72, 78));
        Jogo.setForeground(new java.awt.Color(47, 72, 78));
        Jogo.setLayout(null);

        btn1.setBackground(new java.awt.Color(40, 56, 76));
        btn1.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 0, 51));
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setDefaultCapable(false);
        btn1.setFocusPainted(false);
        btn1.setFocusable(false);
        btn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn1.setMinimumSize(new java.awt.Dimension(22, 102));
        btn1.setRequestFocusEnabled(false);
        btn1.setVerifyInputWhenFocusTarget(false);
        btn1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        Jogo.add(btn1);
        btn1.setBounds(230, 260, 70, 50);

        btn2.setBackground(new java.awt.Color(231, 236, 237));
        btn2.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 0, 51));
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setDefaultCapable(false);
        btn2.setFocusPainted(false);
        btn2.setFocusable(false);
        btn2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn2.setMinimumSize(new java.awt.Dimension(22, 102));
        btn2.setRequestFocusEnabled(false);
        btn2.setVerifyInputWhenFocusTarget(false);
        btn2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        Jogo.add(btn2);
        btn2.setBounds(300, 220, 70, 50);

        btn3.setBackground(new java.awt.Color(40, 56, 76));
        btn3.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 0, 51));
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setDefaultCapable(false);
        btn3.setFocusPainted(false);
        btn3.setFocusable(false);
        btn3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn3.setMinimumSize(new java.awt.Dimension(22, 102));
        btn3.setRequestFocusEnabled(false);
        btn3.setVerifyInputWhenFocusTarget(false);
        btn3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        Jogo.add(btn3);
        btn3.setBounds(380, 180, 70, 50);

        btn4.setBackground(new java.awt.Color(231, 236, 237));
        btn4.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 0, 51));
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setDefaultCapable(false);
        btn4.setFocusPainted(false);
        btn4.setFocusable(false);
        btn4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn4.setMinimumSize(new java.awt.Dimension(22, 102));
        btn4.setRequestFocusEnabled(false);
        btn4.setVerifyInputWhenFocusTarget(false);
        btn4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        Jogo.add(btn4);
        btn4.setBounds(310, 300, 60, 50);

        btn5.setBackground(new java.awt.Color(40, 56, 76));
        btn5.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 0, 51));
        btn5.setBorder(null);
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setDefaultCapable(false);
        btn5.setFocusPainted(false);
        btn5.setFocusable(false);
        btn5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn5.setMinimumSize(new java.awt.Dimension(22, 102));
        btn5.setRequestFocusEnabled(false);
        btn5.setVerifyInputWhenFocusTarget(false);
        btn5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        Jogo.add(btn5);
        btn5.setBounds(370, 260, 70, 50);

        btn6.setBackground(new java.awt.Color(231, 236, 237));
        btn6.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 0, 51));
        btn6.setBorder(null);
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setDefaultCapable(false);
        btn6.setFocusPainted(false);
        btn6.setFocusable(false);
        btn6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn6.setMinimumSize(new java.awt.Dimension(22, 102));
        btn6.setRequestFocusEnabled(false);
        btn6.setVerifyInputWhenFocusTarget(false);
        btn6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        Jogo.add(btn6);
        btn6.setBounds(460, 220, 70, 50);

        btn7.setBackground(new java.awt.Color(40, 56, 76));
        btn7.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 0, 51));
        btn7.setBorder(null);
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setDefaultCapable(false);
        btn7.setFocusPainted(false);
        btn7.setFocusable(false);
        btn7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn7.setMinimumSize(new java.awt.Dimension(22, 102));
        btn7.setRequestFocusEnabled(false);
        btn7.setVerifyInputWhenFocusTarget(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        Jogo.add(btn7);
        btn7.setBounds(380, 340, 80, 50);

        btn8.setBackground(new java.awt.Color(231, 236, 237));
        btn8.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 0, 51));
        btn8.setBorder(null);
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setDefaultCapable(false);
        btn8.setFocusPainted(false);
        btn8.setFocusable(false);
        btn8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn8.setMinimumSize(new java.awt.Dimension(22, 102));
        btn8.setRequestFocusEnabled(false);
        btn8.setVerifyInputWhenFocusTarget(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        Jogo.add(btn8);
        btn8.setBounds(450, 290, 70, 60);

        btn9.setBackground(new java.awt.Color(40, 56, 76));
        btn9.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 0, 51));
        btn9.setBorder(null);
        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setDefaultCapable(false);
        btn9.setFocusPainted(false);
        btn9.setFocusable(false);
        btn9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn9.setMinimumSize(new java.awt.Dimension(22, 102));
        btn9.setRequestFocusEnabled(false);
        btn9.setVerifyInputWhenFocusTarget(false);
        btn9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        Jogo.add(btn9);
        btn9.setBounds(530, 260, 70, 50);

        anuncia.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        anuncia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anuncia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Jogo.add(anuncia);
        anuncia.setBounds(470, 80, 270, 60);

        tabuleiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.png"))); // NOI18N
        Jogo.add(tabuleiro);
        tabuleiro.setBounds(110, 150, 600, 300);

        panSuper.add(Jogo, "card13");

        getContentPane().add(panSuper);
        panSuper.setBounds(0, 0, 1600, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private String res;
    boolean v= true;
    boolean f[]= new boolean[9];
    int x=0;
    int c=0;   // incremento velha
    int i = 0; // incremento identifica X, O
    int bt1=0; // posição 1
    int bt2=0; // posição 2
    int bt3=0; // posição 3
    int bt4=0; // posição 4
    int bt5=0; // posição 5
    int bt6=0; // posição 6
    int bt7=0; // posição 7
    int bt8=0; // posição 8
    int bt9=0; // posição 9
    
    
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(i%2==1){ // Alterna entre X e O
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
            bt7=1;
        }
        else{
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/circulo.png"))); // Seleciona Imagem de O
            bt7=2;
        }
        verifica();
        

    }//GEN-LAST:event_btn7ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(i%2==1){
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
        
        bt5=1;
        }
        else{
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/circulo.png"))); // Seleciona Imagem de O
        bt5=2;
        }
        verifica();

    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(i%2==1){
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
        bt6=1;
        }
        else{
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/circulo.png"))); // Seleciona Imagem de O
        bt6=2;
        }
        verifica();

    }//GEN-LAST:event_btn6ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(i%2==1){
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
        bt4=1;
        }
        else{
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/circulo.png"))); // Seleciona Imagem de O
        bt4=2;
        }
        verifica();

    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(i%2==1){
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
        bt1=1;
        }
        else{
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/circulo.png"))); // Seleciona Imagem de O
        bt1=2;
        }
        verifica();

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(i%2==1){
            btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
            bt8=1;
        }
        else{
            btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/circulo.png"))); // Seleciona Imagem de O
            bt8=2;
        }
        verifica();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if(i%2==1){
            btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
            bt9=1;
        }
        else{
            btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/circulo.png"))); // Seleciona Imagem de O
            bt9=2;
        }
        verifica();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(i%2==1){
            btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
            bt3=1;
        
        }
        else{
            btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/circulo.png"))); // Seleciona Imagem de O
            bt3=2;
        }
        verifica();
        
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

        if(i%2==1){
            btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
            bt2=1;
        }
        else{
            btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/circulo.png"))); // Seleciona Imagem de O
            bt2=2;
        }
        verifica();
    }//GEN-LAST:event_btn2ActionPerformed

    private void multiplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplayerActionPerformed

        panSuper.removeAll();
        panSuper.add(Jogo);
        panSuper.repaint();
        panSuper.revalidate();        
    }//GEN-LAST:event_multiplayerActionPerformed

    private void singleplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleplayerActionPerformed
        x=1;
        panSuper.removeAll();
        panSuper.add(Jogo);
        panSuper.repaint();
        panSuper.revalidate();
    }//GEN-LAST:event_singleplayerActionPerformed

    public void vencedor(int btA, int btB, int btC ){ // Função para verificar vencedor
        
        if (btA==1 && btB==1 && btC==1){ // Verifica
            res = "X";
            anuncia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/xGanhou.png"))); // Seleciona Imagem de X

        }
        else if (btA==2 && btB==2 && btC==2){ // Verifica
            res = "O";
            anuncia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/oGanhou.png"))); // Seleciona Imagem de O

        }
     
    }
    
    public void verifica(){ //
        if (x==0){
        vencedor(bt1,bt2,bt3);
        vencedor(bt4,bt5,bt6);
        vencedor(bt7,bt8,bt9);
        vencedor(bt1,bt4,bt7);
        vencedor(bt2,bt5,bt8);
        vencedor(bt3,bt6,bt9);
        vencedor(bt1,bt5,bt9);
        vencedor(bt3,bt5,bt7);
        i++;
        velha();        
        }
        if (x==1){
            velha();         
            Inicio();
            Mi();
            Ca();
            if (f[0]== true){
            PRj(0,bt1,bt2,bt3,btn1,btn2,btn3); // PR1
            f[2]=false;
            }
            PRj(1,bt4,bt5,bt6,btn4,btn5,btn6); // PR2
            if(f[2]==true){
            PRj(2,bt7,bt8,bt9,btn7,btn8,btn9); // PR3
            f[2]=false;
            }
            PRj(3,bt1,bt4,bt7,btn1,btn4,btn7); // PR4
            PRj(4,bt2,bt5,bt8,btn2,btn5,btn8); // PR5
            if (f[5]== true){
            PRj(5,bt3,bt6,bt9,btn3,btn6,btn9); // PR6 
            f[5]=false;
            }            
            PRj(6,bt1,bt5,bt9,btn1,btn5,btn9); // PR7
            PRj(7,bt7,bt5,bt3,btn7,btn5,btn3); // PR8
            i+=2;
        }
    }
    public void velha(){
        c++;
        if((c>=9 && res!="X") || (c>=9 && res!="O")){
            anuncia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/velha.png"))); // Seleciona Imagem de VELHA
        }
    }
    
    /* INICIO DA INTELIGENCIA ARTIFICIAL */
    
    public void Inicio(){
        if(c==1){
            if(bt5==0){
              btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
              bt5=1;
            }
        }  
    } // Ocupa o meio caso esteja vazio
    public void Mi(){
        if(f[8]==true){
            if(c==3){
            if((bt1==0 && bt9==0) || (bt3==0 && bt7==0)){
                if(bt2==0){
                    btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
                    bt2=1;
                    f[8]=false;
                }
                else if(bt4==0){
                    btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
                    bt4=1;
                    f[8]=false;
                }
                else if(bt6==0){
                    btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
                    bt6=1;
                    f[8]=false;
                }
                else if(bt8==0){
                    btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
                    bt8=1;
                    f[8]=false;
                }                
            }
            }  

    }
        
    } // Ocupa os meios intermediarios
    public void Ca(){
        if(bt5==2){
            btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
            bt1=1;
        }
    } // Ocupa algum canto
    public void PRj(int index, int btA, int btB, int btC, JButton btnA, JButton btnB, JButton btnC ){
        if(btA==2 && btB==2){
            btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
            btC=1;

        }
        else if(btA==2 && btC==2){
            btnB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
            btB=1;


        }
        else if(btB==2 && btC==2){
            btnA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // Seleciona Imagem de X
            btA=1;

        }            
} // Impede o inimigo de ganhar
    
    /* FIM DA INTELIGENCIA ARTIFICIAL */
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
    
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jogo;
    private javax.swing.JLabel anuncia;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel menuanimado;
    private javax.swing.JLabel menuback;
    private javax.swing.JButton multiplayer;
    private javax.swing.JPanel panSuper;
    private javax.swing.JButton singleplayer;
    private javax.swing.JLabel tabuleiro;
    // End of variables declaration//GEN-END:variables
        
}