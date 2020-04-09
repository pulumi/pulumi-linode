// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package linode

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides information about a Linode instance type
//
//
// ## Attributes
//
// The Linode Instance Type resource exports the following attributes:
//
// * `id` - The ID representing the Linode Type
//
// * `label` - The Linode Type's label is for display purposes only
//
// * `class` - The class of the Linode Type
//
// * `disk` - The Disk size, in MB, of the Linode Type
//
// * `price.0.hourly` -  Cost (in US dollars) per hour.
//
// * `price.0.monthly` - Cost (in US dollars) per month.
//
// * `addons.0.backups.0.price.0.hourly` - The cost (in US dollars) per hour to add Backups service.
//
// * `addons.0.backups.0.price.0.monthly` - The cost (in US dollars) per month to add Backups service.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/instance_type.html.md.
func GetInstanceType(ctx *pulumi.Context, args *GetInstanceTypeArgs, opts ...pulumi.InvokeOption) (*GetInstanceTypeResult, error) {
	var rv GetInstanceTypeResult
	err := ctx.Invoke("linode:index/getInstanceType:getInstanceType", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceType.
type GetInstanceTypeArgs struct {
	// Label used to identify instance type
	Id    string  `pulumi:"id"`
	Label *string `pulumi:"label"`
}

// A collection of values returned by getInstanceType.
type GetInstanceTypeResult struct {
	Addons     GetInstanceTypeAddons `pulumi:"addons"`
	Class      string                `pulumi:"class"`
	Disk       int                   `pulumi:"disk"`
	Id         string                `pulumi:"id"`
	Label      string                `pulumi:"label"`
	Memory     int                   `pulumi:"memory"`
	NetworkOut int                   `pulumi:"networkOut"`
	Price      GetInstanceTypePrice  `pulumi:"price"`
	Transfer   int                   `pulumi:"transfer"`
	Vcpus      int                   `pulumi:"vcpus"`
}
