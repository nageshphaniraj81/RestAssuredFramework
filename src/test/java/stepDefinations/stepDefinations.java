package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;
import resources.*;

import static org.junit.Assert.*;

@RunWith(Cucumber.class)
public class stepDefinations extends Utils {

	RequestSpecification spec;
	ResponseSpecification resp;
	Response response;
	TestDataBuild testData = new TestDataBuild();
	JsonPath js;
	static String place_id;

	@Given("^^Add Place Payload with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$$")
	public void add_Place_Payload(String strName, String strLanguage, String strAddress) throws Throwable {
		spec = given().spec(requestSpecification()).body(testData.addPlacePayLoad(strName, strLanguage, strAddress));
	}

	@When("^User calls \"([^\"]*)\" with \"([^\"]*)\" http request$")
	public void user_calls_with_POST_http_request(String resource, String HTTPMethod) throws Throwable {
		APIResources resourceAPI = APIResources.valueOf(resource);
		resp = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		if (HTTPMethod.equalsIgnoreCase("POST")) {
			response = spec.when().post(resourceAPI.getResource());
		} else if (HTTPMethod.equalsIgnoreCase("GET")) {
			response = spec.when().get(resourceAPI.getResource());
		} else if (HTTPMethod.equalsIgnoreCase("DELETE")) {
			response = spec.when().delete(resourceAPI.getResource());
		}
	}

	@Then("^the API call is successful with Status code (\\d+)$")
	public void the_API_call_is_successful_with_Status_code(int arg1) throws Throwable {
		assertEquals(response.getStatusCode(), 200);

	}

	@Then("^\"([^\"]*)\" in response body is \"([^\"]*)\"$")
	public void in_response_body_is(String keyValue, String Expectedvalue) throws Throwable {
		assertEquals(getJSONPath(response, keyValue), Expectedvalue);
	}

	@Then("^verify place_Id created maps to \"([^\"]*)\" using \"([^\"]*)\"$")
	public void verify_place_Id_created_maps_to_using(String strExpectedName, String strResource) throws Throwable {
		place_id = getJSONPath(response, "place_id");
		spec = given().spec(requestSpecification()).queryParam("place_id", place_id);
		user_calls_with_POST_http_request(strResource, "GET");
		String strActualName = getJSONPath(response, "name");
		System.out.println("Expected " + strExpectedName + " Actual :" + strActualName);
		assertEquals(strExpectedName, strActualName);
	}
	
	@Given("^DeletePlace Payload$")
	public void deleteplace_Payload() throws Throwable {
		spec = given().spec(requestSpecification()).body(testData.deletePlacePayLoad(place_id));
	}


}
