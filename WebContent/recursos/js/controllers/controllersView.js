app.controller('loginController', ['$scope', 'auth', function ($scope, auth) {
        // la función login que llamamos en la vista llama a la función
        // login de la factoria auth pasando lo que contiene el campo
        // de texto del formulario

        $scope.login = function () {
            auth.login($scope.username, $scope.password);
        };
    }]);

app.controller('menuController', ['$scope', '$cookies', '$location', 'auth',
    function ($scope, $cookies, $location, auth) {
        // devolvemos a la vista el nombre del usuario
        $scope.username = $cookies.get('username');
        $scope.password = $cookies.get('password');
        // la función logout que llamamos en la vista llama a la función
        // logout de la factoria auth
        $scope.logout = function () {
            auth.logout();
        };

        $scope.sendHome = function () {
            $location.path("/home");
        };

        $scope.sendMigration = function () {
            $location.path("/migration");
        };

        $scope.sendUpload = function () {
            $location.path("/cargue");
        };

        $scope.auditAs400 = function () {
            $location.path("/auditoriaAs400");
        };

        $scope.auditMigration = function () {
            $location.path("/auditoriaMigracion");
        };

        $scope.auditUploadExcel = function () {
            $location.path("/auditoriaCargueExcel");
        };

    }
]);

app.controller('homeController', ['$scope', '$cookies', '$location', 'auth',
    function ($scope, $cookies, $location, auth) {

        // devolvemos a la vista el nombre del usuario
        $scope.username = $cookies.get('username');
        $scope.password = $cookies.get('password');

    }
]);

app.controller('migrationController', ['$scope', '$cookies', 'auth',
    'migrationFact',
    function ($scope, $cookies, auth, migrationFact) {
        // devolvemos a la vista el nombre del usuario
        $scope.username = $cookies.get('username');
        $scope.password = $cookies.get('password');
        // la función logout que llamamos en la vista llama a la función
        // logout de la factoria auth
        $scope.sendMigration = function () {
        	$scope.objeto = migrationFact.callMigration();        	
        };
    }
]);

app.controller('uploadController', [
    '$scope',
    '$cookies',
    '$routeParams',
    '$location',
    'auth',
    'cargueFact',
    'filesToUploadFact',
    function ($scope, $cookies, $routeParams, auth, $location, cargueFact,
            filesToUploadFact) {
        try {
            var param1 = $routeParams.idAuditoria;
            if (undefined !== param1) {
//                alert("El id de la auditoria es: " + param1);
                $scope.idAuditoria = param1;
            }
        } catch (e) {
        }

        // devolvemos a la vista el nombre del usuario
        $scope.listFiles = [];
        $scope.listFiles = filesToUploadFact.getParamsFiles();

        console.log($scope.listFiles);

        $scope.username = $cookies.get('username');
        $scope.password = $cookies.get('password');
        // la función logout que llamamos en la vista llama
        // a la
        // función
        // logout de la factoria auth
        
        $scope.executeProcess = function () {
        	$scope.objeto = cargueFact.executeProcess();
        	//alert($scope.objeto.response);
        };
        
        
        $scope.uploadFile = function () {
            var continuar = $scope.validar();
            if (continuar) {

                document.getElementById("user").setAttribute("name", $scope.username);

                var combo = document.getElementById("nombreArchivoCsv");
                var nombreArchivo = combo.options[combo.selectedIndex].text;
                document.getElementById("nombreArchivoCsv").setAttribute("name", nombreArchivo);

                document.getElementById("formuploadajax").submit();
            }

        };

        $scope.validar = function () {
            if (undefined === $scope.nombreArchivoCsv) {
                alert("Debe seleccionar la opcion del archivo a subir");
                return false;
            }
            if ("" === document
                    .getElementById("archivoCsv").value) {
                alert("Por favor, cargue un archivo");
                return false;
            }
            return true;
        };


        $scope.runUploadFile = function () {
            filesToUploadFact.runUploadFile();
        };


    }
]);

//app.filter('startFromGrid', function() {
//    return function(input, start) {
//        start =+ start;
//        return input.slice(start);
//    }
//}); 
app.filter('startFromGrid', function() {
    return function(input, start) {
        if (!input || !input.length) { return; }
        start = +start; //parse to int
        return input.slice(start);
    }
});

