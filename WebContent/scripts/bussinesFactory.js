//Factory en el cual se realizara todos los metodos de migracion
app.factory("migrationFact", [
    '$cookies',
    '$location',
    function ($cookies, $location) {
        return {
            callMigration: function () {
                $.ajax({
                    url: "resources/migracion/" + $cookies.get('username'),
                    method: 'GET',
                    dataType: 'json',
                    success: function (result) {
                        alert(JSON.stringify(result));
                    }
                });
            }
        };
    }
]);

// Factory en el cual se realizara todos los metodos de migracion
app.factory("cargueFact", ['$cookies', '$location',
    function ($cookies, $location) {
        return {
            uploadCargue: function (formData) {
                $.ajax({
                    url: "resources/v.1/cargue/uploadForm",
                    method: 'post',
                    dataType: 'html',
                    data: formData,
                    cache: false,
                    contentType: false,
                    processData: false,
                    success: function (result) {
                        alert(JSON.stringify(result));
                    }
                });
            }

        };
    }
]);

// Factory en el cual se realizara la obtencion de los archivos disponibles para
// cargar
app.factory(
        "filesToUploadFact", [
            '$cookies',
            '$location',
            function ($cookies, $location) {
                return {
                    getParamsFiles: function (formData) {
                        var listData = [];
                        $.ajax({
                            url: "resources/v.1/cargue/listFiles",
                            method: 'get',
                            dataType: 'json',
                            cache: false,
                            contentType: false,
                            processData: false,
                            async: false,
                            success: function (result) {
                                if (result.message == 'OK' &&
                                        result.typeError == 'SUCCESS') {
                                    listData = result.listResponse;
                                    listData
                                            .push('Seleccione un Archivo');
                                } else {
                                    alert('Error al obtener los parametros de los archivos csv');
                                }
                            }
                        });
                        return listData;
                    },
                    runUploadFile: function () {
                        $.ajax({
                            url: "resources/v.1/uploadExcel/" +
                                    $cookies.get('username'),
                            method: 'GET',
                            dataType: 'json',
                            success: function (result) {
                                alert(JSON.stringify(result));
                            }
                        });
                    }
                };
            }
        ]);

//Factory en el cual se realizara la obtencion de la auditoria de As400
app.factory(
        "auditAs400Fact", [
            '$cookies',
            '$location',
            function ($cookies, $location) {
                return {
                    getAuditAs400: function () {
                        var listData = [];
                        $.ajax({
                            url: "resources/v.1/auditAs400/getAllLogActiva",
                            method: 'get',
                            dataType: 'json',
                            cache: false,
                            contentType: false,
                            processData: false,
                            async: false,
                            success: function (result) {
                                listData = result;
                                console.log(listData);
                            }
                        });
                        return listData;
                    }
                };
            }
        ]);

// Factory en el cual se realizara la obtencion de la auditoria de la Migracion
app.factory(
        "auditMigrationFact", [
            '$cookies',
            '$location',
            function ($cookies, $location) {
                return {
                    getAuditByDate: function (date) {
                    	alert(date);
                        var listData = [];
                        $.ajax({
                            url: "resources/v.1/auditMigration/getAuditByDate/" + date,
                            method: 'get',
                            dataType: 'json',
                            cache: false,
                            contentType: false,
                            processData: false,
                            async: false,
                            success: function (result) {
                                listData = result;
                                console.log(listData);
                            }
                        });
                        return listData;
                    }
                };
            }
        ]);