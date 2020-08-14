package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	AddPlace p;
	
	public AddPlace addPlacePayLoad(String strName,String strLanguage,String strAddress) {
		List<String> types = new ArrayList<String>();
		p = new AddPlace();
		p.setAccuracy(50);
		p.setAddress(strAddress);
		p.setLanguage(strLanguage);
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("http://nagesh.com");
		p.setName(strName);
		types.add("shoe park");
		types.add("Nagesh");
		p.setTypes(types);
		Location loc = new Location();
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		p.setLocation(loc);
		return p;

	}
	
	public String deletePlacePayLoad(String placeId) {
		{
			return "{\r\n     \"place_id\":\""+placeId+"\"\r\n}";
		}
	}

}
