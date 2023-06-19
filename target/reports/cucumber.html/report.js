$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Background.feature");
formatter.feature({
  "name": "Checking the skyblue background colour",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Skybluefeature"
    }
  ]
});
formatter.scenario({
  "name": "skyblue  background",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Skybluefeature"
    }
  ]
});
formatter.step({
  "name": "Set skyblue background button exists",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click on the button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The background colour will change to skyblue",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});