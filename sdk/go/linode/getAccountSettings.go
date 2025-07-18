// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Linode account settings.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-account-settings).
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about Linode account settings.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := linode.LookupAccountSettings(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAccountSettings(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*LookupAccountSettingsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAccountSettingsResult
	err := ctx.Invoke("linode:index/getAccountSettings:getAccountSettings", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getAccountSettings.
type LookupAccountSettingsResult struct {
	// Account-wide backups default.
	BackupsEnabled bool   `pulumi:"backupsEnabled"`
	Id             string `pulumi:"id"`
	// The Longview Pro tier you are currently subscribed to.
	LongviewSubscription string `pulumi:"longviewSubscription"`
	// Enables monitoring for connectivity, response, and total request time.
	Managed bool `pulumi:"managed"`
	// Enables network helper across all users by default for new Linodes and Linode Configs.
	NetworkHelper bool `pulumi:"networkHelper"`
	// A string describing the status of this account’s Object Storage service enrollment.
	ObjectStorage string `pulumi:"objectStorage"`
}

func LookupAccountSettingsOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) LookupAccountSettingsResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (LookupAccountSettingsResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("linode:index/getAccountSettings:getAccountSettings", nil, LookupAccountSettingsResultOutput{}, options).(LookupAccountSettingsResultOutput), nil
	}).(LookupAccountSettingsResultOutput)
}

// A collection of values returned by getAccountSettings.
type LookupAccountSettingsResultOutput struct{ *pulumi.OutputState }

func (LookupAccountSettingsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountSettingsResult)(nil)).Elem()
}

func (o LookupAccountSettingsResultOutput) ToLookupAccountSettingsResultOutput() LookupAccountSettingsResultOutput {
	return o
}

func (o LookupAccountSettingsResultOutput) ToLookupAccountSettingsResultOutputWithContext(ctx context.Context) LookupAccountSettingsResultOutput {
	return o
}

// Account-wide backups default.
func (o LookupAccountSettingsResultOutput) BackupsEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAccountSettingsResult) bool { return v.BackupsEnabled }).(pulumi.BoolOutput)
}

func (o LookupAccountSettingsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountSettingsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Longview Pro tier you are currently subscribed to.
func (o LookupAccountSettingsResultOutput) LongviewSubscription() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountSettingsResult) string { return v.LongviewSubscription }).(pulumi.StringOutput)
}

// Enables monitoring for connectivity, response, and total request time.
func (o LookupAccountSettingsResultOutput) Managed() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAccountSettingsResult) bool { return v.Managed }).(pulumi.BoolOutput)
}

// Enables network helper across all users by default for new Linodes and Linode Configs.
func (o LookupAccountSettingsResultOutput) NetworkHelper() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAccountSettingsResult) bool { return v.NetworkHelper }).(pulumi.BoolOutput)
}

// A string describing the status of this account’s Object Storage service enrollment.
func (o LookupAccountSettingsResultOutput) ObjectStorage() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountSettingsResult) string { return v.ObjectStorage }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAccountSettingsResultOutput{})
}
