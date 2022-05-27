// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Linode StackScripts that match a set of filters.
//
// **NOTICE:** Due to the large number of public StackScripts, this data source may time out if `isPublic` is not filtered on.
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
// 		_, err := linode.GetStackScripts(ctx, &GetStackScriptsArgs{
// 			Filters: []GetStackScriptsFilter{
// 				GetStackScriptsFilter{
// 					Name: "label",
// 					Values: []string{
// 						"my-cool-stackscript",
// 					},
// 				},
// 				GetStackScriptsFilter{
// 					Name: "is_public",
// 					Values: []string{
// 						"false",
// 					},
// 				},
// 			},
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
// Each Linode StackScript will be stored in the `stackscripts` attribute and will export the following attributes:
//
// * `id` - The unique ID of the StackScript.
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
//
// ## Filterable Fields
//
// * `deploymentsActive`
//
// * `deploymentsTotal`
//
// * `description`
//
// * `images`
//
// * `isPublic`
//
// * `label`
//
// * `mine`
//
// * `revNote`
//
// * `username`
func GetStackScripts(ctx *pulumi.Context, args *GetStackScriptsArgs, opts ...pulumi.InvokeOption) (*GetStackScriptsResult, error) {
	var rv GetStackScriptsResult
	err := ctx.Invoke("linode:index/getStackScripts:getStackScripts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStackScripts.
type GetStackScriptsArgs struct {
	Filters []GetStackScriptsFilter `pulumi:"filters"`
	// If true, only the latest StackScript will be returned. StackScripts without a valid `created` field are not included in the result.
	Latest *bool `pulumi:"latest"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy *string `pulumi:"orderBy"`
}

// A collection of values returned by getStackScripts.
type GetStackScriptsResult struct {
	Filters []GetStackScriptsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id           string                       `pulumi:"id"`
	Latest       *bool                        `pulumi:"latest"`
	Order        *string                      `pulumi:"order"`
	OrderBy      *string                      `pulumi:"orderBy"`
	Stackscripts []GetStackScriptsStackscript `pulumi:"stackscripts"`
}

func GetStackScriptsOutput(ctx *pulumi.Context, args GetStackScriptsOutputArgs, opts ...pulumi.InvokeOption) GetStackScriptsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetStackScriptsResult, error) {
			args := v.(GetStackScriptsArgs)
			r, err := GetStackScripts(ctx, &args, opts...)
			var s GetStackScriptsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetStackScriptsResultOutput)
}

// A collection of arguments for invoking getStackScripts.
type GetStackScriptsOutputArgs struct {
	Filters GetStackScriptsFilterArrayInput `pulumi:"filters"`
	// If true, only the latest StackScript will be returned. StackScripts without a valid `created` field are not included in the result.
	Latest pulumi.BoolPtrInput `pulumi:"latest"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy pulumi.StringPtrInput `pulumi:"orderBy"`
}

func (GetStackScriptsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStackScriptsArgs)(nil)).Elem()
}

// A collection of values returned by getStackScripts.
type GetStackScriptsResultOutput struct{ *pulumi.OutputState }

func (GetStackScriptsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStackScriptsResult)(nil)).Elem()
}

func (o GetStackScriptsResultOutput) ToGetStackScriptsResultOutput() GetStackScriptsResultOutput {
	return o
}

func (o GetStackScriptsResultOutput) ToGetStackScriptsResultOutputWithContext(ctx context.Context) GetStackScriptsResultOutput {
	return o
}

func (o GetStackScriptsResultOutput) Filters() GetStackScriptsFilterArrayOutput {
	return o.ApplyT(func(v GetStackScriptsResult) []GetStackScriptsFilter { return v.Filters }).(GetStackScriptsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetStackScriptsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackScriptsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetStackScriptsResultOutput) Latest() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetStackScriptsResult) *bool { return v.Latest }).(pulumi.BoolPtrOutput)
}

func (o GetStackScriptsResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetStackScriptsResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetStackScriptsResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetStackScriptsResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func (o GetStackScriptsResultOutput) Stackscripts() GetStackScriptsStackscriptArrayOutput {
	return o.ApplyT(func(v GetStackScriptsResult) []GetStackScriptsStackscript { return v.Stackscripts }).(GetStackScriptsStackscriptArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStackScriptsResultOutput{})
}
