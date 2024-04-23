// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific Linode StackScript.
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode StackScript.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := linode.LookupStackScript(ctx, &linode.LookupStackScriptArgs{
//				Id: "355872",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupStackScript(ctx *pulumi.Context, args *LookupStackScriptArgs, opts ...pulumi.InvokeOption) (*LookupStackScriptResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupStackScriptResult
	err := ctx.Invoke("linode:index/getStackScript:getStackScript", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStackScript.
type LookupStackScriptArgs struct {
	// The unique numeric ID of the StackScript to query.
	Id string `pulumi:"id"`
}

// A collection of values returned by getStackScript.
type LookupStackScriptResult struct {
	// The date this StackScript was created.
	Created string `pulumi:"created"`
	// Count of currently active, deployed Linodes created from this StackScript.
	DeploymentsActive int `pulumi:"deploymentsActive"`
	// The total number of times this StackScript has been deployed.
	DeploymentsTotal int `pulumi:"deploymentsTotal"`
	// A description for the StackScript.
	Description string `pulumi:"description"`
	Id          string `pulumi:"id"`
	// A set of Image IDs representing the Images that this StackScript is compatible for deploying with. `any/all` indicates that all available image distributions, including private images, are accepted.
	Images []string `pulumi:"images"`
	// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private.
	IsPublic bool `pulumi:"isPublic"`
	// A human-readable label for the field that will serve as the input prompt for entering the value during deployment.
	Label string `pulumi:"label"`
	// This field allows you to add notes for the set of revisions made to this StackScript.
	RevNote string `pulumi:"revNote"`
	// The script to execute when provisioning a new Linode with this StackScript.
	Script string `pulumi:"script"`
	// The date this StackScript was updated.
	Updated string `pulumi:"updated"`
	// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
	UserDefinedFields []GetStackScriptUserDefinedField `pulumi:"userDefinedFields"`
	// The Gravatar ID for the User who created the StackScript.
	UserGravatarId string `pulumi:"userGravatarId"`
	// The User who created the StackScript.
	Username string `pulumi:"username"`
}

func LookupStackScriptOutput(ctx *pulumi.Context, args LookupStackScriptOutputArgs, opts ...pulumi.InvokeOption) LookupStackScriptResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupStackScriptResult, error) {
			args := v.(LookupStackScriptArgs)
			r, err := LookupStackScript(ctx, &args, opts...)
			var s LookupStackScriptResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupStackScriptResultOutput)
}

// A collection of arguments for invoking getStackScript.
type LookupStackScriptOutputArgs struct {
	// The unique numeric ID of the StackScript to query.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupStackScriptOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStackScriptArgs)(nil)).Elem()
}

// A collection of values returned by getStackScript.
type LookupStackScriptResultOutput struct{ *pulumi.OutputState }

func (LookupStackScriptResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStackScriptResult)(nil)).Elem()
}

func (o LookupStackScriptResultOutput) ToLookupStackScriptResultOutput() LookupStackScriptResultOutput {
	return o
}

func (o LookupStackScriptResultOutput) ToLookupStackScriptResultOutputWithContext(ctx context.Context) LookupStackScriptResultOutput {
	return o
}

// The date this StackScript was created.
func (o LookupStackScriptResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.Created }).(pulumi.StringOutput)
}

// Count of currently active, deployed Linodes created from this StackScript.
func (o LookupStackScriptResultOutput) DeploymentsActive() pulumi.IntOutput {
	return o.ApplyT(func(v LookupStackScriptResult) int { return v.DeploymentsActive }).(pulumi.IntOutput)
}

// The total number of times this StackScript has been deployed.
func (o LookupStackScriptResultOutput) DeploymentsTotal() pulumi.IntOutput {
	return o.ApplyT(func(v LookupStackScriptResult) int { return v.DeploymentsTotal }).(pulumi.IntOutput)
}

// A description for the StackScript.
func (o LookupStackScriptResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupStackScriptResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.Id }).(pulumi.StringOutput)
}

// A set of Image IDs representing the Images that this StackScript is compatible for deploying with. `any/all` indicates that all available image distributions, including private images, are accepted.
func (o LookupStackScriptResultOutput) Images() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupStackScriptResult) []string { return v.Images }).(pulumi.StringArrayOutput)
}

// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private.
func (o LookupStackScriptResultOutput) IsPublic() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupStackScriptResult) bool { return v.IsPublic }).(pulumi.BoolOutput)
}

// A human-readable label for the field that will serve as the input prompt for entering the value during deployment.
func (o LookupStackScriptResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.Label }).(pulumi.StringOutput)
}

// This field allows you to add notes for the set of revisions made to this StackScript.
func (o LookupStackScriptResultOutput) RevNote() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.RevNote }).(pulumi.StringOutput)
}

// The script to execute when provisioning a new Linode with this StackScript.
func (o LookupStackScriptResultOutput) Script() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.Script }).(pulumi.StringOutput)
}

// The date this StackScript was updated.
func (o LookupStackScriptResultOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.Updated }).(pulumi.StringOutput)
}

// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
func (o LookupStackScriptResultOutput) UserDefinedFields() GetStackScriptUserDefinedFieldArrayOutput {
	return o.ApplyT(func(v LookupStackScriptResult) []GetStackScriptUserDefinedField { return v.UserDefinedFields }).(GetStackScriptUserDefinedFieldArrayOutput)
}

// The Gravatar ID for the User who created the StackScript.
func (o LookupStackScriptResultOutput) UserGravatarId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.UserGravatarId }).(pulumi.StringOutput)
}

// The User who created the StackScript.
func (o LookupStackScriptResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.Username }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupStackScriptResultOutput{})
}
