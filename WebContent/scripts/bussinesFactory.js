//Factory en el cual se realizara todos los metodos de migracion
app.factory("migrationFact", [ '$cookies', '$location',
		function($cookies, $location) {
			return {
				callMigration : function() {
					$.ajax({
						url : "resources/migracion/" + $cookies.get('username'),
						method : 'GET',
						dataType : 'json',
						success : function(result) {
							alert(JSON.stringify(result));
						}
					});
				}
			};
		} ]);