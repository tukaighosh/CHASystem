function updateJobNumber() {
    var jobNumberField = document.getElementById("jobNumber");
    var importExportField = document.getElementById("importOrExport");
    if (jobNumberField.style.display === "none") {
    	jobNumberField.style.display = "block";
    	jobNumberField.value = importExportField.value + "-" +jobNumberField.value;
    } else {
        var jobNumberValue = jobNumberField.value;
        var array = jobNumberValue.split("-");
        jobNumberField.value = importExportField.value + "-" + array[1];
    }
}