package co.grandcircus.Donuts.Model;

import java.util.List;

public class DonutResponse {

	private List<Donut> results;

	public List<Donut> getResults() {
		return results;
	}
	public void setResults(List<Donut> results) {
		this.results = results;
	}
	public DonutResponse(List<Donut> results) {
		super();
	
		this.results = results;
	}
	
	public DonutResponse() {
		
	}
}
