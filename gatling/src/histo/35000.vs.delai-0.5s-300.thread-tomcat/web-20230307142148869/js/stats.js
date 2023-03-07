var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "35000",
        "ok": "17334",
        "ko": "17666"
    },
    "minResponseTime": {
        "total": "932",
        "ok": "932",
        "ko": "4048"
    },
    "maxResponseTime": {
        "total": "24390",
        "ok": "24390",
        "ko": "4108"
    },
    "meanResponseTime": {
        "total": "8512",
        "ok": "13034",
        "ko": "4076"
    },
    "standardDeviation": {
        "total": "6586",
        "ok": "6862",
        "ko": "4"
    },
    "percentiles1": {
        "total": "4079",
        "ok": "13012",
        "ko": "4076"
    },
    "percentiles2": {
        "total": "13003",
        "ok": "19368",
        "ko": "4078"
    },
    "percentiles3": {
        "total": "22332",
        "ok": "23168",
        "ko": "4080"
    },
    "percentiles4": {
        "total": "23606",
        "ok": "23974",
        "ko": "4091"
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
    "count": 300,
    "percentage": 1
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 17034,
    "percentage": 49
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 17666,
    "percentage": 50
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1129.032",
        "ok": "559.161",
        "ko": "569.871"
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
        "ok": "17334",
        "ko": "17666"
    },
    "minResponseTime": {
        "total": "932",
        "ok": "932",
        "ko": "4048"
    },
    "maxResponseTime": {
        "total": "24390",
        "ok": "24390",
        "ko": "4108"
    },
    "meanResponseTime": {
        "total": "8512",
        "ok": "13034",
        "ko": "4076"
    },
    "standardDeviation": {
        "total": "6586",
        "ok": "6862",
        "ko": "4"
    },
    "percentiles1": {
        "total": "4079",
        "ok": "13078",
        "ko": "4076"
    },
    "percentiles2": {
        "total": "13002",
        "ok": "19369",
        "ko": "4078"
    },
    "percentiles3": {
        "total": "22332",
        "ok": "23168",
        "ko": "4080"
    },
    "percentiles4": {
        "total": "23606",
        "ok": "23974",
        "ko": "4091"
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
    "count": 300,
    "percentage": 1
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 17034,
    "percentage": 49
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 17666,
    "percentage": 50
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1129.032",
        "ok": "559.161",
        "ko": "569.871"
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
