// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about the backups of an Instance.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-backups).
//
// ## Example Usage
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
//			_, err := linode.GetInstanceBackups(ctx, &linode.GetInstanceBackupsArgs{
//				LinodeId: 123,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetInstanceBackups(ctx *pulumi.Context, args *GetInstanceBackupsArgs, opts ...pulumi.InvokeOption) (*GetInstanceBackupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstanceBackupsResult
	err := ctx.Invoke("linode:index/getInstanceBackups:getInstanceBackups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceBackups.
type GetInstanceBackupsArgs struct {
	// The Linode instance's ID.
	LinodeId int `pulumi:"linodeId"`
}

// A collection of values returned by getInstanceBackups.
type GetInstanceBackupsResult struct {
	Automatics []GetInstanceBackupsAutomatic `pulumi:"automatics"`
	Currents   []GetInstanceBackupsCurrent   `pulumi:"currents"`
	// The unique ID of this Backup.
	Id           int                            `pulumi:"id"`
	InProgresses []GetInstanceBackupsInProgress `pulumi:"inProgresses"`
	LinodeId     int                            `pulumi:"linodeId"`
}

func GetInstanceBackupsOutput(ctx *pulumi.Context, args GetInstanceBackupsOutputArgs, opts ...pulumi.InvokeOption) GetInstanceBackupsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetInstanceBackupsResultOutput, error) {
			args := v.(GetInstanceBackupsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("linode:index/getInstanceBackups:getInstanceBackups", args, GetInstanceBackupsResultOutput{}, options).(GetInstanceBackupsResultOutput), nil
		}).(GetInstanceBackupsResultOutput)
}

// A collection of arguments for invoking getInstanceBackups.
type GetInstanceBackupsOutputArgs struct {
	// The Linode instance's ID.
	LinodeId pulumi.IntInput `pulumi:"linodeId"`
}

func (GetInstanceBackupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceBackupsArgs)(nil)).Elem()
}

// A collection of values returned by getInstanceBackups.
type GetInstanceBackupsResultOutput struct{ *pulumi.OutputState }

func (GetInstanceBackupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceBackupsResult)(nil)).Elem()
}

func (o GetInstanceBackupsResultOutput) ToGetInstanceBackupsResultOutput() GetInstanceBackupsResultOutput {
	return o
}

func (o GetInstanceBackupsResultOutput) ToGetInstanceBackupsResultOutputWithContext(ctx context.Context) GetInstanceBackupsResultOutput {
	return o
}

func (o GetInstanceBackupsResultOutput) Automatics() GetInstanceBackupsAutomaticArrayOutput {
	return o.ApplyT(func(v GetInstanceBackupsResult) []GetInstanceBackupsAutomatic { return v.Automatics }).(GetInstanceBackupsAutomaticArrayOutput)
}

func (o GetInstanceBackupsResultOutput) Currents() GetInstanceBackupsCurrentArrayOutput {
	return o.ApplyT(func(v GetInstanceBackupsResult) []GetInstanceBackupsCurrent { return v.Currents }).(GetInstanceBackupsCurrentArrayOutput)
}

// The unique ID of this Backup.
func (o GetInstanceBackupsResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstanceBackupsResult) int { return v.Id }).(pulumi.IntOutput)
}

func (o GetInstanceBackupsResultOutput) InProgresses() GetInstanceBackupsInProgressArrayOutput {
	return o.ApplyT(func(v GetInstanceBackupsResult) []GetInstanceBackupsInProgress { return v.InProgresses }).(GetInstanceBackupsInProgressArrayOutput)
}

func (o GetInstanceBackupsResultOutput) LinodeId() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstanceBackupsResult) int { return v.LinodeId }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceBackupsResultOutput{})
}
