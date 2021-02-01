// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "linode:index/domain:Domain":
		r, err = NewDomain(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/domainRecord:DomainRecord":
		r, err = NewDomainRecord(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/firewall:Firewall":
		r, err = NewFirewall(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/image:Image":
		r, err = NewImage(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/instance:Instance":
		r, err = NewInstance(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/instanceIp:InstanceIp":
		r, err = NewInstanceIp(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/lkeCluster:LkeCluster":
		r, err = NewLkeCluster(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/nodeBalancer:NodeBalancer":
		r, err = NewNodeBalancer(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/nodeBalancerConfig:NodeBalancerConfig":
		r, err = NewNodeBalancerConfig(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/nodeBalancerNode:NodeBalancerNode":
		r, err = NewNodeBalancerNode(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/objectStorageBucket:ObjectStorageBucket":
		r, err = NewObjectStorageBucket(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/objectStorageKey:ObjectStorageKey":
		r, err = NewObjectStorageKey(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/objectStorageObject:ObjectStorageObject":
		r, err = NewObjectStorageObject(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/rdns:Rdns":
		r, err = NewRdns(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/sshKey:SshKey":
		r, err = NewSshKey(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/stackScript:StackScript":
		r, err = NewStackScript(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/token:Token":
		r, err = NewToken(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/vlan:Vlan":
		r, err = NewVlan(ctx, name, nil, pulumi.URN_(urn))
	case "linode:index/volume:Volume":
		r, err = NewVolume(ctx, name, nil, pulumi.URN_(urn))
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:linode" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	return NewProvider(ctx, name, nil, pulumi.URN_(urn))
}

func init() {
	version, err := PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"linode",
		"index/domain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/domainRecord",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/firewall",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/image",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/instance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/instanceIp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/lkeCluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/nodeBalancer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/nodeBalancerConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/nodeBalancerNode",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/objectStorageBucket",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/objectStorageKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/objectStorageObject",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/rdns",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/sshKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/stackScript",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/token",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/vlan",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"linode",
		"index/volume",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"linode",
		&pkg{version},
	)
}
