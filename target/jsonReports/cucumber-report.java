[
  {
    "line": 2,
    "elements": [
      {
        "line": 15,
        "name": "Verify if Place is successfully added using AddPlaceAPI",
        "description": "",
        "id": "validating-place-apis;verify-if-place-is-successfully-added-using-addplaceapi;;2",
        "type": "scenario",
        "keyword": "Scenario Outline",
        "steps": [
          {
            "result": {
              "duration": 710059000,
              "status": "passed"
            },
            "line": 6,
            "name": "Add Place Payload with \"AHouse\" \"English\" \"World cross center\"",
            "match": {
              "arguments": [
                {
                  "val": "AHouse",
                  "offset": 24
                },
                {
                  "val": "English",
                  "offset": 33
                },
                {
                  "val": "World cross center",
                  "offset": 43
                }
              ],
              "location": "stepDefinations.add_Place_Payload(String,String,String)"
            },
            "matchedColumns": [
              0,
              1,
              2
            ],
            "keyword": "Given "
          },
          {
            "result": {
              "duration": 1286681800,
              "status": "passed"
            },
            "line": 7,
            "name": "User calls \"AddPlaceAPI\" with \"Post\" http request",
            "match": {
              "arguments": [
                {
                  "val": "AddPlaceAPI",
                  "offset": 12
                },
                {
                  "val": "Post",
                  "offset": 31
                }
              ],
              "location": "stepDefinations.user_calls_with_POST_http_request(String,String)"
            },
            "keyword": "When "
          },
          {
            "result": {
              "duration": 1313800,
              "status": "passed"
            },
            "line": 8,
            "name": "the API call is successful with Status code 200",
            "match": {
              "arguments": [
                {
                  "val": "200",
                  "offset": 44
                }
              ],
              "location": "stepDefinations.the_API_call_is_successful_with_Status_code(int)"
            },
            "keyword": "Then "
          },
          {
            "result": {
              "duration": 337575300,
              "status": "passed"
            },
            "line": 9,
            "name": "\"status\" in response body is \"OK\"",
            "match": {
              "arguments": [
                {
                  "val": "status",
                  "offset": 1
                },
                {
                  "val": "OK",
                  "offset": 30
                }
              ],
              "location": "stepDefinations.in_response_body_is(String,String)"
            },
            "keyword": "And "
          },
          {
            "result": {
              "duration": 7365700,
              "status": "passed"
            },
            "line": 10,
            "name": "\"scope\" in response body is \"APP\"",
            "match": {
              "arguments": [
                {
                  "val": "scope",
                  "offset": 1
                },
                {
                  "val": "APP",
                  "offset": 29
                }
              ],
              "location": "stepDefinations.in_response_body_is(String,String)"
            },
            "keyword": "And "
          },
          {
            "result": {
              "duration": 460306500,
              "status": "passed"
            },
            "line": 11,
            "name": "verify place_Id created maps to \"AHouse\" using \"getPlaceAPI\"",
            "match": {
              "arguments": [
                {
                  "val": "AHouse",
                  "offset": 33
                },
                {
                  "val": "getPlaceAPI",
                  "offset": 48
                }
              ],
              "location": "stepDefinations.verify_place_Id_created_maps_to_using(String,String)"
            },
            "matchedColumns": [
              0
            ],
            "keyword": "And "
          }
        ],
        "tags": [
          {
            "line": 4,
            "name": "@AddPlace"
          },
          {
            "line": 1,
            "name": "@tag"
          }
        ]
      },
      {
        "line": 16,
        "name": "Verify if Place is successfully added using AddPlaceAPI",
        "description": "",
        "id": "validating-place-apis;verify-if-place-is-successfully-added-using-addplaceapi;;3",
        "type": "scenario",
        "keyword": "Scenario Outline",
        "steps": [
          {
            "result": {
              "duration": 2800100,
              "status": "passed"
            },
            "line": 6,
            "name": "Add Place Payload with \"Nagadhama\" \"Kannada\" \"Banashankari\"",
            "match": {
              "arguments": [
                {
                  "val": "Nagadhama",
                  "offset": 24
                },
                {
                  "val": "Kannada",
                  "offset": 36
                },
                {
                  "val": "Banashankari",
                  "offset": 46
                }
              ],
              "location": "stepDefinations.add_Place_Payload(String,String,String)"
            },
            "matchedColumns": [
              0,
              1,
              2
            ],
            "keyword": "Given "
          },
          {
            "result": {
              "duration": 579733400,
              "status": "passed"
            },
            "line": 7,
            "name": "User calls \"AddPlaceAPI\" with \"Post\" http request",
            "match": {
              "arguments": [
                {
                  "val": "AddPlaceAPI",
                  "offset": 12
                },
                {
                  "val": "Post",
                  "offset": 31
                }
              ],
              "location": "stepDefinations.user_calls_with_POST_http_request(String,String)"
            },
            "keyword": "When "
          },
          {
            "result": {
              "duration": 93800,
              "status": "passed"
            },
            "line": 8,
            "name": "the API call is successful with Status code 200",
            "match": {
              "arguments": [
                {
                  "val": "200",
                  "offset": 44
                }
              ],
              "location": "stepDefinations.the_API_call_is_successful_with_Status_code(int)"
            },
            "keyword": "Then "
          },
          {
            "result": {
              "duration": 9937300,
              "status": "passed"
            },
            "line": 9,
            "name": "\"status\" in response body is \"OK\"",
            "match": {
              "arguments": [
                {
                  "val": "status",
                  "offset": 1
                },
                {
                  "val": "OK",
                  "offset": 30
                }
              ],
              "location": "stepDefinations.in_response_body_is(String,String)"
            },
            "keyword": "And "
          },
          {
            "result": {
              "duration": 7446300,
              "status": "passed"
            },
            "line": 10,
            "name": "\"scope\" in response body is \"APP\"",
            "match": {
              "arguments": [
                {
                  "val": "scope",
                  "offset": 1
                },
                {
                  "val": "APP",
                  "offset": 29
                }
              ],
              "location": "stepDefinations.in_response_body_is(String,String)"
            },
            "keyword": "And "
          },
          {
            "result": {
              "duration": 1007634900,
              "status": "passed"
            },
            "line": 11,
            "name": "verify place_Id created maps to \"Nagadhama\" using \"getPlaceAPI\"",
            "match": {
              "arguments": [
                {
                  "val": "Nagadhama",
                  "offset": 33
                },
                {
                  "val": "getPlaceAPI",
                  "offset": 51
                }
              ],
              "location": "stepDefinations.verify_place_Id_created_maps_to_using(String,String)"
            },
            "matchedColumns": [
              0
            ],
            "keyword": "And "
          }
        ],
        "tags": [
          {
            "line": 4,
            "name": "@AddPlace"
          },
          {
            "line": 1,
            "name": "@tag"
          }
        ]
      },
      {
        "line": 17,
        "name": "Verify if Place is successfully added using AddPlaceAPI",
        "description": "",
        "id": "validating-place-apis;verify-if-place-is-successfully-added-using-addplaceapi;;4",
        "type": "scenario",
        "keyword": "Scenario Outline",
        "steps": [
          {
            "result": {
              "duration": 3617100,
              "status": "passed"
            },
            "line": 6,
            "name": "Add Place Payload with \"MariaHouse\" \"French\" \"Germany\"",
            "match": {
              "arguments": [
                {
                  "val": "MariaHouse",
                  "offset": 24
                },
                {
                  "val": "French",
                  "offset": 37
                },
                {
                  "val": "Germany",
                  "offset": 46
                }
              ],
              "location": "stepDefinations.add_Place_Payload(String,String,String)"
            },
            "matchedColumns": [
              0,
              1,
              2
            ],
            "keyword": "Given "
          },
          {
            "result": {
              "duration": 263411000,
              "status": "passed"
            },
            "line": 7,
            "name": "User calls \"AddPlaceAPI\" with \"Post\" http request",
            "match": {
              "arguments": [
                {
                  "val": "AddPlaceAPI",
                  "offset": 12
                },
                {
                  "val": "Post",
                  "offset": 31
                }
              ],
              "location": "stepDefinations.user_calls_with_POST_http_request(String,String)"
            },
            "keyword": "When "
          },
          {
            "result": {
              "duration": 79800,
              "status": "passed"
            },
            "line": 8,
            "name": "the API call is successful with Status code 200",
            "match": {
              "arguments": [
                {
                  "val": "200",
                  "offset": 44
                }
              ],
              "location": "stepDefinations.the_API_call_is_successful_with_Status_code(int)"
            },
            "keyword": "Then "
          },
          {
            "result": {
              "duration": 6765200,
              "status": "passed"
            },
            "line": 9,
            "name": "\"status\" in response body is \"OK\"",
            "match": {
              "arguments": [
                {
                  "val": "status",
                  "offset": 1
                },
                {
                  "val": "OK",
                  "offset": 30
                }
              ],
              "location": "stepDefinations.in_response_body_is(String,String)"
            },
            "keyword": "And "
          },
          {
            "result": {
              "duration": 6450300,
              "status": "passed"
            },
            "line": 10,
            "name": "\"scope\" in response body is \"APP\"",
            "match": {
              "arguments": [
                {
                  "val": "scope",
                  "offset": 1
                },
                {
                  "val": "APP",
                  "offset": 29
                }
              ],
              "location": "stepDefinations.in_response_body_is(String,String)"
            },
            "keyword": "And "
          },
          {
            "result": {
              "duration": 437650400,
              "status": "passed"
            },
            "line": 11,
            "name": "verify place_Id created maps to \"MariaHouse\" using \"getPlaceAPI\"",
            "match": {
              "arguments": [
                {
                  "val": "MariaHouse",
                  "offset": 33
                },
                {
                  "val": "getPlaceAPI",
                  "offset": 52
                }
              ],
              "location": "stepDefinations.verify_place_Id_created_maps_to_using(String,String)"
            },
            "matchedColumns": [
              0
            ],
            "keyword": "And "
          }
        ],
        "tags": [
          {
            "line": 4,
            "name": "@AddPlace"
          },
          {
            "line": 1,
            "name": "@tag"
          }
        ]
      },
      {
        "before": [
          {
            "result": {
              "duration": 50000,
              "status": "passed"
            },
            "match": {
              "location": "Hooks.beforeScenario()"
            }
          }
        ],
        "line": 20,
        "name": "Verify if Delete Place functionality is working",
        "description": "",
        "id": "validating-place-apis;verify-if-delete-place-functionality-is-working",
        "type": "scenario",
        "keyword": "Scenario",
        "steps": [
          {
            "result": {
              "duration": 863000,
              "status": "passed"
            },
            "line": 21,
            "name": "DeletePlace Payload",
            "match": {
              "location": "stepDefinations.deleteplace_Payload()"
            },
            "keyword": "Given "
          },
          {
            "result": {
              "duration": 418653000,
              "status": "passed"
            },
            "line": 22,
            "name": "User calls \"deletePlaceAPI\" with \"POST\" http request",
            "match": {
              "arguments": [
                {
                  "val": "deletePlaceAPI",
                  "offset": 12
                },
                {
                  "val": "POST",
                  "offset": 34
                }
              ],
              "location": "stepDefinations.user_calls_with_POST_http_request(String,String)"
            },
            "keyword": "When "
          },
          {
            "result": {
              "duration": 76500,
              "status": "passed"
            },
            "line": 23,
            "name": "the API call is successful with Status code 200",
            "match": {
              "arguments": [
                {
                  "val": "200",
                  "offset": 44
                }
              ],
              "location": "stepDefinations.the_API_call_is_successful_with_Status_code(int)"
            },
            "keyword": "Then "
          },
          {
            "result": {
              "duration": 6754800,
              "status": "passed"
            },
            "line": 24,
            "name": "\"status\" in response body is \"OK\"",
            "match": {
              "arguments": [
                {
                  "val": "status",
                  "offset": 1
                },
                {
                  "val": "OK",
                  "offset": 30
                }
              ],
              "location": "stepDefinations.in_response_body_is(String,String)"
            },
            "keyword": "And "
          }
        ],
        "tags": [
          {
            "line": 19,
            "name": "@DeletePlace"
          }
        ]
      }
    ],
    "name": "Validating Place APIs",
    "description": "",
    "id": "validating-place-apis",
    "keyword": "Feature",
    "uri": "placeValidations.feature",
    "tags": [
      {
        "line": 1,
        "name": "@tag"
      }
    ]
  }
]