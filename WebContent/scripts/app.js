var app = angular.module("migracionApp", ['ngCookies', 'ngRoute', 'ngDialog']);

app.config(function ($routeProvider) {
    $routeProvider.when("/", {
        templateUrl: "template/modules/authentication/views/index.html",
        controller: "loginController"
    }).when("/home", {
        templateUrl: "template/modules/home/index.html"
    }).when("/login", {
        templateUrl: "template/modules/authentication/views/index.html",
        controller: "loginController"
    }).when("/migration", {
        templateUrl: "template/modules/migration/views/indexMig.html"
    }).when("/cargue", {
        templateUrl: "template/modules/cargue/views/cargueManual.html"
    }).when("/auditoriaAs400", {
    	templateUrl: "template/modules/audit/views/auditoriaAs400.html",
    	controller: "auditAs400Controller"
    }).when("/auditoriaMigracion", {
    	templateUrl: "template/modules/audit/views/auditoriaMigracion.html",
    	controller: "auditMigrationController"
    }).when("/auditoriaCargueExcel", {
    	templateUrl: "template/modules/audit/views/auditoriaCargueExcel.html",
    		controller: "auditUploadExcelController"
    }).otherwise({
        reditrectTo: "/"
    });
});

// factoria que controla la autentificación, devuelve un objeto
// $cookies para crear cookies
// $cookieStore para actualizar o eliminar
// $location para cargar otras rutas
app.factory(
        "auth",
        [
            '$cookies',
            '$location',
            function ($cookies, $location) {
                return {
                    login: function (username, password) {
                        // creamos la cookie con el nombre que nos
                        // han pasado
                        $cookies.put('username', username);
                        $cookies.put('password', password);
                        // mandamos a la home
                        $location.path("/home");
                    },
                    logout: function () {
                        // al hacer logout eliminamos la cookie con
                        // $cookieStore.remove
                        $cookies.remove("username");
                        $cookies.remove("password");
                        // mandamos al login
                        $location.path("/login");
                    },
                    checkStatus: function () {
                        // creamos un array con las rutas que
                        // queremos controlar
                        var rutasPrivadas = ["/home", "/migration"];
                        if (this.in_array($location.path(),
                                rutasPrivadas)
                                && typeof ($cookies.get('username')) === "undefined") {
                            $location.path("/login");
                        }
                        // en el caso de que intente acceder al
                        // login y ya haya iniciado
                        // sesión lo mandamos a la home
                        if (($location.path() === ""
                                || $location.path() === "/login" || $location
                                .path() === "/")
                                && typeof ($cookies.get('username')) !== "undefined") {
                            $location.path("/home");
                        }
                    },
                    in_array: function (needle, haystack) {
                        var key = '';
                        for (key in haystack) {
                            if (haystack[key] === needle) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
            }]);

// mientras corre la aplicación, comprobamos si el usuario tiene acceso a la
// ruta a la que está accediendo
app.run(function ($rootScope, auth) {
    // al cambiar de rutas
    $rootScope.$on('$routeChangeStart', function () {
        // llamamos a checkStatus, el cual lo hemos definido en la factoria auth
        // la cuál hemos inyectado en la acción run de la aplicación
        auth.checkStatus();
    })
});