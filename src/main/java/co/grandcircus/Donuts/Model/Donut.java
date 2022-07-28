package co.grandcircus.Donuts.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Donut {
	private Integer id;
	private String ref;
	private String name;
	private Integer calories;
	private List<String> extras;
	
	private String photo;
	
	@JsonProperty("photo_attribution")
	private String photoAttribution;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	public List<String> getExtras() {
		return extras;
	}
	public void setExtras(List<String> extras) {
		this.extras = extras;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPhoto_attribution() {
		return photoAttribution;
	}
	public void setPhoto_attribution(String photoAttribution) {
		this.photoAttribution = photoAttribution;
	}
	
	
	public Donut(Integer id, String ref, String name, Integer calories, List<String> extras, String photo, String photoAttribution) {
		super();
		this.id = id;
		this.ref = ref;
		this.name = name;
		this.calories = calories;
		this.extras = extras;
		this.photo = photo;
		this.photoAttribution = photoAttribution;
	}
	
	public Donut() {
		
	}
	
	
}
