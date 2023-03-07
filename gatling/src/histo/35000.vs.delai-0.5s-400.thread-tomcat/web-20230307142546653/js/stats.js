var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "35000",
        "ok": "26932",
        "ko": "8068"
    },
    "minResponseTime": {
        "total": "962",
        "ok": "962",
        "ko": "4053"
    },
    "maxResponseTime": {
        "total": "27134",
        "ok": "27134",
        "ko": "4089"
    },
    "meanResponseTime": {
        "total": "11963",
        "ok": "14328",
        "ko": "4071"
    },
    "standardDeviation": {
        "total": "7944",
        "ok": "7600",
        "ko": "2"
    },
    "percentiles1": {
        "total": "10390",
        "ok": "14336",
        "ko": "4071"
    },
    "percentiles2": {
        "total": "19052",
        "ok": "21025",
        "ko": "4072"
    },
    "percentiles3": {
        "total": "25663",
        "ok": "25798",
        "ko": "4073"
    },
    "percentiles4": {
        "total": "26473",
        "ok": "26504",
        "ko": "4085"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 349,
    "percentage": 1
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 26583,
    "percentage": 76
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 8068,
    "percentage": 23
},
    "meanNumberOfRequestsPerSecond": {
        "total": "972.222",
        "ok": "748.111",
        "ko": "224.111"
    }
},
contents: {
"req_load-ec4d1": {
        type: "REQUEST",
        name: "load",
path: "load",
pathFormatted: "req_load-ec4d1",
stats: {
    "name": "load",
    "numberOfRequests": {
        "total": "35000",
        "ok": "26932",
        "ko": "8068"
    },
    "minResponseTime": {
        "total": "962",
        "ok": "962",
        "ko": "4053"
    },
    "maxResponseTime": {
        "total": "27134",
        "ok": "27134",
        "ko": "4089"
    },
    "meanResponseTime": {
        "total": "11963",
        "ok": "14328",
        "ko": "4071"
    },
    "standardDeviation": {
        "total": "7944",
        "ok": "7600",
        "ko": "2"
    },
    "percentiles1": {
        "total": "10388",
        "ok": "14338",
        "ko": "4071"
    },
    "percentiles2": {
        "total": "19051",
        "ok": "21030",
        "ko": "4072"
    },
    "percentiles3": {
        "total": "25664",
        "ok": "25798",
        "ko": "4073"
    },
    "percentiles4": {
        "total": "26473",
        "ok": "26504",
        "ko": "4085"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 349,
    "percentage": 1
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 26583,
    "percentage": 76
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 8068,
    "percentage": 23
},
    "meanNumberOfRequestsPerSecond": {
        "total": "972.222",
        "ok": "748.111",
        "ko": "224.111"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
