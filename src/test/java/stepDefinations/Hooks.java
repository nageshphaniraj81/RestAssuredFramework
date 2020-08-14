package stepDefinations;

import cucumber.api.java.Before;
import cucumber.runtime.StepDefinition;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws Throwable {

		// Write the code to get place ID
		// Only when place Id is null
		stepDefinations sD = new stepDefinations();

		if (stepDefinations.place_id == null) {
			sD.add_Place_Payload("Shetty", "French", "Asia");
			sD.user_calls_with_POST_http_request("AddPlaceAPI", "POST");
			sD.verify_place_Id_created_maps_to_using("Shetty", "getPlaceAPI");
		}
	}

}
