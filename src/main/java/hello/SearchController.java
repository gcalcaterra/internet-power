package hello;

import org.springframework.web.bind.annotation.RestController;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SearchController {

	@RequestMapping("/search/{keyword}")
	public String search(@PathVariable("keyword") String keyword) {
		
		try {
			return "The keyword is " + ApiExample.youtubeSearch(keyword);
		} catch (GoogleJsonResponseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Erroooor";
	}
}
