// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export * from "./domain";
export * from "./domainRecord";
export * from "./firewall";
export * from "./getAccount";
export * from "./getDomain";
export * from "./getDomainRecord";
export * from "./getFirewall";
export * from "./getImage";
export * from "./getImages";
export * from "./getInstanceBackups";
export * from "./getInstanceType";
export * from "./getInstances";
export * from "./getKernel";
export * from "./getLkeCluster";
export * from "./getNetworkingIp";
export * from "./getNodeBalancer";
export * from "./getNodeBalancerConfig";
export * from "./getNodeBalancerNode";
export * from "./getObjectStorageCluster";
export * from "./getProfile";
export * from "./getRegion";
export * from "./getSshKey";
export * from "./getStackScript";
export * from "./getUser";
export * from "./getVlans";
export * from "./getVolume";
export * from "./image";
export * from "./instance";
export * from "./instanceIp";
export * from "./lkeCluster";
export * from "./nodeBalancer";
export * from "./nodeBalancerConfig";
export * from "./nodeBalancerNode";
export * from "./objectStorageBucket";
export * from "./objectStorageKey";
export * from "./objectStorageObject";
export * from "./provider";
export * from "./rdns";
export * from "./sshKey";
export * from "./stackScript";
export * from "./token";
export * from "./user";
export * from "./volume";

// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

// Import resources to register:
import { Domain } from "./domain";
import { DomainRecord } from "./domainRecord";
import { Firewall } from "./firewall";
import { Image } from "./image";
import { Instance } from "./instance";
import { InstanceIp } from "./instanceIp";
import { LkeCluster } from "./lkeCluster";
import { NodeBalancer } from "./nodeBalancer";
import { NodeBalancerConfig } from "./nodeBalancerConfig";
import { NodeBalancerNode } from "./nodeBalancerNode";
import { ObjectStorageBucket } from "./objectStorageBucket";
import { ObjectStorageKey } from "./objectStorageKey";
import { ObjectStorageObject } from "./objectStorageObject";
import { Rdns } from "./rdns";
import { SshKey } from "./sshKey";
import { StackScript } from "./stackScript";
import { Token } from "./token";
import { User } from "./user";
import { Volume } from "./volume";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "linode:index/domain:Domain":
                return new Domain(name, <any>undefined, { urn })
            case "linode:index/domainRecord:DomainRecord":
                return new DomainRecord(name, <any>undefined, { urn })
            case "linode:index/firewall:Firewall":
                return new Firewall(name, <any>undefined, { urn })
            case "linode:index/image:Image":
                return new Image(name, <any>undefined, { urn })
            case "linode:index/instance:Instance":
                return new Instance(name, <any>undefined, { urn })
            case "linode:index/instanceIp:InstanceIp":
                return new InstanceIp(name, <any>undefined, { urn })
            case "linode:index/lkeCluster:LkeCluster":
                return new LkeCluster(name, <any>undefined, { urn })
            case "linode:index/nodeBalancer:NodeBalancer":
                return new NodeBalancer(name, <any>undefined, { urn })
            case "linode:index/nodeBalancerConfig:NodeBalancerConfig":
                return new NodeBalancerConfig(name, <any>undefined, { urn })
            case "linode:index/nodeBalancerNode:NodeBalancerNode":
                return new NodeBalancerNode(name, <any>undefined, { urn })
            case "linode:index/objectStorageBucket:ObjectStorageBucket":
                return new ObjectStorageBucket(name, <any>undefined, { urn })
            case "linode:index/objectStorageKey:ObjectStorageKey":
                return new ObjectStorageKey(name, <any>undefined, { urn })
            case "linode:index/objectStorageObject:ObjectStorageObject":
                return new ObjectStorageObject(name, <any>undefined, { urn })
            case "linode:index/rdns:Rdns":
                return new Rdns(name, <any>undefined, { urn })
            case "linode:index/sshKey:SshKey":
                return new SshKey(name, <any>undefined, { urn })
            case "linode:index/stackScript:StackScript":
                return new StackScript(name, <any>undefined, { urn })
            case "linode:index/token:Token":
                return new Token(name, <any>undefined, { urn })
            case "linode:index/user:User":
                return new User(name, <any>undefined, { urn })
            case "linode:index/volume:Volume":
                return new Volume(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("linode", "index/domain", _module)
pulumi.runtime.registerResourceModule("linode", "index/domainRecord", _module)
pulumi.runtime.registerResourceModule("linode", "index/firewall", _module)
pulumi.runtime.registerResourceModule("linode", "index/image", _module)
pulumi.runtime.registerResourceModule("linode", "index/instance", _module)
pulumi.runtime.registerResourceModule("linode", "index/instanceIp", _module)
pulumi.runtime.registerResourceModule("linode", "index/lkeCluster", _module)
pulumi.runtime.registerResourceModule("linode", "index/nodeBalancer", _module)
pulumi.runtime.registerResourceModule("linode", "index/nodeBalancerConfig", _module)
pulumi.runtime.registerResourceModule("linode", "index/nodeBalancerNode", _module)
pulumi.runtime.registerResourceModule("linode", "index/objectStorageBucket", _module)
pulumi.runtime.registerResourceModule("linode", "index/objectStorageKey", _module)
pulumi.runtime.registerResourceModule("linode", "index/objectStorageObject", _module)
pulumi.runtime.registerResourceModule("linode", "index/rdns", _module)
pulumi.runtime.registerResourceModule("linode", "index/sshKey", _module)
pulumi.runtime.registerResourceModule("linode", "index/stackScript", _module)
pulumi.runtime.registerResourceModule("linode", "index/token", _module)
pulumi.runtime.registerResourceModule("linode", "index/user", _module)
pulumi.runtime.registerResourceModule("linode", "index/volume", _module)

import { Provider } from "./provider";

pulumi.runtime.registerResourcePackage("linode", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:linode") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
