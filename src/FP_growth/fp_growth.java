/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FP_growth;


import java.io.BufferedReader;
import java.io.FileReader;
import weka.associations.Apriori;
import weka.core.Instance;
import weka.associations.FPGrowth;
import weka.core.Instances;


public class fp_growth {
    
    public static void main(String[] args) throws Exception {
        
        Instances data = new Instances(new BufferedReader(new FileReader("dataset/supermarket.arff"))); //load the data set

        FPGrowth fpgmodel = new FPGrowth(); // Build the model
        
          fpgmodel.buildAssociations(data);//build the assocications
    
        System.out.println(fpgmodel); //print the apriori model
    }
    
}
