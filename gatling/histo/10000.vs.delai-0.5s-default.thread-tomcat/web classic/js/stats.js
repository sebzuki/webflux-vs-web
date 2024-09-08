var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name--1146707516",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "10000",
        "ok": "9897",
        "ko": "103"
    },
    "minResponseTime": {
        "total": "940",
        "ok": "940",
        "ko": "4079"
    },
    "maxResponseTime": {
        "total": "16542",
        "ok": "16542",
        "ko": "4112"
    },
    "meanResponseTime": {
        "total": "8544",
        "ok": "8590",
        "ko": "4097"
    },
    "standardDeviation": {
        "total": "4438",
        "ok": "4438",
        "ko": "3"
    },
    "percentiles1": {
        "total": "8511",
        "ok": "8547",
        "ko": "4098"
    },
    "percentiles2": {
        "total": "12349",
        "ok": "12498",
        "ko": "4098"
    },
    "percentiles3": {
        "total": "15366",
        "ok": "15367",
        "ko": "4099"
    },
    "percentiles4": {
        "total": "16190",
        "ok": "16190",
        "ko": "4099"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 0,
    "percentage": 0.0
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 200,
    "percentage": 2.0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 9697,
    "percentage": 96.97
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 103,
    "percentage": 1.03
},
    "meanNumberOfRequestsPerSecond": {
        "total": "370.37",
        "ok": "366.56",
        "ko": "3.81"
    }
},
contents: {
"req_load-3327206": {
        type: "REQUEST",
        name: "load",
path: "load",
pathFormatted: "req_load-3327206",
stats: {
    "name": "load",
    "numberOfRequests": {
        "total": "10000",
        "ok": "9897",
        "ko": "103"
    },
    "minResponseTime": {
        "total": "940",
        "ok": "940",
        "ko": "4079"
    },
    "maxResponseTime": {
        "total": "16542",
        "ok": "16542",
        "ko": "4112"
    },
    "meanResponseTime": {
        "total": "8544",
        "ok": "8590",
        "ko": "4097"
    },
    "standardDeviation": {
        "total": "4438",
        "ok": "4438",
        "ko": "3"
    },
    "percentiles1": {
        "total": "8509",
        "ok": "8548",
        "ko": "4098"
    },
    "percentiles2": {
        "total": "12423",
        "ok": "12499",
        "ko": "4098"
    },
    "percentiles3": {
        "total": "15366",
        "ok": "15367",
        "ko": "4099"
    },
    "percentiles4": {
        "total": "16190",
        "ok": "16190",
        "ko": "4099"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 0,
    "percentage": 0.0
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 200,
    "percentage": 2.0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 9697,
    "percentage": 96.97
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 103,
    "percentage": 1.03
},
    "meanNumberOfRequestsPerSecond": {
        "total": "370.37",
        "ok": "366.56",
        "ko": "3.81"
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
