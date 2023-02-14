// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("linode");

/**
 * An HTTP User-Agent Prefix to prepend in API requests.
 */
export declare const apiVersion: string | undefined;
Object.defineProperty(exports, "apiVersion", {
    get() {
        return __config.get("apiVersion") ?? utilities.getEnv("LINODE_API_VERSION");
    },
    enumerable: true,
});

export declare const configPath: string | undefined;
Object.defineProperty(exports, "configPath", {
    get() {
        return __config.get("configPath");
    },
    enumerable: true,
});

export declare const configProfile: string | undefined;
Object.defineProperty(exports, "configProfile", {
    get() {
        return __config.get("configProfile");
    },
    enumerable: true,
});

/**
 * Disable the internal caching system that backs certain Linode API requests.
 */
export declare const disableInternalCache: boolean | undefined;
Object.defineProperty(exports, "disableInternalCache", {
    get() {
        return __config.getObject<boolean>("disableInternalCache");
    },
    enumerable: true,
});

/**
 * The rate in milliseconds to poll for events.
 */
export declare const eventPollMs: number | undefined;
Object.defineProperty(exports, "eventPollMs", {
    get() {
        return __config.getObject<number>("eventPollMs");
    },
    enumerable: true,
});

/**
 * The rate in milliseconds to poll for LKE events.
 */
export declare const lkeEventPollMs: number | undefined;
Object.defineProperty(exports, "lkeEventPollMs", {
    get() {
        return __config.getObject<number>("lkeEventPollMs");
    },
    enumerable: true,
});

/**
 * The rate in milliseconds to poll for an LKE node to be ready.
 */
export declare const lkeNodeReadyPollMs: number | undefined;
Object.defineProperty(exports, "lkeNodeReadyPollMs", {
    get() {
        return __config.getObject<number>("lkeNodeReadyPollMs");
    },
    enumerable: true,
});

/**
 * Maximum delay in milliseconds before retrying a request.
 */
export declare const maxRetryDelayMs: number | undefined;
Object.defineProperty(exports, "maxRetryDelayMs", {
    get() {
        return __config.getObject<number>("maxRetryDelayMs");
    },
    enumerable: true,
});

/**
 * Minimum delay in milliseconds before retrying a request.
 */
export declare const minRetryDelayMs: number | undefined;
Object.defineProperty(exports, "minRetryDelayMs", {
    get() {
        return __config.getObject<number>("minRetryDelayMs");
    },
    enumerable: true,
});

/**
 * Skip waiting for a linode_instance resource to finish deleting.
 */
export declare const skipInstanceDeletePoll: boolean | undefined;
Object.defineProperty(exports, "skipInstanceDeletePoll", {
    get() {
        return __config.getObject<boolean>("skipInstanceDeletePoll");
    },
    enumerable: true,
});

/**
 * Skip waiting for a linode_instance resource to be running.
 */
export declare const skipInstanceReadyPoll: boolean | undefined;
Object.defineProperty(exports, "skipInstanceReadyPoll", {
    get() {
        return __config.getObject<boolean>("skipInstanceReadyPoll");
    },
    enumerable: true,
});

/**
 * The token that allows you access to your Linode account
 */
export declare const token: string | undefined;
Object.defineProperty(exports, "token", {
    get() {
        return __config.get("token");
    },
    enumerable: true,
});

/**
 * An HTTP User-Agent Prefix to prepend in API requests.
 */
export declare const uaPrefix: string | undefined;
Object.defineProperty(exports, "uaPrefix", {
    get() {
        return __config.get("uaPrefix") ?? utilities.getEnv("LINODE_UA_PREFIX");
    },
    enumerable: true,
});

/**
 * The HTTP(S) API address of the Linode API to use.
 */
export declare const url: string | undefined;
Object.defineProperty(exports, "url", {
    get() {
        return __config.get("url") ?? utilities.getEnv("LINODE_URL");
    },
    enumerable: true,
});

