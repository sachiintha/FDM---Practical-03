/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weka_demo;

/**
 *
 * @author Asus VivoBook
 */

//import weka.*;

import java.io.BufferedReader;
import java.io.FileReader;
import weka.core.Instance;
import weka.associations.Apriori;
import weka.core.Instances;

public class Weka_demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        //System.out.println("Hello Weka");
        
        Instances data = new Instances(new BufferedReader(new FileReader("dataset/supermarket.arff"))); //load the data set

        Apriori model = new Apriori(); // Build the model
        
        
        
        //set the delta values
        
        model.setDelta(0.05);
        
        //Number of rules
        model.setNumRules(8);
        
       //setlower bound minimum support 
       
       model.setLowerBoundMinSupport(0.1);
        
       //set upper bound minimum suppot
       
       model.setUpperBoundMinSupport(1.0);
       
       model.buildAssociations(data);//build the assocications
    
        System.out.println(model); //print the apriori model
       
       
    }
    
}
