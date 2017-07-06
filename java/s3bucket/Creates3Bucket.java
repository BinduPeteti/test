/**
 * 
 */
package s3bucket;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;

/**
 * @author Bindu
 *
 */
public class Creates3Bucket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String bucketName = "bindubucket";
		
		AWSCredentials credentials = new BasicAWSCredentials("AKIAJRSJJBZ2AENJMUQA",
				"XpBrVEB/6QcUnbaEkW+06e4YzyYJlV8bo53KhyU3");
		
		AmazonS3Client s3Client = new AmazonS3Client(credentials);

		//s3Client.setRegion("");
		s3Client.createBucket(bucketName);
		
	}

}
