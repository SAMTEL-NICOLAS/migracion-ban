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
		'filesToUploadFact',
		function($scope, $cookies, auth, cargueFact, filesToUploadFact) {
			// devolvemos a la vista el nombre del usuario
			$scope.listFiles = [];
			$scope.listFiles = filesToUploadFact.getParamsFiles();
			
			$scope.username = $cookies.get('username');
			$scope.password = $cookies.get('password');
			// la función logout que llamamos en la vista llama
			// a la
			// función
			// logout de la factoria auth
			$scope.uploadFile = function() {
				var continuar = $scope.validar();
				if (continuar) {
					var nombreArchivo = document
							.getElementById("nombreArchivoCsv").value;
					document.getElementById("nombreArchivoCsv").setAttribute(
							"name", nombreArchivo);

					document.getElementById("formuploadajax").submit();
				}

			}

			$scope.validar = function() {
				if (undefined === $scope.nombreArchivoCsv) {
					alert("Debe seleccionar la opcion del archivo a subir");
					return false;
				}
				if ("" === document.getElementById("archivoCsv").value) {
					alert("Por favor, cargue un archivo");
					return false;
				}
				return true;
			}
		} ]);