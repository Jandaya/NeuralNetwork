
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
    private List<InputData> testList = new ArrayList<InputData>();
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
    private List<Neuron> NeuronList = new ArrayList<Neuron>();
    private double threshold = 0.5;
    private double learningRate = 0.5;
    private int correct = 1;
    private int epoch = 0;
    private int numOfDataLines = 0;
    
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
        testButton = new javax.swing.JButton();
        thresholdField = new javax.swing.JTextField();
        thresholdLabel = new javax.swing.JLabel();

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
        openTestSetButton.setEnabled(false);
        openTestSetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openTestSetButtonActionPerformed(evt);
            }
        });

        testButton.setText("Test");
        testButton.setToolTipText("");
        testButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButtonActionPerformed(evt);
            }
        });

        thresholdField.setText("0.5");

        thresholdLabel.setText("Threshold:");

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
            .addComponent(scrollPane)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(learningRateLabel)
                    .addComponent(epochLabel)
                    .addComponent(thresholdLabel))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(performNetworkButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(testButton)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(learningRateField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(epochField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(thresholdField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(234, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(printButton)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(openFile)
                            .addComponent(openTestSetButton)
                            .addComponent(testButton))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(learningRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(learningRateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(thresholdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thresholdLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(epochField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(epochLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(performNetworkButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(printButton)
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

    private void testButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButtonActionPerformed
        // TODO add your handling code here:
        calculatePerfectFire(testList, NeuronList);
    }//GEN-LAST:event_testButtonActionPerformed

    private void openTestSetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openTestSetButtonActionPerformed
        // TODO add your handling code here:
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            // clear the list for new file
            selectedFile  = fc.getSelectedFile();
            sFile = selectedFile.toString();
            try {
                // input in stuff
                readFile(selectedFile, testList);

            } catch (IOException ex) {
                Logger.getLogger(NeuralNetwork.class.getName()).log(Level.SEVERE, null, ex);
            }
            //printInput(testList);

        }
    }//GEN-LAST:event_openTestSetButtonActionPerformed

    private void performNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performNetworkButtonActionPerformed
        // TODO add your handling code here:
        epoch = Integer.parseInt(epochField.getText());
        learningRate = Double.parseDouble(learningRateField.getText());
        threshold = Double.parseDouble(thresholdField.getText());
        performNetwork(InputList, NeuronList);
    }//GEN-LAST:event_performNetworkButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
        printInput(InputList);
    }//GEN-LAST:event_printButtonActionPerformed

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
                readFile(selectedFile, InputList);

            } catch (IOException ex) {
                Logger.getLogger(NeuralNetwork.class.getName()).log(Level.SEVERE, null, ex);
            }
            printButton.setEnabled(true);
            performNetworkButton.setEnabled(true);
            openTestSetButton.setEnabled(true);
            addNeurons();
        }
    }//GEN-LAST:event_openFileActionPerformed

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
    
    public void readFile(File Selected, List<InputData> id)throws IOException{
        Scanner scan = new Scanner(Selected);
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
                id.add(nTemp);
                nTemp = new InputData();
            }
        }
    }
    
    public void testNetwork(List<InputData> id, List<Neuron> ne){
        Iterator iter = id.iterator();
        Iterator itne = ne.iterator();
        int i = 0, j = 0, a, output, iterationCount = 0;
        double weight = 1.0;
        int AfricaCount=0, AmericaCount=0;
        int AfricaCorrectFire = 0;
        while(iter.hasNext()){
            while(itne.hasNext()){
                output = calculateOutput(id.get(i).getLatitude(), id.get(i).getLongitude(), ne.get(j).getLatitudeWeight(), ne.get(j).getLongitudeWeight());
                if(output == 1){
                    if(ne.get(j).getLocation().equals(id.get(i).getLocation())){
                        
                    }
                }
            }
            j = 0;
            itne = ne.iterator();
            i++;
            iter.next();
        }
        numOfDataLines = i;
    }
    
    public String getCorrectLocation(){
        
        return "";
    }
   
    
    public void calculatePerfectFire(List<InputData> n1, List<Neuron> ne){
        Iterator iter = n1.iterator();
        Iterator itne = ne.iterator();
        int i = 0, j = 0, a, AfricaOutput, iterationCount = 0, output = 0, perfect = 0, noFire = 0, multipleFire = 0, overallOutput = 0;
        double weight = 1.0;
        int fire = 0, correctFire = 0;
        String outputLocation;
        while(iter.hasNext()){
            while(itne.hasNext()){
                output = calculateOutput(n1.get(i).getLatitude(), n1.get(i).getLongitude(), ne.get(j).getLatitudeWeight(), ne.get(j).getLongitudeWeight());
                //textArea.append("\ninputLocation: " + n1.get(i).getLocation() + " OutputLocation: " + ne.get(j).getLocation() + " Output: " + output);
                if(output == 0 && ne.get(j).getLocation().equals(n1.get(i).getLocation()))
                    ne.get(j).iterateMisfires();
                if(output == 0 && !(ne.get(j).getLocation().equals(n1.get(i).getLocation())))
                    ne.get(j).iterateNoNo();
                if (output == 1){
                    fire++;
                    ne.get(j).iterateFires();
                    if(ne.get(j).getLocation().equals(n1.get(i).getLocation())){
                       correctFire++;
                       ne.get(j).iterateCorrect();
                    }
                }
                j++;
                itne.next();
            }
            
            if(fire == correctFire && fire > 0)
                perfect++;
            else if(fire >= 1)
                multipleFire++;
            else if(fire < 1)
                noFire++;
            
            
            itne = ne.iterator();
            j = 0;
            output = 0; 
            fire = 0; 
            correctFire = 0;
            i++;
            iter.next();
        }
        textArea.append("\nAfrica Perfect fire percentage: " + calculatePercentage(ne.get(0).getNumCorrect(), i) + "%");
        textArea.append("\nPerfect fire percentage: " + calculatePercentage(perfect, i) + "%");
        textArea.append("\nNo fire percentage: " + calculatePercentage(noFire, i)+ "%");
        textArea.append("\nMultiple fire percentage: " + calculatePercentage(multipleFire, i)+ "%");
        textArea.append("\nNumber of perfect counts: " + perfect + " | " + "Number overall: " + i);
        printStatistics(ne, i);
    }
    
    public void printStatistics(List<Neuron> n, int num){
        Iterator in = n.iterator();
        int i = 0, numShouldntFire = 0;
        while(in.hasNext()){
            textArea.append("\n\n" + n.get(i).getLocation() + ": ");
            textArea.append("\nPercentage correct Fires: " + calculatePercentage(n.get(i).getNumCorrect(), num) + "%");
            textArea.append("\nTrue Negatives: " + calculatePercentage(n.get(i).getNoNo(), num) + "%");
            numShouldntFire = n.get(i).getNumFires() - n.get(i).getNumCorrect();
            //textArea.append("\nPercentage overall Fires: " + calculatePercentage(n.get(i).getNumFires(), num) + "%");
            textArea.append("\nPercentage incorrect Fires: " + calculatePercentage(numShouldntFire, num) + "%");
            textArea.append("\nPercentage Misfires: " + calculatePercentage(n.get(i).getNumMisfires(), num) + "%");

            i++;
            in.next();
        }
    }
    public double calculatePercentage(int num, int total){
        double temp = ((double)num / (double)total) * 100.0;
        temp = Math.round(temp * 100.0) / 100.0;
        return temp;
    }
    public void setCorrect(InputData n){
            if(n.getLocation().equals("Africa")){
                Africa.setCorrect(1);
            }
            else if(n.getLocation().equals("America")){
                America.setCorrect(1);
            }
            else if(n.getLocation().equals("Antarctica")){
                Antarctica.setCorrect(1);
            }
            else if(n.getLocation().equals("Asia")){
                Asia.setCorrect(1);
            }
            else if(n.getLocation().equals("Austrailia")){
                Austrailia.setCorrect(1);
            }
            else if(n.getLocation().equals("Europe")){
                Europe.setCorrect(1);
            }
            else if(n.getLocation().equals("Arctic")){
                Arctic.setCorrect(1);
            }
            else if(n.getLocation().equals("Atlantic")){
                Atlantic.setCorrect(1);
            }
            else if(n.getLocation().equals("Indian")){
                Indian.setCorrect(1);
            }
            else if(n.getLocation().equals("Pacific")){
                Pacific.setCorrect(1);
            }
    }
    
    public void performNetwork(List<InputData> n1, List<Neuron> ne){
        Iterator iter = n1.iterator();
        Iterator itne = ne.iterator();
        int i = 0, j = 0, a, output, count = 0;
        double weight = 1.0;
        while(count < epoch){
            while(iter.hasNext()){
                while(itne.hasNext()){
                    if(n1.get(i).getLocation().equals(ne.get(j).getLocation()))
                        ne.get(j).setCorrect(1);

                    output = calculateOutput(n1.get(i).getLatitude(), n1.get(i).getLongitude(), ne.get(j).getLatitudeWeight(), ne.get(j).getLongitudeWeight());
                    ne.get(j).setLatitudeWeight(calculateWeight(ne.get(j).getLatitudeWeight(), learningRate, ne.get(j).getCorrect(), output, n1.get(i).getLatitude()));
                    ne.get(j).setLongitudeWeight(calculateWeight(ne.get(j).getLongitudeWeight(), learningRate, ne.get(j).getCorrect(), output, n1.get(i).getLongitude()));
                    j++;
                    itne.next();
                }
                j = 0;
                itne = ne.iterator();

                resetCorrect2(ne);
                i++;
                iter.next();
            }
            i = 0;
            iter = n1.iterator();
            count++;
        }
        displayNeurons(ne);
        /*
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
        */

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
    
    
    public void resetCorrect2(List<Neuron> n){
        Iterator iter = n.iterator();
        int i = 0;
        while(iter.hasNext()){
            n.get(i).setCorrect(0);
            i++;
            iter.next();
        }
        
    }
    
    public void displayNeurons(List<Neuron> n){
        Iterator iter = n.iterator();
        int i = 0;
        while(iter.hasNext()){
            textArea.append("\n" + n.get(i).getLocation() + ": ");
            textArea.append("Lat Weight: " + n.get(i).getLatitudeWeight() + " | " + "Lon Weight: " + n.get(i).getLongitudeWeight() + "\n");            i++;
            iter.next();
        }
    }
    
    public void addNeurons(){
        NeuronList.add(Africa);
        NeuronList.add(America);
        NeuronList.add(Antarctica);
        NeuronList.add(Asia);
        NeuronList.add(Austrailia);
        NeuronList.add(Europe);
        NeuronList.add(Arctic);
        NeuronList.add(Atlantic);
        NeuronList.add(Indian);
        NeuronList.add(Pacific);
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
    private javax.swing.JButton testButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField thresholdField;
    private javax.swing.JLabel thresholdLabel;
    // End of variables declaration//GEN-END:variables
}
