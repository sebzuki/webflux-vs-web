var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "35000",
        "ok": "8754",
        "ko": "26246"
    },
    "minResponseTime": {
        "total": "815",
        "ok": "815",
        "ko": "4051"
    },
    "maxResponseTime": {
        "total": "19587",
        "ok": "19587",
        "ko": "4124"
    },
    "meanResponseTime": {
        "total": "5684",
        "ok": "10501",
        "ko": "4077"
    },
    "standardDeviation": {
        "total": "3914",
        "ok": "5503",
        "ko": "9"
    },
    "percentiles1": {
        "total": "4080",
        "ok": "10499",
        "ko": "4076"
    },
    "percentiles2": {
        "total": "4090",
        "ok": "15461",
        "ko": "4086"
    },
    "percentiles3": {
        "total": "16302",
        "ok": "18646",
        "ko": "4090"
    },
    "percentiles4": {
        "total": "18674",
        "ok": "19554",
        "ko": "4094"
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
    "count": 200,
    "percentage": 1
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 8554,
    "percentage": 24
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 26246,
    "percentage": 75
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1521.739",
        "ok": "380.609",
        "ko": "1141.13"
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
        "ok": "8754",
        "ko": "26246"
    },
    "minResponseTime": {
        "total": "815",
        "ok": "815",
        "ko": "4051"
    },
    "maxResponseTime": {
        "total": "19587",
        "ok": "19587",
        "ko": "4124"
    },
    "meanResponseTime": {
        "total": "5684",
        "ok": "10501",
        "ko": "4077"
    },
    "standardDeviation": {
        "total": "3914",
        "ok": "5503",
        "ko": "9"
    },
    "percentiles1": {
        "total": "4080",
        "ok": "10494",
        "ko": "4076"
    },
    "percentiles2": {
        "total": "4090",
        "ok": "15461",
        "ko": "4086"
    },
    "percentiles3": {
        "total": "16306",
        "ok": "18646",
        "ko": "4090"
    },
    "percentiles4": {
        "total": "18674",
        "ok": "19554",
        "ko": "4094"
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
    "count": 200,
    "percentage": 1
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 8554,
    "percentage": 24
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 26246,
    "percentage": 75
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1521.739",
        "ok": "380.609",
        "ko": "1141.13"
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
