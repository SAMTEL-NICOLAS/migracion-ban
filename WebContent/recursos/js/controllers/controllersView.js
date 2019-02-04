app.controller('loginController', [ '$scope', 'auth', function($scope, auth) {
	// la función login que llamamos en la vista llama a la función
	// login de la factoria auth pasando lo que contiene el campo
	// de texto del formulario

	$scope.login = function() {
		auth.login($scope.username, $scope.password);
	}
} ]);

app.controller('menuController', [ '$scope', '$cookies', '$location', 'auth',
		function($scope, $cookies, $location, auth) {
			// devolvemos a la vista el nombre del usuario
			$scope.username = $cookies.get('username');
			$scope.password = $cookies.get('password');
			// la función logout que llamamos en la vista llama a la función
			// logout de la factoria auth
			$scope.logout = function() {
				auth.logout();
			}

			$scope.sendHome = function() {
				$location.path("/home");
			}
			
			$scope.sendMigration = function() {
				$location.path("/migration");
			}

			$scope.sendUpload = function() {
				$location.path("/cargue");
			}

		} ]);

app.controller('homeController', [ '$scope', '$cookies', '$location', 'auth',
		function($scope, $cookies, $location, auth) {

			// devolvemos a la vista el nombre del usuario
			$scope.username = $cookies.get('username');
			$scope.password = $cookies.get('password');

		} ]);

app.controller('migrationController', [ '$scope', '$cookies', 'auth',
		'migrationFact', function($scope, $cookies, auth, migrationFact) {
			// devolvemos a la vista el nombre del usuario
			$scope.username = $cookies.get('username');
			$scope.password = $cookies.get('password');
			// la función logout que llamamos en la vista llama a la función
			// logout de la factoria auth
			$scope.sendMigration = function() {
				migrationFact.callMigration();
			}
		} ]);

app.controller('uploadController', [
		'$scope',
		'$cookies',
		'auth',
		'cargueFact',
		function($scope, $cookies, auth, cargueFact) {
			// devolvemos a la vista el nombre del usuario
			$scope.username = $cookies.get('username');
			$scope.password = $cookies.get('password');
			// la función logout que llamamos en la vista llama a la función
			// logout de la factoria auth
			$scope.uploadFile = function() {
				var formData = new FormData(document
						.getElementById("formuploadajax"));
				cargueFact.uploadCargue(formData);
			}
		} ]);