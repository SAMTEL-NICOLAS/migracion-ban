app.controller('loginController', ['$scope', 'auth', function ($scope, auth) {
        // la función login que llamamos en la vista llama a la función
        // login de la factoria auth pasando lo que contiene el campo
        // de texto del formulario

        $scope.login = function () {
            auth.login($scope.username, $scope.password);
        }
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
                alert("El id de la auditoria es: " + param1);
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
        // devolvemos a la vista el nombre del usuario
        $scope.username = $cookies.get('username');
        $scope.password = $cookies.get('password');
        $scope.showAnswerTableAs = false;

        $scope.getFind = function () {
            var estado = document.getElementById("selectEstado").value;
            $scope.listAuditAs400 = auditAs400Fact.getAuditAs400(estado);
            $scope.showAnswerTableAs = true;

        };
    }
]);

// Controlador de la auditoria de la Migracion
app.controller('auditMigrationController', ['$scope', '$cookies', 'auth', 'auditMigrationFact', 'ngDialog',
    function ($scope, $cookies, auth, auditMigrationFact, ngDialog) {
        // devolvemos a la vista el nombre del usuario
        $scope.username = $cookies.get('username');
        $scope.password = $cookies.get('password');
        $scope.showAnswerTable = false;



        $scope.getAuditByDate = function () {
            var date1 = document.getElementById("fechaInicio").value;
            var date2 = document.getElementById("fechaFin").value;
            $scope.listAudit = auditMigrationFact.getAuditByDate(date1, date2);
            $scope.showAnswerTable = true;


        };

        $scope.getDetailById = function (objDatail) {
            alert(objDatail.id);
            $scope.listDetailAudit = auditMigrationFact.getDetailById(objDatail.id);
            alert($scope.listDetailAudit);

            ngDialog.open({
                template: 'template/modules/audit/views/modalAuditoriaMigracion.html',
                className: 'ngdialog-theme-default',
                scope: $scope
            });

        };
    }
]);
