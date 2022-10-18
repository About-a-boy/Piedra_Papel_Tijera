/*Se importa el paquete swing, el cual contiene todas las clases para crear Frames (marcos)*/
import javax.swing.*;
/*La clase "Galvan_Rodriguez_Esteban" hereda los métodos y atributos de la clase JFrame*/
public class Galvan_Rodriguez_Esteban extends javax.swing.JFrame {
    /*Se declaran 9 objetos de la clase Icon,que almacenarán las imagenes de piedra papel o tijera*/
    /*Imagen de piedra con orientación a la derecha*/
    Icon piedra_der = new ImageIcon("Piedrader.png");
    /*Imagen de papel con orientación a la derecha*/
    Icon papel_der = new ImageIcon("Papelder.png");
    /*Imagen de tijeras orientación a la derecha*/
    Icon tijera_der = new ImageIcon("Tijerasder.png");
    /*Imagen de piedra con orientación a la izquierda*/
    Icon piedra_iz = new ImageIcon("Piedraiz.png");
    /*Imagen de papel con orientación a la izquierda*/
    Icon papel_iz = new ImageIcon("Papeliz.png");
    /*Imagen de tijera con orientación a la izquierda*/
    Icon tijera_iz = new ImageIcon("Tijerasiz.png");
    /*Imagen de una piedra animada, la cual aparecerá al inicio del juego*/
    Icon piedrita = new ImageIcon("Piedrita.png");
    /*Imagen de un papelito animado, el cual aparecerá al inicio del juego*/
    Icon papelito = new ImageIcon("Papelito.png");
    /*Imagen del logotipo de 'VS', el cuál aparecerá durante todo el juego, hasta que haya un ganador*/
    Icon VS = new ImageIcon("VS.jpg");
    /*Se declaran dos variables de tipo entero para almacenar el progreso en en la barra JProgressBar, una por jugador*/
    int progreso_jugador_uno=0;
    int progreso_jugador_dos=0;
    /*Se declara el método constructor de la clase*/
    public Galvan_Rodriguez_Esteban() {
        /*Método intiComponents, creado por defaul al crear un JFrame en el editor de netBeans*/
        initComponents();
        /*Se invoca al método setIcon para asignarle imágenes iniciales a las etiquetas antes de iniciar el juego y durante
        la ejecución del mismo*/
        /*A la 'Etiqueta_Ganador', se le asigna la imagen del VS, la cual permanecerá así hasta que haya un ganador*/
        Etiqueta_Ganador.setIcon(VS);
        /*A la etiqueta Jugador uno se le asigna una imagen inicial de una piedra animada, antes de inicial el juego*/
        Jugador1.setIcon(piedrita);
        /*A la etiqueta jugador2 se le asigna la imágen de un papel animado, antes de iniciar el juego*/
        Jugador2.setIcon(papelito);
    }/*Fin del método constructor*/
    /*Implementación del método initComponents, en el cual se definen las posiciones de las etiquetas, el frame, los botones
    , así como su dispocición horizontal y vertical de los componentes del frame*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Jugador1 = new javax.swing.JLabel();
        Jugador2 = new javax.swing.JLabel();
        Jugar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Progreso_Jugador1 = new javax.swing.JProgressBar();
        Progreso_Jugador2 = new javax.swing.JProgressBar();
        Etiqueta_Ganador = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(500, 300));
        setResizable(false);

        Jugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jugador1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Jugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jugador2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Jugar.setText("Jugar");
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("JUGADOR 1");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("JUGADOR 2");

        Progreso_Jugador1.setForeground(new java.awt.Color(0, 51, 255));
        Progreso_Jugador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        Progreso_Jugador2.setForeground(new java.awt.Color(255, 51, 51));
        Progreso_Jugador2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        Etiqueta_Ganador.setFont(new java.awt.Font("Nirmala UI Semilight", 2, 20)); // NOI18N
        Etiqueta_Ganador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Etiqueta_Ganador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Progreso_Jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(Etiqueta_Ganador, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Progreso_Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Progreso_Jugador1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Progreso_Jugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Etiqueta_Ganador, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*Declaración de un método ActionPerformed, el cual implementa una interfaz de escucha que se ejecutará cada vez que se
    presione el botón "Jugar"*/
    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed
        /*Primero se declaran dos variables de tipo entero; jugador_1 y jugador_2, las cuales tomarán valores aleatorios entre
        el 1 y el 3*/
        int jugador_1= (int) (Math.random()*3+1);/*Uso del método random() de la clase Math, para generar numeros aleatorios*/
        int jugador_2= (int) (Math.random()*3+1);
        /*Una vez que se han generado los números aleatorios entre el 1 y el 3, se usará una estructurs switch, para que, en
        función del número asignado a las variables las etiquetas jugador1 y jugador2 tomen las imágenes de piedra, papel o
        tijeras*/
        /*Se evalúa la variable jugador_1*/
        switch(jugador_1){
            /*Si vale uno, tomará la imagen de piedra*/
            case 1:
                Jugador1.setIcon(piedra_iz);
                break;
             /*Si vale dos, tomará la imagen de papel*/
            case 2:
                Jugador1.setIcon(papel_iz);
                break;
            /*Si vale tres, tomará la imagen de tijera*/
            case 3:
                Jugador1.setIcon(tijera_iz);
                break;
        }
        /*Se evalua la variable jugador 2*/
        switch(jugador_2){
            /*Si vale uno, tomará la imagen de piedra*/
            case 1:
                Jugador2.setIcon(piedra_der);
                break;
            /*Si vale dos, tomará la imagen de papel*/
            case 2:
                Jugador2.setIcon(papel_der);
                break;
            /*Si vale tres, tomará la imagen de tijera*/
            case 3:
                Jugador2.setIcon(tijera_der);
                break;
        }
        /*Este bloque de if anidado hace que los jugadores obtengan puntajes en su ProgressBar*/
        /*Si un  jugador le gana a otro en una partida, su progressbar aumantará 20 pixeles, esto para que, al ganar 5 partidas
        llegue al 100 por ciento y gane algún jugador*/
        /*Si el jugador 1 es piedra y el segundo jugador es tijera, gana el jugador 1*/
        if(jugador_1==1&&jugador_2==3){
            /*Si gana el jugador 1, su ProgressBar aumenta en 20 pixeles*/
            progreso_jugador_uno+=20;
            Progreso_Jugador1.setValue(progreso_jugador_uno);
         /*Si el jugador 1 es papel y el jugador 2 es piedra, gana el jugador 1*/
        }else if(jugador_1==2&&jugador_2==1){
            /*Si gana el jugador 1, su ProgressBar aumenta en 20 pixeles*/
            progreso_jugador_uno+=20;
            Progreso_Jugador1.setValue(progreso_jugador_uno);
        /*Si el jugador 1 es tijera, y el jugador 2 papel, gana el jugador 1*/
        }else if(jugador_1==3&&jugador_2==2){
            /*Si gana el jugador 1, su ProgressBar aumenta en 20 pixeles*/
            progreso_jugador_uno+=20;
            Progreso_Jugador1.setValue(progreso_jugador_uno);
        }
        /*Si el jugador 2 es piedra y el jugador 1 es tijera, gana el jugador 2*/
        if(jugador_2==1&&jugador_1==3){
            /*La variable jugador_dos aumenta en 20*/
            progreso_jugador_dos+=20;
            /*Si gana el jugador 2, su ProgressBar aumenta en 20 pixeles*/
            Progreso_Jugador2.setValue(progreso_jugador_dos);
        /*Si  el jugador 2 es papel, y el jugador 1 es piedra, gana el jugador 2*/
        }else if(jugador_2==2&&jugador_1==1){
             /*La variable jugador_dos aumenta en 20*/
            progreso_jugador_dos+=20;
            /*Si gana el jugador 2, su ProgressBar aumenta en 20 pixeles*/
            Progreso_Jugador2.setValue(progreso_jugador_dos);
        /*Si el jugador 2 es tijera y el jugador 1 es papel, el jugador 2 gana*/
        }else if(jugador_2==3&&jugador_1==2){
             /*La variable jugador_dos aumenta en 20*/
            progreso_jugador_dos+=20;
            /*Si gana el jugador 2, su ProgressBar aumenta en 20 pixeles*/
            Progreso_Jugador2.setValue(progreso_jugador_dos);    
        }
        /*Este bloque se sentencias if sirve para comprobar si alguno de los jugadores ha ganado*/
        /*Si el progreso del jugador 1 o del jugador 2 ha llegado a 100, se inhabilita el botón jugar*/
        if(progreso_jugador_uno ==100|| progreso_jugador_dos==100){
            /*Se invoca al método setEnabled, pasándole como parámetro un valor flase, para inhabilitar el botón Jugar*/
            Jugar.setEnabled(false);
            /*Una vez inhabilitado el botón Jugar, se procede a avaluar cuál de los jugadores ganó*/
            /*Si la variable progreso_jugador_uno vale 100..*/
            if(progreso_jugador_uno ==100){
                /*Se invoca al método setIcon, pasándole como parámentro  una dirección null, para que ya no aparezca la imagen
                VS*/
                Etiqueta_Ganador.setIcon(null);
                /*El texto de la etiqueta cambiará para indicar que ganó el jugador 1*/
                Etiqueta_Ganador.setText("GANÓ JUGADOR 1!!");
            }
            /*Si la variable progreso_jugador_dos vale 100..*/
            if(progreso_jugador_dos==100){
                /*Se invoca al método setIcon, pasándole como parámentro  una dirección null, para que ya no aparezca la imagen
                VS*/
                Etiqueta_Ganador.setIcon(null);
                /*El texto de la etiqueta cambiará para indicar que ganó el jugador 2*/
                Etiqueta_Ganador.setText("GANÓ JUGADOR 2!!");
            }
        }
    }//GEN-LAST:event_JugarActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Galvan_Rodriguez_Esteban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Galvan_Rodriguez_Esteban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Galvan_Rodriguez_Esteban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Galvan_Rodriguez_Esteban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Galvan_Rodriguez_Esteban().setVisible(true);
            }
        });
    }
    /*Se declaran todas todas las variables para la ejecución del programa*/
    /*La variable Etiqueta_Ganador se usará para Indicar quién es el ganador y para mostrar una imagen con el simbolo VS*/
    /*Las variables Jugador1 y Jugador2 servirán para mostrar las imágenes de piedra, papel o tijera*/
    /*La variable Jugar servirá como un  botón al que se le implementará un ActionListener para manejar los eventos del juego
    así mismo para mostrar imagenes aleatorias de piedra, papel o tijera*/
    /*Las variables Progreso_Jugador1/2 servirán para mostrar el avance de ambos jugadores, para saber quién va ganando y para
    indicar al ganador*/
    /*las variables jLabel1/2/3 setvirán para mostrar quién es el jugador 1 y el jugador 2*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Etiqueta_Ganador;
    private javax.swing.JLabel Jugador1;
    private javax.swing.JLabel Jugador2;
    private javax.swing.JButton Jugar;
    private javax.swing.JProgressBar Progreso_Jugador1;
    private javax.swing.JProgressBar Progreso_Jugador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
