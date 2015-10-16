
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


/**
 *
 * @author Joseph
 */
public class NeuralNetwork extends javax.swing.JFrame {

    private List<InputData> InputList = new ArrayList<InputData>();
    private File selectedFile;
    private String sFile;
    private JFileChooser fc = new JFileChooser();
    private Neuron America = new Neuron("America");
    private Neuron Africa = new Neuron("Africa");
    private Neuron Antarctica = new Neuron("Antarctica");
    private Neuron Asia = new Neuron("Asia");
    private Neuron Austrailia = new Neuron("Austrailia");
    private Neuron Europe = new Neuron("Europe");
    private Neuron Arctic = new Neuron("Arctic");
    private Neuron Atlantic = new Neuron("Atlantic");
    private Neuron Indian = new Neuron("Indian");
    private Neuron Pacific = new Neuron("Pacific");
    private double threshold = 0.5;
    private double learningRate = 0.5;
    private int correct = 1;
    private int epoch;
    
    public NeuralNetwork() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        openFile = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        performNetworkButton = new javax.swing.JButton();
        learningRateField = new javax.swing.JTextField();
        epochField = new javax.swing.JTextField();
        learningRateLabel = new javax.swing.JLabel();
        epochLabel = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        openTestSetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFocusable(false);

        openFile.setText("Open File");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });

        printButton.setText("Print");
        printButton.setEnabled(false);
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        performNetworkButton.setText("Perform Network");
        performNetworkButton.setEnabled(false);
        performNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                performNetworkButtonActionPerformed(evt);
            }
        });

        learningRateField.setText("0.5");

        epochField.setText("1");

        learningRateLabel.setText("Learning Rate:");

        epochLabel.setText("# of epochs:");

        textArea.setColumns(20);
        textArea.setRows(5);
        scrollPane.setViewportView(textArea);

        openTestSetButton.setText("Open Test File");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(openFile)
                .addGap(18, 18, 18)
                .addComponent(openTestSetButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(learningRateLabel)
                    .addComponent(epochLabel))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(learningRateField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(epochField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(243, Short.MAX_VALUE))))
            .addComponent(scrollPane)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(performNetworkButton)
                .addGap(18, 18, 18)
                .addComponent(printButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openFile)
                    .addComponent(openTestSetButton))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(learningRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(learningRateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(epochField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(epochLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printButton)
                    .addComponent(performNetworkButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        // TODO add your handling code here:
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            // clear the list for new file
            selectedFile  = fc.getSelectedFile();
            sFile = selectedFile.toString();
            try {
                // input in stuff
                readFile(selectedFile);
                
            } catch (IOException ex) {
                Logger.getLogger(NeuralNetwork.class.getName()).log(Level.SEVERE, null, ex);
            }
            printButton.setEnabled(true);
            performNetworkButton.setEnabled(true);
        }
    }//GEN-LAST:event_openFileActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
        printInput(InputList);
    }//GEN-LAST:event_printButtonActionPerformed

    private void performNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performNetworkButtonActionPerformed
        // TODO add your handling code here:
        performNetwork(InputList);
    }//GEN-LAST:event_performNetworkButtonActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(NeuralNetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NeuralNetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NeuralNetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NeuralNetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NeuralNetwork().setVisible(true);
            }
        });
    }
    
    public void readFile(File Selected)throws IOException{
        Scanner scan = new Scanner(selectedFile);
        InputData nTemp = new InputData();
        int count1 = 0;
        double indata = 0.0;
        while(scan.hasNext()){
            if(count1 == 0){
                nTemp.setLatitude(scan.nextDouble());
            }
            else if(count1 == 1){
                nTemp.setLongitude(scan.nextDouble());
            }
            else if (count1 == 2){
                nTemp.setLocation(scan.next());
            }
            
            count1++;
            if(count1 > 2){
                count1 = 0;
                InputList.add(nTemp);
                nTemp = new InputData();
            }
        }
    }
    
    public void performNetwork(List<InputData> n1){
        Iterator iter = n1.iterator();
        int i = 0, a, output;
        double weight = 1.0;
        while(iter.hasNext()){
            
            if(n1.get(i).getLocation().equals("Africa")){
                Africa.setCorrect(1);
            }
            else if(n1.get(i).getLocation().equals("America")){
                America.setCorrect(1);
            }
            else if(n1.get(i).getLocation().equals("Antarctica")){
                Antarctica.setCorrect(1);
            }
            else if(n1.get(i).getLocation().equals("Asia")){
                Asia.setCorrect(1);
            }
            else if(n1.get(i).getLocation().equals("Austrailia")){
                Austrailia.setCorrect(1);
            }
            else if(n1.get(i).getLocation().equals("Europe")){
                Europe.setCorrect(1);
            }
            else if(n1.get(i).getLocation().equals("Arctic")){
                Arctic.setCorrect(1);
            }
            else if(n1.get(i).getLocation().equals("Atlantic")){
                Atlantic.setCorrect(1);
            }
            else if(n1.get(i).getLocation().equals("Indian")){
                Indian.setCorrect(1);
            }
            else if(n1.get(i).getLocation().equals("Pacific")){
                Pacific.setCorrect(1);
            }
            
            
            
            
            output = calculateOutput(n1.get(i).getLatitude(), n1.get(i).getLongitude(), Africa.getLatitudeWeight(), Africa.getLongitudeWeight());
            Africa.setLatitudeWeight(calculateWeight(Africa.getLatitudeWeight(), learningRate, Africa.getCorrect(), output, n1.get(i).getLatitude()));
            Africa.setLongitudeWeight(calculateWeight(Africa.getLongitudeWeight(), learningRate, Africa.getCorrect(), output, n1.get(i).getLongitude()));
            
            output = calculateOutput(n1.get(i).getLatitude(), n1.get(i).getLongitude(), America.getLatitudeWeight(), America.getLongitudeWeight());
            America.setLatitudeWeight(calculateWeight(America.getLatitudeWeight(), learningRate, America.getCorrect(), output, n1.get(i).getLatitude()));
            America.setLongitudeWeight(calculateWeight(America.getLongitudeWeight(), learningRate, America.getCorrect(), output, n1.get(i).getLongitude()));
            
            output = calculateOutput(n1.get(i).getLatitude(), n1.get(i).getLongitude(), Antarctica.getLatitudeWeight(), Antarctica.getLongitudeWeight());
            Antarctica.setLatitudeWeight(calculateWeight(Antarctica.getLatitudeWeight(), learningRate, Antarctica.getCorrect(), output, n1.get(i).getLatitude()));
            Antarctica.setLongitudeWeight(calculateWeight(Antarctica.getLongitudeWeight(), learningRate, Antarctica.getCorrect(), output, n1.get(i).getLongitude()));
            
            output = calculateOutput(n1.get(i).getLatitude(), n1.get(i).getLongitude(), Asia.getLatitudeWeight(), Asia.getLongitudeWeight());
            Asia.setLatitudeWeight(calculateWeight(Asia.getLatitudeWeight(), learningRate, Asia.getCorrect(), output, n1.get(i).getLatitude()));
            Asia.setLongitudeWeight(calculateWeight(Asia.getLongitudeWeight(), learningRate, Asia.getCorrect(), output, n1.get(i).getLongitude()));
            
            output = calculateOutput(n1.get(i).getLatitude(), n1.get(i).getLongitude(), Austrailia.getLatitudeWeight(), Austrailia.getLongitudeWeight());
            Austrailia.setLatitudeWeight(calculateWeight(Austrailia.getLatitudeWeight(), learningRate, Austrailia.getCorrect(), output, n1.get(i).getLatitude()));
            Austrailia.setLongitudeWeight(calculateWeight(Austrailia.getLongitudeWeight(), learningRate, Austrailia.getCorrect(), output, n1.get(i).getLongitude()));
            
            output = calculateOutput(n1.get(i).getLatitude(), n1.get(i).getLongitude(), Europe.getLatitudeWeight(), Europe.getLongitudeWeight());
            Europe.setLatitudeWeight(calculateWeight(Europe.getLatitudeWeight(), learningRate, Europe.getCorrect(), output, n1.get(i).getLatitude()));
            Europe.setLongitudeWeight(calculateWeight(Europe.getLongitudeWeight(), learningRate, Europe.getCorrect(), output, n1.get(i).getLongitude()));
            
            output = calculateOutput(n1.get(i).getLatitude(), n1.get(i).getLongitude(), Arctic.getLatitudeWeight(), Arctic.getLongitudeWeight());
            Arctic.setLatitudeWeight(calculateWeight(Arctic.getLatitudeWeight(), learningRate, Arctic.getCorrect(), output, n1.get(i).getLatitude()));
            Arctic.setLongitudeWeight(calculateWeight(Arctic.getLongitudeWeight(), learningRate, Arctic.getCorrect(), output, n1.get(i).getLongitude()));
            
            output = calculateOutput(n1.get(i).getLatitude(), n1.get(i).getLongitude(), Atlantic.getLatitudeWeight(), Atlantic.getLongitudeWeight());
            Atlantic.setLatitudeWeight(calculateWeight(Atlantic.getLatitudeWeight(), learningRate, Atlantic.getCorrect(), output, n1.get(i).getLatitude()));
            Atlantic.setLongitudeWeight(calculateWeight(Atlantic.getLongitudeWeight(), learningRate, Atlantic.getCorrect(), output, n1.get(i).getLongitude()));
            
            output = calculateOutput(n1.get(i).getLatitude(), n1.get(i).getLongitude(), Indian.getLatitudeWeight(), Indian.getLongitudeWeight());
            Indian.setLatitudeWeight(calculateWeight(Indian.getLatitudeWeight(), learningRate, Indian.getCorrect(), output, n1.get(i).getLatitude()));
            Indian.setLongitudeWeight(calculateWeight(Indian.getLongitudeWeight(), learningRate, Indian.getCorrect(), output, n1.get(i).getLongitude()));
            
            output = calculateOutput(n1.get(i).getLatitude(), n1.get(i).getLongitude(), Pacific.getLatitudeWeight(), Pacific.getLongitudeWeight());
            Pacific.setLatitudeWeight(calculateWeight(Pacific.getLatitudeWeight(), learningRate, Pacific.getCorrect(), output, n1.get(i).getLatitude()));
            Pacific.setLongitudeWeight(calculateWeight(Pacific.getLongitudeWeight(), learningRate, Pacific.getCorrect(), output, n1.get(i).getLongitude()));
            
            
            resetCorrect();
            i++;
            iter.next();
        }
        
        printWeight(Africa);
        printWeight(America);
        printWeight(Antarctica);
        printWeight(Asia);
        printWeight(Austrailia);
        printWeight(Europe);
        printWeight(Arctic);
        printWeight(Atlantic);
        printWeight(Indian);
        printWeight(Pacific);
        

    }
    
    public void resetCorrect(){
        Antarctica.setCorrect(0);
        Africa.setCorrect(0);
        America.setCorrect(0);
        Indian.setCorrect(0);
        Austrailia.setCorrect(0);
        Pacific.setCorrect(0);
        Asia.setCorrect(0);
        Europe.setCorrect(0);
        Arctic.setCorrect(0);
        Atlantic.setCorrect(0);
    }
    
    public void setWeights(){
        
    }
    
    public void printWeight(Neuron a){
        textArea.append("\n" + a.getLocation() + ": ");
        textArea.append("Lat Weight: " + a.getLatitudeWeight() + " | " + "Lon Weight: " + a.getLongitudeWeight() + "\n");
    }
    
    public int calculateOutput(double latitude, double longitude, double latitudeWeight, double longitudeWeight){
        double temp = (latitude * latitudeWeight) + (longitude * longitudeWeight);
        if (temp >= threshold)
            return 1;
        else 
            return 0;
    }
    
    public void printInput(List<InputData> id){
        Iterator iter = id.iterator(); 
        int i = 0;
        

        while(iter.hasNext()){
            textArea.append("Latitude: " + id.get(i).getLatitude() + " | " + "Longitude: " + id.get(i).getLongitude() + "Location: " + id.get(i).getLocation() + "\n");
            iter.next();
            i++;
        }
    }

    public double calculateWeight(double currentWeight, double learningRate, int correct, int output, double input){
        return currentWeight + learningRate * (correct - output)*input;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField epochField;
    private javax.swing.JLabel epochLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField learningRateField;
    private javax.swing.JLabel learningRateLabel;
    private javax.swing.JButton openFile;
    private javax.swing.JButton openTestSetButton;
    private javax.swing.JButton performNetworkButton;
    private javax.swing.JButton printButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
