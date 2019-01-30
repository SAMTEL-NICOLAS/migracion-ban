var app = angular.module("migracionApp", [ "ngRoute" ]);

app.config(function($routeProvider) {
	$routeProvider.when("/", {
		templateUrl : "template/modules/authentication/views/index.html",
		controller : "loginController"
	}).when("/red", {
		templateUrl : "template/modules/authentication/views/index.jsp"
	}).when("/green", {
		templateUrl : "template/modules/authentication/views/index.jsp"
	}).when("/blue", {
		templateUrl : "template/modules/authentication/views/index.jsp"
	}).otherwise({ reditrectTo : "/" });
});