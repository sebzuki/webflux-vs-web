package com.exemple.webflux.demo;

import reactor.core.publisher.Mono;

public class Demo {

    public static void main(String ...args) {
        System.out.println("imperatif : " + imperatif());
    }

    static int imperatif() {
        int i = 0;
        i++; // 1er operation
        i++; // 2dn operation
        return i;
    }

    // JS
}