// Controlador de la auditoria de As400
app.controller('auditAs400Controller', ['$scope', '$cookies', 'auth', 'auditAs400Fact',
	function($scope, $cookies, auth, auditAs400Fact) {

		// devolvemos a la vista el nombre del usuario
		$scope.username = $cookies.get('username');
		$scope.password = $cookies.get('password');
		$scope.message = "No hay registros que mostrar";
		$scope.showAnswerTableAs = false;
		$scope.errores = false;
		$scope.otros = false;

		$scope.getFind = function() {
			var estado = document.getElementById("selectEstado").value;

			if (estado == 0 || estado == 1) {
				$scope.listAuditAs400 = auditAs400Fact.getAuditAs400(estado);

				if ($scope.listAuditAs400.length === 0) {
					alert($scope.message);
					$scope.showAnswerTableAs = false;
				} else {
					$scope.inicializarVariables();
					$scope.configPages();
					$scope.showAnswerTableAs = true;
				}
			} else {
				$scope.listAuditAs400 = auditAs400Fact.getAuditAllAs400(estado);
				$scope.inicializarVariables();
				$scope.configPages();				
				$scope.showAnswerTableAs = true;
			}
		};
		$scope.inicializarVariables = function() {
			$scope.currentPage = 0;
			$scope.pageSize = 10; // Esta la cantidad de registros que deseamos mostrar por página
			$scope.pages = [];
		}
		$scope.configPages = function() {
			$scope.pages.length = 0;
			var ini = $scope.currentPage - 4;
			var fin = $scope.currentPage + 5;
			if (ini < 1) {
				ini = 1;
				if (Math.ceil($scope.listAuditAs400.length / $scope.pageSize) > 10) fin = 10;
				else fin = Math.ceil($scope.listAuditAs400.length / $scope.pageSize);
			} else {
				if (ini >= Math.ceil($scope.listAuditAs400.length / $scope.pageSize) - 10) {
					ini = Math.ceil($scope.listAuditAs400.length / $scope.pageSize) - 10;
					fin = Math.ceil($scope.listAuditAs400.length / $scope.pageSize);
				}
			}
			if (ini < 1) ini = 1;
			for (var i = ini; i <= fin; i++) {
				$scope.pages.push({
					no: i
				});
			}
			if ($scope.currentPage >= $scope.pages.length)
				$scope.currentPage = $scope.pages.length - 1;
		};
		$scope.setPage = function(index) {
			$scope.currentPage = index - 1;
		};
	}
]);
// Controlador de la auditoria de la Migracion
app.controller('auditMigrationController', ['$scope', '$cookies', 'auth', 'auditMigrationFact', 'ngDialog',
    function ($scope, $cookies, auth, auditMigrationFact, ngDialog) {
//        app.filter('startFrom', function () {
//            return function (input, start) {
//                start = +start;
//                return input.slice(start);
//            };
//        });      
        $scope.actual = actualDate();
        $('#fechaInicio').val($scope.actual);
        $('#fechaFin').val(actualDate());
       

        // devolvemos a la vista el nombre del usuario
        $scope.username = $cookies.get('username');
        $scope.password = $cookies.get('password');
        $scope.showAnswerTable = false;
        $scope.message = "No hay registros que mostrar";

        // Funcion que se encarga de consultar la Auditoria de la migración.
        $scope.getAuditByDate = function () {
            var date1 = $("#fechaInicio").val();
            var date2 = $("#fechaFin").val();
            var id = document.getElementById("idAudit").value;
            
            if(date1>date2 || date1=="" || date2 ==""){
            	  if(date1>date2 && date2!="" && date1!=""){
                  	 alert('La fecha inicial no puede ser mayor a la fecha final');
                  	 $scope.showAnswerTable = false;                  	 
                  }
                  if(date1=="" || date2 ==""){
                  	alert('Por favor seleccione valores para las fechas');
                  	$scope.showAnswerTable = false;   
                  }
            } else {
            	if(!id == ""){
                    $scope.listAudit = auditMigrationFact.getAuditByDateAndId(date1, date2, id);
                    if ($scope.listAudit.length === 0) {
                        alert($scope.message);
                        $scope.showAnswerTable = false;
                    } else {
                        $scope.showAnswerTable = true;
                    }
            	}else{
                    $scope.listAudit = auditMigrationFact.getAuditByDate(date1, date2);
                    if ($scope.listAudit.length === 0) {
                        alert($scope.message);
                        $scope.showAnswerTable = false;
                    } else {
                    	$scope.inicializarVariables();
        				$scope.configPages();	
                        $scope.showAnswerTable = true;
                    }
            	}
            }            
        };
		$scope.inicializarVariables = function() {
			$scope.currentPage = 0;
			$scope.pageSize = 10; // Esta la cantidad de registros que deseamos mostrar por página
			$scope.pages = [];
		}
		$scope.configPages = function() {
			$scope.pages.length = 0;
			var ini = $scope.currentPage - 4;
			var fin = $scope.currentPage + 5;
			if (ini < 1) {
				ini = 1;
				if (Math.ceil($scope.listAudit.length / $scope.pageSize) > 10) fin = 10;
				else fin = Math.ceil($scope.listAudit.length / $scope.pageSize);
			} else {
				if (ini >= Math.ceil($scope.listAudit.length / $scope.pageSize) - 10) {
					ini = Math.ceil($scope.listAudit.length / $scope.pageSize) - 10;
					fin = Math.ceil($scope.listAudit.length / $scope.pageSize);
				}
			}
			if (ini < 1) ini = 1;
			for (var i = ini; i <= fin; i++) {
				$scope.pages.push({
					no: i
				});
			}
			if ($scope.currentPage >= $scope.pages.length)
				$scope.currentPage = $scope.pages.length - 1;
		};
		$scope.setPage = function(index) {
			$scope.currentPage = index - 1;
		};
        // Funcion que se encarga de consultar los detalles de la auditoria.
        $scope.getDetailById = function (objDatail) {
            var urlTemplate = 'template/modules/audit/views/modal/modalAuditoriaMigracion.html';
            $scope.listDetailAudit = auditMigrationFact.getDetailById(objDatail.id);

            if ($scope.listDetailAudit.length === 0) {
                alert($scope.message);
            } else {
                ngDialog.open({
                    template: urlTemplate,
                    className: 'ngdialog-theme-default',
                    scope: $scope
                });
            }
        };
        $scope.deleteAudit = function(objAudit){        	
        	if(confirm("Esta seguro que desea eliminar la auditoria: "+ objAudit + "?")){
        		auditMigrationFact.updateStateAudit(objAudit);
        	    alert("Auditoria eliminada exitosamente");
        	  }else{
        	    alert("Usted cancelo la acción ELIMINAR");
        	  }
        }

        // Funcion que se encarga de obtener la fecha actual.
        function actualDate() {
            var fecha = new Date();
            var anno = fecha.getFullYear();
            var mes = (fecha.getMonth() + 1);

            var fechaActual;
            if (mes < 10) {
                fechaActual = anno + "-0" + mes + "-" + fecha.getDate();
            } else {
                fechaActual = anno + "-" + mes + "-" + fecha.getDate();
            }
            result = moment(fechaActual, 'YYYY-MM-DD').format('DD/MM/YYYY');

            return result;
        }
        ;

//        // Funcion que se encarga de validar que la fecha fin no sea mayor a la fecha inicial.
        function validateDates() {
            var fechaInicial = formatDate($("#fechaInicio").val());
            var fechaFinal = formatDate($("#fechaFin").val());
            if (fechaInicial.getTime()>fechaFinal.getTime()) {
//                $("#fechaFin").val($("#fechaInicio").val());
                alert('La fecha inicial no puede ser mayor a la fecha final');
                return false;
            }
            return true;
        }
        ;

        // Funcion que se encarga de darle un formato a la fecha para poderla validar.
        function formatDate(date) {
            var date_aux = date.split("-");
            return new Date(parseInt(date_aux[2]), parseInt(date_aux[1] - 1), parseInt(date_aux[0]));
        }
        ;
    }
]);


