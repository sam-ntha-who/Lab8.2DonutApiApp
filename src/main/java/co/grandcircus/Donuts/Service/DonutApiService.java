package co.grandcircus.Donuts.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.Donuts.Model.Donut;
import co.grandcircus.Donuts.Model.DonutResponse;


@Service
public class DonutApiService {

	private RestTemplate request = new RestTemplate();
	
	public List<Donut> getDonuts() {
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		DonutResponse response = request.getForObject(url, DonutResponse.class);
		return response.getResults();
	}
	
	public Donut getDonutInfo(Integer id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/{id}.json";
		Donut response = request.getForObject(url, Donut.class, id);
		return response;
			
	}
	
	
}
