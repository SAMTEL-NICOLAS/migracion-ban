//Factory en el cual se realizara todos los metodos de migracion
app.factory("migrationFact", [
    '$cookies',
    '$location',
    function ($cookies, $location) {
        return {
            callMigration: function () {
            	var objeto = null;
                $.ajax({
                    url: "resources/migracion/" + $cookies.get('username'),
                    method: 'GET',
                    dataType: 'json',
                    async: false,
                    success: function (result) {
                    	objeto = result;                    	
                    }
                });
                return objeto;
            }
        };
    }
]);

// Factory en el cual se realizara todos los metodos del cargue
app.factory("cargueFact", ['$cookies', '$location',
    function ($cookies, $location) {
        return {
            executeProcess: function () {
            	var objeto = null;
                $.ajax({
                    url: "resources/v.1/uploadExcel/" + $cookies.get('username'),
                    method: 'get',
                    dataType: 'json',
                    cache: false,
                    contentType: false,
                    processData: false,
                    async: false,
                    success: function (result) {
                    	objeto = result;
                    }
                });
                return objeto;
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
                                if (result.message === 'OK' &&
                                        result.typeError === 'SUCCESS') {
                                    listData = result.listResponse;
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
                    getAuditAs400: function (estado) {
                        var listData = [];
                        $.ajax({
                            url: "resources/v.1/auditAs400/getAllLogActiva/" + estado,
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
                    }, getAuditAllAs400: function () {
                        var listData = [];
                        $.ajax({
                            url: "resources/v.1/auditAs400/getLogActiva/",
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
                    getAuditByDate: function (date1, date2) {
                        var listData = [];
                        $.ajax({
                            url: "resources/v.1/auditMigration/getAuditByDate/" + date1 + "/" + date2,
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
                    }, getAuditByDateAndId: function (date1, date2, id) {
                        var listData = [];
                        $.ajax({
                            url: "resources/v.1/auditMigration/getAuditByDateAndId/" + date1 + "/" + date2 + "/" + id,
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
                    },getDetailById: function (idDatail) {
                        var listData = [];
                        $.ajax({
                            url: "resources/v.1/auditMigration/getDetailById/" + idDatail,
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


//Factory en el cual se realizara la obtencion de la auditoria del cargue del Excel
app.factory(
        "auditUploadExcelFact", [
            '$cookies',
            '$location',
            function ($cookies, $location) {
                return {
                    getAuditByDate: function (date1, date2,id) {
                        var listData = [];
                        $.ajax({
                            url: "resources/v.1/auditUploadExcelRest/getAuditByDate/" + date1 + "/" + date2 + "/" + id,
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
                    },getAuditByDateAllId: function (date1, date2) {
                        var listData = [];
                        $.ajax({
                            url: "resources/v.1/auditUploadExcelRest/getAuditByDateAllId/" + date1 + "/" + date2,
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
                    }, getDetailById: function (idDatail,table) {
                        var listData = [];
                        $.ajax({
                            url: "resources/v.1/auditUploadExcelRest/getDetailById/" + idDatail + "/" + table,
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
                    }, getDetailByIdAndTable: function (idDatail,table) {
                        var listData = [];
                        $.ajax({
                            url: "resources/v.1/auditUploadExcelRest/getDetailByIdAndTable/" + idDatail + "/" + table,
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