//Controlador de la auditoria del  cargue
app.controller('auditUploadExcelController', ['$scope', '$cookies', 'auth', 'auditUploadExcelFact', 'ngDialog',
    function ($scope, $cookies, auth, auditUploadExcelFact, ngDialog) {

        $('#fechaInicio').val(actualDate());
        $('#fechaFin').val(actualDate());
        
        $scope.actual = actualDate();

        // devolvemos a la vista el nombre del usuario
        $scope.username = $cookies.get('username');
        $scope.password = $cookies.get('password');
        $scope.showAnswerTable = false;
        $scope.messageNoData = "La consulta no retorno nada";

        // Funcion que se encarga de consultar la Auditoria del cargue.
        $scope.getAuditByDate = function () {
            var date1 = $("#fechaInicio").val();
            var date2 = $("#fechaFin").val();
            var id = document.getElementById("idAudit").value;
            
            if(date1>date2 || date1=="" || date2 ==""){
          	  if(date1>date2 && date2!="" && date1!=""){
                	 alert('La fecha inicial no puede ser mayor a la fecha final');
                	 $scope.showAnswerTable = false;                  	 
                }
                if(date1=="" || date2 ==""){
                	alert('Por favor seleccione valores para las fechas');
                	$scope.showAnswerTable = false;      
                }
          } else {
              	if(!id == ""){
              		  $scope.listAudit = auditUploadExcelFact.getAuditByDate(date1, date2,id);
                        if ($scope.listAudit.length === 0) {
                            alert($scope.messageNoData);
                            $scope.showAnswerTable = false;
                        } else {                        	
                            $scope.showAnswerTable = true;
                        }
                  }else{
                  	 $scope.listAudit = auditUploadExcelFact.getAuditByDateAllId(date1, date2);
                       if ($scope.listAudit.length === 0) {
                           alert($scope.messageNoData);
                           $scope.showAnswerTable = false;
                       } else {                    	   
               			   $scope.currentPage = 0;
               			   $scope.pageSize = 10; // Esta la cantidad de registros que deseamos mostrar por página		
               			   $scope.pages = [];
           				   $scope.configPages();
                           $scope.showAnswerTable = true;
                       }
                  }
          }

        };
        
//        $scope.inicializarVariables = function() {
//			$scope.currentPage = 0;
//			$scope.pageSize = 10; // Esta la cantidad de registros que deseamos mostrar por página		
//			$scope.pages = [];
//		}
	
        // Funcion que se encarga de consultar los detalles de la auditoria del cargue.
        $scope.getDetailById = function (objDatail) {
            var urlTemplate = 'template/modules/audit/views/modal/modalAuditoriaCargueExcel.html';
            var table = document.getElementById("selectTable").value;
            if (table == 0) {            	
            	$scope.listDetailAudit = auditUploadExcelFact.getDetailById(objDatail.id,table);            	
            	if ($scope.listDetailAudit.length === 0) {
            		alert($scope.message);
            	} else {
            		$scope.currentPage = 0;
          			$scope.pageSize = 20; // Esta la cantidad de registros que deseamos mostrar por página		
          			$scope.pages = [];
            		ngDialog.open({
                    template: urlTemplate,
                    className: 'ngdialog-theme-default',
                    scope: $scope
            		});
            	}
            } else {
            	$scope.listDetailAudit = auditUploadExcelFact.getDetailByIdAndTable(objDatail.id,table);
             	if ($scope.listDetailAudit.length === 0) {
             		alert($scope.message);
             	} else {
             		$scope.currentPage = 0;
             		$scope.pageSize = 20; // Esta la cantidad de registros que deseamos mostrar por página		
          			$scope.pages = [];    		
             		ngDialog.open({
             		template: urlTemplate,
                    className: 'ngdialog-theme-default',
                    scope: $scope
             		});
             	}            	
            }
        };      
        $scope.deleteAudit = function(objAudit){        	
        	if(confirm("Esta seguro que desea eliminar la auditoria: "+ objAudit + "?")){
        		auditUploadExcelFact.updateStateAudit(objAudit);
        	    alert("Auditoria eliminada exitosamente");
        	  }else{
        	    //alert("Usted cancelo la acción para guardar");
        	  }
        }
        // Funcion que se encarga de obtener la fecha actual.
        function actualDate() {
            var fecha = new Date();
            var anno = fecha.getFullYear();
            var mes = (fecha.getMonth() + 1);

            var fechaActual;
            if (mes < 10) {
                fechaActual = anno + "-0" + mes + "-" + fecha.getDate();
            } else {
                fechaActual = anno + "-" + mes + "-" + fecha.getDate();
            }

            return fechaActual;
        }
        ;

        // Funcion que se encarga de validar que la fecha fin no sea mayor a la fecha inicial.
        function validateDates() {
            var fechaInicial = formatDate($("#fechaInicio").val());
            var fechaFinal = formatDate($("#fechaFin").val());
            if (fechaFinal.getTime() < fechaInicial.getTime()) {
                $("#fechaFin").val($("#fechaInicio").val());
                alert('La fecha inicial es mayor a la final..');
                return false;
            }
            return true;
        }
        ;

        // Funcion que se encarga de darle un formato a la fecha para poderla validar.
        function formatDate(date) {
            var date_aux = date.split("-");
            return new Date(parseInt(date_aux[2]), parseInt(date_aux[1] - 1), parseInt(date_aux[0]));
        }
        ;

        // Pie de pagina para la tabla de de la Auditoria.
        function footerOfTableOne() {
            $scope.t1CurrentPage = 0;
            $scope.t1PageSize = 10;
            $scope.data = [];

            $scope.t1NumberOfPages = function () {
                return Math.ceil($scope.listAudit.length / $scope.t1PageSize);
            };
        }
        ;
    	$scope.configPages = function() {
			$scope.pages.length = 0;
			var ini = $scope.currentPage - 4;
			var fin = $scope.currentPage + 5;
			if (ini < 1) {
				ini = 1;
				if (Math.ceil($scope.listAudit.length / $scope.pageSize) > 10) fin = 10;
				else fin = Math.ceil($scope.listAudit.length / $scope.pageSize);
			} else {
				if (ini >= Math.ceil($scope.listAudit.length / $scope.pageSize) - 10) {
					ini = Math.ceil($scope.listAudit.length / $scope.pageSize) - 10;
					fin = Math.ceil($scope.listAudit.length / $scope.pageSize);
				}
			}
			if (ini < 1) ini = 1;
			for (var i = ini; i <= fin; i++) {
				$scope.pages.push({
					no: i
				});
			}
			if ($scope.currentPage >= $scope.pages.length)
				$scope.currentPage = $scope.pages.length - 1;
		};
		$scope.setPage = function(index) {
			$scope.currentPage = index - 1;
		};

    }
]);

