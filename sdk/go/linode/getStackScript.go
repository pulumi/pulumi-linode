// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

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
// 	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := linode.LookupStackScript(ctx, &GetStackScriptArgs{
// 			Id: 355872,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Attributes
//
// This resource exports the following attributes:
//
// * `label` - The StackScript's label is for display purposes only.
//
// * `script` - The script to execute when provisioning a new Linode with this StackScript.
//
// * `description` - A description for the StackScript.
//
// * `revNote` - This field allows you to add notes for the set of revisions made to this StackScript.
//
// * `isPublic` - This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private.
//
// * `images` - An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
//
// * `deploymentsActive` - Count of currently active, deployed Linodes created from this StackScript.
//
// * `userGravatarId` - The Gravatar ID for the User who created the StackScript.
//
// * `deploymentsTotal` - The total number of times this StackScript has been deployed.
//
// * `username` - The User who created the StackScript.
//
// * `created` - The date this StackScript was created.
//
// * `updated` - The date this StackScript was updated.
//
// * `userDefinedFields` - This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
//
//   * `label` - A human-readable label for the field that will serve as the input prompt for entering the value during deployment.
//
//   * `name` - The name of the field.
//
//   * `example` - An example value for the field.
//
//   * `oneOf` - A list of acceptable single values for the field.
//
//   * `manyOf` - A list of acceptable values for the field in any quantity, combination or order.
//
//   * `default` - The default value. If not specified, this value will be used.
func LookupStackScript(ctx *pulumi.Context, args *LookupStackScriptArgs, opts ...pulumi.InvokeOption) (*LookupStackScriptResult, error) {
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
	Id                int                              `pulumi:"id"`
	UserDefinedFields []GetStackScriptUserDefinedField `pulumi:"userDefinedFields"`
}

// A collection of values returned by getStackScript.
type LookupStackScriptResult struct {
	Created           string                           `pulumi:"created"`
	DeploymentsActive int                              `pulumi:"deploymentsActive"`
	DeploymentsTotal  int                              `pulumi:"deploymentsTotal"`
	Description       string                           `pulumi:"description"`
	Id                int                              `pulumi:"id"`
	Images            []string                         `pulumi:"images"`
	IsPublic          bool                             `pulumi:"isPublic"`
	Label             string                           `pulumi:"label"`
	RevNote           string                           `pulumi:"revNote"`
	Script            string                           `pulumi:"script"`
	Updated           string                           `pulumi:"updated"`
	UserDefinedFields []GetStackScriptUserDefinedField `pulumi:"userDefinedFields"`
	UserGravatarId    string                           `pulumi:"userGravatarId"`
	Username          string                           `pulumi:"username"`
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
	Id                pulumi.IntInput                          `pulumi:"id"`
	UserDefinedFields GetStackScriptUserDefinedFieldArrayInput `pulumi:"userDefinedFields"`
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

func (o LookupStackScriptResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.Created }).(pulumi.StringOutput)
}

func (o LookupStackScriptResultOutput) DeploymentsActive() pulumi.IntOutput {
	return o.ApplyT(func(v LookupStackScriptResult) int { return v.DeploymentsActive }).(pulumi.IntOutput)
}

func (o LookupStackScriptResultOutput) DeploymentsTotal() pulumi.IntOutput {
	return o.ApplyT(func(v LookupStackScriptResult) int { return v.DeploymentsTotal }).(pulumi.IntOutput)
}

func (o LookupStackScriptResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupStackScriptResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupStackScriptResult) int { return v.Id }).(pulumi.IntOutput)
}

func (o LookupStackScriptResultOutput) Images() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupStackScriptResult) []string { return v.Images }).(pulumi.StringArrayOutput)
}

func (o LookupStackScriptResultOutput) IsPublic() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupStackScriptResult) bool { return v.IsPublic }).(pulumi.BoolOutput)
}

func (o LookupStackScriptResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.Label }).(pulumi.StringOutput)
}

func (o LookupStackScriptResultOutput) RevNote() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.RevNote }).(pulumi.StringOutput)
}

func (o LookupStackScriptResultOutput) Script() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.Script }).(pulumi.StringOutput)
}

func (o LookupStackScriptResultOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.Updated }).(pulumi.StringOutput)
}

func (o LookupStackScriptResultOutput) UserDefinedFields() GetStackScriptUserDefinedFieldArrayOutput {
	return o.ApplyT(func(v LookupStackScriptResult) []GetStackScriptUserDefinedField { return v.UserDefinedFields }).(GetStackScriptUserDefinedFieldArrayOutput)
}

func (o LookupStackScriptResultOutput) UserGravatarId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.UserGravatarId }).(pulumi.StringOutput)
}

func (o LookupStackScriptResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStackScriptResult) string { return v.Username }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupStackScriptResultOutput{})
}
