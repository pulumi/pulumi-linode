// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("linode");

/**
 * The path to a Linode API CA file to trust.
 */
export declare const apiCaPath: string | undefined;
Object.defineProperty(exports, "apiCaPath", {
    get() {
        return __config.get("apiCaPath");
    },
    enumerable: true,
});

/**
 * The version of Linode API.
 */
export declare const apiVersion: string | undefined;
Object.defineProperty(exports, "apiVersion", {
    get() {
        return __config.get("apiVersion") ?? utilities.getEnv("LINODE_API_VERSION");
    },
    enumerable: true,
});

/**
 * The path to the Linode config file to use. (default `~/.config/linode`)
 */
export declare const configPath: string | undefined;
Object.defineProperty(exports, "configPath", {
    get() {
        return __config.get("configPath");
    },
    enumerable: true,
});

/**
 * The Linode config profile to use. (default `default`)
 */
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
 * The access key to be used in linode.ObjectStorageBucket and linode_object_storage_object.
 */
export declare const objAccessKey: string | undefined;
Object.defineProperty(exports, "objAccessKey", {
    get() {
        return __config.get("objAccessKey");
    },
    enumerable: true,
});

/**
 * If true, when deleting a linode.ObjectStorageBucket any objects and versions will be force deleted.
 */
export declare const objBucketForceDelete: boolean | undefined;
Object.defineProperty(exports, "objBucketForceDelete", {
    get() {
        return __config.getObject<boolean>("objBucketForceDelete");
    },
    enumerable: true,
});

/**
 * The secret key to be used in linode.ObjectStorageBucket and linode_object_storage_object.
 */
export declare const objSecretKey: string | undefined;
Object.defineProperty(exports, "objSecretKey", {
    get() {
        return __config.get("objSecretKey");
    },
    enumerable: true,
});

/**
 * If true, temporary object keys will be created implicitly at apply-time for the linode.ObjectStorageObject and
 * linodeObjectSorageBucket resource.
 */
export declare const objUseTempKeys: boolean | undefined;
Object.defineProperty(exports, "objUseTempKeys", {
    get() {
        return __config.getObject<boolean>("objUseTempKeys");
    },
    enumerable: true,
});

/**
 * If true, Linode Instances will not be rebooted on config and interface changes.
 */
export declare const skipImplicitReboots: boolean | undefined;
Object.defineProperty(exports, "skipImplicitReboots", {
    get() {
        return __config.getObject<boolean>("skipImplicitReboots");
    },
    enumerable: true,
});

/**
 * Skip waiting for a linode.Instance resource to finish deleting.
 */
export declare const skipInstanceDeletePoll: boolean | undefined;
Object.defineProperty(exports, "skipInstanceDeletePoll", {
    get() {
        return __config.getObject<boolean>("skipInstanceDeletePoll");
    },
    enumerable: true,
});

/**
 * Skip waiting for a linode.Instance resource to be running.
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

