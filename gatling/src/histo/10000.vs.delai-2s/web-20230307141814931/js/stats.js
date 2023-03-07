var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "10000",
        "ok": "6600",
        "ko": "3400"
    },
    "minResponseTime": {
        "total": "2003",
        "ok": "2003",
        "ko": "4049"
    },
    "maxResponseTime": {
        "total": "60017",
        "ok": "59991",
        "ko": "60017"
    },
    "meanResponseTime": {
        "total": "31255",
        "ok": "30995",
        "ko": "31759"
    },
    "standardDeviation": {
        "total": "21494",
        "ok": "17226",
        "ko": "27971"
    },
    "percentiles1": {
        "total": "30976",
        "ok": "30988",
        "ko": "4075"
    },
    "percentiles2": {
        "total": "52757",
        "ok": "45501",
        "ko": "60014"
    },
    "percentiles3": {
        "total": "60015",
        "ok": "58113",
        "ko": "60015"
    },
    "percentiles4": {
        "total": "60015",
        "ok": "59949",
        "ko": "60016"
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
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 6600,
    "percentage": 66
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 3400,
    "percentage": 34
},
    "meanNumberOfRequestsPerSecond": {
        "total": "144.928",
        "ok": "95.652",
        "ko": "49.275"
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
        "total": "10000",
        "ok": "6600",
        "ko": "3400"
    },
    "minResponseTime": {
        "total": "2003",
        "ok": "2003",
        "ko": "4049"
    },
    "maxResponseTime": {
        "total": "60017",
        "ok": "59991",
        "ko": "60017"
    },
    "meanResponseTime": {
        "total": "31255",
        "ok": "30995",
        "ko": "31759"
    },
    "standardDeviation": {
        "total": "21494",
        "ok": "17226",
        "ko": "27971"
    },
    "percentiles1": {
        "total": "30975",
        "ok": "30988",
        "ko": "4075"
    },
    "percentiles2": {
        "total": "52757",
        "ok": "45508",
        "ko": "60014"
    },
    "percentiles3": {
        "total": "60015",
        "ok": "58113",
        "ko": "60015"
    },
    "percentiles4": {
        "total": "60015",
        "ok": "59949",
        "ko": "60016"
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
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 6600,
    "percentage": 66
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 3400,
    "percentage": 34
},
    "meanNumberOfRequestsPerSecond": {
        "total": "144.928",
        "ok": "95.652",
        "ko": "49.275"
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
