/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.simmetrics.StringMetric;
import static org.simmetrics.builders.StringMetricBuilder.with;
import org.simmetrics.metrics.StringMetrics;
/**
 *
 * @author Andrius
 */
public class BD {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws TasteException, IOException {
        new Main().setVisible(true);
         DataModel model = new FileDataModel(new File("C:\\Users\\Andrius\\Desktop\\bd\\input.csv"));
         UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
         UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);
         Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);
         List<RecommendedItem> recommendations = recommender.recommend(1, 1);
         for (RecommendedItem recommendation : recommendations) 
        {
       System.out.println(" recommendation: " + recommendation);
        }
    }
    }
    

