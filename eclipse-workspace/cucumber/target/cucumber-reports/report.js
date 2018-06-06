$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("facebookLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login",
  "description": "",
  "id": "facebook-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Positive Login",
  "description": "",
  "id": "facebook-login;positive-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on Facebook Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I provide postive id and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should see the Facebook feed homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Scenario01_Facebook_PostiveLogin.i_am_on_Facebook_Login_Page()"
});
formatter.result({
  "duration": 6087505232,
  "status": "passed"
});
formatter.match({
  "location": "Scenario01_Facebook_PostiveLogin.i_provide_postive_id_and_password()"
});
formatter.result({
  "duration": 5770172422,
  "status": "passed"
});
formatter.match({
  "location": "Scenario01_Facebook_PostiveLogin.i_should_see_the_Facebook_feed_homepage()"
});
formatter.result({
  "duration": 33469,
  "status": "passed"
});
formatter.match({
  "location": "Scenario01_Facebook_PostiveLogin.close()"
});
formatter.result({
  "duration": 2180158383,
  "status": "passed"
});
formatter.uri("radioButton.feature");
formatter.feature({
  "line": 1,
  "name": "Radio Button",
  "description": "",
  "id": "radio-button",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Male Button Check",
  "description": "",
  "id": "radio-button;male-button-check",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on Selenium Easy page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click Input Forms",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click Radio Buttons Demo",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I click Male Button under Radio Button Demo",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click get checked value",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should see Radio button Male is checked",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser1",
  "keyword": "Then "
});
formatter.match({
  "location": "RadioButton.i_am_on_Selenium_Easy_page()"
});
formatter.result({
  "duration": 5291147866,
  "status": "passed"
});
formatter.match({
  "location": "RadioButton.i_click_Input_Forms()"
});
formatter.result({
  "duration": 94871449,
  "status": "passed"
});
formatter.match({
  "location": "RadioButton.i_click_Radio_Buttons_Demo()"
});
formatter.result({
  "duration": 238362520,
  "status": "passed"
});
formatter.match({
  "location": "RadioButton.i_click_Male_Button_under_Radio_Button_Demo()"
});
formatter.result({
  "duration": 75909922,
  "status": "passed"
});
formatter.match({
  "location": "RadioButton.i_click_get_checked_value()"
});
formatter.result({
  "duration": 72108781,
  "status": "passed"
});
formatter.match({
  "location": "RadioButton.i_should_see_Radio_button_Male_is_checked()"
});
formatter.result({
  "duration": 45554342,
  "status": "passed"
});
formatter.match({
  "location": "RadioButton.close()"
});
formatter.result({
  "duration": 175072940,
  "status": "passed"
});
});