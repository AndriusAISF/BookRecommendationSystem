package bd;

import java.io.File;
import java.util.List;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.model.JDBCDataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
 
class RecommenderIntro {
 
 public static void main(String[] args) throws Exception {
 
	DataModel model = new FileDataModel(new File("C:/Users/Andrius/Desktop/bd/input.csv"));    	
	UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
	UserNeighborhood neighborhood = new ThresholdUserNeighborhood(0.1, similarity, model);
	UserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);
	List<RecommendedItem> recommendations = recommender.recommend(2, 3);
	for (RecommendedItem recommendation : recommendations) {
	  System.out.println(recommendations);
	}
 }
}