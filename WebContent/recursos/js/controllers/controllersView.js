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
            migrationFact.callMigration();
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
        $scope.listFiles = filesToUploadFact
                .getParamsFiles();

        $scope.username = $cookies.get('username');
        $scope.password = $cookies.get('password');
        // la función logout que llamamos en la vista llama
        // a la
        // función
        // logout de la factoria auth
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

// Controlador de la auditoria de As400
app.controller('auditAs400Controller', ['$scope', '$cookies', 'auth', 'auditAs400Fact',
    function ($scope, $cookies, auth, auditAs400Fact) {
        app.filter('startFrom', function () {
            return function (input, start) {
                start = +start;
                return input.slice(start);
            };
        });
        footerOfTableOne();

        // devolvemos a la vista el nombre del usuario
        $scope.username = $cookies.get('username');
        $scope.password = $cookies.get('password');
        $scope.showAnswerTableAs = false;

        $scope.getFind = function () {
            var estado = document.getElementById("selectEstado").value;
            $scope.listAuditAs400 = auditAs400Fact.getAuditAs400(estado);
            $scope.showAnswerTableAs = true;

        };

        // Pie de pagina para la tabla de de la Auditoria.
        function footerOfTableOne() {
            $scope.t1CurrentPage = 0;
            $scope.t1PageSize = 10;
            $scope.data = [];

            $scope.t1NumberOfPages = function () {
                return Math.ceil($scope.listAuditAs400.length / $scope.t1PageSize);
            };
        }
        ;
    }
]);

// Controlador de la auditoria de la Migracion
app.controller('auditMigrationController', ['$scope', '$cookies', 'auth', 'auditMigrationFact', 'ngDialog',
    function ($scope, $cookies, auth, auditMigrationFact, ngDialog) {

        app.filter('startFrom', function () {
            return function (input, start) {
                start = +start;
                return input.slice(start);
            };
        });
        footerOfTableOne();

        $('#fechaInicio').val(actualDate());
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

            if (validateDates()) {
                $scope.listAudit = auditMigrationFact.getAuditByDate(date1, date2);
                if ($scope.listAudit.length === 0) {
                    alert($scope.message);
                    $scope.showAnswerTable = false;
                } else {
                    $scope.showAnswerTable = true;
                }

            }

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
    }
]);


//Controlador de la auditoria de la Migracion
app.controller('auditUploadExcelController', ['$scope', '$cookies', 'auth', 'auditUploadExcelFact', 'ngDialog',
    function ($scope, $cookies, auth, auditUploadExcelFact, ngDialog) {

        app.filter('startFrom', function () {
            return function (input, start) {
                start = +start;
                return input.slice(start);
            };
        });
        footerOfTableOne();

        $('#fechaInicio').val(actualDate());
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


            if (validateDates()) {
                $scope.listAudit = auditUploadExcelFact.getAuditByDate(date1, date2);
                if ($scope.listAudit.length === 0) {
                    alert($scope.message);
                    $scope.showAnswerTable = false;
                } else {
                    $scope.showAnswerTable = true;
                }

            }

        };

        // Funcion que se encarga de consultar los detalles de la auditoria.
        $scope.getDetailById = function (objDatail) {
            var urlTemplate = 'template/modules/audit/views/modal/modalAuditoriaCargueExcel.html';
            $scope.listDetailAudit = auditUploadExcelFact.getDetailById(objDatail.id);

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
    }
]);

