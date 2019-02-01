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

// Factory en el cual se realizara todos los metodos de migracion
app.factory("cargueFact", [ '$cookies', '$location',
		function($cookies, $location) {
			return {
				uploadCargue : function(formData) {
					$.ajax({
						url : "resources/v.1/cargue/uploadForm",
						method : 'post',
						dataType : 'html',
						data: formData,
		                cache: false,
		                contentType: false,
		                processData: false,
						success : function(result) {
							alert(JSON.stringify(result));
						}
					});
				}
			};
		} ]);