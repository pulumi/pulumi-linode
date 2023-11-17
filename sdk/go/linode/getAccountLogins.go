// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Linode account logins that match a set of filters.
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode account login.
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
//			filtered_account_logins, err := linode.GetAccountLogins(ctx, &linode.GetAccountLoginsArgs{
//				Filters: []linode.GetAccountLoginsFilter{
//					{
//						Name: "restricted",
//						Values: []string{
//							"true",
//						},
//					},
//					{
//						Name: "username",
//						Values: []string{
//							"myUsername",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			var splat0 []*int
//			for _, val0 := range filtered_account_logins.Logins {
//				splat0 = append(splat0, val0.Id)
//			}
//			ctx.Export("loginIds", splat0)
//			return nil
//		})
//	}
//
// ```
// ## Filterable Fields
//
// * `ip`
//
// * `restricted`
//
// * `username`
func GetAccountLogins(ctx *pulumi.Context, args *GetAccountLoginsArgs, opts ...pulumi.InvokeOption) (*GetAccountLoginsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAccountLoginsResult
	err := ctx.Invoke("linode:index/getAccountLogins:getAccountLogins", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccountLogins.
type GetAccountLoginsArgs struct {
	// `filter` - (Optional) A set of filters used to select Linode account logins that meet certain requirements.
	Filters []GetAccountLoginsFilter `pulumi:"filters"`
	Logins  []GetAccountLoginsLogin  `pulumi:"logins"`
}

// A collection of values returned by getAccountLogins.
type GetAccountLoginsResult struct {
	Filters []GetAccountLoginsFilter `pulumi:"filters"`
	// The unique ID of this login object.
	Id     string                  `pulumi:"id"`
	Logins []GetAccountLoginsLogin `pulumi:"logins"`
}

func GetAccountLoginsOutput(ctx *pulumi.Context, args GetAccountLoginsOutputArgs, opts ...pulumi.InvokeOption) GetAccountLoginsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAccountLoginsResult, error) {
			args := v.(GetAccountLoginsArgs)
			r, err := GetAccountLogins(ctx, &args, opts...)
			var s GetAccountLoginsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAccountLoginsResultOutput)
}

// A collection of arguments for invoking getAccountLogins.
type GetAccountLoginsOutputArgs struct {
	// `filter` - (Optional) A set of filters used to select Linode account logins that meet certain requirements.
	Filters GetAccountLoginsFilterArrayInput `pulumi:"filters"`
	Logins  GetAccountLoginsLoginArrayInput  `pulumi:"logins"`
}

func (GetAccountLoginsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccountLoginsArgs)(nil)).Elem()
}

// A collection of values returned by getAccountLogins.
type GetAccountLoginsResultOutput struct{ *pulumi.OutputState }

func (GetAccountLoginsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccountLoginsResult)(nil)).Elem()
}

func (o GetAccountLoginsResultOutput) ToGetAccountLoginsResultOutput() GetAccountLoginsResultOutput {
	return o
}

func (o GetAccountLoginsResultOutput) ToGetAccountLoginsResultOutputWithContext(ctx context.Context) GetAccountLoginsResultOutput {
	return o
}

func (o GetAccountLoginsResultOutput) Filters() GetAccountLoginsFilterArrayOutput {
	return o.ApplyT(func(v GetAccountLoginsResult) []GetAccountLoginsFilter { return v.Filters }).(GetAccountLoginsFilterArrayOutput)
}

// The unique ID of this login object.
func (o GetAccountLoginsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountLoginsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAccountLoginsResultOutput) Logins() GetAccountLoginsLoginArrayOutput {
	return o.ApplyT(func(v GetAccountLoginsResult) []GetAccountLoginsLogin { return v.Logins }).(GetAccountLoginsLoginArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAccountLoginsResultOutput{})
}
