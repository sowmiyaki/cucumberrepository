$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:package2/new.feature");
formatter.feature({
  "name": "Newlogin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "success",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enter\"sowmiya\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Newloginstep.user_enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User give \"123@456\"",
  "keyword": "When "
});
formatter.match({
  "location": "Newloginstep.user_give(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Newloginstep.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Newloginstep.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
});