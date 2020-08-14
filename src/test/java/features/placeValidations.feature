@tag
Feature: Validating Place APIs

  @AddPlace
  Scenario Outline: Verify if Place is successfully added using AddPlaceAPI
    Given Add Place Payload with "<name>" "<language>" "<address>"
    When User calls "AddPlaceAPI" with "Post" http request
    Then the API call is successful with Status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And verify place_Id created maps to "<name>" using "getPlaceAPI"

    Examples: 
      | name       | language | address            |
      | AHouse     | English  | World cross center |
      | Nagadhama  | Kannada  | Banashankari       |
      | MariaHouse | French   | Germany            |

  @DeletePlace
  Scenario: Verify if Delete Place functionality is working
    Given DeletePlace Payload
    When User calls "deletePlaceAPI" with "POST" http request
    Then the API call is successful with Status code 200
    And "status" in response body is "OK"
  